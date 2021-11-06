// Generated from /home/amin/Desktop/compiler/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#cmmParser}.
	 * @param ctx the parse tree
	 */
	void enterCmmParser(CmmParser.CmmParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#cmmParser}.
	 * @param ctx the parse tree
	 */
	void exitCmmParser(CmmParser.CmmParserContext ctx);
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