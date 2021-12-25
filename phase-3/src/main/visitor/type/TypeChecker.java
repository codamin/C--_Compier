package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.ListType;
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
//    private final Graph<String> strucyHierarchy;
    public ExpressionTypeChecker expressionTypeChecker;
//    public StructDeclaration currentStruct;
//    public Declaration currentStruct;
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

//            this.expressionTypeChecker.setCurrentStruct(structDeclaration);
//            this.currentStruct = structDeclaration;
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
            } catch (ItemNotFoundException classNotFound) {
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
            boolean isSubtype = expressionTypeChecker.isFirstSubTypeOfSecond(defaultValType, variableDec.getVarType());
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
        System.out.println(variableSymbolTableItem.getType());

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
            System.out.println(variableDec.getLine() + vsti.getName().toString() + ">>>type in symbolTable " + vsti.getType().toString());
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
//            e.printStackTrace();
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
        setGetVarDec.getGetterBody().accept(this);
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
        // CHECK
        boolean isSubtype = expressionTypeChecker.isFirstSubTypeOfSecond(secondType, firstType);
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
        this.hasReturn = true;
        System.out.println(returnStmt.getLine());
        Type retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(isInSet || isInMain) {
            CannotUseReturn exception = new CannotUseReturn(returnStmt.getLine());
            returnStmt.addError(exception);
            return null;
        }
        Type actualRetType = this.currentGetSetVarType;
        if(!isInGet) {
            actualRetType = this.currentFunction.getReturnType();
        }

        if(retType instanceof VoidType) {
//            CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(returnStmt.getLine());
//            returnStmt.addError(exception);
        }
        else if(!expressionTypeChecker.isFirstSubTypeOfSecond(retType, actualRetType)) {
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
        expressionTypeChecker.setIsInMethodCallStmt(true);
        Type type = listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInMethodCallStmt(false);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
//        expressionTypeChecker.setIsInMethodCallStmt(true);
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
//        expressionTypeChecker.setIsInMethodCallStmt(false);
        return null;
    }
}