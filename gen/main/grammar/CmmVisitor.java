// Generated from /home/ho/C--_Compier/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmm(CmmParser.CmmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CmmParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBody(CmmParser.StructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structVariableDeclarationGetSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVariableDeclarationGetSet(CmmParser.StructVariableDeclarationGetSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CmmParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CmmParser.ArgumentsContext ctx);
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
	 * Visit a parse tree produced by {@link CmmParser#multiFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiFunctionBody(CmmParser.MultiFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CmmParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#singleFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFunctionBody(CmmParser.SingleFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CmmParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(CmmParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(CmmParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(CmmParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(CmmParser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CmmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expresionFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionFunctionCall(CmmParser.ExpresionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expressionOperandAfterOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperandAfterOr(CmmParser.ExpressionOperandAfterOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expressionOperandAfterAndOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperandAfterAndOr(CmmParser.ExpressionOperandAfterAndOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expressionOperandAfterEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperandAfterEq(CmmParser.ExpressionOperandAfterEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expressionOperandAfterLtGt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperandAfterLtGt(CmmParser.ExpressionOperandAfterLtGtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expressionOperandAfterPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperandAfterPlusMinus(CmmParser.ExpressionOperandAfterPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expressionOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOperand(CmmParser.ExpressionOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(CmmParser.IndexContext ctx);
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
	 * Visit a parse tree produced by {@link CmmParser#primitiveFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveFunctions(CmmParser.PrimitiveFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#nestedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedIdentifier(CmmParser.NestedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#fptrVarTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptrVarTypes(CmmParser.FptrVarTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(CmmParser.VariableTypeContext ctx);
}