package main.visitor.name;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.visitor.*;

//private void print(Node node) {
//        System.out.println("Line:" + node.getLine() + ":" + node.toString());
//        }
//
//@Override
//public Void visit(Program program) {
//        print(program);
//        for(StructDeclaration classDeclaration : program.getStructs()) {
//        classDeclaration.accept(this);
//        }
//        return null;
//        }
//
//@Override
//public Void visit(StructDeclaration structDeclaration) {
//        print(structDeclaration);
//        structDeclaration.getStructName().accept(this);
//
//        for(FieldDeclaration fieldDeclaration : structDeclaration.getFields()) {
//        fieldDeclaration.accept(this);
//        }
//        if(structDeclaration.getConstructor() != null) {
//        structDeclaration.getConstructor().accept(this);
//        }
//        for(MethodDeclaration methodDeclaration : structDeclaration.getMethods()) {
//        methodDeclaration.accept(this);
//        }
//        return null;
//        }

public class ASTTreePrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (StructDeclaration structDeclaration: program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration:program.getFunctions())
            functionDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        messagePrinter(functionDec.getLine(), functionDec.toString());
        functionDec.getFunctionName().accept(this);
        for (VariableDeclaration arg: functionDec.getArgs())
            arg.accept(this);
        functionDec.getBody().accept(this);
//        functionDec.getReturnType().accept(this);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        messagePrinter(mainDec.getLine(), mainDec.toString());
        mainDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        messagePrinter(variableDec.getLine(), variableDec.toString());
        variableDec.getVarName().accept(this);
//        variableDec.getVarType().accept(this);
        variableDec.getDefaultValue().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        messagePrinter(structDec.getLine(), structDec.toString());
        structDec.getStructName().accept(this);
        structDec.getBody().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        //todo
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        //todo
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        //todo
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        //todo
        return null;
    }

    @Override
    public Void visit(FunctionCall funcCall) {
        //todo
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        //todo
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListSize listSize) {
        //todo
        return null;
    }

    @Override
    public Void visit(ListAppend listAppend) {
        //todo
        return null;
    }

    @Override
    public Void visit(ExprInPar exprInPar) {
        //todo
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        //todo
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        //todo
        return null;
    }
}
