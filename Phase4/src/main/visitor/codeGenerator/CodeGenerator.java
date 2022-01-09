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
//        if(currentClass.getParentClassName() == null)
        addCommand("invokespecial java/lang/Object/<init>()V");
//        else
//        addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
//        for(FieldDeclaration fieldDeclaration : currentClass.getFields())
//            this.initializeVar(fieldDeclaration.getVarDeclaration(), true);
        addCommand("return");
        addCommand(".end method\n ");
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
        addDefaultConstructor();
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

        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + functionDeclaration.getFunctionName().getName();
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }

        //todo

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
        addDefaultConstructor();

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
        //todo
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
        //todo
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

        //todo
        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression){
        System.out.println("UnaryExpression is visited");

        return null;
    }

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
        //todo
        return null;
    }

    @Override
    public String visit(BoolValue boolValue) {
        System.out.println("BoolValue is visited");
        //todo
        return null;
    }

    @Override
    public String visit(ExprInPar exprInPar) {
        System.out.println("ExprInPar is visited");
        return exprInPar.getInputs().get(0).accept(this);
    }
}