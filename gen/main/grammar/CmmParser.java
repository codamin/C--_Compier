// Generated from /home/amin/Desktop/compiler/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUM=3, PLUS=4, MINUS=5, MULT=6, DIVIDE=7, COMMA=8, DOT=9, 
		GT=10, LT=11, ASSIGN=12, EQ=13, AND=14, OR=15, NEG=16, LPAR=17, RPAR=18, 
		SHARP=19, NEWLINE=20, INT=21, BOOL=22, LIST=23, STRUCT=24, FALSE=25, TRUE=26, 
		BEGIN=27, END=28, RETURN=29, MAIN=30, DISPLAY=31, APPEND=32, SIZE=33, 
		VOID=34, GET=35, SET=36, WHILE=37, DO=38, IF=39, ELSE=40, FPTR=41, IDENTIFIER=42, 
		WS=43, COMMENT=44;
	public static final int
		RULE_cmmParser = 0, RULE_structDeclaration = 1, RULE_structBody = 2, RULE_structVariableDeclarationGetSet = 3, 
		RULE_methodDeclaration = 4, RULE_arguments = 5, RULE_mainDeclaration = 6, 
		RULE_functionBody = 7, RULE_multiFunctionBody = 8, RULE_returnStmt = 9, 
		RULE_singleFunctionBody = 10, RULE_variableDeclaration = 11, RULE_ifBlock = 12, 
		RULE_elseBlock = 13, RULE_whileBlock = 14, RULE_doWhileBlock = 15, RULE_assignment = 16, 
		RULE_expression = 17, RULE_expressionOperandAfterPlusMinus = 18, RULE_expressionOperandAfterMultDiv = 19, 
		RULE_expressionOperandAfterCond = 20, RULE_expressionOperand = 21, RULE_functionCall = 22, 
		RULE_call = 23, RULE_callArguments = 24, RULE_primitiveFunctions = 25, 
		RULE_fptrVarTypes = 26, RULE_variableType = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmmParser", "structDeclaration", "structBody", "structVariableDeclarationGetSet", 
			"methodDeclaration", "arguments", "mainDeclaration", "functionBody", 
			"multiFunctionBody", "returnStmt", "singleFunctionBody", "variableDeclaration", 
			"ifBlock", "elseBlock", "whileBlock", "doWhileBlock", "assignment", "expression", 
			"expressionOperandAfterPlusMinus", "expressionOperandAfterMultDiv", "expressionOperandAfterCond", 
			"expressionOperand", "functionCall", "call", "callArguments", "primitiveFunctions", 
			"fptrVarTypes", "variableType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'->'", null, "'+'", "'-'", "'*'", "'/'", "','", "'.'", 
			"'>'", "'<'", "'='", "'=='", "'&'", "'|'", "'~'", "'('", "')'", "'#'", 
			null, "'int'", "'bool'", "'list'", "'struct'", "'false'", "'true'", "'begin'", 
			"'end'", "'return'", "'main'", "'display'", "'append'", "'size'", "'void'", 
			"'get'", "'set'", "'while'", "'do'", "'if'", "'else'", "'fptr'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUM", "PLUS", "MINUS", "MULT", "DIVIDE", "COMMA", 
			"DOT", "GT", "LT", "ASSIGN", "EQ", "AND", "OR", "NEG", "LPAR", "RPAR", 
			"SHARP", "NEWLINE", "INT", "BOOL", "LIST", "STRUCT", "FALSE", "TRUE", 
			"BEGIN", "END", "RETURN", "MAIN", "DISPLAY", "APPEND", "SIZE", "VOID", 
			"GET", "SET", "WHILE", "DO", "IF", "ELSE", "FPTR", "IDENTIFIER", "WS", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmmParserContext extends ParserRuleContext {
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public CmmParserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmmParser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmmParser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmmParser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmmParser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmParserContext cmmParser() throws RecognitionException {
		CmmParserContext _localctx = new CmmParserContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmmParser);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					structDeclaration();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << VOID) | (1L << FPTR))) != 0)) {
				{
				{
				setState(62);
				methodDeclaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			mainDeclaration();
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(STRUCT);
			setState(72);
			match(IDENTIFIER);
			setState(73);
			match(BEGIN);
			setState(74);
			structBody();
			setState(75);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructBodyContext extends ParserRuleContext {
		public List<StructVariableDeclarationGetSetContext> structVariableDeclarationGetSet() {
			return getRuleContexts(StructVariableDeclarationGetSetContext.class);
		}
		public StructVariableDeclarationGetSetContext structVariableDeclarationGetSet(int i) {
			return getRuleContext(StructVariableDeclarationGetSetContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					{
					setState(77);
					variableDeclaration();
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(78);
							match(T__0);
							setState(79);
							variableDeclaration();
							}
							} 
						}
						setState(84);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(85);
						match(T__0);
						}
					}

					}
					}
					break;
				case 2:
					{
					setState(88);
					structVariableDeclarationGetSet();
					}
					break;
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructVariableDeclarationGetSetContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StructVariableDeclarationGetSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVariableDeclarationGetSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructVariableDeclarationGetSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructVariableDeclarationGetSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructVariableDeclarationGetSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVariableDeclarationGetSetContext structVariableDeclarationGetSet() throws RecognitionException {
		StructVariableDeclarationGetSetContext _localctx = new StructVariableDeclarationGetSetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structVariableDeclarationGetSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			variableType();
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(LPAR);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(97);
				arguments();
				}
			}

			setState(100);
			match(RPAR);
			setState(101);
			match(BEGIN);
			setState(102);
			match(SET);
			setState(103);
			functionBody();
			setState(104);
			match(GET);
			setState(105);
			functionBody();
			setState(106);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(108);
				variableType();
				}
				break;
			case VOID:
				{
				setState(109);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(LPAR);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(114);
				arguments();
				}
			}

			setState(117);
			match(RPAR);
			setState(118);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<VariableTypeContext> variableType() {
			return getRuleContexts(VariableTypeContext.class);
		}
		public VariableTypeContext variableType(int i) {
			return getRuleContext(VariableTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CmmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CmmParser.IDENTIFIER, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			variableType();
			{
			setState(121);
			match(IDENTIFIER);
			}
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				variableType();
				{
				setState(125);
				match(IDENTIFIER);
				}
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclarationContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public MultiFunctionBodyContext multiFunctionBody() {
			return getRuleContext(MultiFunctionBodyContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(MAIN);
			setState(133);
			match(LPAR);
			setState(134);
			match(RPAR);
			setState(135);
			multiFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public SingleFunctionBodyContext singleFunctionBody() {
			return getRuleContext(SingleFunctionBodyContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public MultiFunctionBodyContext multiFunctionBody() {
			return getRuleContext(MultiFunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(137);
				match(BEGIN);
				setState(138);
				multiFunctionBody();
				setState(139);
				match(END);
				}
				}
				break;
			case NUM:
			case PLUS:
			case MINUS:
			case NEG:
			case LPAR:
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FALSE:
			case TRUE:
			case RETURN:
			case DISPLAY:
			case APPEND:
			case SIZE:
			case WHILE:
			case DO:
			case IF:
			case FPTR:
			case IDENTIFIER:
				{
				setState(141);
				singleFunctionBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiFunctionBodyContext extends ParserRuleContext {
		public List<DoWhileBlockContext> doWhileBlock() {
			return getRuleContexts(DoWhileBlockContext.class);
		}
		public DoWhileBlockContext doWhileBlock(int i) {
			return getRuleContext(DoWhileBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public MultiFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiFunctionBodyContext multiFunctionBody() throws RecognitionException {
		MultiFunctionBodyContext _localctx = new MultiFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiFunctionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAR) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FALSE) | (1L << TRUE) | (1L << RETURN) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << FPTR) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
				case PLUS:
				case MINUS:
				case NEG:
				case LPAR:
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
				case FALSE:
				case TRUE:
				case DISPLAY:
				case APPEND:
				case SIZE:
				case FPTR:
				case IDENTIFIER:
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(144);
						assignment();
						}
						break;
					case 2:
						{
						setState(145);
						expression();
						}
						break;
					case 3:
						{
						setState(146);
						variableDeclaration();
						}
						break;
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(149);
							match(T__0);
							setState(153);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
							case 1:
								{
								setState(150);
								assignment();
								}
								break;
							case 2:
								{
								setState(151);
								expression();
								}
								break;
							case 3:
								{
								setState(152);
								variableDeclaration();
								}
								break;
							}
							}
							} 
						}
						setState(159);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(160);
						match(T__0);
						}
					}

					}
					break;
				case DO:
					{
					setState(163);
					doWhileBlock();
					}
					break;
				case IF:
					{
					setState(164);
					ifBlock();
					}
					break;
				case WHILE:
					{
					setState(165);
					whileBlock();
					}
					break;
				case RETURN:
					{
					setState(166);
					returnStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(RETURN);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(173);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionBodyContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public SingleFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionBodyContext singleFunctionBody() throws RecognitionException {
		SingleFunctionBodyContext _localctx = new SingleFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_singleFunctionBody);
		int _la;
		try {
			int _alt;
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case PLUS:
			case MINUS:
			case NEG:
			case LPAR:
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FALSE:
			case TRUE:
			case DISPLAY:
			case APPEND:
			case SIZE:
			case FPTR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(176);
					assignment();
					}
					break;
				case 2:
					{
					setState(177);
					expression();
					}
					break;
				case 3:
					{
					setState(178);
					variableDeclaration();
					}
					break;
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						match(T__0);
						setState(185);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(182);
							assignment();
							}
							break;
						case 2:
							{
							setState(183);
							expression();
							}
							break;
						case 3:
							{
							setState(184);
							variableDeclaration();
							}
							break;
						}
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(192);
					match(T__0);
					}
				}

				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				ifBlock();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				whileBlock();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				doWhileBlock();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				returnStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CmmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CmmParser.IDENTIFIER, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			variableType();
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(202);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(203);
				assignment();
				}
				break;
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(207);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(208);
					assignment();
					}
					break;
				}
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(IF);
			setState(217);
			expression();
			setState(218);
			functionBody();
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(219);
				elseBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ELSE);
			setState(223);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(WHILE);
			setState(226);
			expression();
			setState(227);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(DO);
			setState(230);
			functionBody();
			setState(231);
			match(WHILE);
			setState(232);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(IDENTIFIER);
			setState(235);
			match(ASSIGN);
			setState(236);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(CmmParser.NEG, 0); }
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public List<ExpressionOperandAfterPlusMinusContext> expressionOperandAfterPlusMinus() {
			return getRuleContexts(ExpressionOperandAfterPlusMinusContext.class);
		}
		public ExpressionOperandAfterPlusMinusContext expressionOperandAfterPlusMinus(int i) {
			return getRuleContext(ExpressionOperandAfterPlusMinusContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(238);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(241);
				match(LPAR);
				setState(242);
				expression();
				setState(243);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				expressionOperandAfterPlusMinus();
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expressionOperandAfterPlusMinus();
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOperandAfterPlusMinusContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionOperandAfterPlusMinusContext expressionOperandAfterPlusMinus() {
			return getRuleContext(ExpressionOperandAfterPlusMinusContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(CmmParser.NEG, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public List<ExpressionOperandAfterMultDivContext> expressionOperandAfterMultDiv() {
			return getRuleContexts(ExpressionOperandAfterMultDivContext.class);
		}
		public ExpressionOperandAfterMultDivContext expressionOperandAfterMultDiv(int i) {
			return getRuleContext(ExpressionOperandAfterMultDivContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CmmParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public ExpressionOperandAfterPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperandAfterPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperandAfterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperandAfterPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperandAfterPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandAfterPlusMinusContext expressionOperandAfterPlusMinus() throws RecognitionException {
		ExpressionOperandAfterPlusMinusContext _localctx = new ExpressionOperandAfterPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionOperandAfterPlusMinus);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(255);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(258);
				match(LPAR);
				setState(259);
				expressionOperandAfterPlusMinus();
				setState(260);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				expressionOperandAfterMultDiv();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIVIDE) {
					{
					{
					setState(263);
					_la = _input.LA(1);
					if ( !(_la==MULT || _la==DIVIDE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(264);
					expressionOperandAfterMultDiv();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOperandAfterMultDivContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionOperandAfterMultDivContext expressionOperandAfterMultDiv() {
			return getRuleContext(ExpressionOperandAfterMultDivContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(CmmParser.NEG, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public List<ExpressionOperandAfterCondContext> expressionOperandAfterCond() {
			return getRuleContexts(ExpressionOperandAfterCondContext.class);
		}
		public ExpressionOperandAfterCondContext expressionOperandAfterCond(int i) {
			return getRuleContext(ExpressionOperandAfterCondContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(CmmParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CmmParser.EQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(CmmParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CmmParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CmmParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CmmParser.GT, i);
		}
		public ExpressionOperandAfterMultDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperandAfterMultDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperandAfterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperandAfterMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperandAfterMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandAfterMultDivContext expressionOperandAfterMultDiv() throws RecognitionException {
		ExpressionOperandAfterMultDivContext _localctx = new ExpressionOperandAfterMultDivContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionOperandAfterMultDiv);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(272);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(275);
				match(LPAR);
				setState(276);
				expressionOperandAfterMultDiv();
				setState(277);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				expressionOperandAfterCond();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) {
					{
					{
					setState(280);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(281);
					expressionOperandAfterCond();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOperandAfterCondContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionOperandAfterCondContext expressionOperandAfterCond() {
			return getRuleContext(ExpressionOperandAfterCondContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(CmmParser.NEG, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public List<ExpressionOperandContext> expressionOperand() {
			return getRuleContexts(ExpressionOperandContext.class);
		}
		public ExpressionOperandContext expressionOperand(int i) {
			return getRuleContext(ExpressionOperandContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
		}
		public ExpressionOperandAfterCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperandAfterCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperandAfterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperandAfterCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperandAfterCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandAfterCondContext expressionOperandAfterCond() throws RecognitionException {
		ExpressionOperandAfterCondContext _localctx = new ExpressionOperandAfterCondContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionOperandAfterCond);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(289);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(292);
				match(LPAR);
				setState(293);
				expressionOperandAfterCond();
				setState(294);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				expressionOperand();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(297);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(298);
					expressionOperand();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOperandContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionOperandContext expressionOperand() {
			return getRuleContext(ExpressionOperandContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(CmmParser.NEG, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrimitiveFunctionsContext primitiveFunctions() {
			return getRuleContext(PrimitiveFunctionsContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CmmParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public ExpressionOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandContext expressionOperand() throws RecognitionException {
		ExpressionOperandContext _localctx = new ExpressionOperandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionOperand);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(306);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(309);
				match(LPAR);
				setState(310);
				expressionOperand();
				setState(311);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				primitiveFunctions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				match(FALSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				match(IDENTIFIER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(319);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				expressionOperand();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(IDENTIFIER);
			setState(324);
			call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LPAR);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAR) | (1L << FALSE) | (1L << TRUE) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(327);
				callArguments();
				}
			}

			setState(330);
			match(RPAR);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(331);
				call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public CallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			expression();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				expression();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveFunctionsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CmmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CmmParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public PrimitiveFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPrimitiveFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPrimitiveFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPrimitiveFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveFunctionsContext primitiveFunctions() throws RecognitionException {
		PrimitiveFunctionsContext _localctx = new PrimitiveFunctionsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primitiveFunctions);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==DISPLAY || _la==SIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(343);
				match(LPAR);
				setState(344);
				match(IDENTIFIER);
				setState(345);
				match(RPAR);
				}
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(346);
				match(APPEND);
				setState(347);
				match(LPAR);
				setState(348);
				match(IDENTIFIER);
				setState(349);
				match(COMMA);
				setState(350);
				match(IDENTIFIER);
				setState(351);
				match(RPAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FptrVarTypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public List<TerminalNode> LIST() { return getTokens(CmmParser.LIST); }
		public TerminalNode LIST(int i) {
			return getToken(CmmParser.LIST, i);
		}
		public List<TerminalNode> SHARP() { return getTokens(CmmParser.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(CmmParser.SHARP, i);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public FptrVarTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrVarTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrVarTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrVarTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrVarTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrVarTypesContext fptrVarTypes() throws RecognitionException {
		FptrVarTypesContext _localctx = new FptrVarTypesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fptrVarTypes);
		try {
			int _alt;
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(BOOL);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(356);
				match(STRUCT);
				setState(357);
				match(IDENTIFIER);
				}
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(358);
				match(LIST);
				setState(359);
				match(SHARP);
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						match(LIST);
						setState(361);
						match(SHARP);
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(367);
				variableType();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableTypeContext extends ParserRuleContext {
		public List<FptrVarTypesContext> fptrVarTypes() {
			return getRuleContexts(FptrVarTypesContext.class);
		}
		public FptrVarTypesContext fptrVarTypes(int i) {
			return getRuleContext(FptrVarTypesContext.class,i);
		}
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LT() { return getToken(CmmParser.LT, 0); }
		public TerminalNode GT() { return getToken(CmmParser.GT, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableType);
		int _la;
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				fptrVarTypes();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(371);
				match(FPTR);
				setState(372);
				match(LT);
				setState(382);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					{
					setState(373);
					fptrVarTypes();
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(374);
						match(COMMA);
						setState(375);
						fptrVarTypes();
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case VOID:
					{
					setState(381);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(384);
				match(T__1);
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					setState(385);
					fptrVarTypes();
					}
					break;
				case VOID:
					{
					setState(386);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(389);
				match(GT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\7\4S\n\4\f\4\16\4V\13\4\3\4\5\4Y\n\4\3\4\7\4\\\n\4\f\4\16\4_\13\4"+
		"\3\5\3\5\3\5\3\5\5\5e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6"+
		"q\n\6\3\6\3\6\3\6\5\6v\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u0082\n\7\f\7\16\7\u0085\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0091\n\t\3\n\3\n\3\n\5\n\u0096\n\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n"+
		"\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\n\5\n\u00a4\n\n\3\n\3\n\3\n\3\n\7"+
		"\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f"+
		"\5\f\u00b6\n\f\3\f\3\f\3\f\3\f\5\f\u00bc\n\f\7\f\u00be\n\f\f\f\16\f\u00c1"+
		"\13\f\3\f\5\f\u00c4\n\f\3\f\3\f\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\r\5\r"+
		"\u00cf\n\r\3\r\3\r\3\r\5\r\u00d4\n\r\7\r\u00d6\n\r\f\r\16\r\u00d9\13\r"+
		"\3\16\3\16\3\16\3\16\5\16\u00df\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\5\23\u00f2\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00fb\n\23\f\23\16\23\u00fe\13\23"+
		"\5\23\u0100\n\23\3\24\5\24\u0103\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u010c\n\24\f\24\16\24\u010f\13\24\5\24\u0111\n\24\3\25\5\25\u0114"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u011d\n\25\f\25\16\25\u0120"+
		"\13\25\5\25\u0122\n\25\3\26\5\26\u0125\n\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u012e\n\26\f\26\16\26\u0131\13\26\5\26\u0133\n\26\3\27\5"+
		"\27\u0136\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0144\n\27\3\30\3\30\3\30\3\31\3\31\5\31\u014b\n\31\3\31\3"+
		"\31\5\31\u014f\n\31\3\32\3\32\3\32\7\32\u0154\n\32\f\32\16\32\u0157\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0163\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u016d\n\34\f\34\16\34\u0170"+
		"\13\34\3\34\5\34\u0173\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u017b\n"+
		"\35\f\35\16\35\u017e\13\35\3\35\5\35\u0181\n\35\3\35\3\35\3\35\5\35\u0186"+
		"\n\35\3\35\5\35\u0189\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\b\4\2\6\7\22\22\3\2\6\7\3\2\b\t\4\2\f\r"+
		"\17\17\3\2\20\21\4\2!!##\2\u01b3\2=\3\2\2\2\4I\3\2\2\2\6]\3\2\2\2\b`\3"+
		"\2\2\2\np\3\2\2\2\fz\3\2\2\2\16\u0086\3\2\2\2\20\u0090\3\2\2\2\22\u00ab"+
		"\3\2\2\2\24\u00ae\3\2\2\2\26\u00c9\3\2\2\2\30\u00cb\3\2\2\2\32\u00da\3"+
		"\2\2\2\34\u00e0\3\2\2\2\36\u00e3\3\2\2\2 \u00e7\3\2\2\2\"\u00ec\3\2\2"+
		"\2$\u00ff\3\2\2\2&\u0110\3\2\2\2(\u0121\3\2\2\2*\u0132\3\2\2\2,\u0143"+
		"\3\2\2\2.\u0145\3\2\2\2\60\u0148\3\2\2\2\62\u0150\3\2\2\2\64\u0162\3\2"+
		"\2\2\66\u0172\3\2\2\28\u0188\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\5\n\6\2A@\3\2\2\2BE\3\2\2\2CA\3"+
		"\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\5\16\b\2GH\7\2\2\3H\3\3\2\2\2I"+
		"J\7\32\2\2JK\7,\2\2KL\7\35\2\2LM\5\6\4\2MN\7\36\2\2N\5\3\2\2\2OT\5\30"+
		"\r\2PQ\7\3\2\2QS\5\30\r\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3"+
		"\2\2\2VT\3\2\2\2WY\7\3\2\2XW\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2Z\\\5\b\5\2["+
		"O\3\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_]\3\2\2"+
		"\2`a\58\35\2ab\7,\2\2bd\7\23\2\2ce\5\f\7\2dc\3\2\2\2de\3\2\2\2ef\3\2\2"+
		"\2fg\7\24\2\2gh\7\35\2\2hi\7&\2\2ij\5\20\t\2jk\7%\2\2kl\5\20\t\2lm\7\36"+
		"\2\2m\t\3\2\2\2nq\58\35\2oq\7$\2\2pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rs\7,"+
		"\2\2su\7\23\2\2tv\5\f\7\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\24\2\2xy\5"+
		"\20\t\2y\13\3\2\2\2z{\58\35\2{|\7,\2\2|\u0083\3\2\2\2}~\7\n\2\2~\177\5"+
		"8\35\2\177\u0080\7,\2\2\u0080\u0082\3\2\2\2\u0081}\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7 \2\2\u0087\u0088\7\23\2\2\u0088\u0089\7\24"+
		"\2\2\u0089\u008a\5\22\n\2\u008a\17\3\2\2\2\u008b\u008c\7\35\2\2\u008c"+
		"\u008d\5\22\n\2\u008d\u008e\7\36\2\2\u008e\u0091\3\2\2\2\u008f\u0091\5"+
		"\26\f\2\u0090\u008b\3\2\2\2\u0090\u008f\3\2\2\2\u0091\21\3\2\2\2\u0092"+
		"\u0096\5\"\22\2\u0093\u0096\5$\23\2\u0094\u0096\5\30\r\2\u0095\u0092\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u009f\3\2\2\2\u0097"+
		"\u009b\7\3\2\2\u0098\u009c\5\"\22\2\u0099\u009c\5$\23\2\u009a\u009c\5"+
		"\30\r\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0097\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\7\3\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00aa\3\2"+
		"\2\2\u00a5\u00aa\5 \21\2\u00a6\u00aa\5\32\16\2\u00a7\u00aa\5\36\20\2\u00a8"+
		"\u00aa\5\24\13\2\u00a9\u0095\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ab\3\2\2"+
		"\2\u00ae\u00b0\7\37\2\2\u00af\u00b1\5$\23\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b6\5\"\22\2\u00b3\u00b6\5$\23"+
		"\2\u00b4\u00b6\5\30\r\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00bf\3\2\2\2\u00b7\u00bb\7\3\2\2\u00b8\u00bc\5\""+
		"\22\2\u00b9\u00bc\5$\23\2\u00ba\u00bc\5\30\r\2\u00bb\u00b8\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b7\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\3\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00ca\3\2\2\2\u00c5\u00ca\5\32\16\2\u00c6"+
		"\u00ca\5\36\20\2\u00c7\u00ca\5 \21\2\u00c8\u00ca\5\24\13\2\u00c9\u00b5"+
		"\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00ce\58\35\2\u00cc\u00cf\7,\2\2"+
		"\u00cd\u00cf\5\"\22\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d7"+
		"\3\2\2\2\u00d0\u00d3\7\n\2\2\u00d1\u00d4\7,\2\2\u00d2\u00d4\5\"\22\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\31\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7)\2\2\u00db\u00dc\5$\23\2"+
		"\u00dc\u00de\5\20\t\2\u00dd\u00df\5\34\17\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\33\3\2\2\2\u00e0\u00e1\7*\2\2\u00e1\u00e2\5\20\t"+
		"\2\u00e2\35\3\2\2\2\u00e3\u00e4\7\'\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6"+
		"\5\20\t\2\u00e6\37\3\2\2\2\u00e7\u00e8\7(\2\2\u00e8\u00e9\5\20\t\2\u00e9"+
		"\u00ea\7\'\2\2\u00ea\u00eb\5$\23\2\u00eb!\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed"+
		"\u00ee\7\16\2\2\u00ee\u00ef\5$\23\2\u00ef#\3\2\2\2\u00f0\u00f2\t\2\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\7\23\2\2\u00f4\u00f5\5$\23\2\u00f5\u00f6\7\24\2\2\u00f6\u0100\3\2\2\2"+
		"\u00f7\u00fc\5&\24\2\u00f8\u00f9\t\3\2\2\u00f9\u00fb\5&\24\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f7\3\2"+
		"\2\2\u0100%\3\2\2\2\u0101\u0103\t\2\2\2\u0102\u0101\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\23\2\2\u0105\u0106\5&\24\2"+
		"\u0106\u0107\7\24\2\2\u0107\u0111\3\2\2\2\u0108\u010d\5(\25\2\u0109\u010a"+
		"\t\4\2\2\u010a\u010c\5(\25\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110\u0102\3\2\2\2\u0110\u0108\3\2\2\2\u0111\'\3\2\2\2\u0112\u0114"+
		"\t\2\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\7\23\2\2\u0116\u0117\5(\25\2\u0117\u0118\7\24\2\2\u0118\u0122\3"+
		"\2\2\2\u0119\u011e\5*\26\2\u011a\u011b\t\5\2\2\u011b\u011d\5*\26\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0113\3\2\2\2\u0121"+
		"\u0119\3\2\2\2\u0122)\3\2\2\2\u0123\u0125\t\2\2\2\u0124\u0123\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\23\2\2\u0127\u0128"+
		"\5*\26\2\u0128\u0129\7\24\2\2\u0129\u0133\3\2\2\2\u012a\u012f\5,\27\2"+
		"\u012b\u012c\t\6\2\2\u012c\u012e\5,\27\2\u012d\u012b\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0124\3\2\2\2\u0132\u012a\3\2\2\2\u0133+\3\2\2\2"+
		"\u0134\u0136\t\2\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0138\7\23\2\2\u0138\u0139\5,\27\2\u0139\u013a\7\24\2\2"+
		"\u013a\u0144\3\2\2\2\u013b\u0144\5.\30\2\u013c\u0144\5\64\33\2\u013d\u0144"+
		"\7\5\2\2\u013e\u0144\7\34\2\2\u013f\u0144\7\33\2\2\u0140\u0144\7,\2\2"+
		"\u0141\u0142\t\2\2\2\u0142\u0144\5,\27\2\u0143\u0135\3\2\2\2\u0143\u013b"+
		"\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0144-\3\2\2\2"+
		"\u0145\u0146\7,\2\2\u0146\u0147\5\60\31\2\u0147/\3\2\2\2\u0148\u014a\7"+
		"\23\2\2\u0149\u014b\5\62\32\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u014e\7\24\2\2\u014d\u014f\5\60\31\2\u014e"+
		"\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\61\3\2\2\2\u0150\u0155\5$\23"+
		"\2\u0151\u0152\7\n\2\2\u0152\u0154\5$\23\2\u0153\u0151\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\63\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\t\7\2\2\u0159\u015a\7\23\2\2\u015a\u015b\7"+
		",\2\2\u015b\u0163\7\24\2\2\u015c\u015d\7\"\2\2\u015d\u015e\7\23\2\2\u015e"+
		"\u015f\7,\2\2\u015f\u0160\7\n\2\2\u0160\u0161\7,\2\2\u0161\u0163\7\24"+
		"\2\2\u0162\u0158\3\2\2\2\u0162\u015c\3\2\2\2\u0163\65\3\2\2\2\u0164\u0173"+
		"\7\27\2\2\u0165\u0173\7\30\2\2\u0166\u0167\7\32\2\2\u0167\u0173\7,\2\2"+
		"\u0168\u0169\7\31\2\2\u0169\u016e\7\25\2\2\u016a\u016b\7\31\2\2\u016b"+
		"\u016d\7\25\2\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0173\58\35\2\u0172\u0164\3\2\2\2\u0172\u0165\3\2\2\2\u0172\u0166\3\2"+
		"\2\2\u0172\u0168\3\2\2\2\u0173\67\3\2\2\2\u0174\u0189\5\66\34\2\u0175"+
		"\u0176\7+\2\2\u0176\u0180\7\r\2\2\u0177\u017c\5\66\34\2\u0178\u0179\7"+
		"\n\2\2\u0179\u017b\5\66\34\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0181\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0181\7$\2\2\u0180\u0177\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0185\7\4\2\2\u0183\u0186\5\66\34\2\u0184\u0186\7"+
		"$\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\7\f\2\2\u0188\u0174\3\2\2\2\u0188\u0175\3\2\2\2\u01899\3\2\2\2"+
		"\65=CTX[]dpu\u0083\u0090\u0095\u009b\u009f\u00a3\u00a9\u00ab\u00b0\u00b5"+
		"\u00bb\u00bf\u00c3\u00c9\u00ce\u00d3\u00d7\u00de\u00f1\u00fc\u00ff\u0102"+
		"\u010d\u0110\u0113\u011e\u0121\u0124\u012f\u0132\u0135\u0143\u014a\u014e"+
		"\u0155\u0162\u016e\u0172\u017c\u0180\u0185\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}