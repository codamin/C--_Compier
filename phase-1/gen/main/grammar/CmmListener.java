// Generated from /home/amin/Desktop/compiler/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void enterCmm(CmmParser.CmmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void exitCmm(CmmParser.CmmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(CmmParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(CmmParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structVariableDeclarationGetSet}.
	 * @param ctx the parse tree
	 */
	void enterStructVariableDeclarationGetSet(CmmParser.StructVariableDeclarationGetSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structVariableDeclarationGetSet}.
	 * @param ctx the parse tree
	 */
	void exitStructVariableDeclarationGetSet(CmmParser.StructVariableDeclarationGetSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CmmParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CmmParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(CmmParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(CmmParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CmmParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CmmParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#multiFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiFunctionBody(CmmParser.MultiFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#multiFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiFunctionBody(CmmParser.MultiFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CmmParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CmmParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#singleFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionBody(CmmParser.SingleFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#singleFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionBody(CmmParser.SingleFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CmmParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CmmParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(CmmParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(CmmParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(CmmParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(CmmParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(CmmParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(CmmParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(CmmParser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(CmmParser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expresionFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterExpresionFunctionCall(CmmParser.ExpresionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expresionFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitExpresionFunctionCall(CmmParser.ExpresionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expressionOperandAfterOr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperandAfterOr(CmmParser.ExpressionOperandAfterOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expressionOperandAfterOr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperandAfterOr(CmmParser.ExpressionOperandAfterOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expressionOperandAfterAndOr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperandAfterAndOr(CmmParser.ExpressionOperandAfterAndOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expressionOperandAfterAndOr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperandAfterAndOr(CmmParser.ExpressionOperandAfterAndOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expressionOperandAfterEq}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperandAfterEq(CmmParser.ExpressionOperandAfterEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expressionOperandAfterEq}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperandAfterEq(CmmParser.ExpressionOperandAfterEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expressionOperandAfterLtGt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperandAfterLtGt(CmmParser.ExpressionOperandAfterLtGtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expressionOperandAfterLtGt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperandAfterLtGt(CmmParser.ExpressionOperandAfterLtGtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expressionOperandAfterPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperandAfterPlusMinus(CmmParser.ExpressionOperandAfterPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expressionOperandAfterPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperandAfterPlusMinus(CmmParser.ExpressionOperandAfterPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expressionOperand}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperand(CmmParser.ExpressionOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expressionOperand}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperand(CmmParser.ExpressionOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(CmmParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(CmmParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CmmParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CmmParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void enterCallArguments(CmmParser.CallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void exitCallArguments(CmmParser.CallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#primitiveFunctions}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveFunctions(CmmParser.PrimitiveFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#primitiveFunctions}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveFunctions(CmmParser.PrimitiveFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedIdentifier(CmmParser.NestedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedIdentifier(CmmParser.NestedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#fptrVarTypes}.
	 * @param ctx the parse tree
	 */
	void enterFptrVarTypes(CmmParser.FptrVarTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#fptrVarTypes}.
	 * @param ctx the parse tree
	 */
	void exitFptrVarTypes(CmmParser.FptrVarTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(CmmParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(CmmParser.VariableTypeContext ctx);
}