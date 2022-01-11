package main.visitor.codeGenerator;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.*;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;

import java.io.*;

public class  CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private String outputPath;
    private FileWriter currentFile;
    private int tempSlot = 0;
    FunctionDeclaration currentFunction;
    StructDeclaration currentStruct;
    MainDeclaration mainDeclaration;
    boolean isInMain = false;
    private int labelCounter = 0;
    private boolean seenReturn = false;

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {//unreachable
        }
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {//unreachable

        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            this.currentFile = new FileWriter(path);
        } catch (IOException e) {//never reached
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    private int slotOf(String identifier) {
        // Since we must start from 1:
        int slotIdx = 1;
        if(currentFunction == null && (!isInMain))
            return tempSlot++;
        if(currentFunction != null) {
            for (VariableDeclaration varDeclaration : currentFunction.getArgs()) {
                String varName = varDeclaration.getVarName().getName();
                if (varName.equals(identifier))
                    return slotIdx;
                slotIdx++;
            }

            if (currentFunction.getBody() instanceof BlockStmt) {
                for (Statement stmt : ((BlockStmt) (currentFunction.getBody())).getStatements()) {
                    if (stmt instanceof VarDecStmt) {
                        for (VariableDeclaration variableDeclaration : ((VarDecStmt) (stmt)).getVars()) {
                            if (variableDeclaration.getVarName().getName().equals(identifier)) {
                                return slotIdx;
                            }
                            slotIdx++;
                        }
                    }
                }
            }
            else {
                Statement stmt = currentFunction.getBody();
                if(stmt instanceof VarDecStmt) {
                    for(VariableDeclaration variableDeclaration : ((VarDecStmt) (stmt)).getVars()) {
                        if (variableDeclaration.getVarName().getName().equals(identifier))
                            return slotIdx;
                        slotIdx++;
                    }
                }
            }
        }
        else if(isInMain) {
            if(mainDeclaration.getBody() instanceof BlockStmt) {
                for(Statement stmt : ((BlockStmt) (mainDeclaration.getBody())).getStatements()) {
                    if(stmt instanceof VarDecStmt) {
                        for(VariableDeclaration variableDeclaration : ((VarDecStmt) (stmt)).getVars()) {
                            if (variableDeclaration.getVarName().getName().equals(identifier))
                                return slotIdx;
                            slotIdx++;
                        }
                    }
                }
            }
            else {
                Statement stmt = mainDeclaration.getBody();
                if(stmt instanceof VarDecStmt) {
                    for(VariableDeclaration variableDeclaration : ((VarDecStmt) (stmt)).getVars()) {
                        if (variableDeclaration.getVarName().getName().equals(identifier))
                            return slotIdx;
                        slotIdx++;
                    }
                }
            }

        }
        return slotIdx + (tempSlot++);
    }

    private String getSignatureString(Type t) {
        if(t instanceof VoidType)
            return "V";
        else
            return "L" + getClassType(t) + ";";
    }

    private String getClassType(Type t) {
        if(t instanceof IntType || t instanceof BoolType){
            String ret = "java/lang/";
            if(t instanceof IntType)
                return ret + "Integer";
            else
                return ret + "Boolean";
        }
        if(t instanceof ListType){
            return "List";
        }
        if(t instanceof FptrType){
            return "Fptr";
        }
        if(t instanceof StructType){
            return ((StructType) t).getStructName().getName();
        }
        return "";
    }

    private String castIntegerBoolean(Type t) {
        String commands = "";
        if(t instanceof IntType)
            commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        else if(t instanceof BoolType)
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        return commands;
    }

    private String castIntBool(Type t) {
        String commands = "";
        if (t instanceof IntType)
            commands += "\ninvokevirtual java/lang/Integer/intValue()I\n";
        else if (t instanceof BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z\n";
        return commands;
    }

    private void setInitValue(VariableDeclaration varDeclaration, boolean isStructVariable) {
        Type type = varDeclaration.getVarType();
        String name = varDeclaration.getVarName().getName();
        // Put class reference on stack
        if(isStructVariable)
            addCommand("aload 0");

        // Set initial value : Either use the given default value or generate a default value
        if(varDeclaration.getDefaultValue() == null)
            addCommand(this.generateValue(null, type));
        else
            addCommand(this.generateValue(varDeclaration.getDefaultValue(), type));

        // Cast int & bool
        addCommand(castIntegerBoolean(type));

        // Store fields in the struct
        if(isStructVariable)
            addCommand("putfield " + currentStruct.getStructName().getName() + "/" + name + " " + getSignatureString(type));
        // Store in top of stack
        else
            addCommand("astore " + slotOf(varDeclaration.getVarName().getName()));
    }

    private String generateValue(Expression expr, Type type) {
        // If there is default value
        if(expr != null)
            return expr.accept(this);

        // If there is no default value

        if(type instanceof IntType)
            return this.visit(new IntValue(0));

        else if(type instanceof BoolType)
            return this.visit(new BoolValue(false));

        else if(type instanceof VoidType)
            return "aconst_null";

        else if(type instanceof FptrType)
            return "aconst_null";

        else if(type instanceof StructType) {
            String commands = "";
            String className = ((StructType)type).getStructName().getName();
            commands += "new " + className + "\n";
            commands += "dup\n";
            commands += "invokespecial " + className + "/<init>()V";
            return commands;
        }

        else if(type instanceof ListType) {
            // Create an empty ArrayList
            String commands = "";
            commands += "new java/util/ArrayList\n";
            commands += "dup\n";
            commands += "invokespecial java/util/ArrayList/<init>()V\n";
            int tempVar = slotOf("");
            commands += "astore " + tempVar + "\n";

            // Creat a List by giving the empty ArrayList to the List constructor ---> newList = List(Empty ArrayList)
            commands += "new List\n";
            commands += "dup\n";
            commands += "aload " + tempVar + "\n";
            commands += "invokespecial List/<init>(Ljava/util/ArrayList;)V";
            --(this.tempSlot);
            return commands;
        }
        return null;
    }

    @Override
    public String visit(Program program) {
        System.out.println("Program is visited");
        prepareOutputFolder();

        for(StructDeclaration structDeclaration : program.getStructs()){
            structDeclaration.accept(this);
        }

        createFile("Main");

        program.getMain().accept(this);

        for (FunctionDeclaration functionDeclaration: program.getFunctions()){
            functionDeclaration.accept(this);
        }
        return null;
    }

    private void addDefaultConstructor() {
        addCommand(".method public <init>()V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("aload 0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        if(currentStruct != null) {
            for (Statement statement : ((BlockStmt) currentStruct.getBody()).getStatements()) {
                for (VariableDeclaration variableDeclaration : ((VarDecStmt) (statement)).getVars()) {
                    this.setInitValue(variableDeclaration, true);
                }
            }
        }
        else if(isInMain) { // So is in MainDeclaration
            mainDeclaration.getBody().accept(this);
        }
        addCommand("return");
        addCommand(".end method\n ");
    }

    private String generateNewLabel() {
        return "Label_" + this.labelCounter++;
    }

    @Override
    public String visit(StructDeclaration structDeclaration) {
        // Symbol Table : Given!
        System.out.println("StructDeclaration is visited");
        currentStruct = structDeclaration;
        try{
            String structKey = StructSymbolTableItem.START_KEY + structDeclaration.getStructName().getName();
            StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem)SymbolTable.root.getItem(structKey);
            SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }

        // Create Class from Struct
        String structName = structDeclaration.getStructName().getName();
        createFile(structName);
        addCommand(".class public " + structName);
        addCommand(".super java/lang/Object\n ");
        structDeclaration.getBody().accept(this);
        addCommand("");
        addDefaultConstructor();

        currentStruct = null;
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        System.out.println("FunctionDeclaration is visited");
        currentFunction = functionDeclaration;
        // Symbol Table : Given!
        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + functionDeclaration.getFunctionName().getName();
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }

        // Make signature of the function = ".method + args sigs + return sig"
        String commands = ".method public " + functionDeclaration.getFunctionName().getName() + "(";
        for(VariableDeclaration arg : functionDeclaration.getArgs())
            commands += getSignatureString(arg.getVarType());
        commands += ")" + getSignatureString(functionDeclaration.getReturnType());
        addCommand(commands);

        addCommand(".limit stack 128");
        addCommand(".limit locals 128");

        functionDeclaration.getBody().accept(this);

        // Shak
        if(functionDeclaration.getReturnType() instanceof VoidType)
            addCommand("return");
        currentFunction = null;
        addCommand(".end method\n ");

        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        System.out.println("MainDeclaration is visited");
        this.isInMain = true;
        this.mainDeclaration = mainDeclaration;
        // Symbol Table Stuff : Given!
        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + "main";
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }

        // We have to add everything in maindeclaration to staticMain
        String className = "Main";
        createFile(className);
        addCommand(".class " + className);
        addCommand(".super java/lang/Object\n ");
        addStaticMainMethod();
        addCommand("");
        addDefaultConstructor();

        SymbolTable.pop();
        this.isInMain = false;
        this.mainDeclaration = null;
        return null;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        System.out.println("VariableDeclaration is visited");
        // Add struct vars to class fields
        String commands = "";
        if(currentStruct != null) {
            commands += ".field ";
            commands += variableDeclaration.getVarName().getName();
            commands += " " + getSignatureString(variableDeclaration.getVarType());
            addCommand(commands);
        }
        else
            setInitValue(variableDeclaration, false);
        return null;
    }

    @Override
    public String visit(SetGetVarDeclaration setGetVarDeclaration) {
        System.out.println("SetGetVarDeclaration is visited");

        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        System.out.println("AssignmentStmt is visited");
        addCommand(this.visit(new BinaryExpression(assignmentStmt.getLValue(), assignmentStmt.getRValue(), BinaryOperator.assign)));
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        System.out.println("BlockStmt is visited");
        for (Statement statement: blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        System.out.println("ConditionalStmt is visited");

        // Define Labels
        String label_else = generateNewLabel();
        String label_end = generateNewLabel();
        addCommand(conditionalStmt.getCondition().accept(this));

        // Check comparison result
        addCommand("ifeq " + label_else);

        // Visit Then Body
        conditionalStmt.getThenBody().accept(this);

        // Jump Optimization!!
        boolean prevSeenReturn = this.seenReturn;
        seenReturn = false;
        if(!seenReturn)
            addCommand("goto " + label_end);
        this.seenReturn = prevSeenReturn;

        // Add Lables
        addCommand(label_else + ":");

        // Visit Else if any
        if(conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        addCommand(label_end + ":");
        return null;
    }

    @Override
    public String visit(FunctionCallStmt functionCallStmt) {
        System.out.println("FunctionCallStmt is visited");
        expressionTypeChecker.setInFunctionCallStmt(true);
        addCommand(functionCallStmt.getFunctionCall().accept(this));
        expressionTypeChecker.setInFunctionCallStmt(false);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(DisplayStmt displayStmt) {
        System.out.println("DisplayStmt is visited");

        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        String commandsOfArg = displayStmt.getArg().accept(this);
        addCommand(commandsOfArg);
        if (argType instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/println(I)V");
        if (argType instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/println(Z)V");

        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        System.out.println("ReturnStmt is visited");
        seenReturn = true;

        // Perfect Don't Touch
        Type type = new VoidType();
        if(returnStmt.getReturnedExpr() != null)
            type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);

        if(type instanceof VoidType) {
//            if(!(currentFunction.getReturnType() instanceof VoidType)) {
//                addCommand(returnStmt.getReturnedExpr().accept(this));
//                addCommand("areturn");
//            }
            addCommand("return");
        }
        else {
            addCommand(returnStmt.getReturnedExpr().accept(this));
            addCommand(castIntegerBoolean(type));
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(LoopStmt loopStmt) {
        System.out.println("LoopStmt is visited");
        String loopStartLabel = generateNewLabel();
        String loopExitLabel = generateNewLabel();
        if(loopStmt.getIsDoWhile()) {
            loopStmt.getBody().accept(this);
        }
        //condition
        addCommand(loopStartLabel + ":");
        addCommand(loopStmt.getCondition().accept(this));
        addCommand("ifeq " + loopExitLabel);
        //body
        loopStmt.getBody().accept(this);
        addCommand("goto " + loopStartLabel);
        addCommand(loopExitLabel + ":");
        return null;
    }

    @Override
    public String visit(VarDecStmt varDecStmt) {
        System.out.println("VarDecStmt is visited");
        for(VariableDeclaration variableDeclaration : varDecStmt.getVars()) {
            variableDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ListAppendStmt listAppendStmt) {
        System.out.println("ListAppendStmt is visited");
        addCommand(listAppendStmt.getListAppendExpr().accept(this));
//        addCommand("pop");
        return null;
    }

    @Override
    public String visit(ListSizeStmt listSizeStmt) {
        System.out.println("ListSizeStmt is visited");
        addCommand(listSizeStmt.getListSizeExpr().accept(this));
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        System.out.println("BinaryExpression is visited");
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";
        if(!((operator == BinaryOperator.and) || (operator == BinaryOperator.or) || (operator == BinaryOperator.assign))) {
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
        }
        if (operator == BinaryOperator.add)
            commands += "iadd";
        else if (operator == BinaryOperator.sub)
            commands += "isub";
        else if (operator == BinaryOperator.mult)
            commands += "imul";
        else if (operator == BinaryOperator.div)
            commands += "idiv";
        else if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            String falseLabel = generateNewLabel();
            String exitLabel = generateNewLabel();
            String command = (operator == BinaryOperator.gt) ? "if_icmple " : "if_icmpge ";
            commands += command + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if((operator == BinaryOperator.eq)) {
            Type type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            String falseLabel = generateNewLabel();
            String exitLabel = generateNewLabel();
            String compareCommand = "";
            if((type instanceof IntType) || (type instanceof BoolType))
                compareCommand += (operator == BinaryOperator.eq) ? "if_icmpne " : "if_icmpeq ";
            else
                compareCommand += (operator == BinaryOperator.eq) ? "if_acmpne " : "if_acmpeq ";
            commands += compareCommand + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if(operator == BinaryOperator.and) {
            String falseLabel = generateNewLabel();
            String exitLabel = generateNewLabel();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += "ifeq " + falseLabel + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
            commands += "ifeq " + falseLabel + "\n";
            commands += "ldc 1\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";

        }
        else if(operator == BinaryOperator.or) {
            String falseLabel = generateNewLabel();
            String exitLabel = generateNewLabel();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += "ldc 0\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 1\n";
            commands += exitLabel + ":";
        }
        else if(operator == BinaryOperator.assign) {
            Type firstType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            String secondCommands = binaryExpression.getSecondOperand().accept(this);
            if(firstType instanceof ListType) {
                secondCommands = "new List" + "\n";
                secondCommands += "dup\n";
                secondCommands += binaryExpression.getSecondOperand().accept(this) + "\n";
                secondCommands += "invokespecial List/<init>(LList;)V";
            }
            if(binaryExpression.getFirstOperand() instanceof Identifier) {
                System.out.println("holy shitiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii " + ((Identifier) binaryExpression.getFirstOperand()).getName());
                commands += secondCommands + "\n";
                commands += "dup\n";
                commands += castIntegerBoolean(firstType);
//                if(firstType instanceof IntType)
//                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
//                else if(firstType instanceof BoolType)
//                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                int varSlot = slotOf(((Identifier) binaryExpression.getFirstOperand()).getName());
                commands += "astore " + varSlot;
            }
            else if(binaryExpression.getFirstOperand() instanceof ListAccessByIndex) {
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getInstance().accept(this) + "\n";
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getIndex().accept(this) + "\n";
                commands += secondCommands + "\n";
                commands += "dup_x2\n";
                commands += castIntegerBoolean(firstType);
//                if(firstType instanceof IntType)
//                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
//                else if(firstType instanceof BoolType)
//                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
            }
            else if(binaryExpression.getFirstOperand() instanceof StructAccess) {
                Expression instance = ((StructAccess) binaryExpression.getFirstOperand()).getInstance();
                Type memberType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
                String memberName = ((StructAccess) binaryExpression.getFirstOperand()).getElement().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
//                if(instanceType instanceof ListType) {
//                    int index = 0;
//                    for(int i = 0; i < ((ListType) instanceType).getElementsTypes().size(); i++)
//                        if(((ListType) instanceType).getElementsTypes().get(i).getName().getName().equals(memberName))
//                            index = i;
//                    commands += instance.accept(this) + "\n";
//                    commands += "ldc " + index + "\n";
//                    commands += secondCommands + "\n";
//                    commands += "dup_x2\n";
//                    if(firstType instanceof IntType)
//                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
//                    else if(firstType instanceof BoolType)
//                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
//                    commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
//                }
//                if(instanceType instanceof StructType) {
                String className = ((StructType) instanceType).getStructName().getName();
                commands += instance.accept(this) + "\n";
                commands += secondCommands + "\n";
                commands += "dup_x1\n";
                commands += castIntegerBoolean(firstType);
//                if(firstType instanceof IntType)
//                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
//                else if(firstType instanceof BoolType)
//                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "putfield " + className + "/" + memberName + " " + getSignatureString(memberType);
//                }
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression){
        System.out.println("UnaryExpression is visited");

        return null;
    }

    @Override
    public String visit(StructAccess structAccess){
        System.out.println("StructAccess is visited");
        Type memberType = structAccess.accept(expressionTypeChecker);
        Type instanceType = structAccess.getInstance().accept(expressionTypeChecker);
        String memberName = structAccess.getElement().getName();
        String commands = "";
        if(instanceType instanceof StructType) {
            String className = ((StructType) instanceType).getStructName().getName();

            try {
                SymbolTable classSymbolTable = ((StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + className)).getStructSymbolTable();
                try {
                    classSymbolTable.getItem(VariableSymbolTableItem.START_KEY + memberName);
                    commands += structAccess.getInstance().accept(this) + "\n";
                    commands += "getfield " + className + "/" + memberName + " " + getSignatureString(memberType);
                    commands += castIntBool(memberType);
                } catch (ItemNotFoundException memberIsMethod) {

                }
            } catch (ItemNotFoundException classNotFound) {
            }
        }
        return commands;
    }

    @Override
    public String visit(Identifier identifier){
//        System.out.println("Identifier <" + identifier.getName() + "> is visited");
        String commands = "";
        Type type = identifier.accept(expressionTypeChecker);
        if(type instanceof FptrType) {
            try {
                VariableSymbolTableItem symbolTableItem =
                        (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + identifier.getName());

                int varSlot = slotOf(symbolTableItem.getName());
                commands += "aload " + varSlot + "\n";
            } catch (ItemNotFoundException e1) {
                try {
                    FunctionSymbolTableItem functionSymbolTableItem =
                            (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY + identifier.getName());
                    commands += "new Fptr\n";
                    commands += "dup\n";
                    commands += "aload 0\n";
                    commands += "ldc \"" + identifier.getName() + "\"\n";
                    commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V";
                } catch (ItemNotFoundException e2) {
                }
            }

        }
        else {
            commands += "aload " + slotOf(identifier.getName()) + "\n";
            if (type instanceof IntType)
                commands += "\ninvokevirtual java/lang/Integer/intValue()I";
            else if (type instanceof BoolType)
                commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
        }
        return commands;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex){
        System.out.println("ListAccessByIndex is visited");
        String commands = "";
        commands += listAccessByIndex.getInstance().accept(this) + "\n";
        commands += listAccessByIndex.getIndex().accept(this) + "\n";
        Type type = listAccessByIndex.accept(expressionTypeChecker);
        commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        commands += "checkcast " + getClassType(type);
        if(type instanceof IntType)
            commands += "\ninvokevirtual java/lang/Integer/intValue()I";
        else if(type instanceof BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";
        return commands;
    }

    @Override
    public String visit(FunctionCall functionCall){
        System.out.println("FunctionCall is visited");

        // Create Empty ArrayList
        String commands = "";
        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        int tempVar = slotOf("");
        commands += "astore " + tempVar + "\n";

        // Visit and Add args to the arraylist
        for(Expression arg : functionCall.getArgs()) {
            commands += "aload " + tempVar + "\n";
            commands += arg.accept(this) + "\n";
            commands += castIntegerBoolean(arg.accept(expressionTypeChecker));
            commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            commands += "pop\n";
        }

        // Put Fptr --> Put Args Array ---> Invoke
        commands += functionCall.getInstance().accept(this) + "\n";
        commands += "aload " + tempVar + "\n";
        commands += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";

        Type type = functionCall.accept(expressionTypeChecker);
        if(!(type instanceof VoidType))
            commands += "\n" + "checkcast " + getClassType(type);

        commands += castIntBool(type);
        this.tempSlot = this.tempSlot - 1;
        return commands;
    }

    @Override
    public String visit(ListSize listSize){
        System.out.println("ListSize is visited");
        String commands = "";
        commands += listSize.getArg().accept(this);
        commands += "invokevirtual List/getSize()I\n";
        System.out.println(commands);
        return commands;
    }

    @Override
    public String visit(ListAppend listAppend) {
        System.out.println("ListAppend is visited");
        String commands = "";
        commands += listAppend.getListArg().accept(this) + "\n";
        commands += listAppend.getElementArg().accept(this) + "\n";
        Type elementArgType = listAppend.getElementArg().accept(expressionTypeChecker);
        commands += castIntegerBoolean(elementArgType);
        commands += "invokevirtual List/addElement(Ljava/lang/Object;)V\n";

//        commands += "pop\n";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        System.out.println("IntValue is visited");
        return "ldc " + intValue.getConstant();
    }

    @Override
    public String visit(BoolValue boolValue) {
        System.out.println("BoolValue is visited");
        int boolIntVal = (boolValue.getConstant()) ? 1 : 0;
        return "ldc " + boolIntVal;
    }

    @Override
    public String visit(ExprInPar exprInPar) {
        System.out.println("ExprInPar is visited");
        return exprInPar.getInputs().get(0).accept(this);
    }
}