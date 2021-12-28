package main.visitor.type;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.types.*;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;
import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    private StructDeclaration currentStruct;
    private Declaration currentFunction;
    private boolean seenNoneLvalue = false;
    private boolean isInFunctionCallStmt = false;

    public void setCurrentFunction(Declaration currentFunction) {
        currentFunction = currentFunction;
    }

    public void setIsInFunctionCallStmt(boolean inIsFunctionCallStmt) {
        isInFunctionCallStmt = inIsFunctionCallStmt;
    }

    boolean getIsInFunctionCallStmt() {
        return isInFunctionCallStmt;
    }

    public boolean doArraysTypesMatch(ArrayList<Type> first, ArrayList<Type> second) {
        if(first.size() == second.size()) {
            for (int i = 0; i < first.size(); i++) {
                if (!doTypesMatch(first.get(i), second.get(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    public boolean doTypesMatch(Type first, Type second) {
        if(first instanceof NoType)
            return true;
        else if(first instanceof IntType || first instanceof BoolType || first instanceof VoidType) {
            return first.toString().equals(second.toString());
        }
        else if(first instanceof StructType) {
            if(!(second instanceof StructType))
                return false;
            else if(((StructType) first).getStructName().getName().equals(((StructType) second).getStructName().getName()))
                return true;
            return false;
        }
        else if(first instanceof FptrType) {
            if(!(second instanceof FptrType))
                return false;
            Type firstRetType = ((FptrType) first).getReturnType();
            Type secondRetType = ((FptrType) second).getReturnType();
            if(!doTypesMatch(firstRetType, secondRetType))
                return false;
            ArrayList<Type> firstArgsTypes = ((FptrType) first).getArgsType();
            ArrayList<Type> secondArgsTypes = ((FptrType) second).getArgsType();
            if(firstArgsTypes.size() != secondArgsTypes.size())
                return false;
            for(int i = 0; i < firstArgsTypes.size(); i++) {
                if(!doTypesMatch(firstArgsTypes.get(i), secondArgsTypes.get(i)))
                    return false;
            }
            return true;
        }
        else if(first instanceof ListType) {
            if(!(second instanceof ListType))
                return false;
            Type firstType = ((ListType)first).getType();
            Type secondType = ((ListType)second).getType();

            if(!doTypesMatch(firstType, secondType))
                return false;
            return true;
        }
        return false;
    }

    public Type getReturnType(Type type) {
        if(validateNodeType(type, new IntValue(0)) > 0)
            return new NoType();
        return type;
    }

    public int validateNodeType(Type type, Node node) {
        int numErrors = 0;
        if(!(type instanceof StructType || type instanceof FptrType || type instanceof ListType))
            return numErrors;
        if(type instanceof ListType) {
            Type elementType = ((ListType) type).getType();
            numErrors += validateNodeType(elementType, node);
        }
        if(type instanceof StructType) {
            String structName = ((StructType)type).getStructName().getName();
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + structName);
            } catch (ItemNotFoundException e) {
                StructNotDeclared exception = new StructNotDeclared(node.getLine(), structName);
                node.addError(exception);
                numErrors += 1;
            }
        }
        if(type instanceof FptrType) {
            numErrors += validateNodeType(((FptrType) type).getReturnType(), node);
            for(Type argType : ((FptrType) type).getArgsType())
                numErrors += validateNodeType(argType, node);
        }
        return numErrors;
    }

    public boolean isLvalue(Expression expression) {
        boolean prevSeenNoneLvalue = seenNoneLvalue;
        seenNoneLvalue = false;
        boolean notLvalue;

        if (Node.isCatchErrorsActive) {
            Node.isCatchErrorsActive = false;
            expression.accept(this);
            notLvalue = seenNoneLvalue;
            Node.isCatchErrorsActive = true;
        }
        else {
            Node.isCatchErrorsActive = false;
            expression.accept(this);
            notLvalue = seenNoneLvalue;
            Node.isCatchErrorsActive = false;
        }
        seenNoneLvalue = prevSeenNoneLvalue;
        return !notLvalue;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        seenNoneLvalue = true;
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        Type firstType = binaryExpression.getFirstOperand().accept(this);
        Type secondType = binaryExpression.getSecondOperand().accept(this);
        if(operator == BinaryOperator.assign) {
            boolean isFirstLvalue = isLvalue(binaryExpression.getFirstOperand());
            if(!isFirstLvalue) {
                LeftSideNotLvalue exception = new LeftSideNotLvalue(binaryExpression.getLine());
                binaryExpression.addError(exception);
            }
            if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            boolean isSubtype = doTypesMatch(secondType, firstType);

            if(isSubtype && isFirstLvalue) {
                return secondType;
            }
            else if(!isFirstLvalue) {
                return new NoType();
            }

            UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
            binaryExpression.addError(exception);
            return new NoType();
        }
        if (firstType instanceof NoType && secondType instanceof NoType) {
            return new NoType();
        }
        if((operator == BinaryOperator.eq)) {
            if(firstType instanceof ListType || secondType instanceof ListType) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }

            boolean isAllowedToeq = firstType instanceof IntType || firstType instanceof BoolType ||
                    firstType instanceof FptrType || firstType instanceof StructType || firstType instanceof VoidType;
            if(isAllowedToeq) {
                if (firstType.toString().equals(secondType.toString())) {
                    return new BoolType();
                }
                else {
                    UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                    binaryExpression.addError(exception);
                    return new NoType();
                }
            }
        }
        if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            if((firstType instanceof IntType) && (secondType instanceof IntType))
                return new BoolType();
            if(!((firstType instanceof NoType) || (firstType instanceof IntType)) || !((secondType instanceof NoType) || (secondType instanceof IntType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            return new NoType();

        }
        if((operator == BinaryOperator.add) || (operator == BinaryOperator.sub) || (operator == BinaryOperator.mult) || (operator == BinaryOperator.div)) {
            if((firstType instanceof IntType) && (secondType instanceof IntType))
                return new IntType();
            if(!((firstType instanceof NoType) || (firstType instanceof IntType)) || !((secondType instanceof NoType) || (secondType instanceof IntType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            return new NoType();
        }
        if((operator == BinaryOperator.or) || (operator == BinaryOperator.and)) {
            if((firstType instanceof BoolType) && (secondType instanceof BoolType))
                return new BoolType();

            if(!((firstType instanceof NoType) || (firstType instanceof BoolType)) || !((secondType instanceof NoType) || (secondType instanceof BoolType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        seenNoneLvalue = true;
        Type operandType = unaryExpression.getOperand().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        if(operandType instanceof NoType)
            return new NoType();

        if(operator == UnaryOperator.not) {
            if(operandType instanceof BoolType) {
                return new BoolType();
            }
            UnsupportedOperandType exception = new UnsupportedOperandType(unaryExpression.getLine(), operator.name());
            unaryExpression.addError(exception);
            return new NoType();
        }
        else if(operator == UnaryOperator.minus) {
            if(operandType instanceof IntType) {
                return new IntType();
            }
            UnsupportedOperandType exception = new UnsupportedOperandType(unaryExpression.getLine(), operator.name());
            unaryExpression.addError(exception);
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        seenNoneLvalue = true;
        Type instanceType = funcCall.getInstance().accept(this);

        boolean prevIsInFunctionCallStmt = isInFunctionCallStmt;
        setIsInFunctionCallStmt(false);
        ArrayList<Type> argsTypes = new ArrayList<>();
        for(Expression arg : funcCall.getArgs()) {
            argsTypes.add(arg.accept(this));
        }
        setIsInFunctionCallStmt(prevIsInFunctionCallStmt);

        if(instanceType instanceof NoType) {
            return new NoType();
        }
        if(!(instanceType instanceof FptrType)) {
            CallOnNoneFptrType exception = new CallOnNoneFptrType(funcCall.getLine());
            funcCall.addError(exception);
            return new NoType();
        }

        boolean temp = false;
        if(!isInFunctionCallStmt && (((FptrType) instanceType).getReturnType() instanceof VoidType)) {
            CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(funcCall.getLine());
            funcCall.addError(exception);
            temp = true;
        }
        if(doArraysTypesMatch(argsTypes, ((FptrType) instanceType).getArgsType())) {
            if(!temp)
                return getReturnType(((FptrType) instanceType).getReturnType());
        }
        else {
            ArgsInFunctionCallNotMatchDefinition exception = new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine());
            funcCall.addError(exception);
        }
        return new NoType();

    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            VariableSymbolTableItem symbolTableItem =
                    (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + identifier.getName());
            return symbolTableItem.getType();
        } catch (ItemNotFoundException e1) {
            try {
                FunctionSymbolTableItem functionSymbolTableItem =
                        (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY + identifier.getName());
                seenNoneLvalue = true;
                return new FptrType(functionSymbolTableItem.getArgTypes(), functionSymbolTableItem.getReturnType());

            } catch (ItemNotFoundException e2) {
                VarNotDeclared exception = new VarNotDeclared(identifier.getLine(), identifier.getName());
                identifier.addError(exception);
                return new NoType();
            }
        }
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        Type instanceType = listAccessByIndex.getInstance().accept(this);
        boolean prevSeenNoneLvalue = seenNoneLvalue;
        Type indexType = listAccessByIndex.getIndex().accept(this);
        seenNoneLvalue = prevSeenNoneLvalue;
        boolean indexHasError = false;
        if(!(indexType instanceof NoType || indexType instanceof IntType)) {
            ListIndexNotInt exception = new ListIndexNotInt(listAccessByIndex.getLine());
            listAccessByIndex.addError(exception);
            indexHasError = true;
        }
        if(instanceType instanceof NoType) {
            return new NoType();
        }
        if(instanceType instanceof ListType) {
            if(indexHasError)
                return new NoType();
            return ((ListType) instanceType).getType();
        }

        AccessByIndexOnNonList exception = new AccessByIndexOnNonList(listAccessByIndex.getLine());
        listAccessByIndex.addError(exception);
        return new NoType();
    }

    @Override
    public Type visit(StructAccess structAccess) {
//        seenNoneLvalue = true; // This actually is for structAccess Lvalue error
        Type instanceType = structAccess.getInstance().accept(this);
        String memberName = structAccess.getElement().getName();
        if(instanceType instanceof NoType)
            return new NoType();
        else if(instanceType instanceof StructType) {
            String structName = ((StructType) instanceType).getStructName().getName();
            SymbolTable structSymbolTable;
            try {
                structSymbolTable = ((StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + structName)).getStructSymbolTable();
            } catch (ItemNotFoundException e) {
                return new NoType();
            }
            try {
                VariableSymbolTableItem fieldSymbolTableItem = (VariableSymbolTableItem) structSymbolTable.getItem(VariableSymbolTableItem.START_KEY + memberName);
                return fieldSymbolTableItem.getType();
            } catch (ItemNotFoundException e) {
                try {
                    FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem) structSymbolTable.getItem(FunctionSymbolTableItem.START_KEY + memberName);
                    seenNoneLvalue = true;
                    return functionSymbolTableItem.getReturnType();

                } catch (ItemNotFoundException e1) {
                    StructMemberNotFound exception = new StructMemberNotFound(structAccess.getLine(), structName, memberName);
                    structAccess.addError(exception);
                    return new NoType();
                }
            }
        }
        else {
            AccessOnNonStruct exception = new AccessOnNonStruct(structAccess.getLine());
            structAccess.addError(exception);
            return new NoType();
        }
    }

    @Override
    public Type visit(ListSize listSize) {
        Type at = listSize.getArg().accept(this);
        if(at instanceof NoType) {
            return new NoType();
        }
        if(!(at instanceof ListType)) {
            GetSizeOfNonList exception = new GetSizeOfNonList(listSize.getLine());
            listSize.addError(exception);
            return new NoType();
        }
        return new IntType();
    }

    @Override
    public Type visit(ListAppend listAppend) {
        boolean prevIsInFunctionCallStmt = isInFunctionCallStmt;
        isInFunctionCallStmt = false;
        Type lat = listAppend.getListArg().accept(this);
        isInFunctionCallStmt = false;
        Type eat = listAppend.getElementArg().accept(this);
        isInFunctionCallStmt = prevIsInFunctionCallStmt;

        if(lat instanceof NoType || eat instanceof NoType) {
            return new NoType();
        }
        if(!(lat instanceof ListType)) {
            AppendToNonList exception = new AppendToNonList(listAppend.getLine());
            listAppend.addError(exception);
            return new NoType();
        }
        if(!doTypesMatch(eat, ((ListType)lat).getType())) {
            NewElementTypeNotMatchListType exception = new NewElementTypeNotMatchListType(listAppend.getLine());
            listAppend.addError(exception);
            return new NoType();
        }
        if(!isInFunctionCallStmt) {
            CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(listAppend.getLine());
            listAppend.addError(exception);
            return new NoType();
        }
        return new VoidType();
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        seenNoneLvalue = true;
        for(Expression eInPar : exprInPar.getInputs()) {
            Type type = eInPar.accept(this);
            return type;
        }
        return new NoType();
    }

    @Override
    public Type visit(IntValue intValue) {
        seenNoneLvalue = true;
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        seenNoneLvalue = true;
        return new BoolType();
    }
}
