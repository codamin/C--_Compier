package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.NoType;
import main.ast.types.StructType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.nameError.DuplicateVar;
import main.compileError.nameError.VarFunctionConflict;
import main.compileError.nameError.VarStructConflict;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

public class TypeChecker extends Visitor<Void> {
//    private final Graph<String> strucyHierarchy;
    public ExpressionTypeChecker expressionTypeChecker;
//    public StructDeclaration currentStruct;
    public Declaration currentStruct;
//    public FunctionDeclaration currentFunction;
    public Declaration currentFunction;
    private boolean isInFor = false;
    private boolean isInSet = false;
    private boolean isInGet = false;

    public TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }

    @Override
    public Void visit(Program program) {
        for(FunctionDeclaration functionDeclaration : program.getFunctions()) {
            System.out.println("HIIII There Is is a function here");
            this.expressionTypeChecker.setCurrentFunction(functionDeclaration);
            this.currentFunction = functionDeclaration;
            functionDeclaration.accept(this);
        }
        for(StructDeclaration structDeclaration : program.getStructs()) {
            System.out.println("HIIII There Is is a struct here");

            this.expressionTypeChecker.setCurrentStruct(structDeclaration);
            this.currentStruct = structDeclaration;
            structDeclaration.accept(this);
        }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        System.out.println("^^^^^^^^^^^^$$$$$$$$############^^^^^^^^^^^^^##########^^^^^^^^^^^^^^$$$$$$$$$$" + functionDec.getReturnType());
        this.expressionTypeChecker.checkTypeValidation(functionDec.getReturnType(), functionDec);

        SymbolTable.push(new SymbolTable());
        for(VariableDeclaration varDeclaration : functionDec.getArgs()) {
            varDeclaration.accept(this);
        }
        functionDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        this.expressionTypeChecker.setCurrentFunction(mainDec);
        this.currentFunction = mainDec;
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        SymbolTable.push(new SymbolTable());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        mainDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        if(isInSet || isInGet) {
            CannotUseDefineVar exception = new CannotUseDefineVar(variableDec.getLine());
            variableDec.addError(exception);
        }

        this.expressionTypeChecker.checkTypeValidation(variableDec.getVarType(), variableDec);

        if(variableDec.getDefaultValue() != null) {
            Type defaultValType = variableDec.getDefaultValue().accept(expressionTypeChecker);

            boolean isSubtype = expressionTypeChecker.isFirstSubTypeOfSecond(defaultValType, variableDec.getVarType());
            if(!isSubtype) {
                UnsupportedOperandType exception = new UnsupportedOperandType(variableDec.getLine(), BinaryOperator.assign.name());
                variableDec.addError(exception);
            }
        }

        if (variableDec.getVarType() instanceof StructType) {
            try {
                System.out.println("in pos 1");
                System.out.println(StructSymbolTableItem.START_KEY + ((StructType) variableDec.getVarType()).getStructName().getName());
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + ((StructType) variableDec.getVarType()).getStructName().getName());                    System.out.println("in pos 1");
                System.out.println("in pos 2");
            } catch (ItemNotFoundException classNotFound) {
                StructNotDeclared exception = new StructNotDeclared(variableDec.getLine(), variableDec.getVarType().toString());
                variableDec.addError(exception);
            }
        }

//FOR SYMBOL TABLE $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
        System.out.println("***********************************************************");
        variableSymbolTableItem.setType(variableDec.getVarType());
        System.out.println(variableSymbolTableItem.getType());
        System.out.println("***********************************************************");

        try {
            SymbolTable.top.getItem(variableSymbolTableItem.getKey());
        } catch (ItemNotFoundException exception2) {
            try {
                SymbolTable.top.put(variableSymbolTableItem);
            } catch (ItemAlreadyExistsException exception3) { //unreachable
            }
        }
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        structDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        isInSet = true;
        setGetVarDec.getSetterBody().accept(this);
        isInSet = false;
        isInGet = true;
        setGetVarDec.getGetterBody().accept(this);
        isInGet = false;

        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Type firstType = assignmentStmt.getLValue().accept(expressionTypeChecker);
        Type secondType = assignmentStmt.getRValue().accept(expressionTypeChecker);
        System.out.println("firstType = " + firstType.toString());
        System.out.println("secondType = " + secondType.toString());

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
            System.out.println("WE ARE IN UnsupportedTypeForDisplay ++++++++++++++++++++++++++++++++++++++++++++++++");
            UnsupportedTypeForDisplay exception = new UnsupportedTypeForDisplay(displayStmt.getLine());
            displayStmt.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        if(isInSet) {
            CannotUseReturn exception = new CannotUseReturn(returnStmt.getLine());
            returnStmt.addError(exception);
            //CHECK HERE
            return null;
        }
        Type retType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type actualRetType = ((FunctionDeclaration) this.currentFunction).getReturnType();
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
        Type type = listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }
}