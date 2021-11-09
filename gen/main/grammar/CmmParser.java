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
		RULE_expresionFunctionCall = 17, RULE_expression = 18, RULE_expressionOperandAfterOr = 19, 
		RULE_expressionOperandAfterAndOr = 20, RULE_expressionOperandAfterEq = 21, 
		RULE_expressionOperandAfterLtGt = 22, RULE_expressionOperandAfterPlusMinus = 23, 
		RULE_expressionOperand = 24, RULE_index = 25, RULE_functionCall = 26, 
		RULE_call = 27, RULE_callArguments = 28, RULE_primitiveFunctions = 29, 
		RULE_nestedIdentifier = 30, RULE_fptrVarTypes = 31, RULE_variableType = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmmParser", "structDeclaration", "structBody", "structVariableDeclarationGetSet", 
			"methodDeclaration", "arguments", "mainDeclaration", "functionBody", 
			"multiFunctionBody", "returnStmt", "singleFunctionBody", "variableDeclaration", 
			"ifBlock", "elseBlock", "whileBlock", "doWhileBlock", "assignment", "expresionFunctionCall", 
			"expression", "expressionOperandAfterOr", "expressionOperandAfterAndOr", 
			"expressionOperandAfterEq", "expressionOperandAfterLtGt", "expressionOperandAfterPlusMinus", 
			"expressionOperand", "index", "functionCall", "call", "callArguments", 
			"primitiveFunctions", "nestedIdentifier", "fptrVarTypes", "variableType"
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
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					match(NEWLINE);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					structDeclaration();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					match(NEWLINE);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << VOID) | (1L << FPTR))) != 0)) {
				{
				{
				setState(84);
				methodDeclaration();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(90);
				match(NEWLINE);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			mainDeclaration();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(97);
				match(NEWLINE);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
			setState(105);
			match(STRUCT);
			setState(106);
			((StructDeclarationContext)_localctx).StructName = match(IDENTIFIER);
			System.out.println("StructDec : " + (((StructDeclarationContext)_localctx).StructName!=null?((StructDeclarationContext)_localctx).StructName.getText():null));
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(108);
				match(BEGIN);
				setState(110); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(109);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(112); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(114);
				structBody();
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					match(NEWLINE);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(120);
				match(END);
				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(121);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124); 
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
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						match(NEWLINE);
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(132);
				structBody();
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						match(NEWLINE);
						}
						} 
					}
					setState(138);
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
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(157);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case BOOL:
					case LIST:
					case STRUCT:
					case FPTR:
						{
						{
						setState(143);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(141);
							variableDeclaration();
							}
							break;
						case 2:
							{
							setState(142);
							structVariableDeclarationGetSet();
							}
							break;
						}
						setState(150);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(148);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case SEMICOLLON:
									{
									setState(145);
									match(SEMICOLLON);
									setState(146);
									variableDeclaration();
									}
									break;
								case INT:
								case BOOL:
								case LIST:
								case STRUCT:
								case FPTR:
									{
									setState(147);
									structVariableDeclarationGetSet();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								} 
							}
							setState(152);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLLON) {
							{
							setState(153);
							match(SEMICOLLON);
							}
						}

						}
						}
						break;
					case NEWLINE:
						{
						setState(156);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(161);
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
			setState(162);
			variableType();
			{
			setState(163);
			((StructVariableDeclarationGetSetContext)_localctx).VariableName = match(IDENTIFIER);
			System.out.println("VarDec : " + (((StructVariableDeclarationGetSetContext)_localctx).VariableName!=null?((StructVariableDeclarationGetSetContext)_localctx).VariableName.getText():null));
			}
			setState(166);
			match(LPAR);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(167);
				arguments();
				}
			}

			setState(170);
			match(RPAR);
			setState(171);
			match(BEGIN);
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				match(NEWLINE);
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(177);
			match(SET);
			System.out.println("Setter");
			setState(179);
			functionBody();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(180);
				match(NEWLINE);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(GET);
			System.out.println("Getter");
			setState(188);
			functionBody();
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(NEWLINE);
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(194);
			match(END);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(NEWLINE);
					}
					} 
				}
				setState(200);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(201);
				variableType();
				}
				break;
			case VOID:
				{
				setState(202);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			((MethodDeclarationContext)_localctx).FunctionName = match(IDENTIFIER);
			System.out.println("FunctionDec : " + (((MethodDeclarationContext)_localctx).FunctionName!=null?((MethodDeclarationContext)_localctx).FunctionName.getText():null));
			setState(207);
			match(LPAR);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(208);
				arguments();
				}
			}

			setState(211);
			match(RPAR);
			setState(212);
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
			setState(214);
			variableType();
			{
			setState(215);
			((ArgumentsContext)_localctx).ArgumentName = match(IDENTIFIER);
			System.out.println("ArgumentDec : " + (((ArgumentsContext)_localctx).ArgumentName!=null?((ArgumentsContext)_localctx).ArgumentName.getText():null));
			}
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(218);
				match(COMMA);
				setState(219);
				variableType();
				{
				setState(220);
				((ArgumentsContext)_localctx).ArgumentName = match(IDENTIFIER);
				System.out.println("ArgumentDec : " + (((ArgumentsContext)_localctx).ArgumentName!=null?((ArgumentsContext)_localctx).ArgumentName.getText():null));
				}
				}
				}
				setState(227);
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
			setState(228);
			match(MAIN);
			System.out.println("Main");
			setState(230);
			match(LPAR);
			setState(231);
			match(RPAR);
			setState(232);
			match(BEGIN);
			setState(234); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(233);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(238);
			multiFunctionBody();
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				match(NEWLINE);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(244);
			match(END);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(NEWLINE);
					}
					} 
				}
				setState(250);
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
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(251);
				match(BEGIN);
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(252);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(257);
				multiFunctionBody();
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(258);
					match(NEWLINE);
					}
					}
					setState(261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(263);
				match(END);
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						match(NEWLINE);
						}
						} 
					}
					setState(269);
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
				setState(270);
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
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(301);
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
						{
						setState(280);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(273);
							assignment();
							}
							break;
						case 2:
							{
							setState(274);
							expresionFunctionCall();
							}
							break;
						case 3:
							{
							setState(275);
							variableDeclaration();
							}
							break;
						case 4:
							{
							setState(276);
							returnStmt();
							}
							break;
						case 5:
							{
							setState(277);
							ifBlock();
							}
							break;
						case 6:
							{
							setState(278);
							doWhileBlock();
							}
							break;
						case 7:
							{
							setState(279);
							whileBlock();
							}
							break;
						}
						setState(294);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(282);
								match(SEMICOLLON);
								setState(290);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
								case 1:
									{
									setState(283);
									assignment();
									}
									break;
								case 2:
									{
									setState(284);
									expresionFunctionCall();
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
								case 5:
									{
									setState(287);
									ifBlock();
									}
									break;
								case 6:
									{
									setState(288);
									doWhileBlock();
									}
									break;
								case 7:
									{
									setState(289);
									whileBlock();
									}
									break;
								}
								}
								} 
							}
							setState(296);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						}
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLLON) {
							{
							setState(297);
							match(SEMICOLLON);
							}
						}

						}
						}
						break;
					case NEWLINE:
						{
						setState(300);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(305);
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
			setState(306);
			match(RETURN);
			System.out.println("Return");
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(308);
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
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(311);
				match(NEWLINE);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(317);
				assignment();
				}
				break;
			case 2:
				{
				setState(318);
				expresionFunctionCall();
				}
				break;
			case 3:
				{
				setState(319);
				variableDeclaration();
				}
				break;
			case 4:
				{
				setState(320);
				returnStmt();
				}
				break;
			case 5:
				{
				setState(321);
				ifBlock();
				}
				break;
			case 6:
				{
				setState(322);
				whileBlock();
				}
				break;
			case 7:
				{
				setState(323);
				doWhileBlock();
				}
				break;
			}
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					match(SEMICOLLON);
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(327);
						assignment();
						}
						break;
					case 2:
						{
						setState(328);
						expresionFunctionCall();
						}
						break;
					case 3:
						{
						setState(329);
						variableDeclaration();
						}
						break;
					case 4:
						{
						setState(330);
						returnStmt();
						}
						break;
					case 5:
						{
						setState(331);
						ifBlock();
						}
						break;
					case 6:
						{
						setState(332);
						whileBlock();
						}
						break;
					case 7:
						{
						setState(333);
						doWhileBlock();
						}
						break;
					}
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(341);
				match(SEMICOLLON);
				}
				break;
			}
			}
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					match(NEWLINE);
					}
					} 
				}
				setState(349);
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
			setState(350);
			variableType();
			{
			{
			setState(351);
			((VariableDeclarationContext)_localctx).VariableName = match(IDENTIFIER);
			System.out.println("VarDec : " + (((VariableDeclarationContext)_localctx).VariableName!=null?((VariableDeclarationContext)_localctx).VariableName.getText():null));
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(354);
				match(ASSIGN);
				setState(355);
				expression();
				}
			}

			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(358);
				match(COMMA);
				{
				{
				setState(359);
				((VariableDeclarationContext)_localctx).VariableName = match(IDENTIFIER);
				System.out.println("VarDec : " + (((VariableDeclarationContext)_localctx).VariableName!=null?((VariableDeclarationContext)_localctx).VariableName.getText():null));
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(362);
					match(ASSIGN);
					setState(363);
					expression();
					}
				}

				}
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(371);
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
			setState(374);
			match(IF);
			System.out.println("Conditional : if");
			setState(376);
			expression();
			setState(377);
			functionBody();
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(378);
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
			setState(381);
			match(ELSE);
			System.out.println("Conditional : else");
			setState(383);
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
			setState(385);
			match(WHILE);
			System.out.println("Loop : while");
			setState(387);
			expression();
			setState(388);
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
			setState(390);
			match(DO);
			System.out.println("Loop : do...while");
			setState(392);
			functionBody();
			setState(393);
			match(WHILE);
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
			setState(396);
			nestedIdentifier();
			setState(397);
			match(ASSIGN);
			setState(398);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(400);
				nestedIdentifier();
				setState(401);
				call();
				System.out.println("FunctionCall");
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
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
		public List<ExpressionOperandAfterOrContext> expressionOperandAfterOr() {
			return getRuleContexts(ExpressionOperandAfterOrContext.class);
		}
		public ExpressionOperandAfterOrContext expressionOperandAfterOr(int i) {
			return getRuleContext(ExpressionOperandAfterOrContext.class,i);
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
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(407);
					((ExpressionContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(408);
					((ExpressionContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(409);
					((ExpressionContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(412);
				match(LPAR);
				setState(413);
				expression();
				setState(414);
				match(RPAR);
				if((((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				expressionOperandAfterOr();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					{
					setState(418);
					((ExpressionContext)_localctx).Operator = match(OR);
					}
					setState(419);
					expressionOperandAfterOr();
					System.out.println("Operator : " + (((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null));
					}
					}
					setState(426);
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

	public static class ExpressionOperandAfterOrContext extends ParserRuleContext {
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
		public ExpressionOperandAfterOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperandAfterOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperandAfterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperandAfterOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperandAfterOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandAfterOrContext expressionOperandAfterOr() throws RecognitionException {
		ExpressionOperandAfterOrContext _localctx = new ExpressionOperandAfterOrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionOperandAfterOr);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(432);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(429);
					((ExpressionOperandAfterOrContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(430);
					((ExpressionOperandAfterOrContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(431);
					((ExpressionOperandAfterOrContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(434);
				match(LPAR);
				setState(435);
				expression();
				setState(436);
				match(RPAR);
				if((((ExpressionOperandAfterOrContext)_localctx).Operator!=null?((ExpressionOperandAfterOrContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterOrContext)_localctx).Operator!=null?((ExpressionOperandAfterOrContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				expressionOperandAfterAndOr();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					{
					setState(440);
					((ExpressionOperandAfterOrContext)_localctx).Operator = match(AND);
					}
					setState(441);
					expressionOperandAfterAndOr();
					System.out.println("Operator : " + (((ExpressionOperandAfterOrContext)_localctx).Operator!=null?((ExpressionOperandAfterOrContext)_localctx).Operator.getText():null));
					}
					}
					setState(448);
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
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public List<ExpressionOperandAfterEqContext> expressionOperandAfterEq() {
			return getRuleContexts(ExpressionOperandAfterEqContext.class);
		}
		public ExpressionOperandAfterEqContext expressionOperandAfterEq(int i) {
			return getRuleContext(ExpressionOperandAfterEqContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(CmmParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CmmParser.EQ, i);
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
		enterRule(_localctx, 40, RULE_expressionOperandAfterAndOr);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(454);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(451);
					((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(452);
					((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(453);
					((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(456);
				match(LPAR);
				setState(457);
				expression();
				setState(458);
				match(RPAR);
				if((((ExpressionOperandAfterAndOrContext)_localctx).Operator!=null?((ExpressionOperandAfterAndOrContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterAndOrContext)_localctx).Operator!=null?((ExpressionOperandAfterAndOrContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				expressionOperandAfterEq();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQ) {
					{
					{
					{
					setState(462);
					((ExpressionOperandAfterAndOrContext)_localctx).Operator = match(EQ);
					}
					setState(463);
					expressionOperandAfterEq();
					System.out.println("Operator : " + (((ExpressionOperandAfterAndOrContext)_localctx).Operator!=null?((ExpressionOperandAfterAndOrContext)_localctx).Operator.getText():null));
					}
					}
					setState(470);
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

	public static class ExpressionOperandAfterEqContext extends ParserRuleContext {
		public Token Operator;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(CmmParser.NEG, 0); }
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public List<ExpressionOperandAfterLtGtContext> expressionOperandAfterLtGt() {
			return getRuleContexts(ExpressionOperandAfterLtGtContext.class);
		}
		public ExpressionOperandAfterLtGtContext expressionOperandAfterLtGt(int i) {
			return getRuleContext(ExpressionOperandAfterLtGtContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(CmmParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CmmParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CmmParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CmmParser.GT, i);
		}
		public ExpressionOperandAfterEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperandAfterEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperandAfterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperandAfterEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperandAfterEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandAfterEqContext expressionOperandAfterEq() throws RecognitionException {
		ExpressionOperandAfterEqContext _localctx = new ExpressionOperandAfterEqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionOperandAfterEq);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(476);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(473);
					((ExpressionOperandAfterEqContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(474);
					((ExpressionOperandAfterEqContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(475);
					((ExpressionOperandAfterEqContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(478);
				match(LPAR);
				setState(479);
				expression();
				setState(480);
				match(RPAR);
				if((((ExpressionOperandAfterEqContext)_localctx).Operator!=null?((ExpressionOperandAfterEqContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterEqContext)_localctx).Operator!=null?((ExpressionOperandAfterEqContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				expressionOperandAfterLtGt();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==GT || _la==LT) {
					{
					{
					setState(486);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
						{
						{
						setState(484);
						((ExpressionOperandAfterEqContext)_localctx).Operator = match(LT);
						}
						}
						break;
					case GT:
						{
						{
						setState(485);
						((ExpressionOperandAfterEqContext)_localctx).Operator = match(GT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(488);
					expressionOperandAfterLtGt();
					System.out.println("Operator : " + (((ExpressionOperandAfterEqContext)_localctx).Operator!=null?((ExpressionOperandAfterEqContext)_localctx).Operator.getText():null));
					}
					}
					setState(495);
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

	public static class ExpressionOperandAfterLtGtContext extends ParserRuleContext {
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
		public ExpressionOperandAfterLtGtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperandAfterLtGt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpressionOperandAfterLtGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpressionOperandAfterLtGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpressionOperandAfterLtGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperandAfterLtGtContext expressionOperandAfterLtGt() throws RecognitionException {
		ExpressionOperandAfterLtGtContext _localctx = new ExpressionOperandAfterLtGtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionOperandAfterLtGt);
		try {
			int _alt;
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(501);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(498);
					((ExpressionOperandAfterLtGtContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(499);
					((ExpressionOperandAfterLtGtContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(500);
					((ExpressionOperandAfterLtGtContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(503);
				match(LPAR);
				setState(504);
				expression();
				setState(505);
				match(RPAR);
				if((((ExpressionOperandAfterLtGtContext)_localctx).Operator!=null?((ExpressionOperandAfterLtGtContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterLtGtContext)_localctx).Operator!=null?((ExpressionOperandAfterLtGtContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				expressionOperandAfterPlusMinus();
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(511);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							{
							setState(509);
							((ExpressionOperandAfterLtGtContext)_localctx).Operator = match(PLUS);
							}
							}
							break;
						case MINUS:
							{
							{
							setState(510);
							((ExpressionOperandAfterLtGtContext)_localctx).Operator = match(MINUS);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(513);
						expressionOperandAfterPlusMinus();
						System.out.println("Operator : " + (((ExpressionOperandAfterLtGtContext)_localctx).Operator!=null?((ExpressionOperandAfterLtGtContext)_localctx).Operator.getText():null));
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		public List<ExpressionOperandContext> expressionOperand() {
			return getRuleContexts(ExpressionOperandContext.class);
		}
		public ExpressionOperandContext expressionOperand(int i) {
			return getRuleContext(ExpressionOperandContext.class,i);
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
		enterRule(_localctx, 46, RULE_expressionOperandAfterPlusMinus);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(526);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(523);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(524);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(525);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(528);
				match(LPAR);
				setState(529);
				expression();
				setState(530);
				match(RPAR);
				if((((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				expressionOperand();
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIVIDE) {
					{
					{
					setState(536);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						{
						setState(534);
						((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(MULT);
						}
						}
						break;
					case DIVIDE:
						{
						{
						setState(535);
						((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(DIVIDE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(538);
					expressionOperand();
					System.out.println("Operator : " + (((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null));
					}
					}
					setState(545);
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
		enterRule(_localctx, 48, RULE_expressionOperand);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(551);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(548);
					((ExpressionOperandContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(549);
					((ExpressionOperandContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(550);
					((ExpressionOperandContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(553);
				match(LPAR);
				setState(554);
				expression();
				setState(555);
				match(RPAR);
				if((((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					{
					setState(558);
					match(LPAR);
					setState(559);
					expression();
					setState(560);
					match(RPAR);
					}
					}
					break;
				case 2:
					{
					setState(562);
					functionCall();
					}
					break;
				case 3:
					{
					setState(563);
					nestedIdentifier();
					}
					break;
				}
				setState(566);
				index();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(570);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(571);
				match(FALSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(572);
				nestedIdentifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(573);
					((ExpressionOperandContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(574);
					((ExpressionOperandContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(575);
					((ExpressionOperandContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(578);
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
		enterRule(_localctx, 50, RULE_index);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(583);
					match(LBRACKET);
					setState(584);
					expression();
					setState(585);
					match(RBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(589); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 52, RULE_functionCall);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
			case APPEND:
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				primitiveFunctions();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(592);
				nestedIdentifier();
				setState(593);
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
		enterRule(_localctx, 54, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(LPAR);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAR) | (1L << FALSE) | (1L << TRUE) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(598);
				callArguments();
				}
			}

			setState(601);
			match(RPAR);
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(602);
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
		enterRule(_localctx, 56, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			expression();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(606);
				match(COMMA);
				setState(607);
				expression();
				}
				}
				setState(612);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 58, RULE_primitiveFunctions);
		try {
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(613);
				match(DISPLAY);
				System.out.println("Built-in : display");
				setState(615);
				match(LPAR);
				setState(616);
				expression();
				setState(617);
				match(RPAR);
				}
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(619);
				match(SIZE);
				System.out.println("Size");
				setState(621);
				match(LPAR);
				setState(622);
				expression();
				setState(623);
				match(RPAR);
				}
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(625);
				match(APPEND);
				System.out.println("Append");
				setState(627);
				match(LPAR);
				setState(628);
				expression();
				setState(629);
				match(COMMA);
				setState(630);
				expression();
				setState(631);
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
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
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
		enterRule(_localctx, 60, RULE_nestedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(635);
			match(IDENTIFIER);
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(636);
				index();
				}
				break;
			}
			}
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(639);
				match(DOT);
				{
				setState(640);
				match(IDENTIFIER);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(641);
					index();
					}
					break;
				}
				}
				}
				}
				setState(648);
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
		enterRule(_localctx, 62, RULE_fptrVarTypes);
		try {
			int _alt;
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(BOOL);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(651);
				match(STRUCT);
				setState(652);
				match(IDENTIFIER);
				}
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(653);
				match(LIST);
				setState(654);
				match(SHARP);
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(655);
						match(LIST);
						setState(656);
						match(SHARP);
						}
						} 
					}
					setState(661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(662);
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
		enterRule(_localctx, 64, RULE_variableType);
		int _la;
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				fptrVarTypes();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(666);
				match(FPTR);
				setState(667);
				match(LT);
				setState(677);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					{
					setState(668);
					fptrVarTypes();
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(669);
						match(COMMA);
						setState(670);
						fptrVarTypes();
						}
						}
						setState(675);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case VOID:
					{
					setState(676);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(679);
				match(T__0);
				setState(682);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					setState(680);
					fptrVarTypes();
					}
					break;
				case VOID:
					{
					setState(681);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(684);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u02b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\7\2R\n\2\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\7\2^\n\2\f"+
		"\2\16\2a\13\2\3\2\3\2\7\2e\n\2\f\2\16\2h\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\6\3q\n\3\r\3\16\3r\3\3\3\3\6\3w\n\3\r\3\16\3x\3\3\3\3\6\3}\n\3\r"+
		"\3\16\3~\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13\3\3\3\3\3\7\3\u0089\n\3\f"+
		"\3\16\3\u008c\13\3\5\3\u008e\n\3\3\4\3\4\5\4\u0092\n\4\3\4\3\4\3\4\7\4"+
		"\u0097\n\4\f\4\16\4\u009a\13\4\3\4\5\4\u009d\n\4\3\4\7\4\u00a0\n\4\f\4"+
		"\16\4\u00a3\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\5\3\5\3\5\6\5"+
		"\u00b0\n\5\r\5\16\5\u00b1\3\5\3\5\3\5\3\5\7\5\u00b8\n\5\f\5\16\5\u00bb"+
		"\13\5\3\5\3\5\3\5\3\5\6\5\u00c1\n\5\r\5\16\5\u00c2\3\5\3\5\7\5\u00c7\n"+
		"\5\f\5\16\5\u00ca\13\5\3\6\3\6\5\6\u00ce\n\6\3\6\3\6\3\6\3\6\5\6\u00d4"+
		"\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e2\n\7\f\7"+
		"\16\7\u00e5\13\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00ed\n\b\r\b\16\b\u00ee"+
		"\3\b\3\b\6\b\u00f3\n\b\r\b\16\b\u00f4\3\b\3\b\7\b\u00f9\n\b\f\b\16\b\u00fc"+
		"\13\b\3\t\3\t\6\t\u0100\n\t\r\t\16\t\u0101\3\t\3\t\6\t\u0106\n\t\r\t\16"+
		"\t\u0107\3\t\3\t\7\t\u010c\n\t\f\t\16\t\u010f\13\t\3\t\5\t\u0112\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0125\n\n\7\n\u0127\n\n\f\n\16\n\u012a\13\n\3\n\5\n\u012d\n\n\3"+
		"\n\7\n\u0130\n\n\f\n\16\n\u0133\13\n\3\13\3\13\3\13\5\13\u0138\n\13\3"+
		"\f\7\f\u013b\n\f\f\f\16\f\u013e\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0147"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0151\n\f\7\f\u0153\n\f\f\f\16"+
		"\f\u0156\13\f\3\f\5\f\u0159\n\f\3\f\7\f\u015c\n\f\f\f\16\f\u015f\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0167\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u016f"+
		"\n\r\7\r\u0171\n\r\f\r\16\r\u0174\13\r\3\r\5\r\u0177\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u017e\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0198\n\23\3\24\3\24\3\24\5\24\u019d\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01a9\n\24\f\24\16\24\u01ac\13"+
		"\24\5\24\u01ae\n\24\3\25\3\25\3\25\5\25\u01b3\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01bf\n\25\f\25\16\25\u01c2\13\25"+
		"\5\25\u01c4\n\25\3\26\3\26\3\26\5\26\u01c9\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u01d5\n\26\f\26\16\26\u01d8\13\26\5"+
		"\26\u01da\n\26\3\27\3\27\3\27\5\27\u01df\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u01e9\n\27\3\27\3\27\3\27\7\27\u01ee\n\27\f\27\16"+
		"\27\u01f1\13\27\5\27\u01f3\n\27\3\30\3\30\3\30\5\30\u01f8\n\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0202\n\30\3\30\3\30\3\30\7\30"+
		"\u0207\n\30\f\30\16\30\u020a\13\30\5\30\u020c\n\30\3\31\3\31\3\31\5\31"+
		"\u0211\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u021b\n\31\3"+
		"\31\3\31\3\31\7\31\u0220\n\31\f\31\16\31\u0223\13\31\5\31\u0225\n\31\3"+
		"\32\3\32\3\32\5\32\u022a\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0237\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0243\n\32\3\32\3\32\3\32\5\32\u0248\n\32\3\33\3\33\3"+
		"\33\3\33\6\33\u024e\n\33\r\33\16\33\u024f\3\34\3\34\3\34\3\34\5\34\u0256"+
		"\n\34\3\35\3\35\5\35\u025a\n\35\3\35\3\35\5\35\u025e\n\35\3\36\3\36\3"+
		"\36\7\36\u0263\n\36\f\36\16\36\u0266\13\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u027c\n\37\3 \3 \5 \u0280\n \3 \3 \3 \5 \u0285\n \7 \u0287\n"+
		" \f \16 \u028a\13 \3!\3!\3!\3!\3!\3!\3!\3!\7!\u0294\n!\f!\16!\u0297\13"+
		"!\3!\5!\u029a\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u02a2\n\"\f\"\16\"\u02a5"+
		"\13\"\3\"\5\"\u02a8\n\"\3\"\3\"\3\"\5\"\u02ad\n\"\3\"\5\"\u02b0\n\"\3"+
		"\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@B\2\2\2\u0319\2G\3\2\2\2\4k\3\2\2\2\6\u00a1\3\2\2\2\b\u00a4\3\2\2\2"+
		"\n\u00cd\3\2\2\2\f\u00d8\3\2\2\2\16\u00e6\3\2\2\2\20\u0111\3\2\2\2\22"+
		"\u0131\3\2\2\2\24\u0134\3\2\2\2\26\u013c\3\2\2\2\30\u0160\3\2\2\2\32\u0178"+
		"\3\2\2\2\34\u017f\3\2\2\2\36\u0183\3\2\2\2 \u0188\3\2\2\2\"\u018e\3\2"+
		"\2\2$\u0197\3\2\2\2&\u01ad\3\2\2\2(\u01c3\3\2\2\2*\u01d9\3\2\2\2,\u01f2"+
		"\3\2\2\2.\u020b\3\2\2\2\60\u0224\3\2\2\2\62\u0247\3\2\2\2\64\u024d\3\2"+
		"\2\2\66\u0255\3\2\2\28\u0257\3\2\2\2:\u025f\3\2\2\2<\u027b\3\2\2\2>\u027d"+
		"\3\2\2\2@\u0299\3\2\2\2B\u02af\3\2\2\2DF\7\30\2\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\7\30\2\2QP\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5\n\6\2WV\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2\2\2\\^\7\30\2\2]\\\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\5\16\b\2ce\7\30\2\2d"+
		"c\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\2\2\3"+
		"j\3\3\2\2\2kl\7\34\2\2lm\7.\2\2m\u008d\b\3\1\2np\7\37\2\2oq\7\30\2\2p"+
		"o\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\5\6\4\2uw\7\30\2\2"+
		"vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7 \2\2{}\7\30\2\2"+
		"|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u008e\3\2\2\2\u0080\u0082"+
		"\7\30\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008a"+
		"\5\6\4\2\u0087\u0089\7\30\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008dn\3\2\2\2\u008d\u0083\3\2\2\2\u008e\5\3\2\2\2\u008f\u0092"+
		"\5\30\r\2\u0090\u0092\5\b\5\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0098\3\2\2\2\u0093\u0094\7\n\2\2\u0094\u0097\5\30\r\2\u0095\u0097"+
		"\5\b\5\2\u0096\u0093\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\7\n\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u00a0\7\30\2\2\u009f\u0091\3\2\2\2\u009f\u009e\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\7\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5B\"\2\u00a5\u00a6\7.\2\2\u00a6"+
		"\u00a7\b\5\1\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\7\23\2\2\u00a9\u00ab\5"+
		"\f\7\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\7\24\2\2\u00ad\u00af\7\37\2\2\u00ae\u00b0\7\30\2\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b5\b\5\1\2\u00b5\u00b9\5\20"+
		"\t\2\u00b6\u00b8\7\30\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7\'\2\2\u00bd\u00be\b\5\1\2\u00be\u00c0\5\20\t\2\u00bf"+
		"\u00c1\7\30\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\7 \2\2\u00c5"+
		"\u00c7\7\30\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\t\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce"+
		"\5B\"\2\u00cc\u00ce\7&\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7.\2\2\u00d0\u00d1\b\6\1\2\u00d1\u00d3\7\23"+
		"\2\2\u00d2\u00d4\5\f\7\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\7\24\2\2\u00d6\u00d7\5\20\t\2\u00d7\13\3\2"+
		"\2\2\u00d8\u00d9\5B\"\2\u00d9\u00da\7.\2\2\u00da\u00db\b\7\1\2\u00db\u00e3"+
		"\3\2\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\5B\"\2\u00de\u00df\7.\2\2\u00df"+
		"\u00e0\b\7\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\r\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\b\b\1\2\u00e8\u00e9\7\23\2\2"+
		"\u00e9\u00ea\7\24\2\2\u00ea\u00ec\7\37\2\2\u00eb\u00ed\7\30\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\5\22\n\2\u00f1\u00f3\7\30\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\7 \2\2\u00f7\u00f9\7\30\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\17\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7\37\2\2\u00fe\u0100"+
		"\7\30\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\5\22\n\2\u0104\u0106"+
		"\7\30\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010d\7 \2\2\u010a\u010c"+
		"\7\30\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u0112\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112"+
		"\5\26\f\2\u0111\u00fd\3\2\2\2\u0111\u0110\3\2\2\2\u0112\21\3\2\2\2\u0113"+
		"\u011b\5\"\22\2\u0114\u011b\5$\23\2\u0115\u011b\5\30\r\2\u0116\u011b\5"+
		"\24\13\2\u0117\u011b\5\32\16\2\u0118\u011b\5 \21\2\u0119\u011b\5\36\20"+
		"\2\u011a\u0113\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116"+
		"\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\u0128\3\2\2\2\u011c\u0124\7\n\2\2\u011d\u0125\5\"\22\2\u011e\u0125\5"+
		"$\23\2\u011f\u0125\5\30\r\2\u0120\u0125\5\24\13\2\u0121\u0125\5\32\16"+
		"\2\u0122\u0125\5 \21\2\u0123\u0125\5\36\20\2\u0124\u011d\3\2\2\2\u0124"+
		"\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u011c\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\7\n\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u0130\7\30"+
		"\2\2\u012f\u011a\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\23\3\2\2\2\u0133\u0131\3\2\2"+
		"\2\u0134\u0135\7!\2\2\u0135\u0137\b\13\1\2\u0136\u0138\5&\24\2\u0137\u0136"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\25\3\2\2\2\u0139\u013b\7\30\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u0146\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0147\5\"\22\2\u0140"+
		"\u0147\5$\23\2\u0141\u0147\5\30\r\2\u0142\u0147\5\24\13\2\u0143\u0147"+
		"\5\32\16\2\u0144\u0147\5\36\20\2\u0145\u0147\5 \21\2\u0146\u013f\3\2\2"+
		"\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0154\3\2\2\2\u0148"+
		"\u0150\7\n\2\2\u0149\u0151\5\"\22\2\u014a\u0151\5$\23\2\u014b\u0151\5"+
		"\30\r\2\u014c\u0151\5\24\13\2\u014d\u0151\5\32\16\2\u014e\u0151\5\36\20"+
		"\2\u014f\u0151\5 \21\2\u0150\u0149\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014b"+
		"\3\2\2\2\u0150\u014c\3\2\2\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0148\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\7\n\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015d\3\2\2\2\u015a\u015c\7\30\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\27\3\2\2"+
		"\2\u015f\u015d\3\2\2\2\u0160\u0161\5B\"\2\u0161\u0162\7.\2\2\u0162\u0163"+
		"\b\r\1\2\u0163\u0166\3\2\2\2\u0164\u0165\7\16\2\2\u0165\u0167\5&\24\2"+
		"\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0172\3\2\2\2\u0168\u0169"+
		"\7\t\2\2\u0169\u016a\7.\2\2\u016a\u016b\b\r\1\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016d\7\16\2\2\u016d\u016f\5&\24\2\u016e\u016c\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0171\3\2\2\2\u0170\u0168\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0175\u0177\7\n\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\31\3\2\2\2\u0178\u0179\7+\2\2\u0179\u017a\b\16\1\2\u017a\u017b\5&\24"+
		"\2\u017b\u017d\5\20\t\2\u017c\u017e\5\34\17\2\u017d\u017c\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\33\3\2\2\2\u017f\u0180\7,\2\2\u0180\u0181\b\17\1"+
		"\2\u0181\u0182\5\20\t\2\u0182\35\3\2\2\2\u0183\u0184\7)\2\2\u0184\u0185"+
		"\b\20\1\2\u0185\u0186\5&\24\2\u0186\u0187\5\20\t\2\u0187\37\3\2\2\2\u0188"+
		"\u0189\7*\2\2\u0189\u018a\b\21\1\2\u018a\u018b\5\20\t\2\u018b\u018c\7"+
		")\2\2\u018c\u018d\5&\24\2\u018d!\3\2\2\2\u018e\u018f\5> \2\u018f\u0190"+
		"\7\16\2\2\u0190\u0191\5&\24\2\u0191#\3\2\2\2\u0192\u0193\5> \2\u0193\u0194"+
		"\58\35\2\u0194\u0195\b\23\1\2\u0195\u0198\3\2\2\2\u0196\u0198\5&\24\2"+
		"\u0197\u0192\3\2\2\2\u0197\u0196\3\2\2\2\u0198%\3\2\2\2\u0199\u019d\7"+
		"\22\2\2\u019a\u019d\7\5\2\2\u019b\u019d\7\6\2\2\u019c\u0199\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\7\23\2\2\u019f\u01a0\5&\24\2\u01a0\u01a1\7\24\2\2\u01a1"+
		"\u01a2\b\24\1\2\u01a2\u01ae\3\2\2\2\u01a3\u01aa\5(\25\2\u01a4\u01a5\7"+
		"\21\2\2\u01a5\u01a6\5(\25\2\u01a6\u01a7\b\24\1\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a4\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u019c\3\2\2\2\u01ad"+
		"\u01a3\3\2\2\2\u01ae\'\3\2\2\2\u01af\u01b3\7\22\2\2\u01b0\u01b3\7\5\2"+
		"\2\u01b1\u01b3\7\6\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7\23\2\2"+
		"\u01b5\u01b6\5&\24\2\u01b6\u01b7\7\24\2\2\u01b7\u01b8\b\25\1\2\u01b8\u01c4"+
		"\3\2\2\2\u01b9\u01c0\5*\26\2\u01ba\u01bb\7\20\2\2\u01bb\u01bc\5*\26\2"+
		"\u01bc\u01bd\b\25\1\2\u01bd\u01bf\3\2\2\2\u01be\u01ba\3\2\2\2\u01bf\u01c2"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01b2\3\2\2\2\u01c3\u01b9\3\2\2\2\u01c4)\3\2\2\2"+
		"\u01c5\u01c9\7\22\2\2\u01c6\u01c9\7\5\2\2\u01c7\u01c9\7\6\2\2\u01c8\u01c5"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\7\23\2\2\u01cb\u01cc\5&\24\2\u01cc\u01cd\7"+
		"\24\2\2\u01cd\u01ce\b\26\1\2\u01ce\u01da\3\2\2\2\u01cf\u01d6\5,\27\2\u01d0"+
		"\u01d1\7\17\2\2\u01d1\u01d2\5,\27\2\u01d2\u01d3\b\26\1\2\u01d3\u01d5\3"+
		"\2\2\2\u01d4\u01d0\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01c8\3\2"+
		"\2\2\u01d9\u01cf\3\2\2\2\u01da+\3\2\2\2\u01db\u01df\7\22\2\2\u01dc\u01df"+
		"\7\5\2\2\u01dd\u01df\7\6\2\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\23"+
		"\2\2\u01e1\u01e2\5&\24\2\u01e2\u01e3\7\24\2\2\u01e3\u01e4\b\27\1\2\u01e4"+
		"\u01f3\3\2\2\2\u01e5\u01ef\5.\30\2\u01e6\u01e9\7\r\2\2\u01e7\u01e9\7\f"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\5.\30\2\u01eb\u01ec\b\27\1\2\u01ec\u01ee\3\2\2\2\u01ed\u01e8\3"+
		"\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01de\3\2\2\2\u01f2\u01e5\3\2"+
		"\2\2\u01f3-\3\2\2\2\u01f4\u01f8\7\22\2\2\u01f5\u01f8\7\5\2\2\u01f6\u01f8"+
		"\7\6\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\7\23\2\2\u01fa\u01fb\5"+
		"&\24\2\u01fb\u01fc\7\24\2\2\u01fc\u01fd\b\30\1\2\u01fd\u020c\3\2\2\2\u01fe"+
		"\u0208\5\60\31\2\u01ff\u0202\7\5\2\2\u0200\u0202\7\6\2\2\u0201\u01ff\3"+
		"\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\60\31\2\u0204"+
		"\u0205\b\30\1\2\u0205\u0207\3\2\2\2\u0206\u0201\3\2\2\2\u0207\u020a\3"+
		"\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020b\u01f7\3\2\2\2\u020b\u01fe\3\2\2\2\u020c/\3\2\2\2"+
		"\u020d\u0211\7\22\2\2\u020e\u0211\7\5\2\2\u020f\u0211\7\6\2\2\u0210\u020d"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\7\23\2\2\u0213\u0214\5&\24\2\u0214\u0215\7"+
		"\24\2\2\u0215\u0216\b\31\1\2\u0216\u0225\3\2\2\2\u0217\u0221\5\62\32\2"+
		"\u0218\u021b\7\7\2\2\u0219\u021b\7\b\2\2\u021a\u0218\3\2\2\2\u021a\u0219"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\5\62\32\2\u021d\u021e\b\31\1"+
		"\2\u021e\u0220\3\2\2\2\u021f\u021a\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0224"+
		"\u0210\3\2\2\2\u0224\u0217\3\2\2\2\u0225\61\3\2\2\2\u0226\u022a\7\22\2"+
		"\2\u0227\u022a\7\5\2\2\u0228\u022a\7\6\2\2\u0229\u0226\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\7\23\2\2\u022c\u022d\5&\24\2\u022d\u022e\7\24\2\2\u022e\u022f\b"+
		"\32\1\2\u022f\u0248\3\2\2\2\u0230\u0231\7\23\2\2\u0231\u0232\5&\24\2\u0232"+
		"\u0233\7\24\2\2\u0233\u0237\3\2\2\2\u0234\u0237\5\66\34\2\u0235\u0237"+
		"\5> \2\u0236\u0230\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\5\64\33\2\u0239\u0248\3\2\2\2\u023a\u0248\5"+
		"\66\34\2\u023b\u0248\7\4\2\2\u023c\u0248\7\36\2\2\u023d\u0248\7\35\2\2"+
		"\u023e\u0248\5> \2\u023f\u0243\7\22\2\2\u0240\u0243\7\5\2\2\u0241\u0243"+
		"\7\6\2\2\u0242\u023f\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\5\62\32\2\u0245\u0246\b\32\1\2\u0246\u0248"+
		"\3\2\2\2\u0247\u0229\3\2\2\2\u0247\u0236\3\2\2\2\u0247\u023a\3\2\2\2\u0247"+
		"\u023b\3\2\2\2\u0247\u023c\3\2\2\2\u0247\u023d\3\2\2\2\u0247\u023e\3\2"+
		"\2\2\u0247\u0242\3\2\2\2\u0248\63\3\2\2\2\u0249\u024a\7\25\2\2\u024a\u024b"+
		"\5&\24\2\u024b\u024c\7\26\2\2\u024c\u024e\3\2\2\2\u024d\u0249\3\2\2\2"+
		"\u024e\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\65"+
		"\3\2\2\2\u0251\u0256\5<\37\2\u0252\u0253\5> \2\u0253\u0254\58\35\2\u0254"+
		"\u0256\3\2\2\2\u0255\u0251\3\2\2\2\u0255\u0252\3\2\2\2\u0256\67\3\2\2"+
		"\2\u0257\u0259\7\23\2\2\u0258\u025a\5:\36\2\u0259\u0258\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\7\24\2\2\u025c\u025e\5"+
		"8\35\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e9\3\2\2\2\u025f\u0264"+
		"\5&\24\2\u0260\u0261\7\t\2\2\u0261\u0263\5&\24\2\u0262\u0260\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265;\3\2\2\2"+
		"\u0266\u0264\3\2\2\2\u0267\u0268\7#\2\2\u0268\u0269\b\37\1\2\u0269\u026a"+
		"\7\23\2\2\u026a\u026b\5&\24\2\u026b\u026c\7\24\2\2\u026c\u027c\3\2\2\2"+
		"\u026d\u026e\7%\2\2\u026e\u026f\b\37\1\2\u026f\u0270\7\23\2\2\u0270\u0271"+
		"\5&\24\2\u0271\u0272\7\24\2\2\u0272\u027c\3\2\2\2\u0273\u0274\7$\2\2\u0274"+
		"\u0275\b\37\1\2\u0275\u0276\7\23\2\2\u0276\u0277\5&\24\2\u0277\u0278\7"+
		"\t\2\2\u0278\u0279\5&\24\2\u0279\u027a\7\24\2\2\u027a\u027c\3\2\2\2\u027b"+
		"\u0267\3\2\2\2\u027b\u026d\3\2\2\2\u027b\u0273\3\2\2\2\u027c=\3\2\2\2"+
		"\u027d\u027f\7.\2\2\u027e\u0280\5\64\33\2\u027f\u027e\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0288\3\2\2\2\u0281\u0282\7\13\2\2\u0282\u0284\7.\2\2\u0283"+
		"\u0285\5\64\33\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3"+
		"\2\2\2\u0286\u0281\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289?\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u029a\7\31\2\2"+
		"\u028c\u029a\7\32\2\2\u028d\u028e\7\34\2\2\u028e\u029a\7.\2\2\u028f\u0290"+
		"\7\33\2\2\u0290\u0295\7\27\2\2\u0291\u0292\7\33\2\2\u0292\u0294\7\27\2"+
		"\2\u0293\u0291\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296"+
		"\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029a\5B\"\2\u0299"+
		"\u028b\3\2\2\2\u0299\u028c\3\2\2\2\u0299\u028d\3\2\2\2\u0299\u028f\3\2"+
		"\2\2\u029aA\3\2\2\2\u029b\u02b0\5@!\2\u029c\u029d\7-\2\2\u029d\u02a7\7"+
		"\r\2\2\u029e\u02a3\5@!\2\u029f\u02a0\7\t\2\2\u02a0\u02a2\5@!\2\u02a1\u029f"+
		"\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a8\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a8\7&\2\2\u02a7\u029e\3\2"+
		"\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ac\7\3\2\2\u02aa"+
		"\u02ad\5@!\2\u02ab\u02ad\7&\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2\2"+
		"\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\7\f\2\2\u02af\u029b\3\2\2\2\u02af\u029c"+
		"\3\2\2\2\u02b0C\3\2\2\2^GMSY_frx~\u0083\u008a\u008d\u0091\u0096\u0098"+
		"\u009c\u009f\u00a1\u00aa\u00b1\u00b9\u00c2\u00c8\u00cd\u00d3\u00e3\u00ee"+
		"\u00f4\u00fa\u0101\u0107\u010d\u0111\u011a\u0124\u0128\u012c\u012f\u0131"+
		"\u0137\u013c\u0146\u0150\u0154\u0158\u015d\u0166\u016e\u0172\u0176\u017d"+
		"\u0197\u019c\u01aa\u01ad\u01b2\u01c0\u01c3\u01c8\u01d6\u01d9\u01de\u01e8"+
		"\u01ef\u01f2\u01f7\u0201\u0208\u020b\u0210\u021a\u0221\u0224\u0229\u0236"+
		"\u0242\u0247\u024f\u0255\u0259\u025d\u0264\u027b\u027f\u0284\u0288\u0295"+
		"\u0299\u02a3\u02a7\u02ac\u02af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}