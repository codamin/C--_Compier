package main.visitor.codeGenerator;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.*;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;
import java.io.*;
import java.util.*;

public class  CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private String outputPath;
    private FileWriter currentFile;
    private int tempVarSlot = 0;
    FunctionDeclaration currentFunction;
    StructDeclaration currentStruct;
    boolean isInMain = false;
    private int labelCounter = 0;



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
        int count = 1;
        if(currentFunction == null)
            return tempVarSlot++;
        for (VariableDeclaration varDeclaration : currentFunction.getArgs()) {
            if (varDeclaration.getVarName().getName().equals(identifier))
                return count;
            count++;
        }

        for(Statement stmt : ((BlockStmt) (currentFunction.getBody())).getStatements()) {
            if(stmt instanceof VarDecStmt) {
                for(VariableDeclaration variableDeclaration : ((VarDecStmt) (stmt)).getVars()) {
                    if (variableDeclaration.getVarName().getName().equals(identifier))
                        return count;
                    count++;
                }
            }
        }
//        for (VariableDeclaration varDeclaration : currentFunction.get) {
//            if (varDeclaration.getVarName().getName().equals(identifier))
//                return count;
//            count++;
//        }
        //first empty var
        return count + (tempVarSlot++);
    }

    private String makeTypeSignature(Type t) {
//        if(t instanceof NullType)
        if(t instanceof VoidType)
            return "V";
        else
            return "L" + getClass(t) + ";";
    }

    private String getClass(Type t) {
        if(t instanceof IntType){
            return "java/lang/Integer";
        }
        else if(t instanceof BoolType){
            return "java/lang/Boolean";
        }
//        else if(t instanceof StringType){
//            return "java/lang/String";
//        }
        else if(t instanceof ListType){
            return "List";
        }
        else if(t instanceof FptrType){
            return "Fptr";
        }
//        else if(t instanceof ClassType){
//            return ((ClassType) t).getClassName().getName();
//        }
        else if(t instanceof StructType){
            return ((StructType) t).getStructName().getName();
        }
        return "";
    }


    private void initializeVar(VariableDeclaration varDeclaration, boolean isField) {
        Type type = varDeclaration.getVarType();
        String name = varDeclaration.getVarName().getName();
//        String className = currentStruct.getStructName().getName();
        if(isField)
            addCommand("aload 0");

        addCommand(this.generateValue(true, varDeclaration.getDefaultValue(), type));

        if(type instanceof IntType)
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        else if(type instanceof BoolType)
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        if(isField) {
            String className = currentStruct.getStructName().getName();
            addCommand("putfield " + className + "/" + name + " " + makeTypeSignature(type));
        }
        else
            addCommand("astore " + slotOf(varDeclaration.getVarName().getName()));
    }

    private String generateValue(boolean isInitialization, Expression expr, Type type) {
        if(type instanceof IntType) {
            if(isInitialization)
                return this.visit(new IntValue(0));
            else
                return expr.accept(this);
        }
//        else if(type instanceof StringType) {
//            if(isInitialization)
//                return this.visit(new StringValue(""));
//            else
//                return expr.accept(this);
//        }
        else if(type instanceof BoolType) {
            if(isInitialization)
                return this.visit(new BoolValue(false));
            else
                return expr.accept(this);
        }
        else if(type instanceof StructType || type instanceof FptrType || type instanceof VoidType) {
            if(isInitialization)
                return "aconst_null";
            else
                return expr.accept(this);
        }
//        else if(type instanceof ListType) {
//            String commands = "";
//            commands += "new java/util/ArrayList\n";
//            commands += "dup\n";
//            commands += "invokespecial java/util/ArrayList/<init>()V\n";
//            int tempVar = slotOf("");
//            commands += "astore " + tempVar + "\n";
//            if(isInitialization)
//                for(ListNameType listNameType : ((ListType) type).getElementsTypes()) {
//                    commands += "aload " + tempVar + "\n";
//                    commands += this.generateValue(true, null, listNameType.getType()) + "\n";
//                    if(listNameType.getType() instanceof IntType)
//                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
//                    else if(listNameType.getType() instanceof BoolType)
//                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
//                    commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
//                    commands += "pop\n";
//                }
//            else
//                for(Expression expression : ((ListValue) expr).getElements()) {
//                    commands += "aload " + tempVar + "\n";
//                    commands += expression.accept(this) + "\n";
//                    Type t = expression.accept(expressionTypeChecker);
//                    if(t instanceof IntType)
//                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
//                    else if(t instanceof BoolType)
//                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
//                    commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
//                    commands += "pop\n";
//                }
//            commands += "new List\n";
//            commands += "dup\n";
//            commands += "aload " + tempVar + "\n";
//            commands += "invokespecial List/<init>(Ljava/util/ArrayList;)V";
//            --(this.tempVarSlot);
//            return commands;
//        }
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

    private void addDefaultConstructor(MainDeclaration mainDeclaration) {
        addCommand(".method public <init>()V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("aload 0");
//        if(currentClass.getParentClassName() == null)
        addCommand("invokespecial java/lang/Object/<init>()V");
//        else
//        addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
//        for(FieldDeclaration fieldDeclaration : currentClass.getFields())
//            this.initializeVar(fieldDeclaration.getVarDeclaration(), true);
        if(currentStruct != null) {
            for (Statement statement : ((BlockStmt) currentStruct.getBody()).getStatements()) {
                for (VariableDeclaration variableDeclaration : ((VarDecStmt) (statement)).getVars()) {
                    this.initializeVar(variableDeclaration, true);
                }
            }
        }
        else { // So is in MainDeclaration
            mainDeclaration.getBody().accept(this);
        }
        addCommand("return");
        addCommand(".end method\n ");
    }

    private String getFreshLabel() {
        return "Label_" + this.labelCounter++;
    }

    @Override
    public String visit(StructDeclaration structDeclaration) {
        System.out.println("StructDeclaration is visited");
        currentStruct = structDeclaration;
        try{
            String structKey = StructSymbolTableItem.START_KEY + structDeclaration.getStructName().getName();
            StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem)SymbolTable.root.getItem(structKey);
            SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }
        /////////////////////////////////////
        String className = structDeclaration.getStructName().getName();
        createFile(className);
        addCommand(".class public " + className );
//        if(classDeclaration.getParentClassName() != null)
//            addCommand(".super " + classDeclaration.getParentClassName().getName() + "\n ");
//        else
        addCommand(".super java/lang/Object\n ");
//        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
//            fieldDeclaration.accept(this);
//        }
        structDeclaration.getBody().accept(this);

        addCommand("");
//        if(classDeclaration.getConstructor() != null) {
//            this.typeChecker.currentMethod = classDeclaration.getConstructor();
//            this.typeChecker.expressionTypeChecker.setCurrentMethod(classDeclaration.getConstructor());
//            this.currentMethod = classDeclaration.getConstructor();
//            classDeclaration.getConstructor().accept(this);
//        }
//        else
        addDefaultConstructor(null);
//        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
//            this.typeChecker.currentMethod = methodDeclaration;
//            this.typeChecker.expressionTypeChecker.setCurrentMethod(methodDeclaration);
//            this.currentMethod = methodDeclaration;
//            methodDeclaration.accept(this);
//        }
////////////////////////////////////
        currentStruct = null;
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        System.out.println("FunctionDeclaration is visited");
        currentFunction = functionDeclaration;

        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + functionDeclaration.getFunctionName().getName();
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }
/////////////////////////////
        String argsSignature = "";
        for(VariableDeclaration arg : functionDeclaration.getArgs())
            argsSignature += makeTypeSignature(arg.getVarType());
//        if(functionDeclaration instanceof ConstructorDeclaration)
//            addCommand(".method public <init>(" + argsSignature + ")V");
//        else
        addCommand(".method public " + functionDeclaration.getFunctionName().getName() +
                "(" + argsSignature + ")" + makeTypeSignature(functionDeclaration.getReturnType()));
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
//        if(functionDeclaration instanceof ConstructorDeclaration) {
//            addCommand("aload 0");
//            if(currentClass.getParentClassName() == null)
//                addCommand("invokespecial java/lang/Object/<init>()V");
//            else
//                addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
//            for (FieldDeclaration fieldDeclaration : currentClass.getFields())
//                this.initializeVar(fieldDeclaration.getVarDeclaration(), true);
//        }
        functionDeclaration.getBody().accept(this);
//        for(VarDeclaration varDeclaration : methodDeclaration.getLocalVars())
//            varDeclaration.accept(this);
//        for(Statement statement : methodDeclaration.getBody())
//            statement.accept(this);

        // Gand
        if(functionDeclaration.getReturnType() instanceof VoidType)
            addCommand("return");
        currentFunction = null;
        addCommand(".end method\n ");
/////////////////////////////

        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        System.out.println("MainDeclaration is visited");

        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + "main";
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }
//////////////////////////////////////////////////////////////////////////////////////
        // I guess we have to add everything in maindeclaration to staticMain
        String className = "Main";
        createFile(className);
        addCommand(".class " + className);
        addCommand(".super java/lang/Object\n ");
        addStaticMainMethod();
        addCommand("");
        addDefaultConstructor(mainDeclaration);

//////////////////////////////////////////////////////////////////////////////////////
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        System.out.println("VariableDeclaration is visited");
        if(currentStruct != null) {
            addCommand(".field " + variableDeclaration.getVarName() + " " + makeTypeSignature(variableDeclaration.getVarType()));
        }
        else
            initializeVar(variableDeclaration, false);
        return null;
    }

//    @Override
//    public String visit(SetGetVarDeclaration setGetVarDeclaration) {
//        System.out.println("SetGetVarDeclaration is visited");
//
//        return null;
//    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        System.out.println("AssignmentStmt is visited");

        //todo
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

        //todo
        return null;
    }

    @Override
    public String visit(FunctionCallStmt functionCallStmt) {
        System.out.println("FunctionCallStmt is visited");

        //todo
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

        //todo
        return null;
    }

    @Override
    public String visit(LoopStmt loopStmt) {
        System.out.println("LoopStmt is visited");

        //todo
        return null;
    }

    @Override
    public String visit(VarDecStmt varDecStmt) {
        System.out.println("VarDecStmt is visited");
        for(VariableDeclaration variableDeclaration : varDecStmt.getVars()) {
            variableDeclaration.accept(this);
        }
        //todo
        return null;
    }

    @Override
    public String visit(ListAppendStmt listAppendStmt) {
        System.out.println("ListAppendStmt is visited");

        //todo
        return null;
    }

    @Override
    public String visit(ListSizeStmt listSizeStmt) {
        System.out.println("ListSizeStmt is visited");
        //todo
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
//        else if (operator == BinaryOperator.mod)
//            commands += "irem";
        else if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
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
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
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
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
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
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
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
                commands += secondCommands + "\n";
                commands += "dup\n";
                if(firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                int varSlot = slotOf(((Identifier) binaryExpression.getFirstOperand()).getName());
                commands += "astore " + varSlot;
            }
            else if(binaryExpression.getFirstOperand() instanceof ListAccessByIndex) {
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getInstance().accept(this) + "\n";
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getIndex().accept(this) + "\n";
                commands += secondCommands + "\n";
                commands += "dup_x2\n";
                if(firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
            }
            else if(binaryExpression.getFirstOperand() instanceof ObjectOrListMemberAccess) {
                Expression instance = ((ObjectOrListMemberAccess) binaryExpression.getFirstOperand()).getInstance();
                Type memberType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectOrListMemberAccess) binaryExpression.getFirstOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ListType) {
                    int index = 0;
                    for(int i = 0; i < ((ListType) instanceType).getElementsTypes().size(); i++)
                        if(((ListType) instanceType).getElementsTypes().get(i).getName().getName().equals(memberName))
                            index = i;
                    commands += instance.accept(this) + "\n";
                    commands += "ldc " + index + "\n";
                    commands += secondCommands + "\n";
                    commands += "dup_x2\n";
                    if(firstType instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(firstType instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    commands += "invokevirtual List/setElement(ILjava/lang/Object;)V";
                }
                else if(instanceType instanceof ClassType) {
                    String className = ((ClassType) instanceType).getClassName().getName();
                    commands += instance.accept(this) + "\n";
                    commands += secondCommands + "\n";
                    commands += "dup_x1\n";
                    if(firstType instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(firstType instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    commands += "putfield " + className + "/" + memberName + " " + makeTypeSignature(memberType);
                }
            }
        }
        return commands;
    }

//    @Override
//    public String visit(UnaryExpression unaryExpression){
//        System.out.println("UnaryExpression is visited");
//
//        return null;
//    }

    @Override
    public String visit(StructAccess structAccess){
        System.out.println("StructAccess is visited");

        //todo
        return null;
    }

    @Override
    public String visit(Identifier identifier){
        System.out.println("Identifier is visited");

        //todo
        return null;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex){
        System.out.println("ListAccessByIndex is visited");

        //todo
        return null;
    }

    @Override
    public String visit(FunctionCall functionCall){
        System.out.println("FunctionCall is visited");
        //todo
        return null;
    }

    @Override
    public String visit(ListSize listSize){
        System.out.println("ListSize is visited");
        //todo
        return null;
    }

    @Override
    public String visit(ListAppend listAppend) {
        System.out.println("ListAppend is visited");
        //todo
        return null;
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