package main.visitor.name;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.visitor.*;

import javax.swing.plaf.nimbus.State;

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
        if(variableDec.getDefaultValue() != null)
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
        messagePrinter(setGetVarDec.getLine(), setGetVarDec.toString());
        setGetVarDec.getVarName().accept(this);
        for (VariableDeclaration arg: setGetVarDec.getArgs())
            arg.accept(this);
        setGetVarDec.getGetterBody().accept(this);
        setGetVarDec.getSetterBody().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        messagePrinter(assignmentStmt.getLine(), assignmentStmt.toString());
        assignmentStmt.getLValue().accept(this);
        assignmentStmt.getRValue().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        messagePrinter(blockStmt.getLine(), blockStmt.toString());
        for (Statement statement: blockStmt.getStatements()) {
            statement.accept(this);
        }
        //todo
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        messagePrinter(conditionalStmt.getLine(), conditionalStmt.toString());
        conditionalStmt.getCondition().accept(this);
        conditionalStmt.getThenBody().accept(this);
        conditionalStmt.getElseBody().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        messagePrinter(functionCallStmt.getLine(), functionCallStmt.toString());
        functionCallStmt.getFunctionCall().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        messagePrinter(displayStmt.getLine(), displayStmt.toString());
        displayStmt.getArg().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        messagePrinter(returnStmt.getLine(), returnStmt.toString());
        returnStmt.getReturnedExpr().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        messagePrinter(loopStmt.getLine(), loopStmt.toString());
        loopStmt.getCondition().accept(this);
        loopStmt.getBody().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        messagePrinter(varDecStmt.getLine(), varDecStmt.toString());
        for (VariableDeclaration var: varDecStmt.getVars())
            var.accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        messagePrinter(listAppendStmt.getLine(), listAppendStmt.toString());
        listAppendStmt.getListAppendExpr().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        messagePrinter(listSizeStmt.getLine(), listSizeStmt.toString());
        listSizeStmt.getListSizeExpr().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
//        binaryExpression.getBinaryOperator()
        //todo
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        unaryExpression.getOperand().accept(this);
//        unaryExpression.getOperator()
        //todo
        return null;
    }

    @Override
    public Void visit(FunctionCall funcCall) {
        messagePrinter(funcCall.getLine(), funcCall.toString());
        funcCall.getInstance().accept(this);
        for(Expression arg: funcCall.getArgs())
            arg.accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        messagePrinter(identifier.getLine(), identifier.toString());
        //todo
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        messagePrinter(listAccessByIndex.getLine(), listAccessByIndex.toString());
        listAccessByIndex.getInstance().accept(this);
        listAccessByIndex.getIndex().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(StructAccess structAccess) {
        messagePrinter(structAccess.getLine(), structAccess.toString());
        structAccess.getInstance().accept(this);
        structAccess.getElement().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(ListSize listSize) {
        messagePrinter(listSize.getLine(), listSize.toString());
        listSize.getArg().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(ListAppend listAppend) {
        messagePrinter(listAppend.getLine(), listAppend.toString());
        listAppend.getListArg().accept(this);
        listAppend.getElementArg().accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(ExprInPar exprInPar) {
        messagePrinter(exprInPar.getLine(), exprInPar.toString());
        for (Expression input: exprInPar.getInputs())
            input.accept(this);
        //todo
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        messagePrinter(intValue.getLine(), intValue.toString());
        //todo
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        messagePrinter(boolValue.getLine(), boolValue.toString());
        //todo
        return null;
    }
}
