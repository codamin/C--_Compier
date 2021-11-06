// Generated from /home/amin/Desktop/compiler/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(CmmParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(CmmParser.RContext ctx);
}