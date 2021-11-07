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
		IF=41, ELSE=42, FPTR=43, IDENTIFIER=44, COMMENT=45, WS=46;
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
								match(SEMICOLLON);
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
						if (_la==SEMICOLLON) {
							{
							setState(128);
							match(SEMICOLLON);
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
			setState(138);
			variableType();
			{
			setState(139);
			((StructVariableDeclarationGetSetContext)_localctx).VariableName = match(IDENTIFIER);
			System.out.println("VarDec : " + (((StructVariableDeclarationGetSetContext)_localctx).VariableName!=null?((StructVariableDeclarationGetSetContext)_localctx).VariableName.getText():null));
			}
			setState(142);
			match(LPAR);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(143);
				arguments();
				}
			}

			setState(146);
			match(RPAR);
			setState(147);
			match(BEGIN);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				match(NEWLINE);
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(153);
			match(SET);
			System.out.println("Setter");
			setState(155);
			functionBody();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(156);
				match(NEWLINE);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(GET);
			System.out.println("Getter");
			setState(164);
			functionBody();
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				match(NEWLINE);
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(170);
			match(END);
			setState(172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(174); 
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(176);
				variableType();
				}
				break;
			case VOID:
				{
				setState(177);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(180);
			((MethodDeclarationContext)_localctx).FunctionName = match(IDENTIFIER);
			System.out.println("FunctionDec : " + (((MethodDeclarationContext)_localctx).FunctionName!=null?((MethodDeclarationContext)_localctx).FunctionName.getText():null));
			setState(182);
			match(LPAR);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(183);
				arguments();
				}
			}

			setState(186);
			match(RPAR);
			setState(187);
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
			setState(189);
			variableType();
			{
			setState(190);
			((ArgumentsContext)_localctx).ArgumentName = match(IDENTIFIER);
			System.out.println("ArgumentDec : " + (((ArgumentsContext)_localctx).ArgumentName!=null?((ArgumentsContext)_localctx).ArgumentName.getText():null));
			}
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				variableType();
				{
				setState(195);
				((ArgumentsContext)_localctx).ArgumentName = match(IDENTIFIER);
				System.out.println("ArgumentDec : " + (((ArgumentsContext)_localctx).ArgumentName!=null?((ArgumentsContext)_localctx).ArgumentName.getText():null));
				}
				}
				}
				setState(202);
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
			setState(203);
			match(MAIN);
			System.out.println("Main");
			setState(205);
			match(LPAR);
			setState(206);
			match(RPAR);
			setState(207);
			match(BEGIN);
			setState(209); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(208);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(213);
			multiFunctionBody();
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				match(NEWLINE);
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(219);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(221);
				match(BEGIN);
				setState(223); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(222);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(225); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(227);
				multiFunctionBody();
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					match(NEWLINE);
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(233);
				match(END);
				setState(235); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(237); 
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
				setState(239);
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
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(267);
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
						setState(246);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(242);
							assignment();
							}
							break;
						case 2:
							{
							setState(243);
							expression();
							}
							break;
						case 3:
							{
							setState(244);
							variableDeclaration();
							}
							break;
						case 4:
							{
							setState(245);
							returnStmt();
							}
							break;
						}
						setState(257);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(248);
								match(SEMICOLLON);
								setState(253);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
								case 1:
									{
									setState(249);
									assignment();
									}
									break;
								case 2:
									{
									setState(250);
									expression();
									}
									break;
								case 3:
									{
									setState(251);
									variableDeclaration();
									}
									break;
								case 4:
									{
									setState(252);
									returnStmt();
									}
									break;
								}
								}
								} 
							}
							setState(259);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLLON) {
							{
							setState(260);
							match(SEMICOLLON);
							}
						}

						}
						break;
					case NEWLINE:
						{
						setState(263);
						match(NEWLINE);
						}
						break;
					case DO:
						{
						setState(264);
						doWhileBlock();
						}
						break;
					case IF:
						{
						setState(265);
						ifBlock();
						}
						break;
					case WHILE:
						{
						setState(266);
						whileBlock();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(271);
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
			setState(272);
			match(RETURN);
			System.out.println("Return");
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(274);
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
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(277);
				match(NEWLINE);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
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
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
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
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						match(SEMICOLLON);
						setState(294);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(290);
							assignment();
							}
							break;
						case 2:
							{
							setState(291);
							expression();
							}
							break;
						case 3:
							{
							setState(292);
							variableDeclaration();
							}
							break;
						case 4:
							{
							setState(293);
							returnStmt();
							}
							break;
						}
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLLON) {
					{
					setState(301);
					match(SEMICOLLON);
					}
				}

				}
				break;
			case IF:
				{
				setState(304);
				ifBlock();
				}
				break;
			case WHILE:
				{
				setState(305);
				whileBlock();
				}
				break;
			case DO:
				{
				setState(306);
				doWhileBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(NEWLINE);
					}
					} 
				}
				setState(314);
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
			setState(315);
			variableType();
			{
			{
			setState(316);
			((VariableDeclarationContext)_localctx).VariableName = match(IDENTIFIER);
			System.out.println("VarDec : " + (((VariableDeclarationContext)_localctx).VariableName!=null?((VariableDeclarationContext)_localctx).VariableName.getText():null));
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(319);
				match(ASSIGN);
				setState(320);
				expression();
				}
			}

			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(323);
				match(COMMA);
				{
				{
				setState(324);
				((VariableDeclarationContext)_localctx).VariableName = match(IDENTIFIER);
				System.out.println("VarDec : " + (((VariableDeclarationContext)_localctx).VariableName!=null?((VariableDeclarationContext)_localctx).VariableName.getText():null));
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(327);
					match(ASSIGN);
					setState(328);
					expression();
					}
				}

				}
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(336);
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
			setState(339);
			match(IF);
			System.out.println("Conditional : if");
			setState(341);
			expression();
			setState(342);
			functionBody();
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(343);
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
			setState(346);
			match(ELSE);
			System.out.println("Conditional : else");
			setState(348);
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
			setState(350);
			match(WHILE);
			System.out.println("Loop : while");
			setState(352);
			expression();
			setState(353);
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
			setState(355);
			match(DO);
			System.out.println("Loop : do...while");
			setState(357);
			functionBody();
			setState(358);
			match(WHILE);
			setState(359);
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
			setState(361);
			nestedIdentifier();
			setState(362);
			match(ASSIGN);
			setState(363);
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
		try {
			int _alt;
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(368);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(365);
					((ExpressionContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(366);
					((ExpressionContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(367);
					((ExpressionContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(370);
				match(LPAR);
				setState(371);
				expression();
				setState(372);
				match(RPAR);
				if((((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				expressionOperandAfterPlusMinus();
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(378);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							{
							setState(376);
							((ExpressionContext)_localctx).Operator = match(PLUS);
							}
							}
							break;
						case MINUS:
							{
							{
							setState(377);
							((ExpressionContext)_localctx).Operator = match(MINUS);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(380);
						expressionOperandAfterPlusMinus();
						System.out.println("Operator : " + (((ExpressionContext)_localctx).Operator!=null?((ExpressionContext)_localctx).Operator.getText():null));
						}
						} 
					}
					setState(387);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 36, RULE_expressionOperandAfterPlusMinus);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(393);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(390);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(391);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(392);
					((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(395);
				match(LPAR);
				setState(396);
				expression();
				setState(397);
				match(RPAR);
				if((((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				expressionOperandAfterMultDiv();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIVIDE) {
					{
					{
					setState(403);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						{
						setState(401);
						((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(MULT);
						}
						}
						break;
					case DIVIDE:
						{
						{
						setState(402);
						((ExpressionOperandAfterPlusMinusContext)_localctx).Operator = match(DIVIDE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(405);
					expressionOperandAfterMultDiv();
					System.out.println("Operator : " + (((ExpressionOperandAfterPlusMinusContext)_localctx).Operator!=null?((ExpressionOperandAfterPlusMinusContext)_localctx).Operator.getText():null));
					}
					}
					setState(412);
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(418);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(415);
					((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(416);
					((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(417);
					((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(420);
				match(LPAR);
				setState(421);
				expression();
				setState(422);
				match(RPAR);
				if((((ExpressionOperandAfterMultDivContext)_localctx).Operator!=null?((ExpressionOperandAfterMultDivContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterMultDivContext)_localctx).Operator!=null?((ExpressionOperandAfterMultDivContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				expressionOperandAfterCond();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) {
					{
					{
					setState(429);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQ:
						{
						{
						setState(426);
						((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(EQ);
						}
						}
						break;
					case LT:
						{
						{
						setState(427);
						((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(LT);
						}
						}
						break;
					case GT:
						{
						{
						setState(428);
						((ExpressionOperandAfterMultDivContext)_localctx).Operator = match(GT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(431);
					expressionOperandAfterCond();
					System.out.println("Operator : " + (((ExpressionOperandAfterMultDivContext)_localctx).Operator!=null?((ExpressionOperandAfterMultDivContext)_localctx).Operator.getText():null));
					}
					}
					setState(438);
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
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(444);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(441);
					((ExpressionOperandAfterCondContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(442);
					((ExpressionOperandAfterCondContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(443);
					((ExpressionOperandAfterCondContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(446);
				match(LPAR);
				setState(447);
				expression();
				setState(448);
				match(RPAR);
				if((((ExpressionOperandAfterCondContext)_localctx).Operator!=null?((ExpressionOperandAfterCondContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandAfterCondContext)_localctx).Operator!=null?((ExpressionOperandAfterCondContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				expressionOperand();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(454);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AND:
						{
						{
						setState(452);
						((ExpressionOperandAfterCondContext)_localctx).Operator = match(AND);
						}
						}
						break;
					case OR:
						{
						{
						setState(453);
						((ExpressionOperandAfterCondContext)_localctx).Operator = match(OR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(456);
					expressionOperand();
					System.out.println("Operator : " + (((ExpressionOperandAfterCondContext)_localctx).Operator!=null?((ExpressionOperandAfterCondContext)_localctx).Operator.getText():null));
					}
					}
					setState(463);
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
		enterRule(_localctx, 42, RULE_expressionOperand);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(469);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(466);
					((ExpressionOperandContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(467);
					((ExpressionOperandContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(468);
					((ExpressionOperandContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				case LPAR:
					break;
				default:
					break;
				}
				setState(471);
				match(LPAR);
				setState(472);
				expression();
				setState(473);
				match(RPAR);
				if((((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null) != null) System.out.println("Operator : " + (((ExpressionOperandContext)_localctx).Operator!=null?((ExpressionOperandContext)_localctx).Operator.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					{
					setState(476);
					match(LPAR);
					setState(477);
					expression();
					setState(478);
					match(RPAR);
					}
					}
					break;
				case 2:
					{
					setState(480);
					functionCall();
					}
					break;
				case 3:
					{
					setState(481);
					nestedIdentifier();
					}
					break;
				}
				setState(484);
				index();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
				match(FALSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(490);
				nestedIdentifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(494);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEG:
					{
					{
					setState(491);
					((ExpressionOperandContext)_localctx).Operator = match(NEG);
					}
					}
					break;
				case PLUS:
					{
					{
					setState(492);
					((ExpressionOperandContext)_localctx).Operator = match(PLUS);
					}
					}
					break;
				case MINUS:
					{
					{
					setState(493);
					((ExpressionOperandContext)_localctx).Operator = match(MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(496);
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
		enterRule(_localctx, 44, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(501);
				match(LBRACKET);
				setState(502);
				match(NUM);
				setState(503);
				match(RBRACKET);
				}
				}
				setState(506); 
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
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
			case APPEND:
			case SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				primitiveFunctions();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(509);
				nestedIdentifier();
				setState(510);
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
			setState(514);
			match(LPAR);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAR) | (1L << FALSE) | (1L << TRUE) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(515);
				callArguments();
				}
			}

			setState(518);
			match(RPAR);
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(519);
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
			setState(522);
			expression();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(523);
				match(COMMA);
				setState(524);
				expression();
				}
				}
				setState(529);
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
		enterRule(_localctx, 52, RULE_primitiveFunctions);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(530);
				match(DISPLAY);
				System.out.println("Built-in: display");
				setState(532);
				match(LPAR);
				setState(533);
				expression();
				setState(534);
				match(RPAR);
				}
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(536);
				match(SIZE);
				System.out.println("Size");
				setState(538);
				match(LPAR);
				setState(539);
				expression();
				setState(540);
				match(RPAR);
				}
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(542);
				match(APPEND);
				System.out.println("Append");
				setState(544);
				match(LPAR);
				setState(545);
				nestedIdentifier();
				setState(546);
				match(COMMA);
				setState(547);
				expression();
				setState(548);
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
			setState(552);
			match(IDENTIFIER);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(553);
				match(DOT);
				setState(554);
				match(IDENTIFIER);
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					match(LBRACKET);
					setState(561);
					expression();
					setState(562);
					match(RBRACKET);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(BOOL);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(571);
				match(STRUCT);
				setState(572);
				match(IDENTIFIER);
				}
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(573);
				match(LIST);
				setState(574);
				match(SHARP);
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(575);
						match(LIST);
						setState(576);
						match(SHARP);
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(582);
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
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				fptrVarTypes();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(586);
				match(FPTR);
				setState(587);
				match(LT);
				setState(597);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					{
					setState(588);
					fptrVarTypes();
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(589);
						match(COMMA);
						setState(590);
						fptrVarTypes();
						}
						}
						setState(595);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case VOID:
					{
					setState(596);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(599);
				match(T__0);
				setState(602);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case BOOL:
				case LIST:
				case STRUCT:
					{
					setState(600);
					fptrVarTypes();
					}
					break;
				case VOID:
					{
					setState(601);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(604);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0262\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2"+
		"O\13\2\3\2\7\2R\n\2\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2"+
		"\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3k\n\3\r\3\16\3"+
		"l\3\3\3\3\6\3q\n\3\r\3\16\3r\3\3\3\3\6\3w\n\3\r\3\16\3x\3\4\3\4\3\4\7"+
		"\4~\n\4\f\4\16\4\u0081\13\4\3\4\5\4\u0084\n\4\3\4\3\4\7\4\u0088\n\4\f"+
		"\4\16\4\u008b\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\5\3\5\3\5\6"+
		"\5\u0098\n\5\r\5\16\5\u0099\3\5\3\5\3\5\3\5\7\5\u00a0\n\5\f\5\16\5\u00a3"+
		"\13\5\3\5\3\5\3\5\3\5\6\5\u00a9\n\5\r\5\16\5\u00aa\3\5\3\5\6\5\u00af\n"+
		"\5\r\5\16\5\u00b0\3\6\3\6\5\6\u00b5\n\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c9\n\7\f\7\16"+
		"\7\u00cc\13\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00d4\n\b\r\b\16\b\u00d5\3\b"+
		"\3\b\6\b\u00da\n\b\r\b\16\b\u00db\3\b\3\b\3\t\3\t\6\t\u00e2\n\t\r\t\16"+
		"\t\u00e3\3\t\3\t\6\t\u00e8\n\t\r\t\16\t\u00e9\3\t\3\t\6\t\u00ee\n\t\r"+
		"\t\16\t\u00ef\3\t\5\t\u00f3\n\t\3\n\3\n\3\n\3\n\5\n\u00f9\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0100\n\n\7\n\u0102\n\n\f\n\16\n\u0105\13\n\3\n\5\n\u0108"+
		"\n\n\3\n\3\n\3\n\3\n\7\n\u010e\n\n\f\n\16\n\u0111\13\n\3\13\3\13\3\13"+
		"\5\13\u0116\n\13\3\f\7\f\u0119\n\f\f\f\16\f\u011c\13\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0122\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0129\n\f\7\f\u012b\n\f\f\f\16"+
		"\f\u012e\13\f\3\f\5\f\u0131\n\f\3\f\3\f\3\f\5\f\u0136\n\f\3\f\7\f\u0139"+
		"\n\f\f\f\16\f\u013c\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0144\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u014c\n\r\7\r\u014e\n\r\f\r\16\r\u0151\13\r\3\r\5"+
		"\r\u0154\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u015b\n\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\5\23\u0173\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u017d\n\23\3\23\3\23\3\23\7\23\u0182\n\23\f\23\16\23\u0185"+
		"\13\23\5\23\u0187\n\23\3\24\3\24\3\24\5\24\u018c\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0196\n\24\3\24\3\24\3\24\7\24\u019b\n\24"+
		"\f\24\16\24\u019e\13\24\5\24\u01a0\n\24\3\25\3\25\3\25\5\25\u01a5\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b0\n\25\3\25\3\25"+
		"\3\25\7\25\u01b5\n\25\f\25\16\25\u01b8\13\25\5\25\u01ba\n\25\3\26\3\26"+
		"\3\26\5\26\u01bf\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01c9"+
		"\n\26\3\26\3\26\3\26\7\26\u01ce\n\26\f\26\16\26\u01d1\13\26\5\26\u01d3"+
		"\n\26\3\27\3\27\3\27\5\27\u01d8\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u01e5\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u01f1\n\27\3\27\3\27\3\27\5\27\u01f6\n\27\3\30\3"+
		"\30\3\30\6\30\u01fb\n\30\r\30\16\30\u01fc\3\31\3\31\3\31\3\31\5\31\u0203"+
		"\n\31\3\32\3\32\5\32\u0207\n\32\3\32\3\32\5\32\u020b\n\32\3\33\3\33\3"+
		"\33\7\33\u0210\n\33\f\33\16\33\u0213\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0229\n\34\3\35\3\35\3\35\7\35\u022e\n\35\f\35\16\35\u0231\13"+
		"\35\3\35\3\35\3\35\3\35\7\35\u0237\n\35\f\35\16\35\u023a\13\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0244\n\36\f\36\16\36\u0247\13"+
		"\36\3\36\5\36\u024a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0252\n\37"+
		"\f\37\16\37\u0255\13\37\3\37\5\37\u0258\n\37\3\37\3\37\3\37\5\37\u025d"+
		"\n\37\3\37\5\37\u0260\n\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<\2\2\2\u02b7\2A\3\2\2\2\4e\3\2\2\2\6\u0089"+
		"\3\2\2\2\b\u008c\3\2\2\2\n\u00b4\3\2\2\2\f\u00bf\3\2\2\2\16\u00cd\3\2"+
		"\2\2\20\u00f2\3\2\2\2\22\u010f\3\2\2\2\24\u0112\3\2\2\2\26\u011a\3\2\2"+
		"\2\30\u013d\3\2\2\2\32\u0155\3\2\2\2\34\u015c\3\2\2\2\36\u0160\3\2\2\2"+
		" \u0165\3\2\2\2\"\u016b\3\2\2\2$\u0186\3\2\2\2&\u019f\3\2\2\2(\u01b9\3"+
		"\2\2\2*\u01d2\3\2\2\2,\u01f5\3\2\2\2.\u01fa\3\2\2\2\60\u0202\3\2\2\2\62"+
		"\u0204\3\2\2\2\64\u020c\3\2\2\2\66\u0228\3\2\2\28\u022a\3\2\2\2:\u0249"+
		"\3\2\2\2<\u025f\3\2\2\2>@\7\30\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BG\3\2\2\2CA\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2HM\3\2\2\2IG\3\2\2\2JL\7\30\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5\n\6\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3"+
		"\2\2\2TY\3\2\2\2US\3\2\2\2VX\7\30\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ"+
		"\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\5\16\b\2]_\7\30\2\2^]\3\2\2\2_b\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\2\2\3d\3\3\2\2\2ef\7\34"+
		"\2\2fg\7.\2\2gh\b\3\1\2hj\7\37\2\2ik\7\30\2\2ji\3\2\2\2kl\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mn\3\2\2\2np\5\6\4\2oq\7\30\2\2po\3\2\2\2qr\3\2\2\2rp"+
		"\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\7 \2\2uw\7\30\2\2vu\3\2\2\2wx\3\2\2\2x"+
		"v\3\2\2\2xy\3\2\2\2y\5\3\2\2\2z\177\5\30\r\2{|\7\n\2\2|~\5\30\r\2}{\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0084\7\n\2\2\u0083\u0082\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0088\7\30\2\2\u0086\u0088\5\b\5\2"+
		"\u0087z\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\7\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008d\5<\37\2\u008d\u008e\7.\2\2\u008e\u008f\b\5\1\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\7\23\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\24\2\2\u0095"+
		"\u0097\7\37\2\2\u0096\u0098\7\30\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\7(\2\2\u009c\u009d\b\5\1\2\u009d\u00a1\5\20\t\2\u009e\u00a0\7\30"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\'"+
		"\2\2\u00a5\u00a6\b\5\1\2\u00a6\u00a8\5\20\t\2\u00a7\u00a9\7\30\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7 \2\2\u00ad\u00af\7\30\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\t\3\2\2\2\u00b2\u00b5\5<\37\2\u00b3\u00b5\7&\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7"+
		"\u00b8\b\6\1\2\u00b8\u00ba\7\23\2\2\u00b9\u00bb\5\f\7\2\u00ba\u00b9\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\24\2\2\u00bd"+
		"\u00be\5\20\t\2\u00be\13\3\2\2\2\u00bf\u00c0\5<\37\2\u00c0\u00c1\7.\2"+
		"\2\u00c1\u00c2\b\7\1\2\u00c2\u00ca\3\2\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5"+
		"\5<\37\2\u00c5\u00c6\7.\2\2\u00c6\u00c7\b\7\1\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c3\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\r\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf"+
		"\b\b\1\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d3\7\37\2"+
		"\2\u00d2\u00d4\7\30\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\5\22"+
		"\n\2\u00d8\u00da\7\30\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7 "+
		"\2\2\u00de\17\3\2\2\2\u00df\u00e1\7\37\2\2\u00e0\u00e2\7\30\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\5\22\n\2\u00e6\u00e8\7\30\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\7 \2\2\u00ec\u00ee\7\30\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3\5\26\f\2\u00f2\u00df\3\2\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\21\3\2\2\2\u00f4\u00f9\5\"\22\2\u00f5\u00f9\5$\23"+
		"\2\u00f6\u00f9\5\30\r\2\u00f7\u00f9\5\24\13\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u0103\3\2"+
		"\2\2\u00fa\u00ff\7\n\2\2\u00fb\u0100\5\"\22\2\u00fc\u0100\5$\23\2\u00fd"+
		"\u0100\5\30\r\2\u00fe\u0100\5\24\13\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00fa\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\7\n\2\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u010e\7\30"+
		"\2\2\u010a\u010e\5 \21\2\u010b\u010e\5\32\16\2\u010c\u010e\5\36\20\2\u010d"+
		"\u00f8\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\23\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7!\2\2"+
		"\u0113\u0115\b\13\1\2\u0114\u0116\5$\23\2\u0115\u0114\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\25\3\2\2\2\u0117\u0119\7\30\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0135\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u0122\5\"\22\2\u011e\u0122\5$\23\2\u011f"+
		"\u0122\5\30\r\2\u0120\u0122\5\24\13\2\u0121\u011d\3\2\2\2\u0121\u011e"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u012c\3\2\2\2\u0123"+
		"\u0128\7\n\2\2\u0124\u0129\5\"\22\2\u0125\u0129\5$\23\2\u0126\u0129\5"+
		"\30\r\2\u0127\u0129\5\24\13\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0123"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\7\n\2\2\u0130\u012f\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0136\3\2\2\2\u0132\u0136\5\32\16\2\u0133"+
		"\u0136\5\36\20\2\u0134\u0136\5 \21\2\u0135\u0121\3\2\2\2\u0135\u0132\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u013a\3\2\2\2\u0137"+
		"\u0139\7\30\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\27\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013e\5<\37\2\u013e\u013f\7.\2\2\u013f\u0140\b\r\1\2\u0140\u0143\3\2"+
		"\2\2\u0141\u0142\7\16\2\2\u0142\u0144\5$\23\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u014f\3\2\2\2\u0145\u0146\7\t\2\2\u0146\u0147\7."+
		"\2\2\u0147\u0148\b\r\1\2\u0148\u014b\3\2\2\2\u0149\u014a\7\16\2\2\u014a"+
		"\u014c\5$\23\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u0145\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\7\n"+
		"\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\31\3\2\2\2\u0155\u0156"+
		"\7+\2\2\u0156\u0157\b\16\1\2\u0157\u0158\5$\23\2\u0158\u015a\5\20\t\2"+
		"\u0159\u015b\5\34\17\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\33"+
		"\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e\b\17\1\2\u015e\u015f\5\20\t\2"+
		"\u015f\35\3\2\2\2\u0160\u0161\7)\2\2\u0161\u0162\b\20\1\2\u0162\u0163"+
		"\5$\23\2\u0163\u0164\5\20\t\2\u0164\37\3\2\2\2\u0165\u0166\7*\2\2\u0166"+
		"\u0167\b\21\1\2\u0167\u0168\5\20\t\2\u0168\u0169\7)\2\2\u0169\u016a\5"+
		"$\23\2\u016a!\3\2\2\2\u016b\u016c\58\35\2\u016c\u016d\7\16\2\2\u016d\u016e"+
		"\5$\23\2\u016e#\3\2\2\2\u016f\u0173\7\22\2\2\u0170\u0173\7\5\2\2\u0171"+
		"\u0173\7\6\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\23\2\2\u0175"+
		"\u0176\5$\23\2\u0176\u0177\7\24\2\2\u0177\u0178\b\23\1\2\u0178\u0187\3"+
		"\2\2\2\u0179\u0183\5&\24\2\u017a\u017d\7\5\2\2\u017b\u017d\7\6\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\5&"+
		"\24\2\u017f\u0180\b\23\1\2\u0180\u0182\3\2\2\2\u0181\u017c\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0172\3\2\2\2\u0186\u0179\3\2\2\2\u0187"+
		"%\3\2\2\2\u0188\u018c\7\22\2\2\u0189\u018c\7\5\2\2\u018a\u018c\7\6\2\2"+
		"\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7\23\2\2\u018e\u018f\5$\23\2"+
		"\u018f\u0190\7\24\2\2\u0190\u0191\b\24\1\2\u0191\u01a0\3\2\2\2\u0192\u019c"+
		"\5(\25\2\u0193\u0196\7\7\2\2\u0194\u0196\7\b\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\5(\25\2\u0198\u0199\b\24"+
		"\1\2\u0199\u019b\3\2\2\2\u019a\u0195\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019f\u018b\3\2\2\2\u019f\u0192\3\2\2\2\u01a0\'\3\2\2\2\u01a1\u01a5"+
		"\7\22\2\2\u01a2\u01a5\7\5\2\2\u01a3\u01a5\7\6\2\2\u01a4\u01a1\3\2\2\2"+
		"\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a7\7\23\2\2\u01a7\u01a8\5$\23\2\u01a8\u01a9\7\24\2\2"+
		"\u01a9\u01aa\b\25\1\2\u01aa\u01ba\3\2\2\2\u01ab\u01b6\5*\26\2\u01ac\u01b0"+
		"\7\17\2\2\u01ad\u01b0\7\r\2\2\u01ae\u01b0\7\f\2\2\u01af\u01ac\3\2\2\2"+
		"\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\5*\26\2\u01b2\u01b3\b\25\1\2\u01b3\u01b5\3\2\2\2\u01b4\u01af\3\2\2\2"+
		"\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01a4\3\2\2\2\u01b9\u01ab\3\2\2\2\u01ba"+
		")\3\2\2\2\u01bb\u01bf\7\22\2\2\u01bc\u01bf\7\5\2\2\u01bd\u01bf\7\6\2\2"+
		"\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\23\2\2\u01c1\u01c2\5$\23\2"+
		"\u01c2\u01c3\7\24\2\2\u01c3\u01c4\b\26\1\2\u01c4\u01d3\3\2\2\2\u01c5\u01cf"+
		"\5,\27\2\u01c6\u01c9\7\20\2\2\u01c7\u01c9\7\21\2\2\u01c8\u01c6\3\2\2\2"+
		"\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\5,\27\2\u01cb\u01cc"+
		"\b\26\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01c8\3\2\2\2\u01ce\u01d1\3\2\2\2"+
		"\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01be\3\2\2\2\u01d2\u01c5\3\2\2\2\u01d3+\3\2\2\2\u01d4"+
		"\u01d8\7\22\2\2\u01d5\u01d8\7\5\2\2\u01d6\u01d8\7\6\2\2\u01d7\u01d4\3"+
		"\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\7\23\2\2\u01da\u01db\5$\23\2\u01db\u01dc\7"+
		"\24\2\2\u01dc\u01dd\b\27\1\2\u01dd\u01f6\3\2\2\2\u01de\u01df\7\23\2\2"+
		"\u01df\u01e0\5$\23\2\u01e0\u01e1\7\24\2\2\u01e1\u01e5\3\2\2\2\u01e2\u01e5"+
		"\5\60\31\2\u01e3\u01e5\58\35\2\u01e4\u01de\3\2\2\2\u01e4\u01e2\3\2\2\2"+
		"\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5.\30\2\u01e7\u01f6"+
		"\3\2\2\2\u01e8\u01f6\5\60\31\2\u01e9\u01f6\7\4\2\2\u01ea\u01f6\7\36\2"+
		"\2\u01eb\u01f6\7\35\2\2\u01ec\u01f6\58\35\2\u01ed\u01f1\7\22\2\2\u01ee"+
		"\u01f1\7\5\2\2\u01ef\u01f1\7\6\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5,\27\2\u01f3"+
		"\u01f4\b\27\1\2\u01f4\u01f6\3\2\2\2\u01f5\u01d7\3\2\2\2\u01f5\u01e4\3"+
		"\2\2\2\u01f5\u01e8\3\2\2\2\u01f5\u01e9\3\2\2\2\u01f5\u01ea\3\2\2\2\u01f5"+
		"\u01eb\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f6-\3\2\2\2"+
		"\u01f7\u01f8\7\25\2\2\u01f8\u01f9\7\4\2\2\u01f9\u01fb\7\26\2\2\u01fa\u01f7"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"/\3\2\2\2\u01fe\u0203\5\66\34\2\u01ff\u0200\58\35\2\u0200\u0201\5\62\32"+
		"\2\u0201\u0203\3\2\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0203\61"+
		"\3\2\2\2\u0204\u0206\7\23\2\2\u0205\u0207\5\64\33\2\u0206\u0205\3\2\2"+
		"\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\7\24\2\2\u0209"+
		"\u020b\5\62\32\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\63\3\2"+
		"\2\2\u020c\u0211\5$\23\2\u020d\u020e\7\t\2\2\u020e\u0210\5$\23\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\65\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\7#\2\2\u0215\u0216"+
		"\b\34\1\2\u0216\u0217\7\23\2\2\u0217\u0218\5$\23\2\u0218\u0219\7\24\2"+
		"\2\u0219\u0229\3\2\2\2\u021a\u021b\7%\2\2\u021b\u021c\b\34\1\2\u021c\u021d"+
		"\7\23\2\2\u021d\u021e\5$\23\2\u021e\u021f\7\24\2\2\u021f\u0229\3\2\2\2"+
		"\u0220\u0221\7$\2\2\u0221\u0222\b\34\1\2\u0222\u0223\7\23\2\2\u0223\u0224"+
		"\58\35\2\u0224\u0225\7\t\2\2\u0225\u0226\5$\23\2\u0226\u0227\7\24\2\2"+
		"\u0227\u0229\3\2\2\2\u0228\u0214\3\2\2\2\u0228\u021a\3\2\2\2\u0228\u0220"+
		"\3\2\2\2\u0229\67\3\2\2\2\u022a\u022f\7.\2\2\u022b\u022c\7\13\2\2\u022c"+
		"\u022e\7.\2\2\u022d\u022b\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0238\3\2\2\2\u0231\u022f\3\2\2\2\u0232"+
		"\u0233\7\25\2\2\u0233\u0234\5$\23\2\u0234\u0235\7\26\2\2\u0235\u0237\3"+
		"\2\2\2\u0236\u0232\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u02399\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u024a\7\31\2\2"+
		"\u023c\u024a\7\32\2\2\u023d\u023e\7\34\2\2\u023e\u024a\7.\2\2\u023f\u0240"+
		"\7\33\2\2\u0240\u0245\7\27\2\2\u0241\u0242\7\33\2\2\u0242\u0244\7\27\2"+
		"\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\5<\37\2\u0249"+
		"\u023b\3\2\2\2\u0249\u023c\3\2\2\2\u0249\u023d\3\2\2\2\u0249\u023f\3\2"+
		"\2\2\u024a;\3\2\2\2\u024b\u0260\5:\36\2\u024c\u024d\7-\2\2\u024d\u0257"+
		"\7\r\2\2\u024e\u0253\5:\36\2\u024f\u0250\7\t\2\2\u0250\u0252\5:\36\2\u0251"+
		"\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0258\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0258\7&\2\2\u0257"+
		"\u024e\3\2\2\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025c\7\3"+
		"\2\2\u025a\u025d\5:\36\2\u025b\u025d\7&\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\7\f\2\2\u025f\u024b\3\2"+
		"\2\2\u025f\u024c\3\2\2\2\u0260=\3\2\2\2RAGMSY`lrx\177\u0083\u0087\u0089"+
		"\u0092\u0099\u00a1\u00aa\u00b0\u00b4\u00ba\u00ca\u00d5\u00db\u00e3\u00e9"+
		"\u00ef\u00f2\u00f8\u00ff\u0103\u0107\u010d\u010f\u0115\u011a\u0121\u0128"+
		"\u012c\u0130\u0135\u013a\u0143\u014b\u014f\u0153\u015a\u0172\u017c\u0183"+
		"\u0186\u018b\u0195\u019c\u019f\u01a4\u01af\u01b6\u01b9\u01be\u01c8\u01cf"+
		"\u01d2\u01d7\u01e4\u01f0\u01f5\u01fc\u0202\u0206\u020a\u0211\u0228\u022f"+
		"\u0238\u0245\u0249\u0253\u0257\u025c\u025f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}