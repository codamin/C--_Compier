package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.NoType;
import main.ast.types.StructType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

public class TypeChecker extends Visitor<Void> {
    public ExpressionTypeChecker expressionTypeChecker;
    public FunctionDeclaration currentFunction;
    private boolean isInFor = false;
    private boolean isInSet = false;
    private boolean isInGet = false;
    private boolean isInMain = false;
    private boolean hasReturn = false;
    private Type currentGetSetVarType = null;

    public TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }

    @Override
    public Void visit(Program program) {
        for(StructDeclaration structDeclaration : program.getStructs()) {
            structDeclaration.accept(this);
        }
        for(FunctionDeclaration functionDeclaration : program.getFunctions()) {
            this.expressionTypeChecker.setCurrentFunction(functionDeclaration);
            this.currentFunction = functionDeclaration;
            boolean prevIsInMain = this.isInMain;
            boolean prevIsInSet = this.isInSet;
            this.isInMain = false;
            this.isInSet = false;
            boolean prevHasReturn = this.hasReturn;
            this.hasReturn = false;
            functionDeclaration.accept(this);
            this.hasReturn = prevHasReturn;
            this.isInMain = prevIsInMain;
            this.isInSet = prevIsInSet;
        }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
//        this.expressionTypeChecker.checkTypeValidation(functionDec.getReturnType(), functionDec);
        Type retType = functionDec.getReturnType();
        if(retType instanceof StructType) {
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + ((StructType) retType).getStructName().getName());
            } catch (ItemNotFoundException e) {
                StructNotDeclared exception = new StructNotDeclared(functionDec.getLine(), ((StructType) retType).getStructName().getName());
                functionDec.addError(exception);
            }
        }
        SymbolTable.push(new SymbolTable());
        for(VariableDeclaration varDeclaration : functionDec.getArgs()) {
            varDeclaration.accept(this);
        }
        functionDec.getBody().accept(this);
        if(!(retType instanceof VoidType) && !this.hasReturn) {
            MissingReturnStatement exception = new MissingReturnStatement(functionDec.getLine(), functionDec.getFunctionName().getName());
            functionDec.addError(exception);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        isInMain = true;
        SymbolTable.push(new SymbolTable());
        mainDec.getBody().accept(this);
        SymbolTable.pop();
        isInMain = false;
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        if(isInSet || isInGet) {
            CannotUseDefineVar exception = new CannotUseDefineVar(variableDec.getLine());
            variableDec.addError(exception);
        }

        if(variableDec.getDefaultValue() != null) {
            Type defaultValType = variableDec.getDefaultValue().accept(expressionTypeChecker);
            boolean isSubtype = expressionTypeChecker.doTypesMatch(defaultValType, variableDec.getVarType());
            if(!isSubtype) {
                UnsupportedOperandType exception = new UnsupportedOperandType(variableDec.getLine(), BinaryOperator.assign.name());
                variableDec.addError(exception);
            }
        }

        int numErrors = this.expressionTypeChecker.checkTypeValidation(variableDec.getVarType(), variableDec);
        Type finalType = variableDec.getVarType();
        if(numErrors > 0) {
            finalType = new NoType();
        }
//FOR SYMBOL TABLE $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
        variableSymbolTableItem.setType(finalType);
        try {
            VariableSymbolTableItem vsti = (VariableSymbolTableItem) SymbolTable.top.getItem(variableSymbolTableItem.getKey());
            vsti.setType(finalType);
        } catch (ItemNotFoundException exception2) {
            try {
                SymbolTable.top.put(variableSymbolTableItem);
            } catch (ItemAlreadyExistsException exception3) { //unreachable
            }
        }
        try {
            VariableSymbolTableItem vsti = (VariableSymbolTableItem) SymbolTable.top.getItem(variableSymbolTableItem.getKey());
        } catch (ItemNotFoundException e3) {}
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        try {
            StructSymbolTableItem structSymbolTableItem =
                    (StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + structDec.getStructName().getName());
            SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        structDec.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        setGetVarDec.getVarDec().accept(this);
        try {
            VariableSymbolTableItem variableSymbolTableItem =
                    (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + setGetVarDec.getVarName().getName());
            variableSymbolTableItem.setType(setGetVarDec.getVarDec().getVarType());
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FunctionSymbolTableItem functionSymbolTableItem =
                    (FunctionSymbolTableItem) SymbolTable.top.getItem(FunctionSymbolTableItem.START_KEY + setGetVarDec.getVarName().getName());
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        } catch (ItemNotFoundException e) {
            return null;
        }
        for(VariableDeclaration variableDeclaration : setGetVarDec.getArgs()) {
            variableDeclaration.accept(this);
        }
        isInSet = true;
        setGetVarDec.getSetterBody().accept(this);
        this.currentGetSetVarType = setGetVarDec.getVarType();
        isInSet = false;
        SymbolTable.pop();
        isInGet = true;
        boolean prevHasReturn = this.hasReturn;
        this.hasReturn = false;
        setGetVarDec.getGetterBody().accept(this);
        if(!hasReturn) {
            MissingReturnStatement exception = new MissingReturnStatement(setGetVarDec.getGetterBody().getLine(), setGetVarDec.getVarName().getName());
            setGetVarDec.addError(exception);
        }
        this.hasReturn = prevHasReturn;
        isInGet = false;
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

        boolean isSubtype = expressionTypeChecker.doTypesMatch(secondType, firstType);
        if(firstType instanceof NoType) {
            return null;
        }
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
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        conditionalStmt.getThenBody().accept(this);
        SymbolTable.pop();
        if(conditionalStmt.getElseBody() != null) {
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            conditionalStmt.getElseBody().accept(this);
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        expressionTypeChecker.setIsInFunctionCallStmt(true);
        functionCallStmt.getFunctionCall().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInFunctionCallStmt(false);
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        boolean prevIsInFunctionCallStmt = expressionTypeChecker.getIsInFunctionCallStmt();
        expressionTypeChecker.setIsInFunctionCallStmt(false);
        Type type = displayStmt.getArg().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInFunctionCallStmt(prevIsInFunctionCallStmt);
        if(!(type instanceof IntType || type instanceof BoolType || type instanceof NoType)) {
            UnsupportedTypeForDisplay exception = new UnsupportedTypeForDisplay(displayStmt.getLine());
            displayStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        this.hasReturn = true;
        Type retType;
        if(returnStmt.getReturnedExpr() != null) {
            retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        }
        else {
            retType = new VoidType();
        }
        if(isInSet || isInMain) {
            CannotUseReturn exception = new CannotUseReturn(returnStmt.getLine());
            returnStmt.addError(exception);
            return null;
        }
        Type actualRetType = this.currentGetSetVarType;
        if(!isInGet) {
            actualRetType = this.currentFunction.getReturnType();
        }

        if(!expressionTypeChecker.doTypesMatch(retType, actualRetType)) {
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
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        loopStmt.getBody().accept(this);
        SymbolTable.pop();
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
        boolean prevIsInFunctionCallStmt = expressionTypeChecker.getIsInFunctionCallStmt();
        expressionTypeChecker.setIsInFunctionCallStmt(true);
        listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInFunctionCallStmt(prevIsInFunctionCallStmt);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        boolean prevIsInFunctionCallStmt = expressionTypeChecker.getIsInFunctionCallStmt();
        expressionTypeChecker.setIsInFunctionCallStmt(true);
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInFunctionCallStmt(prevIsInFunctionCallStmt);
        return null;
    }
}