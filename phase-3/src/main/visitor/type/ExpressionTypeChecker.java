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

import javax.lang.model.type.NullType;
import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    private StructDeclaration currentStruct;
    private Declaration currentFunction;
    private int typeValidationNumberOfErrors;
    private boolean seenNoneLvalue = false;
    private boolean isInFunctionCallStmt = false;

    public void setCurrentFunction(Declaration currentFunction) {
        this.currentFunction = currentFunction;
    }

    public void setIsInFunctionCallStmt(boolean inIsFunctionCallStmt) {
        isInFunctionCallStmt = inIsFunctionCallStmt;
    }

    boolean getIsInFunctionCallStmt() {
        return this.isInFunctionCallStmt;
    }

    public boolean isFirstSubTypeOfSecondMultiple(ArrayList<Type> first, ArrayList<Type> second) {
        if(first.size() != second.size())
            return false;
        for(int i = 0; i < first.size(); i++) {
            if(!isFirstSubTypeOfSecond(first.get(i), second.get(i)))
                return false;
        }
        return true;
    }

    public boolean isFirstSubTypeOfSecond(Type first, Type second) {
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
            if(!firstRetType.toString().equals(secondRetType.toString()))
                return false;
            ArrayList<Type> firstArgsTypes = ((FptrType) first).getArgsType();
            ArrayList<Type> secondArgsTypes = ((FptrType) second).getArgsType();
            if(firstArgsTypes.size() != secondArgsTypes.size())
                return false;
            for(int i = 0; i < firstArgsTypes.size(); i++) {
                if(!firstArgsTypes.get(i).toString().equals(secondArgsTypes.get(i).toString()))
                    return false;
            }
            return true;
        }
        else if(first instanceof ListType) {
            if(!(second instanceof ListType))
                return false;
            Type firstType = ((ListType)first).getType();
            Type secondType = ((ListType)second).getType();

            if(firstType.toString().equals(secondType.toString()))
                return true;
        }
        return false;
    }

    public Type refineType(Type type) {
        typeValidationNumberOfErrors = 0;
        this.checkTypeValidation(type, new IntValue(0));
        if(typeValidationNumberOfErrors > 0)
            return new NoType();
        return type;
    }

    public int checkTypeValidation(Type type, Node node) {
        int ans = 0;
        if(!(type instanceof StructType || type instanceof FptrType || type instanceof ListType))
            return ans;
        if(type instanceof ListType) {
            Type elementType = ((ListType) type).getType();
            ans += this.checkTypeValidation(elementType, node);
        }
        if(type instanceof StructType) {
            String structName = ((StructType)type).getStructName().getName();
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + structName);
            } catch (ItemNotFoundException e) {
                StructNotDeclared exception = new StructNotDeclared(node.getLine(), structName);
                node.addError(exception);
                ans += 1;
            }
        }
        if(type instanceof FptrType) {
            Type retType = ((FptrType) type).getReturnType();
            ArrayList<Type> argsType = ((FptrType) type).getArgsType();
            ans += this.checkTypeValidation(retType, node);
            for(Type argType : argsType)
                ans += this.checkTypeValidation(argType, node);
        }
        return ans;
    }

    public boolean isLvalue(Expression expression) {
        boolean prevIsCatchErrorsActive = Node.isCatchErrorsActive;
        boolean prevSeenNoneLvalue = this.seenNoneLvalue;
        Node.isCatchErrorsActive = false;
        this.seenNoneLvalue = false;
        expression.accept(this);
        boolean isLvalue = !this.seenNoneLvalue;
        this.seenNoneLvalue = prevSeenNoneLvalue;
        Node.isCatchErrorsActive = prevIsCatchErrorsActive;
        return isLvalue;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        this.seenNoneLvalue = true;
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        Type firstType = binaryExpression.getFirstOperand().accept(this);
        Type secondType = binaryExpression.getSecondOperand().accept(this);
        if((operator == BinaryOperator.eq)) {
            if (firstType instanceof NoType && secondType instanceof NoType) {
                return new NoType();
            }
            if(firstType instanceof ListType || secondType instanceof ListType) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }

            if(firstType instanceof IntType || firstType instanceof BoolType || firstType instanceof FptrType || firstType instanceof StructType) {
                if (firstType.toString().equals(secondType.toString()))
                    return new BoolType();
            }

            if((firstType instanceof StructType && secondType instanceof NullType) ||
                    (firstType instanceof NullType && secondType instanceof StructType) ||
                    (firstType instanceof StructType && secondType instanceof StructType &&
                            ((StructType)firstType).getStructName().getName().equals(((StructType)secondType).getStructName().getName()))) {
                return new BoolType();
            }
            if((firstType instanceof FptrType && secondType instanceof NullType) ||
                    (firstType instanceof NullType && secondType instanceof FptrType) ||
                    (firstType instanceof FptrType && secondType instanceof FptrType)) {
                return new BoolType();
            }
            if(firstType instanceof NullType && secondType instanceof NullType)
                return new BoolType();
        }
        if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            if(firstType instanceof NoType && secondType instanceof NoType)
                return new NoType();
            else if((firstType instanceof NoType && !(secondType instanceof IntType)) ||
                    (secondType instanceof NoType && !(firstType instanceof IntType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType)
                return new NoType();
            if((firstType instanceof IntType) && (secondType instanceof IntType))
                return new BoolType();
        }
        if((operator == BinaryOperator.add) || (operator == BinaryOperator.sub) ||
                (operator == BinaryOperator.mult) || (operator == BinaryOperator.div)) {
            if(firstType instanceof NoType && secondType instanceof NoType)
                return new NoType();
            else if((firstType instanceof NoType && !(secondType instanceof IntType)) ||
                    (secondType instanceof NoType && !(firstType instanceof IntType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType)
                return new NoType();
            if((firstType instanceof IntType) && (secondType instanceof IntType))
                return new IntType();
        }

        if((operator == BinaryOperator.or) || (operator == BinaryOperator.and)) {
            if(firstType instanceof NoType && secondType instanceof NoType)
                return new NoType();
            else if((firstType instanceof NoType && !(secondType instanceof BoolType)) ||
                    (secondType instanceof NoType && !(firstType instanceof BoolType))) {
                UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else if(firstType instanceof NoType || secondType instanceof NoType)
                return new NoType();
            if((firstType instanceof BoolType) && (secondType instanceof BoolType))
                return new BoolType();
        }
        if(operator == BinaryOperator.assign) {
            boolean isFirstLvalue = this.isLvalue(binaryExpression.getFirstOperand());
            if(!isFirstLvalue) {
                LeftSideNotLvalue exception = new LeftSideNotLvalue(binaryExpression.getLine());
                binaryExpression.addError(exception);
            }
            if(firstType instanceof NoType || secondType instanceof NoType) {
                return new NoType();
            }
            boolean isSubtype = this.isFirstSubTypeOfSecond(secondType, firstType);
            if(isSubtype) {
                if(isFirstLvalue)
                    return secondType;
                return new NoType();
            }
            UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
            binaryExpression.addError(exception);
            return new NoType();
        }
        UnsupportedOperandType exception = new UnsupportedOperandType(binaryExpression.getLine(), operator.name());
        binaryExpression.addError(exception);
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        this.seenNoneLvalue = true;
        Type operandType = unaryExpression.getOperand().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        if(operator == UnaryOperator.not) {
            if(operandType instanceof NoType)
                return new NoType();
            if(operandType instanceof BoolType)
                return operandType;
            UnsupportedOperandType exception = new UnsupportedOperandType(unaryExpression.getLine(), operator.name());
            unaryExpression.addError(exception);
            return new NoType();
        }
        else if(operator == UnaryOperator.minus) {
            if(operandType instanceof NoType)
                return new NoType();
            if(operandType instanceof IntType)
                return operandType;
            UnsupportedOperandType exception = new UnsupportedOperandType(unaryExpression.getLine(), operator.name());
            unaryExpression.addError(exception);
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        this.seenNoneLvalue = true;
        Type instanceType = funcCall.getInstance().accept(this);

        boolean prevIsInFunctionCallStmt = this.isInFunctionCallStmt;
        this.setIsInFunctionCallStmt(false);
        ArrayList<Type> argsTypes = new ArrayList<>();
        for(Expression arg : funcCall.getArgs()) {
            argsTypes.add(arg.accept(this));
        }
        this.setIsInFunctionCallStmt(prevIsInFunctionCallStmt);

        if(!(instanceType instanceof FptrType || instanceType instanceof NoType)) {
            CallOnNoneFptrType exception = new CallOnNoneFptrType(funcCall.getLine());
            funcCall.addError(exception);
            return new NoType();
        }
        else if(instanceType instanceof NoType) {
            return new NoType();
        }
        else {
            ArrayList<Type> actualArgsTypes = ((FptrType) instanceType).getArgsType();
            Type returnType = ((FptrType) instanceType).getReturnType();
            if(!isInFunctionCallStmt && (returnType instanceof VoidType)) {
                CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(funcCall.getLine());
                funcCall.addError(exception);
            }
            if(this.isFirstSubTypeOfSecondMultiple(argsTypes, actualArgsTypes)) {
                return this.refineType(returnType);
            }
            else {
                ArgsInFunctionCallNotMatchDefinition exception = new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine());
                funcCall.addError(exception);
                return new NoType();
            }
        }

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
        boolean prevSeenNoneLvalue = this.seenNoneLvalue;
        Type indexType = listAccessByIndex.getIndex().accept(this);
        this.seenNoneLvalue = prevSeenNoneLvalue;
        boolean indexErrored = false;
        if(!(indexType instanceof NoType || indexType instanceof IntType)) {
            ListIndexNotInt exception = new ListIndexNotInt(listAccessByIndex.getLine());
            listAccessByIndex.addError(exception);
            indexErrored = true;
        }
        if(instanceType instanceof ListType) {
            Type lt = ((ListType) instanceType).getType();
            if(indexErrored)
                return new NoType();
        }
        else if(instanceType instanceof NoType) {
            return new NoType();
        }
        else if(!(instanceType instanceof NoType)) {
            AccessByIndexOnNonList exception = new AccessByIndexOnNonList(listAccessByIndex.getLine());
            listAccessByIndex.addError(exception);
            return new NoType();
        }
        return ((ListType) instanceType).getType();
    }

    @Override
    public Type visit(StructAccess structAccess) {
//        this.seenNoneLvalue = true; // This actually is for structAccess Lvalue error
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
                    this.seenNoneLvalue = true;
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
        if(!isInFunctionCallStmt) {
            CantUseValueOfVoidFunction exception = new CantUseValueOfVoidFunction(listAppend.getLine());
            listAppend.addError(exception);
        }

        boolean prevIsInFunctionCallStmt = this.isInFunctionCallStmt;
        this.isInFunctionCallStmt = false;
        Type lat = listAppend.getListArg().accept(this);
        this.isInFunctionCallStmt = false;
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
        if(!isFirstSubTypeOfSecond(eat, ((ListType)lat).getType())) {
            NewElementTypeNotMatchListType exception = new NewElementTypeNotMatchListType(listAppend.getLine());
            listAppend.addError(exception);
            return new NoType();
        }
        return new VoidType();
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        this.seenNoneLvalue = true;
        for(Expression eInPar : exprInPar.getInputs()) {
            Type type = eInPar.accept(this);
            return type;
        }
        return new NoType();
    }

    @Override
    public Type visit(IntValue intValue) {
        this.seenNoneLvalue = true;
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        this.seenNoneLvalue = true;
        return new BoolType();
    }
}
