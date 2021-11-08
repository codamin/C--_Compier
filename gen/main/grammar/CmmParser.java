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
		T__0=1, NUM=2, PLUS=3, MINUS=4, MULT=5, DIVIDE=6, COMMA=7, SEMICOLLON=8, 
		DOT=9, GT=10, LT=11, ASSIGN=12, EQ=13, AND=14, OR=15, NEG=16, LPAR=17, 
		RPAR=18, LBRACKET=19, RBRACKET=20, SHARP=21, NEWLINE=22, INT=23, BOOL=24, 
		LIST=25, STRUCT=26, FALSE=27, TRUE=28, BEGIN=29, END=30, RETURN=31, MAIN=32, 
		DISPLAY=33, APPEND=34, SIZE=35, VOID=36, GET=37, SET=38, WHILE=39, DO=40, 
		IF=41, ELSE=42, FPTR=43, IDENTIFIER=44, WS=45, COMMENT=46;
	public static final int
		RULE_cmmParser = 0, RULE_structDeclaration = 1, RULE_structBody = 2, RULE_structVariableDeclarationGetSet = 3, 
		RULE_methodDeclaration = 4, RULE_arguments = 5, RULE_mainDeclaration = 6, 
		RULE_functionBody = 7, RULE_multiFunctionBody = 8, RULE_returnStmt = 9, 
		RULE_singleFunctionBody = 10, RULE_variableDeclaration = 11, RULE_ifBlock = 12, 
		RULE_elseBlock = 13, RULE_whileBlock = 14, RULE_doWhileBlock = 15, RULE_assignment = 16, 
		RULE_expresionFunctionCall = 17, RULE_expression = 18, RULE_expressionOperandAfterAndOr = 19, 
		RULE_expressionOperandAfterPlusMinus = 20, RULE_expressionOperandAfterMultDiv = 21, 
		RULE_expressionOperand = 22, RULE_index = 23, RULE_functionCall = 24, 
		RULE_call = 25, RULE_callArguments = 26, RULE_primitiveFunctions = 27, 
		RULE_nestedIdentifier = 28, RULE_fptrVarTypes = 29, RULE_variableType = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmmParser", "structDeclaration", "structBody", "structVariableDeclarationGetSet", 
			"methodDeclaration", "arguments", "mainDeclaration", "functionBody", 
			"multiFunctionBody", "returnStmt", "singleFunctionBody", "variableDeclaration", 
			"ifBlock", "elseBlock", "whileBlock", "doWhileBlock", "assignment", "expresionFunctionCall", 
			"expression", "expressionOperandAfterAndOr", "expressionOperandAfterPlusMinus", 
			"expressionOperandAfterMultDiv", "expressionOperand", "index", "functionCall", 
			"call", "callArguments", "primitiveFunctions", "nestedIdentifier", "fptrVarTypes", 
			"variableType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", null, "'+'", "'-'", "'*'", "'/'", "','", "';'", "'.'", 
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
			null, null, "NUM", "PLUS", "MINUS", "MULT", "DIVIDE", "COMMA", "SEMICOLLON", 
			"DOT", "GT", "LT", "ASSIGN", "EQ", "AND", "OR", "NEG", "LPAR", "RPAR", 
			"LBRACKET", "RBRACKET", "SHARP", "NEWLINE", "INT", "BOOL", "LIST", "STRUCT", 
			"FALSE", "TRUE", "BEGIN", "END", "RETURN", "MAIN", "DISPLAY", "APPEND", 
			"SIZE", "VOID", "GET", "SET", "WHILE", "DO", "IF", "ELSE", "FPTR", "IDENTIFIER", 
			"WS", "COMMENT"
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
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					match(NEWLINE);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					structDeclaration();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(NEWLINE);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << VOID) | (1L << FPTR))) != 0)) {
				{
				{
				setState(80);
				methodDeclaration();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			mainDeclaration();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(93);
				match(NEWLINE);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
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
			setState(101);
			match(STRUCT);
			setState(102);
			((StructDeclarationContext)_localctx).StructName = match(IDENTIFIER);
			System.out.println("StructDec : " + (((StructDeclarationContext)_localctx).StructName!=null?((StructDeclarationContext)_localctx).StructName.getText():null));
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(104);
				match(BEGIN);
				setState(106); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(105);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(108); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(110);
				structBody();
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					match(NEWLINE);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(116);
				match(END);
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(117);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case NEWLINE:
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case MAIN:
			case VOID:
			case FPTR:
				{
				{
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						match(NEWLINE);
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(128);
				structBody();
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						match(NEWLINE);
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
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

	public static class StructBodyContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<StructVariableDeclarationGetSetContext> structVariableDeclarationGetSet() {
			return getRuleContexts(StructVariableDeclarationGetSetContext.class);
		}
		public StructVariableDeclarationGetSetContext structVariableDeclarationGetSet(int i) {
			return getRuleContext(StructVariableDeclarationGetSetContext.class,i);
		}
		public List<TerminalNode> SEMICOLLON() { return getTokens(CmmParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(CmmParser.SEMICOLLON, i);
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
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(153);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case BOOL:
					case LIST:
					case STRUCT:
					case FPTR:
						{
						{
						setState(139);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(137);
							variableDeclaration();
							}
							break;
						case 2:
							{
							setState(138);
							structVariableDeclarationGetSet();
							}
							break;
						}
						setState(146);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(144);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case SEMICOLLON:
									{
									setState(141);
									match(SEMICOLLON);
									setState(142);
									variableDeclaration();
									}
									break;
								case INT:
								case BOOL:
								case LIST:
								case STRUCT:
								case FPTR:
									{
									setState(143);
									structVariableDeclarationGetSet();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								} 
							}
							setState(148);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						}
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLLON) {
							{
							setState(149);
							match(SEMICOLLON);
							}
						}

						}
						}
						break;
					case NEWLINE:
						{
						setState(152);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public Token VariableName;
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
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
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
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
			setState(158);
			variableType();
			{
			setState(159);
			((StructVariableDeclarationGetSetContext)_localctx).VariableName = match(IDENTIFIER);
			System.out.println("VarDec : " + (((StructVariableDeclarationGetSetContext)_localctx).VariableName!=null?((StructVariableDeclarationGetSetContext)_localctx).VariableName.getText():null));
			}
			setState(162);
			match(LPAR);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(163);
				arguments();
				}
			}

			setState(166);
			match(RPAR);
			setState(167);
			match(BEGIN);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(173);
			match(SET);
			System.out.println("Setter");
			setState(175);
			functionBody();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(176);
				match(NEWLINE);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(GET);
			System.out.println("Getter");
			setState(184);
			functionBody();
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				match(NEWLINE);
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(190);
			match(END);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(NEWLINE);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token FunctionName;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(197);
				variableType();
				}
				break;
			case VOID:
				{
				setState(198);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(201);
			((MethodDeclarationContext)_localctx).FunctionName = match(IDENTIFIER);
			System.out.println("FunctionDec : " + (((MethodDeclarationContext)_localctx).FunctionName!=null?((MethodDeclarationContext)_localctx).FunctionName.getText():null));
			setState(203);
			match(LPAR);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(204);
				arguments();
				}
			}

			setState(207);
			match(RPAR);
			setState(208);
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
		public Token ArgumentName;
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
			setState(210);
			variableType();
			{
			setState(211);
			((ArgumentsContext)_localctx).ArgumentName = match(IDENTIFIER);
			System.out.println("ArgumentDec : " + (((ArgumentsContext)_localctx).ArgumentName!=null?((ArgumentsContext)_localctx).ArgumentName.getText():null));
			}
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				variableType();
				{
				setState(216);
				((ArgumentsContext)_localctx).ArgumentName = match(IDENTIFIER);
				System.out.println("ArgumentDec : " + (((ArgumentsContext)_localctx).ArgumentName!=null?((ArgumentsContext)_localctx).ArgumentName.getText():null));
				}
				}
				}
				setState(223);
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
			setState(224);
			match(MAIN);
			System.out.println("Main");
			setState(226);
			match(LPAR);
			setState(227);
			match(RPAR);
			setState(228);
			match(BEGIN);
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(234);
			multiFunctionBody();
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				match(NEWLINE);
				}
				}
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(240);
			match(END);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					match(NEWLINE);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(247);
				match(BEGIN);
				setState(249); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(248);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(251); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(253);
				multiFunctionBody();
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					match(NEWLINE);
					}
					}
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(259);
				match(END);
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						match(NEWLINE);
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
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
				setState(266);
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
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ExpresionFunctionCallContext> expresionFunctionCall() {
			return getRuleContexts(ExpresionFunctionCallContext.class);
		}
		public ExpresionFunctionCallContext expresionFunctionCall(int i) {
			return getRuleContext(ExpresionFunctionCallContext.class,i);
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
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<DoWhileBlockContext> doWhileBlock() {
			return getRuleContexts(DoWhileBlockContext.class);
		}
		public DoWhileBlockContext doWhileBlock(int i) {
			return getRuleContext(DoWhileBlockContext.class,i);
		}
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<TerminalNode> SEMICOLLON() { return getTokens(CmmParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(CmmParser.SEMICOLLON, i);
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
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(297);
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
					case WHILE:
					case DO:
					case IF:
					case FPTR:
					case IDENTIFIER:
						{
						setState(276);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(269);
							assignment();
							}
							break;
						case 2:
							{
							setState(270);
							expresionFunctionCall();
							}
							break;
						case 3:
							{
							setState(271);
							variableDeclaration();
							}
							break;
						case 4:
							{
							setState(272);
							returnStmt();
							}
							break;
						case 5:
							{
							setState(273);
							ifBlock();
							}
							break;
						case 6:
							{
							setState(274);
							doWhileBlock();
							}
							break;
						case 7:
							{
							setState(275);
							whileBlock();
							}
							break;
						}
						setState(290);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(278);
								match(SEMICOLLON);
								setState(286);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
								case 1:
									{
									setState(279);
									assignment();
									}
									break;
								case 2:
									{
									setState(280);
									expresionFunctionCall();
									}
									break;
								case 3:
									{
									setState(281);
									variableDeclaration();
									}
									break;
								case 4:
									{
									setState(282);
									returnStmt();
									}
									break;
								case 5:
									{
									setState(283);
									ifBlock();
									}
									break;
								case 6:
									{
									setState(284);
									doWhileBlock();
									}
									break;
								case 7:
									{
									setState(285);
									whileBlock();
									}
									break;
								}
								}
								} 
							}
							setState(292);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						}
						setState(294);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLLON) {
							{
							setState(293);
							match(SEMICOLLON);
							}
						}

						}
						break;
					case NEWLINE:
						{
						setState(296);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(302);
			match(RETURN);
			System.out.println("Return");
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(304);
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
		public List<ExpresionFunctionCallContext> expresionFunctionCall() {
			return getRuleContexts(ExpresionFunctionCallContext.class);
		}
		public ExpresionFunctionCallContext expresionFunctionCall(int i) {
			return getRuleContext(ExpresionFunctionCallContext.class,i);
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
		public List<DoWhileBlockContext> doWhileBlock() {
			return getRuleContexts(DoWhileBlockContext.class);
		}
		public DoWhileBlockContext doWhileBlock(int i) {
			return getRuleContext(DoWhileBlockContext.class,i);
		}
		public List<TerminalNode> SEMICOLLON() { return getTokens(CmmParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(CmmParser.SEMICOLLON, i);
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
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(307);
				match(NEWLINE);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(313);
				assignment();
				}
				break;
			case 2:
				{
				setState(314);
				expresionFunctionCall();
				}
				break;
			case 3:
				{
				setState(315);
				variableDeclaration();
				}
				break;
			case 4:
				{
				setState(316);
				returnStmt();
				}
				break;
			case 5:
				{
				setState(317);
				ifBlock();
				}
				break;
			case 6:
				{
				setState(318);
				whileBlock();
				}
				break;
			case 7:
				{
				setState(319);
				doWhileBlock();
				}
				break;
			}
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					match(SEMICOLLON);
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(323);
						assignment();
						}
						break;
					case 2:
						{
						setState(324);
						expresionFunctionCall();
						}
						break;
					case 3:
						{
						setState(325);
						variableDeclaration();
						}
						break;
					case 4:
						{
						setState(326);
						returnStmt();
						}
						break;
					case 5:
						{
						setState(327);
						ifBlock();
						}
						break;
					case 6:
						{
						setState(328);
						whileBlock();
						}
						break;
					case 7:
						{
						setState(329);
						doWhileBlock();
						}
						break;
					}
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(337);
				match(SEMICOLLON);
				}
				break;
			}
			}
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					match(NEWLINE);
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		public Token VariableName;
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(CmmParser.SEMICOLLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CmmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CmmParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(346);
			variableType();
			{
			{
			setState(347);
			((VariableDeclarationContext)_localctx).VariableName = match(IDENTIFIER);
			System.out.println("VarDec : " + (((VariableDeclarationContext)_localctx).VariableName!=null?((VariableDeclarationContext)_localctx).VariableName.getText():null));
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(350);
				match(ASSIGN);
				setState(351);
				expression();
				}
			}

			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(354);
				match(COMMA);
				{
				{
				setState(355);
				((VariableDeclarationContext)_localctx).VariableName = match(IDENTIFIER);
				System.out.println("VarDec : " + (((VariableDeclarationContext)_localctx).VariableName!=null?((VariableDeclarationContext)_localctx).VariableName.getText():null));
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(358);
					match(ASSIGN);
					setState(359);
					expression();
					}
				}

				}
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(367);
				match(SEMICOLLON);
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
			setState(370);
			match(IF);
			System.out.println("Conditional : if");
			setState(372);
			expression();
			setState(373);
			functionBody();
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(374);
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
			setState(377);
			match(ELSE);
			System.out.println("Conditional : else");
			setState(379);
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
			setState(381);
			match(WHILE);
			System.out.println("Loop : while");
			setState(383);
			expression();
			setState(384);
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
			setState(386);
			match(DO);
			System.out.println("Loop : do...while");
			setState(388);
			functionBody();
			setState(389);
			match(WHILE);
			setState(390);
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
			setState(392);
			nestedIdentifier();
			setState(393);
			match(ASSIGN);
			setState(394);
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

	public static class ExpresionFunctionCallContext extends ParserRuleContext {
		public NestedIdentifierContext nestedIdentifier() {
			return getRuleContext(NestedIdentifierContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpresionFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpresionFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpresionFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpresionFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionFunctionCallContext expresionFunctionCall() throws RecognitionException {
		ExpresionFunctionCallContext _localctx = new ExpresionFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresionFunctionCall);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(396);
				nestedIdentifier();
				setState(397);
				call();
				System.out.println("FunctionCall");
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token Operator;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(CmmParser.NEG, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public List<ExpressionOperandAfterAndOrContext> expressionOperandAfterAndOr() {
			return getRuleContexts(ExpressionOperandAfterAndOrContext.class);
		}
		public ExpressionOperandAfterAndOrContext expressionOperandAfterAndOr(int i) {
			return getRuleContext(ExpressionOperandAfterAndOrContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
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
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(406);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(403);
					((ExpressionContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(404);
					((ExpressionContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(405);
					((ExpressionContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(408);
				match(LPAR);
				setState(409);
				expression();
				setState(410);
				match(RPAR);
				if((((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				expressionOperandAfterAndOr();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(416);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AND:
						{
						{
						setState(414);
						((ExpressionContext)_localctx).Operator = match(AND);
						}
						}
						break;
					case OR:
						{
						{
						setState(415);
						((ExpressionContext)_localctx).Operator = match(OR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(418);
					expressionOperandAfterAndOr();
					System.out.println("Operator : " + (((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null));
					}
					}
					setState(425);
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

	public static class ExpressionOperandAfterAndOrContext extends ParserRuleContext {
		public Token Operator;
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
		public ExpressionOperandAfterAndOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperandAfterAndOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperandAfterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperandAfterAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperandAfterAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandAfterAndOrContext expressionOperandAfterAndOr() throws RecognitionException {
		ExpressionOperandAfterAndOrContext _localctx = new ExpressionOperandAfterAndOrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionOperandAfterAndOr);
		try {
			int _alt;
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(428);
					((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(429);
					((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(430);
					((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(433);
				match(LPAR);
				setState(434);
				expression();
				setState(435);
				match(RPAR);
				if((((ExpressionOperandAfterAndOrContext)_localctx).Operator!=null?((ExpressionOperandAfterAndOrContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterAndOrContext)_localctx).Operator!=null?((ExpressionOperandAfterAndOrContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				expressionOperandAfterPlusMinus();
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(441);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							{
							setState(439);
							((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(PLUS);
							}
							}
							break;
						case MINUS:
							{
							{
							setState(440);
							((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(MINUS);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(443);
						expressionOperandAfterPlusMinus();
						System.out.println("Operator : " + (((ExpressionOperandAfterAndOrContext)_localctx).Operator!=null?((ExpressionOperandAfterAndOrContext)_localctx).Operator.getText():null));
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		public Token Operator;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 40, RULE_expressionOperandAfterPlusMinus);
		int _la;
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(453);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(454);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(455);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(458);
				match(LPAR);
				setState(459);
				expression();
				setState(460);
				match(RPAR);
				if((((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				expressionOperandAfterMultDiv();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIVIDE) {
					{
					{
					setState(466);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						{
						setState(464);
						((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(MULT);
						}
						}
						break;
					case DIVIDE:
						{
						{
						setState(465);
						((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(DIVIDE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(468);
					expressionOperandAfterMultDiv();
					System.out.println("Operator : " + (((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null));
					}
					}
					setState(475);
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
		public Token Operator;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_expressionOperandAfterMultDiv);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(478);
					((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(479);
					((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(480);
					((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(483);
				match(LPAR);
				setState(484);
				expression();
				setState(485);
				match(RPAR);
				if((((ExpressionOperandAfterMultDivContext)_localctx).Operator!=null?((ExpressionOperandAfterMultDivContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterMultDivContext)_localctx).Operator!=null?((ExpressionOperandAfterMultDivContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				expressionOperand();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) {
					{
					{
					setState(492);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQ:
						{
						{
						setState(489);
						((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(EQ);
						}
						}
						break;
					case LT:
						{
						{
						setState(490);
						((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(LT);
						}
						}
						break;
					case GT:
						{
						{
						setState(491);
						((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(GT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(494);
					expressionOperand();
					System.out.println("Operator : " + (((ExpressionOperandAfterMultDivContext)_localctx).Operator!=null?((ExpressionOperandAfterMultDivContext)_localctx).Operator.getText():null));
					}
					}
					setState(501);
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
		public Token Operator;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public TerminalNode NUM() { return getToken(CmmParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public ExpressionOperandContext expressionOperand() {
			return getRuleContext(ExpressionOperandContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_expressionOperand);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(507);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(504);
					((ExpressionOperandContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(505);
					((ExpressionOperandContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(506);
					((ExpressionOperandContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(509);
				match(LPAR);
				setState(510);
				expression();
				setState(511);
				match(RPAR);
				if((((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					{
					setState(514);
					match(LPAR);
					setState(515);
					expression();
					setState(516);
					match(RPAR);
					}
					}
					break;
				case 2:
					{
					setState(518);
					functionCall();
					}
					break;
				case 3:
					{
					setState(519);
					nestedIdentifier();
					}
					break;
				}
				setState(522);
				index();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(527);
				match(FALSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(528);
				nestedIdentifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(532);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(529);
					((ExpressionOperandContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(530);
					((ExpressionOperandContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(531);
					((ExpressionOperandContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(534);
				expressionOperand();
				if((((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null));
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
		enterRule(_localctx, 46, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(539);
				match(LBRACKET);
				setState(540);
				match(NUM);
				setState(541);
				match(RBRACKET);
				}
				}
				setState(544); 
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
		enterRule(_localctx, 48, RULE_functionCall);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
			case APPEND:
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				primitiveFunctions();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(547);
				nestedIdentifier();
				setState(548);
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
		enterRule(_localctx, 50, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(LPAR);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAR) | (1L << FALSE) | (1L << TRUE) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(553);
				callArguments();
				}
			}

			setState(556);
			match(RPAR);
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(557);
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
		enterRule(_localctx, 52, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			expression();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(561);
				match(COMMA);
				setState(562);
				expression();
				}
				}
				setState(567);
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
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 54, RULE_primitiveFunctions);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(568);
				match(DISPLAY);
				System.out.println("Built-in : display");
				setState(570);
				match(LPAR);
				setState(571);
				expression();
				setState(572);
				match(RPAR);
				}
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(574);
				match(SIZE);
				System.out.println("Size");
				setState(576);
				match(LPAR);
				setState(577);
				expression();
				setState(578);
				match(RPAR);
				}
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(580);
				match(APPEND);
				System.out.println("Append");
				setState(582);
				match(LPAR);
				setState(583);
				nestedIdentifier();
				setState(584);
				match(COMMA);
				setState(585);
				expression();
				setState(586);
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
		enterRule(_localctx, 56, RULE_nestedIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(IDENTIFIER);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(591);
				match(DOT);
				setState(592);
				match(IDENTIFIER);
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598);
					match(LBRACKET);
					setState(599);
					expression();
					setState(600);
					match(RBRACKET);
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 58, RULE_fptrVarTypes);
		try {
			int _alt;
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(BOOL);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(609);
				match(STRUCT);
				setState(610);
				match(IDENTIFIER);
				}
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(611);
				match(LIST);
				setState(612);
				match(SHARP);
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(LIST);
						setState(614);
						match(SHARP);
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(620);
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
		enterRule(_localctx, 60, RULE_variableType);
		int _la;
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				fptrVarTypes();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(624);
				match(FPTR);
				setState(625);
				match(LT);
				setState(635);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					{
					setState(626);
					fptrVarTypes();
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(627);
						match(COMMA);
						setState(628);
						fptrVarTypes();
						}
						}
						setState(633);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case VOID:
					{
					setState(634);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(637);
				match(T__0);
				setState(640);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					setState(638);
					fptrVarTypes();
					}
					break;
				case VOID:
					{
					setState(639);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(642);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0288\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2"+
		"\16\2Q\13\2\3\2\7\2T\n\2\f\2\16\2W\13\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3"+
		"\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3m\n\3\r"+
		"\3\16\3n\3\3\3\3\6\3s\n\3\r\3\16\3t\3\3\3\3\6\3y\n\3\r\3\16\3z\3\3\7\3"+
		"~\n\3\f\3\16\3\u0081\13\3\3\3\3\3\7\3\u0085\n\3\f\3\16\3\u0088\13\3\5"+
		"\3\u008a\n\3\3\4\3\4\5\4\u008e\n\4\3\4\3\4\3\4\7\4\u0093\n\4\f\4\16\4"+
		"\u0096\13\4\3\4\5\4\u0099\n\4\3\4\7\4\u009c\n\4\f\4\16\4\u009f\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a7\n\5\3\5\3\5\3\5\6\5\u00ac\n\5\r\5\16"+
		"\5\u00ad\3\5\3\5\3\5\3\5\7\5\u00b4\n\5\f\5\16\5\u00b7\13\5\3\5\3\5\3\5"+
		"\3\5\6\5\u00bd\n\5\r\5\16\5\u00be\3\5\3\5\7\5\u00c3\n\5\f\5\16\5\u00c6"+
		"\13\5\3\6\3\6\5\6\u00ca\n\6\3\6\3\6\3\6\3\6\5\6\u00d0\n\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00de\n\7\f\7\16\7\u00e1\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00e9\n\b\r\b\16\b\u00ea\3\b\3\b\6\b\u00ef"+
		"\n\b\r\b\16\b\u00f0\3\b\3\b\7\b\u00f5\n\b\f\b\16\b\u00f8\13\b\3\t\3\t"+
		"\6\t\u00fc\n\t\r\t\16\t\u00fd\3\t\3\t\6\t\u0102\n\t\r\t\16\t\u0103\3\t"+
		"\3\t\7\t\u0108\n\t\f\t\16\t\u010b\13\t\3\t\5\t\u010e\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0117\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0121"+
		"\n\n\7\n\u0123\n\n\f\n\16\n\u0126\13\n\3\n\5\n\u0129\n\n\3\n\7\n\u012c"+
		"\n\n\f\n\16\n\u012f\13\n\3\13\3\13\3\13\5\13\u0134\n\13\3\f\7\f\u0137"+
		"\n\f\f\f\16\f\u013a\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0143\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u014d\n\f\7\f\u014f\n\f\f\f\16\f\u0152"+
		"\13\f\3\f\5\f\u0155\n\f\3\f\7\f\u0158\n\f\f\f\16\f\u015b\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0163\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u016b\n\r\7"+
		"\r\u016d\n\r\f\r\16\r\u0170\13\r\3\r\5\r\u0173\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u017a\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0194\n\23\3\24\3\24\3\24\5\24\u0199\n\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u01a3\n\24\3\24\3\24\3\24\7\24\u01a8\n\24\f\24"+
		"\16\24\u01ab\13\24\5\24\u01ad\n\24\3\25\3\25\3\25\5\25\u01b2\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01bc\n\25\3\25\3\25\3\25\7\25"+
		"\u01c1\n\25\f\25\16\25\u01c4\13\25\5\25\u01c6\n\25\3\26\3\26\3\26\5\26"+
		"\u01cb\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01d5\n\26\3"+
		"\26\3\26\3\26\7\26\u01da\n\26\f\26\16\26\u01dd\13\26\5\26\u01df\n\26\3"+
		"\27\3\27\3\27\5\27\u01e4\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01ef\n\27\3\27\3\27\3\27\7\27\u01f4\n\27\f\27\16\27\u01f7"+
		"\13\27\5\27\u01f9\n\27\3\30\3\30\3\30\5\30\u01fe\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u020b\n\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0217\n\30\3\30\3\30\3\30\5\30"+
		"\u021c\n\30\3\31\3\31\3\31\6\31\u0221\n\31\r\31\16\31\u0222\3\32\3\32"+
		"\3\32\3\32\5\32\u0229\n\32\3\33\3\33\5\33\u022d\n\33\3\33\3\33\5\33\u0231"+
		"\n\33\3\34\3\34\3\34\7\34\u0236\n\34\f\34\16\34\u0239\13\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u024f\n\35\3\36\3\36\3\36\7\36\u0254\n\36\f"+
		"\36\16\36\u0257\13\36\3\36\3\36\3\36\3\36\7\36\u025d\n\36\f\36\16\36\u0260"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u026a\n\37\f\37\16"+
		"\37\u026d\13\37\3\37\5\37\u0270\n\37\3 \3 \3 \3 \3 \3 \7 \u0278\n \f "+
		"\16 \u027b\13 \3 \5 \u027e\n \3 \3 \3 \5 \u0283\n \3 \5 \u0286\n \3 \2"+
		"\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2"+
		"\2\2\u02e8\2C\3\2\2\2\4g\3\2\2\2\6\u009d\3\2\2\2\b\u00a0\3\2\2\2\n\u00c9"+
		"\3\2\2\2\f\u00d4\3\2\2\2\16\u00e2\3\2\2\2\20\u010d\3\2\2\2\22\u012d\3"+
		"\2\2\2\24\u0130\3\2\2\2\26\u0138\3\2\2\2\30\u015c\3\2\2\2\32\u0174\3\2"+
		"\2\2\34\u017b\3\2\2\2\36\u017f\3\2\2\2 \u0184\3\2\2\2\"\u018a\3\2\2\2"+
		"$\u0193\3\2\2\2&\u01ac\3\2\2\2(\u01c5\3\2\2\2*\u01de\3\2\2\2,\u01f8\3"+
		"\2\2\2.\u021b\3\2\2\2\60\u0220\3\2\2\2\62\u0228\3\2\2\2\64\u022a\3\2\2"+
		"\2\66\u0232\3\2\2\28\u024e\3\2\2\2:\u0250\3\2\2\2<\u026f\3\2\2\2>\u0285"+
		"\3\2\2\2@B\7\30\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2"+
		"EC\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2"+
		"KI\3\2\2\2LN\7\30\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PU\3\2\2"+
		"\2QO\3\2\2\2RT\5\n\6\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2\2"+
		"\2WU\3\2\2\2XZ\7\30\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3"+
		"\2\2\2][\3\2\2\2^b\5\16\b\2_a\7\30\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2b"+
		"c\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\2\2\3f\3\3\2\2\2gh\7\34\2\2hi\7.\2\2"+
		"i\u0089\b\3\1\2jl\7\37\2\2km\7\30\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no"+
		"\3\2\2\2op\3\2\2\2pr\5\6\4\2qs\7\30\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2uv\3\2\2\2vx\7 \2\2wy\7\30\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{\u008a\3\2\2\2|~\7\30\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0086"+
		"\5\6\4\2\u0083\u0085\7\30\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089j\3\2\2\2\u0089\177\3\2\2\2\u008a\5\3\2\2\2\u008b\u008e"+
		"\5\30\r\2\u008c\u008e\5\b\5\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\u0094\3\2\2\2\u008f\u0090\7\n\2\2\u0090\u0093\5\30\r\2\u0091\u0093"+
		"\5\b\5\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\7\n\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u009c\7\30\2\2\u009b\u008d\3\2\2\2\u009b\u009a\3"+
		"\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\7\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5> \2\u00a1\u00a2\7.\2\2\u00a2"+
		"\u00a3\b\5\1\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\23\2\2\u00a5\u00a7\5"+
		"\f\7\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\24\2\2\u00a9\u00ab\7\37\2\2\u00aa\u00ac\7\30\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1\b\5\1\2\u00b1\u00b5\5\20"+
		"\t\2\u00b2\u00b4\7\30\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7\'\2\2\u00b9\u00ba\b\5\1\2\u00ba\u00bc\5\20\t\2\u00bb"+
		"\u00bd\7\30\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\7 \2\2\u00c1"+
		"\u00c3\7\30\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\t\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca"+
		"\5> \2\u00c8\u00ca\7&\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7.\2\2\u00cc\u00cd\b\6\1\2\u00cd\u00cf\7\23"+
		"\2\2\u00ce\u00d0\5\f\7\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\5\20\t\2\u00d3\13\3\2"+
		"\2\2\u00d4\u00d5\5> \2\u00d5\u00d6\7.\2\2\u00d6\u00d7\b\7\1\2\u00d7\u00df"+
		"\3\2\2\2\u00d8\u00d9\7\t\2\2\u00d9\u00da\5> \2\u00da\u00db\7.\2\2\u00db"+
		"\u00dc\b\7\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\r\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\b\b\1\2\u00e4\u00e5\7\23\2\2"+
		"\u00e5\u00e6\7\24\2\2\u00e6\u00e8\7\37\2\2\u00e7\u00e9\7\30\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\5\22\n\2\u00ed\u00ef\7\30\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\7 \2\2\u00f3\u00f5\7\30\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\17\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\7\37\2\2\u00fa\u00fc"+
		"\7\30\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\5\22\n\2\u0100\u0102"+
		"\7\30\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\7 \2\2\u0106\u0108"+
		"\7\30\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\u010e\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e"+
		"\5\26\f\2\u010d\u00f9\3\2\2\2\u010d\u010c\3\2\2\2\u010e\21\3\2\2\2\u010f"+
		"\u0117\5\"\22\2\u0110\u0117\5$\23\2\u0111\u0117\5\30\r\2\u0112\u0117\5"+
		"\24\13\2\u0113\u0117\5\32\16\2\u0114\u0117\5 \21\2\u0115\u0117\5\36\20"+
		"\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112"+
		"\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0124\3\2\2\2\u0118\u0120\7\n\2\2\u0119\u0121\5\"\22\2\u011a\u0121\5"+
		"$\23\2\u011b\u0121\5\30\r\2\u011c\u0121\5\24\13\2\u011d\u0121\5\32\16"+
		"\2\u011e\u0121\5 \21\2\u011f\u0121\5\36\20\2\u0120\u0119\3\2\2\2\u0120"+
		"\u011a\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0118\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\7\n\2\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012c\7\30"+
		"\2\2\u012b\u0116\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\23\3\2\2\2\u012f\u012d\3\2\2"+
		"\2\u0130\u0131\7!\2\2\u0131\u0133\b\13\1\2\u0132\u0134\5&\24\2\u0133\u0132"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\25\3\2\2\2\u0135\u0137\7\30\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u0142\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0143\5\"\22\2\u013c"+
		"\u0143\5$\23\2\u013d\u0143\5\30\r\2\u013e\u0143\5\24\13\2\u013f\u0143"+
		"\5\32\16\2\u0140\u0143\5\36\20\2\u0141\u0143\5 \21\2\u0142\u013b\3\2\2"+
		"\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u013f"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0150\3\2\2\2\u0144"+
		"\u014c\7\n\2\2\u0145\u014d\5\"\22\2\u0146\u014d\5$\23\2\u0147\u014d\5"+
		"\30\r\2\u0148\u014d\5\24\13\2\u0149\u014d\5\32\16\2\u014a\u014d\5\36\20"+
		"\2\u014b\u014d\5 \21\2\u014c\u0145\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0147"+
		"\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0144\3\2\2\2\u014f\u0152\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0155\7\n\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0159\3\2\2\2\u0156\u0158\7\30\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\27\3\2\2"+
		"\2\u015b\u0159\3\2\2\2\u015c\u015d\5> \2\u015d\u015e\7.\2\2\u015e\u015f"+
		"\b\r\1\2\u015f\u0162\3\2\2\2\u0160\u0161\7\16\2\2\u0161\u0163\5&\24\2"+
		"\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016e\3\2\2\2\u0164\u0165"+
		"\7\t\2\2\u0165\u0166\7.\2\2\u0166\u0167\b\r\1\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0169\7\16\2\2\u0169\u016b\5&\24\2\u016a\u0168\3\2\2\2\u016a\u016b\3"+
		"\2\2\2\u016b\u016d\3\2\2\2\u016c\u0164\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0173\7\n\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\31\3\2\2\2\u0174\u0175\7+\2\2\u0175\u0176\b\16\1\2\u0176\u0177\5&\24"+
		"\2\u0177\u0179\5\20\t\2\u0178\u017a\5\34\17\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\33\3\2\2\2\u017b\u017c\7,\2\2\u017c\u017d\b\17\1"+
		"\2\u017d\u017e\5\20\t\2\u017e\35\3\2\2\2\u017f\u0180\7)\2\2\u0180\u0181"+
		"\b\20\1\2\u0181\u0182\5&\24\2\u0182\u0183\5\20\t\2\u0183\37\3\2\2\2\u0184"+
		"\u0185\7*\2\2\u0185\u0186\b\21\1\2\u0186\u0187\5\20\t\2\u0187\u0188\7"+
		")\2\2\u0188\u0189\5&\24\2\u0189!\3\2\2\2\u018a\u018b\5:\36\2\u018b\u018c"+
		"\7\16\2\2\u018c\u018d\5&\24\2\u018d#\3\2\2\2\u018e\u018f\5:\36\2\u018f"+
		"\u0190\5\64\33\2\u0190\u0191\b\23\1\2\u0191\u0194\3\2\2\2\u0192\u0194"+
		"\5&\24\2\u0193\u018e\3\2\2\2\u0193\u0192\3\2\2\2\u0194%\3\2\2\2\u0195"+
		"\u0199\7\22\2\2\u0196\u0199\7\5\2\2\u0197\u0199\7\6\2\2\u0198\u0195\3"+
		"\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\7\23\2\2\u019b\u019c\5&\24\2\u019c\u019d\7"+
		"\24\2\2\u019d\u019e\b\24\1\2\u019e\u01ad\3\2\2\2\u019f\u01a9\5(\25\2\u01a0"+
		"\u01a3\7\20\2\2\u01a1\u01a3\7\21\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3"+
		"\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5(\25\2\u01a5\u01a6\b\24\1\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u0198\3\2\2\2\u01ac\u019f\3\2\2\2\u01ad\'\3\2\2\2\u01ae\u01b2\7\22\2"+
		"\2\u01af\u01b2\7\5\2\2\u01b0\u01b2\7\6\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\7\23\2\2\u01b4\u01b5\5&\24\2\u01b5\u01b6\7\24\2\2\u01b6\u01b7\b"+
		"\25\1\2\u01b7\u01c6\3\2\2\2\u01b8\u01c2\5*\26\2\u01b9\u01bc\7\5\2\2\u01ba"+
		"\u01bc\7\6\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01be\5*\26\2\u01be\u01bf\b\25\1\2\u01bf\u01c1\3\2\2\2\u01c0"+
		"\u01bb\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01b1\3\2\2\2\u01c5"+
		"\u01b8\3\2\2\2\u01c6)\3\2\2\2\u01c7\u01cb\7\22\2\2\u01c8\u01cb\7\5\2\2"+
		"\u01c9\u01cb\7\6\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\23\2\2"+
		"\u01cd\u01ce\5&\24\2\u01ce\u01cf\7\24\2\2\u01cf\u01d0\b\26\1\2\u01d0\u01df"+
		"\3\2\2\2\u01d1\u01db\5,\27\2\u01d2\u01d5\7\7\2\2\u01d3\u01d5\7\b\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\5,"+
		"\27\2\u01d7\u01d8\b\26\1\2\u01d8\u01da\3\2\2\2\u01d9\u01d4\3\2\2\2\u01da"+
		"\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01de\u01ca\3\2\2\2\u01de\u01d1\3\2\2\2\u01df"+
		"+\3\2\2\2\u01e0\u01e4\7\22\2\2\u01e1\u01e4\7\5\2\2\u01e2\u01e4\7\6\2\2"+
		"\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\23\2\2\u01e6\u01e7\5&\24\2"+
		"\u01e7\u01e8\7\24\2\2\u01e8\u01e9\b\27\1\2\u01e9\u01f9\3\2\2\2\u01ea\u01f5"+
		"\5.\30\2\u01eb\u01ef\7\17\2\2\u01ec\u01ef\7\r\2\2\u01ed\u01ef\7\f\2\2"+
		"\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f1\5.\30\2\u01f1\u01f2\b\27\1\2\u01f2\u01f4\3\2\2\2"+
		"\u01f3\u01ee\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01e3\3\2\2\2\u01f8"+
		"\u01ea\3\2\2\2\u01f9-\3\2\2\2\u01fa\u01fe\7\22\2\2\u01fb\u01fe\7\5\2\2"+
		"\u01fc\u01fe\7\6\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\23\2\2"+
		"\u0200\u0201\5&\24\2\u0201\u0202\7\24\2\2\u0202\u0203\b\30\1\2\u0203\u021c"+
		"\3\2\2\2\u0204\u0205\7\23\2\2\u0205\u0206\5&\24\2\u0206\u0207\7\24\2\2"+
		"\u0207\u020b\3\2\2\2\u0208\u020b\5\62\32\2\u0209\u020b\5:\36\2\u020a\u0204"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\5\60\31\2\u020d\u021c\3\2\2\2\u020e\u021c\5\62\32\2\u020f\u021c"+
		"\7\4\2\2\u0210\u021c\7\36\2\2\u0211\u021c\7\35\2\2\u0212\u021c\5:\36\2"+
		"\u0213\u0217\7\22\2\2\u0214\u0217\7\5\2\2\u0215\u0217\7\6\2\2\u0216\u0213"+
		"\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\5.\30\2\u0219\u021a\b\30\1\2\u021a\u021c\3\2\2\2\u021b\u01fd\3"+
		"\2\2\2\u021b\u020a\3\2\2\2\u021b\u020e\3\2\2\2\u021b\u020f\3\2\2\2\u021b"+
		"\u0210\3\2\2\2\u021b\u0211\3\2\2\2\u021b\u0212\3\2\2\2\u021b\u0216\3\2"+
		"\2\2\u021c/\3\2\2\2\u021d\u021e\7\25\2\2\u021e\u021f\7\4\2\2\u021f\u0221"+
		"\7\26\2\2\u0220\u021d\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3\2\2\2"+
		"\u0222\u0223\3\2\2\2\u0223\61\3\2\2\2\u0224\u0229\58\35\2\u0225\u0226"+
		"\5:\36\2\u0226\u0227\5\64\33\2\u0227\u0229\3\2\2\2\u0228\u0224\3\2\2\2"+
		"\u0228\u0225\3\2\2\2\u0229\63\3\2\2\2\u022a\u022c\7\23\2\2\u022b\u022d"+
		"\5\66\34\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2"+
		"\u022e\u0230\7\24\2\2\u022f\u0231\5\64\33\2\u0230\u022f\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\65\3\2\2\2\u0232\u0237\5&\24\2\u0233\u0234\7\t\2"+
		"\2\u0234\u0236\5&\24\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\67\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023b\7#\2\2\u023b\u023c\b\35\1\2\u023c\u023d\7\23\2\2\u023d\u023e\5"+
		"&\24\2\u023e\u023f\7\24\2\2\u023f\u024f\3\2\2\2\u0240\u0241\7%\2\2\u0241"+
		"\u0242\b\35\1\2\u0242\u0243\7\23\2\2\u0243\u0244\5&\24\2\u0244\u0245\7"+
		"\24\2\2\u0245\u024f\3\2\2\2\u0246\u0247\7$\2\2\u0247\u0248\b\35\1\2\u0248"+
		"\u0249\7\23\2\2\u0249\u024a\5:\36\2\u024a\u024b\7\t\2\2\u024b\u024c\5"+
		"&\24\2\u024c\u024d\7\24\2\2\u024d\u024f\3\2\2\2\u024e\u023a\3\2\2\2\u024e"+
		"\u0240\3\2\2\2\u024e\u0246\3\2\2\2\u024f9\3\2\2\2\u0250\u0255\7.\2\2\u0251"+
		"\u0252\7\13\2\2\u0252\u0254\7.\2\2\u0253\u0251\3\2\2\2\u0254\u0257\3\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025e\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0258\u0259\7\25\2\2\u0259\u025a\5&\24\2\u025a\u025b\7"+
		"\26\2\2\u025b\u025d\3\2\2\2\u025c\u0258\3\2\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f;\3\2\2\2\u0260\u025e\3\2\2\2"+
		"\u0261\u0270\7\31\2\2\u0262\u0270\7\32\2\2\u0263\u0264\7\34\2\2\u0264"+
		"\u0270\7.\2\2\u0265\u0266\7\33\2\2\u0266\u026b\7\27\2\2\u0267\u0268\7"+
		"\33\2\2\u0268\u026a\7\27\2\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026e\u0270\5> \2\u026f\u0261\3\2\2\2\u026f\u0262\3\2\2\2\u026f\u0263"+
		"\3\2\2\2\u026f\u0265\3\2\2\2\u0270=\3\2\2\2\u0271\u0286\5<\37\2\u0272"+
		"\u0273\7-\2\2\u0273\u027d\7\r\2\2\u0274\u0279\5<\37\2\u0275\u0276\7\t"+
		"\2\2\u0276\u0278\5<\37\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027e\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027c\u027e\7&\2\2\u027d\u0274\3\2\2\2\u027d\u027c\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0282\7\3\2\2\u0280\u0283\5<\37\2\u0281\u0283\7&"+
		"\2\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0286\7\f\2\2\u0285\u0271\3\2\2\2\u0285\u0272\3\2\2\2\u0286?\3\2\2\2"+
		"XCIOU[bntz\177\u0086\u0089\u008d\u0092\u0094\u0098\u009b\u009d\u00a6\u00ad"+
		"\u00b5\u00be\u00c4\u00c9\u00cf\u00df\u00ea\u00f0\u00f6\u00fd\u0103\u0109"+
		"\u010d\u0116\u0120\u0124\u0128\u012b\u012d\u0133\u0138\u0142\u014c\u0150"+
		"\u0154\u0159\u0162\u016a\u016e\u0172\u0179\u0193\u0198\u01a2\u01a9\u01ac"+
		"\u01b1\u01bb\u01c2\u01c5\u01ca\u01d4\u01db\u01de\u01e3\u01ee\u01f5\u01f8"+
		"\u01fd\u020a\u0216\u021b\u0222\u0228\u022c\u0230\u0237\u024e\u0255\u025e"+
		"\u026b\u026f\u0279\u027d\u0282\u0285";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}