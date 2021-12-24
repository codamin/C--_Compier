package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.NoType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.compileError.typeError.*;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

import javax.swing.plaf.nimbus.State;

public class TypeChecker extends Visitor<Void> {
//    private final Graph<String> strucyHierarchy;
    public ExpressionTypeChecker expressionTypeChecker;
    public StructDeclaration currentStruct;
    public FunctionDeclaration currentFunction;
    private boolean isInFor = false;

    public TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }

    @Override
    public Void visit(Program program) {
        for(FunctionDeclaration functionDeclaration : program.getFunctions()) {
            this.expressionTypeChecker.setCurrentFunction(functionDeclaration);
            this.currentFunction = functionDeclaration;
            functionDeclaration.accept(this);
        }
        for(StructDeclaration structDeclaration : program.getStructs()) {
            this.expressionTypeChecker.setCurrentStruct(structDeclaration);
            this.currentStruct = structDeclaration;
            structDeclaration.accept(this);
        }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        this.expressionTypeChecker.checkTypeValidation(functionDec.getReturnType(), functionDec);
        for(VariableDeclaration varDeclaration : functionDec.getArgs()) {
            varDeclaration.accept(this);
        }
        // for(VariableDeclaration varDeclaration : functionDec.getLocalVars()) {
        //     varDeclaration.accept(this);
        // }
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        this.expressionTypeChecker.setCurrentFunction(null);
        this.currentFunction = null;
        mainDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        this.expressionTypeChecker.checkTypeValidation(variableDec.getVarType(), variableDec);
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        structDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Type firstType = assignmentStmt.getLValue().accept(expressionTypeChecker);
        Type secondType = assignmentStmt.getRValue().accept(expressionTypeChecker);
        boolean isFirstLvalue = expressionTypeChecker.isLvalue(assignmentStmt.getLValue());
        if(!isFirstLvalue) {
            LeftSideNotLvalue exception = new LeftSideNotLvalue(assignmentStmt.getLine());
            assignmentStmt.addError(exception);
        }
        boolean isSubtype = expressionTypeChecker.isFirstSubTypeOfSecond(secondType, firstType);
        if(!isSubtype) {
            UnsupportedOperandType exception = new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.name());
            assignmentStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement stmt : blockStmt.getStatements()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type condType = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(condType instanceof BoolType || condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(conditionalStmt.getLine());
            conditionalStmt.addError(exception);
        }
        conditionalStmt.getThenBody().accept(this);
        if(conditionalStmt.getElseBody() != null) {
            conditionalStmt.getElseBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        expressionTypeChecker.setIsInMethodCallStmt(true);
        functionCallStmt.getFunctionCall().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInMethodCallStmt(false);
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        Type type = displayStmt.getArg().accept(expressionTypeChecker);
        if(!(type instanceof IntType || type instanceof BoolType || type instanceof NoType)) {
            UnsupportedTypeForDisplay exception = new UnsupportedTypeForDisplay(displayStmt.getLine());
            displayStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type actualRetType = this.currentFunction.getReturnType();
        if(!expressionTypeChecker.isFirstSubTypeOfSecond(retType, actualRetType)) {
            //CHECK : Error Input GetLine
            ReturnValueNotMatchFunctionReturnType exception = new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine());
            returnStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        Type type = loopStmt.getCondition().accept(expressionTypeChecker);
        if(!(type instanceof BoolType || type instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(loopStmt.getLine());
            loopStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        for (VariableDeclaration variableDeclaration : varDecStmt.getVars()) {
            variableDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }
}