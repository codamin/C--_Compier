// Generated from /home/ho/C--_Compier/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
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
		LBRACKET=19, RBRACKET=20, SHARP=21, NEWLINE=22, INT=23, BOOL=24, LIST=25, 
		STRUCT=26, FALSE=27, TRUE=28, BEGIN=29, END=30, RETURN=31, MAIN=32, DISPLAY=33, 
		APPEND=34, SIZE=35, VOID=36, GET=37, SET=38, WHILE=39, DO=40, IF=41, ELSE=42, 
		FPTR=43, IDENTIFIER=44, COMMENT=45, WS=46;
	public static final int
		RULE_cmmParser = 0, RULE_structDeclaration = 1, RULE_structBody = 2, RULE_structVariableDeclarationGetSet = 3, 
		RULE_methodDeclaration = 4, RULE_arguments = 5, RULE_mainDeclaration = 6, 
		RULE_functionBody = 7, RULE_multiFunctionBody = 8, RULE_returnStmt = 9, 
		RULE_singleFunctionBody = 10, RULE_variableDeclaration = 11, RULE_ifBlock = 12, 
		RULE_elseBlock = 13, RULE_whileBlock = 14, RULE_doWhileBlock = 15, RULE_assignment = 16, 
		RULE_expression = 17, RULE_expressionOperandAfterPlusMinus = 18, RULE_expressionOperandAfterMultDiv = 19, 
		RULE_expressionOperandAfterCond = 20, RULE_expressionOperand = 21, RULE_index = 22, 
		RULE_functionCall = 23, RULE_call = 24, RULE_callArguments = 25, RULE_primitiveFunctions = 26, 
		RULE_nestedIdentifier = 27, RULE_fptrVarTypes = 28, RULE_variableType = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmmParser", "structDeclaration", "structBody", "structVariableDeclarationGetSet", 
			"methodDeclaration", "arguments", "mainDeclaration", "functionBody", 
			"multiFunctionBody", "returnStmt", "singleFunctionBody", "variableDeclaration", 
			"ifBlock", "elseBlock", "whileBlock", "doWhileBlock", "assignment", "expression", 
			"expressionOperandAfterPlusMinus", "expressionOperandAfterMultDiv", "expressionOperandAfterCond", 
			"expressionOperand", "index", "functionCall", "call", "callArguments", 
			"primitiveFunctions", "nestedIdentifier", "fptrVarTypes", "variableType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'->'", null, "'+'", "'-'", "'*'", "'/'", "','", "'.'", 
			"'>'", "'<'", "'='", "'=='", "'&'", "'|'", "'~'", "'('", "')'", "'['", 
			"']'", "'#'", "'\n'", "'int'", "'bool'", "'list'", "'struct'", "'false'", 
			"'true'", "'begin'", "'end'", "'return'", "'main'", "'display'", "'append'", 
			"'size'", "'void'", "'get'", "'set'", "'while'", "'do'", "'if'", "'else'", 
			"'fptr'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUM", "PLUS", "MINUS", "MULT", "DIVIDE", "COMMA", 
			"DOT", "GT", "LT", "ASSIGN", "EQ", "AND", "OR", "NEG", "LPAR", "RPAR", 
			"LBRACKET", "RBRACKET", "SHARP", "NEWLINE", "INT", "BOOL", "LIST", "STRUCT", 
			"FALSE", "TRUE", "BEGIN", "END", "RETURN", "MAIN", "DISPLAY", "APPEND", 
			"SIZE", "VOID", "GET", "SET", "WHILE", "DO", "IF", "ELSE", "FPTR", "IDENTIFIER", 
			"COMMENT", "WS"
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
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
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
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(NEWLINE);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					structDeclaration();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					match(NEWLINE);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << VOID) | (1L << FPTR))) != 0)) {
				{
				{
				setState(78);
				methodDeclaration();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(84);
				match(NEWLINE);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			mainDeclaration();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(91);
				match(NEWLINE);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
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
		public Token StructName;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(STRUCT);
			setState(100);
			((StructDeclarationContext)_localctx).StructName = match(IDENTIFIER);
			System.out.println("StructDec : " + (((StructDeclarationContext)_localctx).StructName!=null?((StructDeclarationContext)_localctx).StructName.getText():null));
			setState(102);
			match(BEGIN);
			setState(104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(103);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(108);
			structBody();
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				match(NEWLINE);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(114);
			match(END);
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
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
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						{
						setState(120);
						variableDeclaration();
						setState(125);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(121);
								match(T__0);
								setState(122);
								variableDeclaration();
								}
								} 
							}
							setState(127);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						}
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(128);
							match(T__0);
							}
						}

						}
						}
						break;
					case 2:
						{
						setState(131);
						match(NEWLINE);
						}
						break;
					case 3:
						{
						setState(132);
						structVariableDeclarationGetSet();
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			variableType();
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(LPAR);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(141);
				arguments();
				}
			}

			setState(144);
			match(RPAR);
			setState(145);
			match(BEGIN);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(NEWLINE);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(151);
			match(SET);
			System.out.println("Setter");
			setState(153);
			functionBody();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(154);
				match(NEWLINE);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(GET);
			System.out.println("Getter");
			setState(162);
			functionBody();
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				match(NEWLINE);
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(168);
			match(END);
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(169);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(174);
				variableType();
				}
				break;
			case VOID:
				{
				setState(175);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(LPAR);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(180);
				arguments();
				}
			}

			setState(183);
			match(RPAR);
			setState(184);
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
			setState(186);
			variableType();
			{
			setState(187);
			match(IDENTIFIER);
			}
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				variableType();
				{
				setState(191);
				match(IDENTIFIER);
				}
				}
				}
				setState(197);
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
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public MultiFunctionBodyContext multiFunctionBody() {
			return getRuleContext(MultiFunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(MAIN);
			setState(199);
			match(LPAR);
			setState(200);
			match(RPAR);
			setState(201);
			match(BEGIN);
			setState(203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(202);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(207);
			multiFunctionBody();
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				match(NEWLINE);
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(213);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public SingleFunctionBodyContext singleFunctionBody() {
			return getRuleContext(SingleFunctionBodyContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public MultiFunctionBodyContext multiFunctionBody() {
			return getRuleContext(MultiFunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(215);
				match(BEGIN);
				setState(217); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(216);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(219); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(221);
				multiFunctionBody();
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					match(NEWLINE);
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(227);
				match(END);
				setState(229); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(228);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(231); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case NUM:
			case PLUS:
			case MINUS:
			case NEG:
			case LPAR:
			case NEWLINE:
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
				setState(233);
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
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
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
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
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
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(261);
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
					case RETURN:
					case DISPLAY:
					case APPEND:
					case SIZE:
					case FPTR:
					case IDENTIFIER:
						{
						setState(240);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(236);
							assignment();
							}
							break;
						case 2:
							{
							setState(237);
							expression();
							}
							break;
						case 3:
							{
							setState(238);
							variableDeclaration();
							}
							break;
						case 4:
							{
							setState(239);
							returnStmt();
							}
							break;
						}
						setState(251);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(242);
								match(T__0);
								setState(247);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
								case 1:
									{
									setState(243);
									assignment();
									}
									break;
								case 2:
									{
									setState(244);
									expression();
									}
									break;
								case 3:
									{
									setState(245);
									variableDeclaration();
									}
									break;
								case 4:
									{
									setState(246);
									returnStmt();
									}
									break;
								}
								}
								} 
							}
							setState(253);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(254);
							match(T__0);
							}
						}

						}
						break;
					case NEWLINE:
						{
						setState(257);
						match(NEWLINE);
						}
						break;
					case DO:
						{
						setState(258);
						doWhileBlock();
						}
						break;
					case IF:
						{
						setState(259);
						ifBlock();
						}
						break;
					case WHILE:
						{
						setState(260);
						whileBlock();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(266);
			match(RETURN);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(267);
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
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
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
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(270);
				match(NEWLINE);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
			case RETURN:
			case DISPLAY:
			case APPEND:
			case SIZE:
			case FPTR:
			case IDENTIFIER:
				{
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(276);
					assignment();
					}
					break;
				case 2:
					{
					setState(277);
					expression();
					}
					break;
				case 3:
					{
					setState(278);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(279);
					returnStmt();
					}
					break;
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						match(T__0);
						setState(287);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(283);
							assignment();
							}
							break;
						case 2:
							{
							setState(284);
							expression();
							}
							break;
						case 3:
							{
							setState(285);
							variableDeclaration();
							}
							break;
						case 4:
							{
							setState(286);
							returnStmt();
							}
							break;
						}
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(294);
					match(T__0);
					}
				}

				}
				break;
			case IF:
				{
				setState(297);
				ifBlock();
				}
				break;
			case WHILE:
				{
				setState(298);
				whileBlock();
				}
				break;
			case DO:
				{
				setState(299);
				doWhileBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					match(NEWLINE);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
			setState(308);
			variableType();
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(309);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(310);
				assignment();
				}
				break;
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(313);
				match(COMMA);
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(314);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(315);
					assignment();
					}
					break;
				}
				}
				}
				setState(322);
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
			setState(323);
			match(IF);
			setState(324);
			expression();
			setState(325);
			functionBody();
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(326);
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
			setState(329);
			match(ELSE);
			setState(330);
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
			setState(332);
			match(WHILE);
			setState(333);
			expression();
			setState(334);
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
			setState(336);
			match(DO);
			setState(337);
			functionBody();
			setState(338);
			match(WHILE);
			setState(339);
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
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
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
			setState(341);
			nestedIdentifier();
			setState(342);
			match(ASSIGN);
			setState(343);
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
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(345);
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

				setState(348);
				match(LPAR);
				setState(349);
				expression();
				setState(350);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				expressionOperandAfterPlusMinus();
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(353);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(354);
						expressionOperandAfterPlusMinus();
						}
						} 
					}
					setState(359);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(362);
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

				setState(365);
				match(LPAR);
				setState(366);
				expressionOperandAfterPlusMinus();
				setState(367);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				expressionOperandAfterMultDiv();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIVIDE) {
					{
					{
					setState(370);
					_la = _input.LA(1);
					if ( !(_la==MULT || _la==DIVIDE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(371);
					expressionOperandAfterMultDiv();
					}
					}
					setState(376);
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
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(379);
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

				setState(382);
				match(LPAR);
				setState(383);
				expressionOperandAfterMultDiv();
				setState(384);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				expressionOperandAfterCond();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) {
					{
					{
					setState(387);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(388);
					expressionOperandAfterCond();
					}
					}
					setState(393);
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
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(396);
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

				setState(399);
				match(LPAR);
				setState(400);
				expressionOperandAfterCond();
				setState(401);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				expressionOperand();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(404);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(405);
					expressionOperand();
					}
					}
					setState(410);
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
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CmmParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
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
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) {
					{
					setState(413);
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

				setState(416);
				match(LPAR);
				setState(417);
				expressionOperand();
				setState(418);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					{
					setState(420);
					match(LPAR);
					setState(421);
					expression();
					setState(422);
					match(RPAR);
					}
					}
					break;
				case 2:
					{
					setState(424);
					functionCall();
					}
					break;
				case 3:
					{
					setState(425);
					nestedIdentifier();
					}
					break;
				}
				setState(428);
				index();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				match(FALSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(434);
				nestedIdentifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(435);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << NEG))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(436);
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

	public static class IndexContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(CmmParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CmmParser.LBRACKET, i);
		}
		public List<TerminalNode> NUM() { return getTokens(CmmParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(CmmParser.NUM, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CmmParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CmmParser.RBRACKET, i);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(439);
				match(LBRACKET);
				setState(440);
				match(NUM);
				setState(441);
				match(RBRACKET);
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
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
		public PrimitiveFunctionsContext primitiveFunctions() {
			return getRuleContext(PrimitiveFunctionsContext.class,0);
		}
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_functionCall);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
			case APPEND:
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				primitiveFunctions();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(447);
				nestedIdentifier();
				setState(448);
				call();
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
		enterRule(_localctx, 48, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(LPAR);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAR) | (1L << FALSE) | (1L << TRUE) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(453);
				callArguments();
				}
			}

			setState(456);
			match(RPAR);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(457);
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
		enterRule(_localctx, 50, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			expression();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(461);
				match(COMMA);
				setState(462);
				expression();
				}
				}
				setState(467);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_primitiveFunctions);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==DISPLAY || _la==SIZE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
				match(LPAR);
				setState(470);
				expression();
				setState(471);
				match(RPAR);
				}
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(473);
				match(APPEND);
				setState(474);
				match(LPAR);
				setState(475);
				nestedIdentifier();
				setState(476);
				match(COMMA);
				setState(477);
				expression();
				setState(478);
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

	public static class NestedIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CmmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CmmParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(CmmParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CmmParser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CmmParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CmmParser.RBRACKET, i);
		}
		public NestedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterNestedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitNestedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitNestedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedIdentifierContext nestedIdentifier() throws RecognitionException {
		NestedIdentifierContext _localctx = new NestedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nestedIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(IDENTIFIER);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(483);
				match(DOT);
				setState(484);
				match(IDENTIFIER);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					match(LBRACKET);
					setState(491);
					expression();
					setState(492);
					match(RBRACKET);
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 56, RULE_fptrVarTypes);
		try {
			int _alt;
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(BOOL);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(501);
				match(STRUCT);
				setState(502);
				match(IDENTIFIER);
				}
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(503);
				match(LIST);
				setState(504);
				match(SHARP);
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(505);
						match(LIST);
						setState(506);
						match(SHARP);
						}
						} 
					}
					setState(511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(512);
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
		enterRule(_localctx, 58, RULE_variableType);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				fptrVarTypes();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(516);
				match(FPTR);
				setState(517);
				match(LT);
				setState(527);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					{
					setState(518);
					fptrVarTypes();
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(519);
						match(COMMA);
						setState(520);
						fptrVarTypes();
						}
						}
						setState(525);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case VOID:
					{
					setState(526);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(529);
				match(T__1);
				setState(532);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					setState(530);
					fptrVarTypes();
					}
					break;
				case VOID:
					{
					setState(531);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(534);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u021c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2"+
		"O\13\2\3\2\7\2R\n\2\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2"+
		"\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3k\n\3\r\3\16\3"+
		"l\3\3\3\3\6\3q\n\3\r\3\16\3r\3\3\3\3\6\3w\n\3\r\3\16\3x\3\4\3\4\3\4\7"+
		"\4~\n\4\f\4\16\4\u0081\13\4\3\4\5\4\u0084\n\4\3\4\3\4\7\4\u0088\n\4\f"+
		"\4\16\4\u008b\13\4\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\5\3\5\3\5\6\5\u0096"+
		"\n\5\r\5\16\5\u0097\3\5\3\5\3\5\3\5\7\5\u009e\n\5\f\5\16\5\u00a1\13\5"+
		"\3\5\3\5\3\5\3\5\6\5\u00a7\n\5\r\5\16\5\u00a8\3\5\3\5\6\5\u00ad\n\5\r"+
		"\5\16\5\u00ae\3\6\3\6\5\6\u00b3\n\6\3\6\3\6\3\6\5\6\u00b8\n\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\6\b\u00ce\n\b\r\b\16\b\u00cf\3\b\3\b\6\b\u00d4\n\b\r"+
		"\b\16\b\u00d5\3\b\3\b\3\t\3\t\6\t\u00dc\n\t\r\t\16\t\u00dd\3\t\3\t\6\t"+
		"\u00e2\n\t\r\t\16\t\u00e3\3\t\3\t\6\t\u00e8\n\t\r\t\16\t\u00e9\3\t\5\t"+
		"\u00ed\n\t\3\n\3\n\3\n\3\n\5\n\u00f3\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00fa"+
		"\n\n\7\n\u00fc\n\n\f\n\16\n\u00ff\13\n\3\n\5\n\u0102\n\n\3\n\3\n\3\n\3"+
		"\n\7\n\u0108\n\n\f\n\16\n\u010b\13\n\3\13\3\13\5\13\u010f\n\13\3\f\7\f"+
		"\u0112\n\f\f\f\16\f\u0115\13\f\3\f\3\f\3\f\3\f\5\f\u011b\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0122\n\f\7\f\u0124\n\f\f\f\16\f\u0127\13\f\3\f\5\f\u012a"+
		"\n\f\3\f\3\f\3\f\5\f\u012f\n\f\3\f\7\f\u0132\n\f\f\f\16\f\u0135\13\f\3"+
		"\r\3\r\3\r\5\r\u013a\n\r\3\r\3\r\3\r\5\r\u013f\n\r\7\r\u0141\n\r\f\r\16"+
		"\r\u0144\13\r\3\16\3\16\3\16\3\16\5\16\u014a\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\5\23"+
		"\u015d\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0166\n\23\f\23\16"+
		"\23\u0169\13\23\5\23\u016b\n\23\3\24\5\24\u016e\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0177\n\24\f\24\16\24\u017a\13\24\5\24\u017c\n"+
		"\24\3\25\5\25\u017f\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0188"+
		"\n\25\f\25\16\25\u018b\13\25\5\25\u018d\n\25\3\26\5\26\u0190\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0199\n\26\f\26\16\26\u019c\13\26"+
		"\5\26\u019e\n\26\3\27\5\27\u01a1\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u01ad\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u01b8\n\27\3\30\3\30\3\30\6\30\u01bd\n\30\r\30\16\30\u01be"+
		"\3\31\3\31\3\31\3\31\5\31\u01c5\n\31\3\32\3\32\5\32\u01c9\n\32\3\32\3"+
		"\32\5\32\u01cd\n\32\3\33\3\33\3\33\7\33\u01d2\n\33\f\33\16\33\u01d5\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01e3"+
		"\n\34\3\35\3\35\3\35\7\35\u01e8\n\35\f\35\16\35\u01eb\13\35\3\35\3\35"+
		"\3\35\3\35\7\35\u01f1\n\35\f\35\16\35\u01f4\13\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u01fe\n\36\f\36\16\36\u0201\13\36\3\36\5\36"+
		"\u0204\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u020c\n\37\f\37\16\37\u020f"+
		"\13\37\3\37\5\37\u0212\n\37\3\37\3\37\3\37\5\37\u0217\n\37\3\37\5\37\u021a"+
		"\n\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<\2\b\4\2\6\7\22\22\3\2\6\7\3\2\b\t\4\2\f\r\17\17\3\2\20\21\4"+
		"\2##%%\2\u025e\2A\3\2\2\2\4e\3\2\2\2\6\u0089\3\2\2\2\b\u008c\3\2\2\2\n"+
		"\u00b2\3\2\2\2\f\u00bc\3\2\2\2\16\u00c8\3\2\2\2\20\u00ec\3\2\2\2\22\u0109"+
		"\3\2\2\2\24\u010c\3\2\2\2\26\u0113\3\2\2\2\30\u0136\3\2\2\2\32\u0145\3"+
		"\2\2\2\34\u014b\3\2\2\2\36\u014e\3\2\2\2 \u0152\3\2\2\2\"\u0157\3\2\2"+
		"\2$\u016a\3\2\2\2&\u017b\3\2\2\2(\u018c\3\2\2\2*\u019d\3\2\2\2,\u01b7"+
		"\3\2\2\2.\u01bc\3\2\2\2\60\u01c4\3\2\2\2\62\u01c6\3\2\2\2\64\u01ce\3\2"+
		"\2\2\66\u01e2\3\2\2\28\u01e4\3\2\2\2:\u0203\3\2\2\2<\u0219\3\2\2\2>@\7"+
		"\30\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF"+
		"\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2J"+
		"L\7\30\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2"+
		"PR\5\n\6\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2"+
		"VX\7\30\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2"+
		"\2\\`\5\16\b\2]_\7\30\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3"+
		"\2\2\2b`\3\2\2\2cd\7\2\2\3d\3\3\2\2\2ef\7\34\2\2fg\7.\2\2gh\b\3\1\2hj"+
		"\7\37\2\2ik\7\30\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"np\5\6\4\2oq\7\30\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2"+
		"\2tv\7 \2\2uw\7\30\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\5\3\2"+
		"\2\2z\177\5\30\r\2{|\7\3\2\2|~\5\30\r\2}{\3\2\2\2~\u0081\3\2\2\2\177}"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0084\7\3\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\3\2"+
		"\2\2\u0085\u0088\7\30\2\2\u0086\u0088\5\b\5\2\u0087z\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\7\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5<\37\2"+
		"\u008d\u008e\7.\2\2\u008e\u0090\7\23\2\2\u008f\u0091\5\f\7\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\24\2\2"+
		"\u0093\u0095\7\37\2\2\u0094\u0096\7\30\2\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\7(\2\2\u009a\u009b\b\5\1\2\u009b\u009f\5\20\t\2\u009c\u009e\7\30"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\'"+
		"\2\2\u00a3\u00a4\b\5\1\2\u00a4\u00a6\5\20\t\2\u00a5\u00a7\7\30\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7 \2\2\u00ab\u00ad\7\30\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\t\3\2\2\2\u00b0\u00b3\5<\37\2\u00b1\u00b3\7&\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5"+
		"\u00b7\7\23\2\2\u00b6\u00b8\5\f\7\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\5\20\t\2\u00bb"+
		"\13\3\2\2\2\u00bc\u00bd\5<\37\2\u00bd\u00be\7.\2\2\u00be\u00c5\3\2\2\2"+
		"\u00bf\u00c0\7\n\2\2\u00c0\u00c1\5<\37\2\u00c1\u00c2\7.\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\r\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\"\2\2"+
		"\u00c9\u00ca\7\23\2\2\u00ca\u00cb\7\24\2\2\u00cb\u00cd\7\37\2\2\u00cc"+
		"\u00ce\7\30\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5\22\n\2\u00d2"+
		"\u00d4\7\30\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7 \2\2\u00d8"+
		"\17\3\2\2\2\u00d9\u00db\7\37\2\2\u00da\u00dc\7\30\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\5\22\n\2\u00e0\u00e2\7\30\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\7 \2\2\u00e6\u00e8\7\30\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00ed\5\26\f\2\u00ec\u00d9\3\2\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\21\3\2\2\2\u00ee\u00f3\5\"\22\2\u00ef\u00f3\5$\23\2\u00f0"+
		"\u00f3\5\30\r\2\u00f1\u00f3\5\24\13\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00fd\3\2\2\2\u00f4"+
		"\u00f9\7\3\2\2\u00f5\u00fa\5\"\22\2\u00f6\u00fa\5$\23\2\u00f7\u00fa\5"+
		"\30\r\2\u00f8\u00fa\5\24\13\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f4"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\7\3\2\2\u0101\u0100\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0108\3\2\2\2\u0103\u0108\7\30\2\2\u0104"+
		"\u0108\5 \21\2\u0105\u0108\5\32\16\2\u0106\u0108\5\36\20\2\u0107\u00f2"+
		"\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\23\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\7!\2\2\u010d\u010f"+
		"\5$\23\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\25\3\2\2\2\u0110"+
		"\u0112\7\30\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\u012e\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u011b\5\"\22\2\u0117\u011b\5$\23\2\u0118\u011b\5\30\r\2\u0119\u011b\5"+
		"\24\13\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u0125\3\2\2\2\u011c\u0121\7\3\2\2\u011d\u0122\5\""+
		"\22\2\u011e\u0122\5$\23\2\u011f\u0122\5\30\r\2\u0120\u0122\5\24\13\2\u0121"+
		"\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u011c\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u012a\7\3\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012f\3\2\2\2\u012b\u012f\5\32\16\2\u012c\u012f\5\36\20\2\u012d\u012f"+
		"\5 \21\2\u012e\u011a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0133\3\2\2\2\u0130\u0132\7\30\2\2\u0131\u0130\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\27\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0139\5<\37\2\u0137\u013a\7.\2\2"+
		"\u0138\u013a\5\"\22\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u0142"+
		"\3\2\2\2\u013b\u013e\7\n\2\2\u013c\u013f\7.\2\2\u013d\u013f\5\"\22\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013b\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\31\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7+\2\2\u0146\u0147\5$\23\2"+
		"\u0147\u0149\5\20\t\2\u0148\u014a\5\34\17\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\33\3\2\2\2\u014b\u014c\7,\2\2\u014c\u014d\5\20\t"+
		"\2\u014d\35\3\2\2\2\u014e\u014f\7)\2\2\u014f\u0150\5$\23\2\u0150\u0151"+
		"\5\20\t\2\u0151\37\3\2\2\2\u0152\u0153\7*\2\2\u0153\u0154\5\20\t\2\u0154"+
		"\u0155\7)\2\2\u0155\u0156\5$\23\2\u0156!\3\2\2\2\u0157\u0158\58\35\2\u0158"+
		"\u0159\7\16\2\2\u0159\u015a\5$\23\2\u015a#\3\2\2\2\u015b\u015d\t\2\2\2"+
		"\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\7\23\2\2\u015f\u0160\5$\23\2\u0160\u0161\7\24\2\2\u0161\u016b\3\2\2\2"+
		"\u0162\u0167\5&\24\2\u0163\u0164\t\3\2\2\u0164\u0166\5&\24\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u015c\3\2\2\2\u016a\u0162\3\2"+
		"\2\2\u016b%\3\2\2\2\u016c\u016e\t\2\2\2\u016d\u016c\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\23\2\2\u0170\u0171\5&\24\2"+
		"\u0171\u0172\7\24\2\2\u0172\u017c\3\2\2\2\u0173\u0178\5(\25\2\u0174\u0175"+
		"\t\4\2\2\u0175\u0177\5(\25\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u016d\3\2\2\2\u017b\u0173\3\2\2\2\u017c\'\3\2\2\2\u017d\u017f"+
		"\t\2\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\7\23\2\2\u0181\u0182\5(\25\2\u0182\u0183\7\24\2\2\u0183\u018d\3"+
		"\2\2\2\u0184\u0189\5*\26\2\u0185\u0186\t\5\2\2\u0186\u0188\5*\26\2\u0187"+
		"\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u017e\3\2\2\2\u018c"+
		"\u0184\3\2\2\2\u018d)\3\2\2\2\u018e\u0190\t\2\2\2\u018f\u018e\3\2\2\2"+
		"\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\23\2\2\u0192\u0193"+
		"\5*\26\2\u0193\u0194\7\24\2\2\u0194\u019e\3\2\2\2\u0195\u019a\5,\27\2"+
		"\u0196\u0197\t\6\2\2\u0197\u0199\5,\27\2\u0198\u0196\3\2\2\2\u0199\u019c"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u018f\3\2\2\2\u019d\u0195\3\2\2\2\u019e+\3\2\2\2"+
		"\u019f\u01a1\t\2\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\7\23\2\2\u01a3\u01a4\5,\27\2\u01a4\u01a5\7\24\2\2"+
		"\u01a5\u01b8\3\2\2\2\u01a6\u01a7\7\23\2\2\u01a7\u01a8\5$\23\2\u01a8\u01a9"+
		"\7\24\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01ad\5\60\31\2\u01ab\u01ad\58\35"+
		"\2\u01ac\u01a6\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\5.\30\2\u01af\u01b8\3\2\2\2\u01b0\u01b8\5\60\31\2"+
		"\u01b1\u01b8\7\5\2\2\u01b2\u01b8\7\36\2\2\u01b3\u01b8\7\35\2\2\u01b4\u01b8"+
		"\58\35\2\u01b5\u01b6\t\2\2\2\u01b6\u01b8\5,\27\2\u01b7\u01a0\3\2\2\2\u01b7"+
		"\u01ac\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b2\3\2"+
		"\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"-\3\2\2\2\u01b9\u01ba\7\25\2\2\u01ba\u01bb\7\5\2\2\u01bb\u01bd\7\26\2"+
		"\2\u01bc\u01b9\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf/\3\2\2\2\u01c0\u01c5\5\66\34\2\u01c1\u01c2\58\35\2\u01c2"+
		"\u01c3\5\62\32\2\u01c3\u01c5\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3"+
		"\2\2\2\u01c5\61\3\2\2\2\u01c6\u01c8\7\23\2\2\u01c7\u01c9\5\64\33\2\u01c8"+
		"\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\7\24"+
		"\2\2\u01cb\u01cd\5\62\32\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\63\3\2\2\2\u01ce\u01d3\5$\23\2\u01cf\u01d0\7\n\2\2\u01d0\u01d2\5$\23"+
		"\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\65\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\t\7\2\2\u01d7"+
		"\u01d8\7\23\2\2\u01d8\u01d9\5$\23\2\u01d9\u01da\7\24\2\2\u01da\u01e3\3"+
		"\2\2\2\u01db\u01dc\7$\2\2\u01dc\u01dd\7\23\2\2\u01dd\u01de\58\35\2\u01de"+
		"\u01df\7\n\2\2\u01df\u01e0\5$\23\2\u01e0\u01e1\7\24\2\2\u01e1\u01e3\3"+
		"\2\2\2\u01e2\u01d6\3\2\2\2\u01e2\u01db\3\2\2\2\u01e3\67\3\2\2\2\u01e4"+
		"\u01e9\7.\2\2\u01e5\u01e6\7\13\2\2\u01e6\u01e8\7.\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01f2\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\25\2\2\u01ed\u01ee\5"+
		"$\23\2\u01ee\u01ef\7\26\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f39\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f5\u0204\7\31\2\2\u01f6\u0204\7\32\2\2\u01f7\u01f8"+
		"\7\34\2\2\u01f8\u0204\7.\2\2\u01f9\u01fa\7\33\2\2\u01fa\u01ff\7\27\2\2"+
		"\u01fb\u01fc\7\33\2\2\u01fc\u01fe\7\27\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0201"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0204\5<\37\2\u0203\u01f5\3\2\2\2\u0203\u01f6\3\2"+
		"\2\2\u0203\u01f7\3\2\2\2\u0203\u01f9\3\2\2\2\u0204;\3\2\2\2\u0205\u021a"+
		"\5:\36\2\u0206\u0207\7-\2\2\u0207\u0211\7\r\2\2\u0208\u020d\5:\36\2\u0209"+
		"\u020a\7\n\2\2\u020a\u020c\5:\36\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0212\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0212\7&\2\2\u0211\u0208\3\2\2\2\u0211\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0216\7\4\2\2\u0214\u0217\5:\36\2\u0215"+
		"\u0217\7&\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u021a\7\f\2\2\u0219\u0205\3\2\2\2\u0219\u0206\3\2\2\2\u021a"+
		"=\3\2\2\2LAGMSY`lrx\177\u0083\u0087\u0089\u0090\u0097\u009f\u00a8\u00ae"+
		"\u00b2\u00b7\u00c5\u00cf\u00d5\u00dd\u00e3\u00e9\u00ec\u00f2\u00f9\u00fd"+
		"\u0101\u0107\u0109\u010e\u0113\u011a\u0121\u0125\u0129\u012e\u0133\u0139"+
		"\u013e\u0142\u0149\u015c\u0167\u016a\u016d\u0178\u017b\u017e\u0189\u018c"+
		"\u018f\u019a\u019d\u01a0\u01ac\u01b7\u01be\u01c4\u01c8\u01cc\u01d3\u01e2"+
		"\u01e9\u01f2\u01ff\u0203\u020d\u0211\u0216\u0219";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}