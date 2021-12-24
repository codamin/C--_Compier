package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.statement.*;
import main.ast.types.NoType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.compileError.typeError.ConditionNotBool;
import main.visitor.Visitor;

public class TypeChecker extends Visitor<Void> {
    private final Graph<String> classHierarchy;
    public ExpressionTypeChecker expressionTypeChecker;
    public StructDeclaration currentStruct;
    public FunctionDeclaration currentFunction;
    private boolean isInFor = false;

    public TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }

    @Override
    public Void visit(Program program) {
        boolean mainCheck = false;
        for(StructDeclaration structDeclaration : program.getStructs()) {
            this.expressionTypeChecker.setCurrentStruct(structDeclaration);
            this.currentStruct = structDeclaration;
            structDeclaration.accept(this);
            if(structDeclaration.getStructName().getName().equals("Main")) {
                mainCheck = true;
            }
        }
        // if(!mainCheck) {
        //     NoMainClass exception = new NoMainClass();
        //     program.addError(exception);
        // }
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
        //Todo
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type actualRetType = this.currentFunction.getReturnType();
        if(!expressionTypeChecker.isFirstSubTypeOfSecond(retType, actualRetType)) {
            ReturnValueNotMatchMethodReturnType exception = new ReturnValueNotMatchMethodReturnType(returnStmt);
            returnStmt.addError(exception);
        }
        return new RetConBrk(true, false);
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
        //Todo
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        //
        return null;
    }
}
