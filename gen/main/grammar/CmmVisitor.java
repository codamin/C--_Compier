// Generated from /home/amin/Desktop/compiler/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#cmmParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmmParser(CmmParser.CmmParserContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(CmmParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CmmParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expressionOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperand(CmmParser.ExpressionOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CmmParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#callArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArguments(CmmParser.CallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CmmParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(CmmParser.VariableTypeContext ctx);
}