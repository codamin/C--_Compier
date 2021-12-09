// Generated from /home/ho/C--_Compier/Phase-2/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 
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
		MAIN=1, RETURN=2, VOID=3, SIZE=4, DISPLAY=5, APPEND=6, IF=7, ELSE=8, PLUS=9, 
		MINUS=10, MULT=11, DIVIDE=12, EQUAL=13, ARROW=14, GREATER_THAN=15, LESS_THAN=16, 
		AND=17, OR=18, NOT=19, TRUE=20, FALSE=21, BEGIN=22, END=23, INT=24, BOOL=25, 
		LIST=26, STRUCT=27, FPTR=28, GET=29, SET=30, WHILE=31, DO=32, ASSIGN=33, 
		SHARP=34, LPAR=35, RPAR=36, LBRACK=37, RBRACK=38, COMMA=39, DOT=40, SEMICOLON=41, 
		NEWLINE=42, INT_VALUE=43, IDENTIFIER=44, COMMENT=45, WS=46;
	public static final int
		RULE_cmm = 0, RULE_program = 1, RULE_main = 2, RULE_structDeclaration = 3, 
		RULE_singleVarWithGetAndSet = 4, RULE_singleStatementStructBody = 5, RULE_structBody = 6, 
		RULE_getBody = 7, RULE_setBody = 8, RULE_functionDeclaration = 9, RULE_functionArgsDec = 10, 
		RULE_functionArguments = 11, RULE_body = 12, RULE_loopCondBody = 13, RULE_blockStatement = 14, 
		RULE_varDecStatement = 15, RULE_functionCallStmt = 16, RULE_returnStatement = 17, 
		RULE_ifStatement = 18, RULE_elseStatement = 19, RULE_loopStatement = 20, 
		RULE_whileLoopStatement = 21, RULE_doWhileLoopStatement = 22, RULE_displayStatement = 23, 
		RULE_assignmentStatement = 24, RULE_singleStatement = 25, RULE_expression = 26, 
		RULE_orExpression = 27, RULE_andExpression = 28, RULE_equalityExpression = 29, 
		RULE_relationalExpression = 30, RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, 
		RULE_preUnaryExpression = 33, RULE_accessExpression = 34, RULE_otherExpression = 35, 
		RULE_size = 36, RULE_append = 37, RULE_value = 38, RULE_boolValue = 39, 
		RULE_identifier = 40, RULE_type = 41, RULE_fptrType = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "program", "main", "structDeclaration", "singleVarWithGetAndSet", 
			"singleStatementStructBody", "structBody", "getBody", "setBody", "functionDeclaration", 
			"functionArgsDec", "functionArguments", "body", "loopCondBody", "blockStatement", 
			"varDecStatement", "functionCallStmt", "returnStatement", "ifStatement", 
			"elseStatement", "loopStatement", "whileLoopStatement", "doWhileLoopStatement", 
			"displayStatement", "assignmentStatement", "singleStatement", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"accessExpression", "otherExpression", "size", "append", "value", "boolValue", 
			"identifier", "type", "fptrType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'return'", "'void'", "'size'", "'display'", "'append'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'=='", "'->'", "'>'", 
			"'<'", "'&'", "'|'", "'~'", "'true'", "'false'", "'begin'", "'end'", 
			"'int'", "'bool'", "'list'", "'struct'", "'fptr'", "'get'", "'set'", 
			"'while'", "'do'", "'='", "'#'", "'('", "')'", "'['", "']'", "','", "'.'", 
			"';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "RETURN", "VOID", "SIZE", "DISPLAY", "APPEND", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "TRUE", "FALSE", "BEGIN", "END", "INT", 
			"BOOL", "LIST", "STRUCT", "FPTR", "GET", "SET", "WHILE", "DO", "ASSIGN", 
			"SHARP", "LPAR", "RPAR", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"NEWLINE", "INT_VALUE", "IDENTIFIER", "COMMENT", "WS"
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

	public static class CmmContext extends ParserRuleContext {
		public Program cmmProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public CmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmContext cmm() throws RecognitionException {
		CmmContext _localctx = new CmmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			((CmmContext)_localctx).p = program();
			((CmmContext)_localctx).cmmProgram =  ((CmmContext)_localctx).p.programRet;
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public StructDeclarationContext s;
		public FunctionDeclarationContext f;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					((ProgramContext)_localctx).s = structDeclaration();
					_localctx.programRet.addStruct(((ProgramContext)_localctx).s.structDeclarationRet);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).f = functionDeclaration();
				_localctx.programRet.addFunction(((ProgramContext)_localctx).f.functionDeclarationRet);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			((ProgramContext)_localctx).m = main();
			_localctx.programRet.setMain(((ProgramContext)_localctx).m.mainRet);
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

	public static class MainContext extends ParserRuleContext {
		public MainDeclaration mainRet;
		public Token m;
		public BodyContext b;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainContext)_localctx).mainRet =  new MainDeclaration();
			setState(123);
			((MainContext)_localctx).m = match(MAIN);
			_localctx.mainRet.setLine(((MainContext)_localctx).m.getLine());
			setState(125);
			match(LPAR);
			setState(126);
			match(RPAR);
			setState(127);
			((MainContext)_localctx).b = body();
			_localctx.mainRet.setBody(((MainContext)_localctx).b.bodyRet
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
		public StructDeclaration structDeclarationRet;
		public Token s;
		public IdentifierContext i;
		public StructBodyContext b1;
		public SingleStatementStructBodyContext b2;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public SingleStatementStructBodyContext singleStatementStructBody() {
			return getRuleContext(SingleStatementStructBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StructDeclarationContext)_localctx).structDeclarationRet =  new structDeclaration();
			setState(131);
			((StructDeclarationContext)_localctx).s = match(STRUCT);
			_localctx.structDeclarationRet.setline(((StructDeclarationContext)_localctx).s.getline());
			setState(133);
			((StructDeclarationContext)_localctx).i = identifier();
			_localctx.structDeclarationRet.setStructName(((StructDeclarationContext)_localctx).i.identifierRet);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(135);
				match(BEGIN);
				setState(136);
				((StructDeclarationContext)_localctx).b1 = structBody();
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					match(NEWLINE);
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(142);
				match(END);
				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).b1.strcutBodyRet);
				}
				}
				break;
			case NEWLINE:
				{
				{
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					match(NEWLINE);
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(150);
				((StructDeclarationContext)_localctx).b2 = singleStatementStructBody();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(151);
					match(SEMICOLON);
					}
				}

				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).b2.singleStatementStructBodyRet);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(NEWLINE);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SingleVarWithGetAndSetContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SingleVarWithGetAndSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarWithGetAndSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleVarWithGetAndSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleVarWithGetAndSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleVarWithGetAndSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarWithGetAndSetContext singleVarWithGetAndSet() throws RecognitionException {
		SingleVarWithGetAndSetContext _localctx = new SingleVarWithGetAndSetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleVarWithGetAndSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			type();
			setState(164);
			identifier();
			setState(165);
			functionArgsDec();
			setState(166);
			match(BEGIN);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(NEWLINE);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(172);
			setBody();
			setState(173);
			getBody();
			setState(174);
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

	public static class SingleStatementStructBodyContext extends ParserRuleContext {
		public BlockStmt singleStatementStructBodyRet;
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet() {
			return getRuleContext(SingleVarWithGetAndSetContext.class,0);
		}
		public SingleStatementStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatementStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatementStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatementStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatementStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementStructBodyContext singleStatementStructBody() throws RecognitionException {
		SingleStatementStructBodyContext _localctx = new SingleStatementStructBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatementStructBody);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				varDecStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				singleVarWithGetAndSet();
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

	public static class StructBodyContext extends ParserRuleContext {
		public Statement strcutBodyRet;
		public List<SingleStatementStructBodyContext> singleStatementStructBody() {
			return getRuleContexts(SingleStatementStructBodyContext.class);
		}
		public SingleStatementStructBodyContext singleStatementStructBody(int i) {
			return getRuleContext(SingleStatementStructBodyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
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
		enterRule(_localctx, 12, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(180);
						match(NEWLINE);
						}
						}
						setState(183); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(185);
							singleStatementStructBody();
							setState(186);
							match(SEMICOLON);
							}
							} 
						}
						setState(192);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(193);
					singleStatementStructBody();
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(194);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class GetBodyContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public GetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetBodyContext getBody() throws RecognitionException {
		GetBodyContext _localctx = new GetBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(GET);
			setState(202);
			body();
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				match(NEWLINE);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SetBodyContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBodyContext setBody() throws RecognitionException {
		SetBodyContext _localctx = new SetBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SET);
			setState(209);
			body();
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(NEWLINE);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration functionDeclarationRet;
		public TypeContext t;
		public IdentifierContext id;
		public FunctionArgsDecContext a;
		public BodyContext b;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			functionDeclarationRet = new FunctionDeclaration();
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(216);
				((FunctionDeclarationContext)_localctx).t = type();
				functionDeclarationRet.setReturnType(((FunctionDeclarationContext)_localctx).t.typeRet);
				}
				break;
			case VOID:
				{
				setState(219);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(222);
			((FunctionDeclarationContext)_localctx).id = identifier();

			        functionDeclarationRet.setFunctionName(((FunctionDeclarationContext)_localctx).id.identifierRet);
			        functionDeclarationRet.setLine(((FunctionDeclarationContext)_localctx).id.line);
			    
			setState(224);
			((FunctionDeclarationContext)_localctx).a = functionArgsDec();
			functionDeclarationRet.setArgs(((FunctionDeclarationContext)_localctx).a.functionArgsDecRet);
			setState(226);
			((FunctionDeclarationContext)_localctx).b = body();
			_localctx.functionDeclarationRet.setBody(((FunctionDeclarationContext)_localctx).b.bodyRet);
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

	public static class FunctionArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> functionArgsDecRet;
		public TypeContext t;
		public IdentifierContext i;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsDecContext functionArgsDec() throws RecognitionException {
		FunctionArgsDecContext _localctx = new FunctionArgsDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionArgsDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			functionArgsDecRet = new ArrayList<>();
			setState(234);
			match(LPAR);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(235);
				((FunctionArgsDecContext)_localctx).t = type();
				setState(236);
				((FunctionArgsDecContext)_localctx).i = identifier();
				VariableDeclaration v = new VariableDeclaration(((FunctionArgsDecContext)_localctx).i.identifierRet, ((FunctionArgsDecContext)_localctx).t.typeRet);  functionArgsDecRet.addArg(v);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(238);
					match(COMMA);
					setState(239);
					((FunctionArgsDecContext)_localctx).t = type();
					setState(240);
					((FunctionArgsDecContext)_localctx).i = identifier();
					VariableDeclaration v = new VariableDeclaration(((FunctionArgsDecContext)_localctx).i.identifierRet, ((FunctionArgsDecContext)_localctx).t.typeRet);  functionArgsDecRet.addArg(v);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(250);
			match(RPAR);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> functionArgumentsRet;
		public ExpressionContext ex;
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
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			functionArgumentsRet = new ArrayList<>();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(253);
				((FunctionArgumentsContext)_localctx).ex = expression();
				functionArgumentsRet.addArg(((FunctionArgumentsContext)_localctx).ex.expressionRet);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(255);
					match(COMMA);
					setState(256);
					((FunctionArgumentsContext)_localctx).ex = expression();
					functionArgumentsRet.addArg(((FunctionArgumentsContext)_localctx).ex.expressionRet);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class BodyContext extends ParserRuleContext {
		public Statement bodyRet;
		public BlockStatementContext b;
		public SingleStatementContext b1;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			bodyRet = new BlockStmt();
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(267);
				((BodyContext)_localctx).b = blockStatement();
				bodyRet.addStatement(((BodyContext)_localctx).b.blockStatementRet);
				}
				break;
			case NEWLINE:
				{
				{
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					match(NEWLINE);
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(275);
				((BodyContext)_localctx).b1 = singleStatement();
				bodyRet.addStatement(((BodyContext)_localctx).b1.singleStatementRet);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(277);
					match(SEMICOLON);
					}
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

	public static class LoopCondBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public LoopCondBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopCondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopCondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopCondBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCondBodyContext loopCondBody() throws RecognitionException {
		LoopCondBodyContext _localctx = new LoopCondBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(282);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(283);
					match(NEWLINE);
					}
					}
					setState(286); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(288);
				singleStatement();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public Statement blockStatementRet;
		public Token bg;
		public SingleStatementContext ss;
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			blockStatementRet = new BlockStmt();
			setState(292);
			((BlockStatementContext)_localctx).bg = match(BEGIN);
			blockStatementRet.setLine(((BlockStatementContext)_localctx).bg.getLine());
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(295); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(294);
						match(NEWLINE);
						}
						}
						setState(297); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(299);
							((BlockStatementContext)_localctx).ss = singleStatement();
							blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss.singleStatementRet);
							setState(301);
							match(SEMICOLON);
							}
							} 
						}
						setState(307);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(308);
					((BlockStatementContext)_localctx).ss = singleStatement();
					blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss.singleStatementRet);
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(310);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				match(NEWLINE);
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(322);
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public VarDecStatement varDecStatementRet;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			type();
			setState(325);
			identifier();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(326);
				match(ASSIGN);
				setState(327);
				orExpression();
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(330);
				match(COMMA);
				setState(331);
				identifier();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(332);
					match(ASSIGN);
					setState(333);
					orExpression();
					}
				}

				}
				}
				setState(340);
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

	public static class FunctionCallStmtContext extends ParserRuleContext {
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStmtContext functionCallStmt() throws RecognitionException {
		FunctionCallStmtContext _localctx = new FunctionCallStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			otherExpression();
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(348);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(342);
						match(LPAR);
						setState(343);
						functionArguments();
						setState(344);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(346);
						match(DOT);
						setState(347);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(353);
			match(LPAR);
			setState(354);
			functionArguments();
			setState(355);
			match(RPAR);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(RETURN);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(358);
				expression();
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

	public static class IfStatementContext extends ParserRuleContext {
		public Statement ifStatementRet;
		public ExpressionContext e;
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			ifStatementRet = new ConditionalStmt();
			setState(362);
			match(IF);
			setState(363);
			((IfStatementContext)_localctx).e = expression();
			ifStatementRet.setCondition(e.);
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(365);
				loopCondBody();
				}
				break;
			case 2:
				{
				setState(366);
				body();
				setState(367);
				elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(371);
				match(NEWLINE);
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(ELSE);
			setState(378);
			loopCondBody();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileLoopStatementContext whileLoopStatement() {
			return getRuleContext(WhileLoopStatementContext.class,0);
		}
		public DoWhileLoopStatementContext doWhileLoopStatement() {
			return getRuleContext(DoWhileLoopStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopStatement);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				whileLoopStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				doWhileLoopStatement();
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

	public static class WhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public WhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopStatementContext whileLoopStatement() throws RecognitionException {
		WhileLoopStatementContext _localctx = new WhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(WHILE);
			setState(385);
			expression();
			setState(386);
			loopCondBody();
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

	public static class DoWhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public DoWhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopStatementContext doWhileLoopStatement() throws RecognitionException {
		DoWhileLoopStatementContext _localctx = new DoWhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doWhileLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(DO);
			setState(389);
			body();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(390);
				match(NEWLINE);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(WHILE);
			setState(397);
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(DISPLAY);
			setState(400);
			match(LPAR);
			setState(401);
			expression();
			setState(402);
			match(RPAR);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			orExpression();
			setState(405);
			match(ASSIGN);
			setState(406);
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement singleStatementRet;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallStmtContext functionCallStmt() {
			return getRuleContext(FunctionCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleStatement);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				displayStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				functionCallStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(412);
				assignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(413);
				varDecStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(414);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(415);
				append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(416);
				size();
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
		public Expression expressionRet;
		public OrExpressionContext oe;
		public Token op;
		public ExpressionContext e;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((ExpressionContext)_localctx).oe = orExpression();
			((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).oe.orExpressionRet;
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(421);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(422);
				((ExpressionContext)_localctx).e = expression();

				    BinaryOperator bo = BinaryOperator.assign;
				    ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).oe.orExpressionRet, ((ExpressionContext)_localctx).e.expressionRet, bo);
				    _localctx.expressionRet.setLine(((ExpressionContext)_localctx).op.getLine());

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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpressionRet;
		public AndExpressionContext ael;
		public Token op;
		public AndExpressionContext aer;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			((OrExpressionContext)_localctx).ael = andExpression();
			 ((OrExpressionContext)_localctx).orExpressionRet =  ((OrExpressionContext)_localctx).ael.andExpressionRet;
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(429);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(430);
				((OrExpressionContext)_localctx).aer = andExpression();

				    BinaryOperator bo = BinaryOperator.or;
				    ((OrExpressionContext)_localctx).orExpressionRet =  new BinaryExpression(((OrExpressionContext)_localctx).ael.andExpressionRet, ((OrExpressionContext)_localctx).aer.andExpressionRet, bo);
				    _localctx.orExpressionRet.setLine(((OrExpressionContext)_localctx).op.getLine());

				}
				}
				setState(437);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpressionRet;
		public EqualityExpressionContext eql;
		public Token op;
		public EqualityExpressionContext eqr;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			((AndExpressionContext)_localctx).eql = equalityExpression();
			((AndExpressionContext)_localctx).andExpressionRet =  eql.equalityExpressionRet;
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(440);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(441);
				((AndExpressionContext)_localctx).eqr = equalityExpression();
				   
				    BinaryOperator bo = BinaryOperator.and;
				    ((AndExpressionContext)_localctx).andExpressionRet =  new BinaryExpression(eql.equalityExpressionRet, ((AndExpressionContext)_localctx).eqr.equalityExpressionRet, bo);
				    _localctx.andExpressionRet.setLine(((AndExpressionContext)_localctx).op.getLine());

				}
				}
				setState(448);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression equalityExpressionRet;
		public RelationalExpressionContext rel;
		public Token op;
		public RelationalExpressionContext rer;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CmmParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			((EqualityExpressionContext)_localctx).rel = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExpressionRet =  rel.relationalExpressionRet;
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(451);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(452);
				((EqualityExpressionContext)_localctx).rer = relationalExpression();

				    BinaryOperator bo = BinaryOperator.equal;
				    ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(rel.relationalExpressionRet, ((EqualityExpressionContext)_localctx).rer.relationalExpressionRet, bo);
				    _localctx.equalityExpressionRet.setLine(((EqualityExpressionContext)_localctx).op.getLine());

				}
				}
				setState(459);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relationalExpressionRet;
		public AdditiveExpressionContext ael;
		public Token op;
		public AdditiveExpressionContext aer;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(CmmParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(CmmParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(CmmParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(CmmParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			((RelationalExpressionContext)_localctx).ael = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExpressionRet =  ((RelationalExpressionContext)_localctx).ael.additiveExpressionRet;
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(462);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					BinaryOperator bo = BinaryOperator.gt;
					}
					break;
				case LESS_THAN:
					{
					setState(464);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					BinaryOperator bo = BinaryOperator.lt;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(468);
				((RelationalExpressionContext)_localctx).aer = additiveExpression();

				    ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(ael.additiveExpressionRet, ((RelationalExpressionContext)_localctx).aer.additiveExpressionRet, bo);
				    _localctx.relationalExpressionRet.setLine(((RelationalExpressionContext)_localctx).op.getLine());

				}
				}
				setState(475);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExpressionRet;
		public MultiplicativeExpressionContext mpl;
		public Token op;
		public MultiplicativeExpressionContext mpr;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			((AdditiveExpressionContext)_localctx).mpl = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExpressionRet =  ((AdditiveExpressionContext)_localctx).mpl.multiplicativeExpressionRet;
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(478);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					BinaryOperator bo = BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(480);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					BinaryOperator bo = BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(484);
				((AdditiveExpressionContext)_localctx).mpr = multiplicativeExpression();

				    ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(mpl.multiplicativeExpressionRet, ((AdditiveExpressionContext)_localctx).mpr.multiplicativeExpressionRet, bo);
				    _localctx.additiveExpressionRet.setLine(((AdditiveExpressionContext)_localctx).op.getLine());

				}
				}
				setState(491);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiplicativeExpressionRet;
		public PreUnaryExpressionContext pul;
		public Token op;
		public PreUnaryExpressionContext pur;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CmmParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			((MultiplicativeExpressionContext)_localctx).pul = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  ((MultiplicativeExpressionContext)_localctx).pul.preUnaryExpressionRet;
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(498);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(494);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					BinaryOperator bo = BinaryOperator.mult;
					}
					break;
				case DIVIDE:
					{
					setState(496);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					BinaryOperator bo = BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500);
				((MultiplicativeExpressionContext)_localctx).pur = preUnaryExpression();

				    ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(pul.preUnaryExpressionRet, ((MultiplicativeExpressionContext)_localctx).pur.preUnaryExpressionRet, bo);
				    _localctx.multiplicativeExpressionRet.setLine(((MultiplicativeExpressionContext)_localctx).op.getLine());

				}
				}
				setState(507);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExpressionRet;
		public int line;
		public Token op;
		public PreUnaryExpressionContext pue;
		public AccessExpressionContext ae;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_preUnaryExpression);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(508);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					BinaryOperator bo = BinaryOperator.not; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				case MINUS:
					{
					setState(510);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					BinaryOperator bo = BinaryOperator.minus; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(514);
				((PreUnaryExpressionContext)_localctx).pue = preUnaryExpression();

				        preUnaryExpressionRet = new UnaryExpression(((PreUnaryExpressionContext)_localctx).pue.preUnaryExpressionRet, bo);
				        preUnaryExpressionRet.setLine(_localctx.line);
				    
				}
				}
				break;
			case SIZE:
			case APPEND:
			case TRUE:
			case FALSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				((PreUnaryExpressionContext)_localctx).ae = accessExpression();

				        preUnaryExpressionRet = new UnaryExpression(((PreUnaryExpressionContext)_localctx).ae.accessExpressionRet, bo);
				        preUnaryExpressionRet.setLine(_localctx.line);
				    
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExpressionRet;
		public OtherExpressionContext oe;
		public Token lp;
		public FunctionArgumentsContext fa;
		public Token d;
		public IdentifierContext id;
		public Token lb;
		public ExpressionContext ex;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CmmParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CmmParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CmmParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CmmParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			accessExpressionRet = ((AccessExpressionContext)_localctx).oe.otherExpressionRet;
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(533);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(524);
						((AccessExpressionContext)_localctx).lp = match(LPAR);
						setState(525);
						((AccessExpressionContext)_localctx).fa = functionArguments();

						        accessExpressionRet = new FunctionCall(accessExpressionRet, ((AccessExpressionContext)_localctx).fa.functionArgumentsRet);
						        accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lp.getLine());
						    
						setState(527);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(529);
						((AccessExpressionContext)_localctx).d = match(DOT);
						setState(530);
						((AccessExpressionContext)_localctx).id = identifier();

						        accessExpressionRet = new StructAccess(accessExpressionRet, ((AccessExpressionContext)_localctx).id.identifierRet);
						        accessExpressionRet.setLine(((AccessExpressionContext)_localctx).d.getLine());
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(547);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(538);
					((AccessExpressionContext)_localctx).lb = match(LBRACK);
					setState(539);
					((AccessExpressionContext)_localctx).ex = expression();

					        accessExpressionRet = new ListAccessByIndex(accessExpressionRet, ((AccessExpressionContext)_localctx).ex.expressionRet);
					        accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lb.getLine());
					    
					setState(541);
					match(RBRACK);
					}
					}
					break;
				case DOT:
					{
					{
					setState(543);
					((AccessExpressionContext)_localctx).d = match(DOT);
					setState(544);
					((AccessExpressionContext)_localctx).id = identifier();

					        accessExpressionRet = new StructAccess(accessExpressionRet, ((AccessExpressionContext)_localctx).id.identifierRet);
					        accessExpressionRet.setLine(((AccessExpressionContext)_localctx).d.getLine());
					    
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(551);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpressionRet;
		public ValueContext vl;
		public IdentifierContext id;
		public Token lp;
		public FunctionArgumentsContext fa;
		public SizeContext sz;
		public AppendContext ap;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_otherExpression);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				((OtherExpressionContext)_localctx).vl = value();
				otherExpressionRet = ((OtherExpressionContext)_localctx).vl.valueRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				((OtherExpressionContext)_localctx).id = identifier();
				otherExpressionRet = ((OtherExpressionContext)_localctx).id.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				((OtherExpressionContext)_localctx).lp = match(LPAR);
				{
				setState(559);
				((OtherExpressionContext)_localctx).fa = functionArguments();
				}
				otherExpressionRet = ((OtherExpressionContext)_localctx).fa.functionArgumentsRet;
				setState(561);
				match(RPAR);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				((OtherExpressionContext)_localctx).sz = size();
				therExpressionRet = ((OtherExpressionContext)_localctx).sz.sizeRet;
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(566);
				((OtherExpressionContext)_localctx).ap = append();
				otherExpressionRet = ((OtherExpressionContext)_localctx).ap.appendRet;
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

	public static class SizeContext extends ParserRuleContext {
		public Expression sizeRet;
		public Token sz;
		public ExpressionContext ex;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((SizeContext)_localctx).sz = match(SIZE);
			setState(572);
			match(LPAR);
			setState(573);
			((SizeContext)_localctx).ex = expression();

			        sizeRet = new ListSize(((SizeContext)_localctx).ex.expressionRet);
			        sizeRet.setLine(((SizeContext)_localctx).sz.getLine());
			    
			setState(575);
			match(RPAR);
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

	public static class AppendContext extends ParserRuleContext {
		public Expression appendRet;
		public Token ap;
		public ExpressionContext ex1;
		public ExpressionContext ex2;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			((AppendContext)_localctx).ap = match(APPEND);
			setState(578);
			match(LPAR);
			setState(579);
			((AppendContext)_localctx).ex1 = expression();
			setState(580);
			match(COMMA);
			setState(581);
			((AppendContext)_localctx).ex2 = expression();

			        appendRet = new ListAppend(((AppendContext)_localctx).ex1.expressionRet, ((AppendContext)_localctx).ex2.expressionRet);
			        appendRet.setLine(((AppendContext)_localctx).ap.getLine());
			    
			setState(583);
			match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public BoolValueContext bv;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(CmmParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				((ValueContext)_localctx).bv = boolValue();
				valueRet = ((ValueContext)_localctx).bv.boolValueRet;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(INT_VALUE);
				valueRet = new IntValue(integer.valueOf(INT_VALUE.text()));
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValueRet;
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolValue);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(TRUE);
				boolValueRet = new BoolValue(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(FALSE);
				boolValueRet = new BoolValue(false);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public int line;
		public Token i;
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			((IdentifierContext)_localctx).i = match(IDENTIFIER);

			    identifierRet = new Identifier((((IdentifierContext)_localctx).i!=null?((IdentifierContext)_localctx).i.getText():null));
			    identifierRet.setLine(((IdentifierContext)_localctx).i.getLine());
			    ((IdentifierContext)_localctx).line =  ((IdentifierContext)_localctx).i.getLine();
			    
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				match(BOOL);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				match(LIST);
				setState(604);
				match(SHARP);
				setState(605);
				type();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				match(STRUCT);
				setState(607);
				identifier();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				fptrType();
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

	public static class FptrTypeContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(CmmParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CmmParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FptrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrTypeContext fptrType() throws RecognitionException {
		FptrTypeContext _localctx = new FptrTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(FPTR);
			setState(612);
			match(LESS_THAN);
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(613);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				{
				setState(614);
				type();
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(615);
					match(COMMA);
					setState(616);
					type();
					}
					}
					setState(621);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(624);
			match(ARROW);
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(625);
				type();
				}
				break;
			case VOID:
				{
				setState(626);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(629);
			match(GREATER_THAN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u027a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\6\5\u008d\n\5\r\5\16\5\u008e\3\5\3\5\3\5\3\5\6\5"+
		"\u0095\n\5\r\5\16\5\u0096\3\5\3\5\5\5\u009b\n\5\3\5\3\5\5\5\u009f\n\5"+
		"\3\5\6\5\u00a2\n\5\r\5\16\5\u00a3\3\6\3\6\3\6\3\6\3\6\6\6\u00ab\n\6\r"+
		"\6\16\6\u00ac\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u00b5\n\7\3\b\6\b\u00b8\n\b"+
		"\r\b\16\b\u00b9\3\b\3\b\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\b\3\b"+
		"\5\b\u00c6\n\b\6\b\u00c8\n\b\r\b\16\b\u00c9\3\t\3\t\3\t\6\t\u00cf\n\t"+
		"\r\t\16\t\u00d0\3\n\3\n\3\n\6\n\u00d6\n\n\r\n\16\n\u00d7\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00df\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00e8"+
		"\n\13\r\13\16\13\u00e9\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f6"+
		"\n\f\f\f\16\f\u00f9\13\f\5\f\u00fb\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0106\n\r\f\r\16\r\u0109\13\r\5\r\u010b\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\6\16\u0112\n\16\r\16\16\16\u0113\3\16\3\16\3\16\5\16\u0119\n"+
		"\16\5\16\u011b\n\16\3\17\3\17\6\17\u011f\n\17\r\17\16\17\u0120\3\17\5"+
		"\17\u0124\n\17\3\20\3\20\3\20\3\20\6\20\u012a\n\20\r\20\16\20\u012b\3"+
		"\20\3\20\3\20\3\20\7\20\u0132\n\20\f\20\16\20\u0135\13\20\3\20\3\20\3"+
		"\20\5\20\u013a\n\20\6\20\u013c\n\20\r\20\16\20\u013d\3\20\6\20\u0141\n"+
		"\20\r\20\16\20\u0142\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u014b\n\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0151\n\21\7\21\u0153\n\21\f\21\16\21\u0156\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u015f\n\22\f\22\16\22\u0162\13"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u016a\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0174\n\24\3\25\7\25\u0177\n\25\f\25\16\25\u017a"+
		"\13\25\3\25\3\25\3\25\3\26\3\26\5\26\u0181\n\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\7\30\u018a\n\30\f\30\16\30\u018d\13\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u01a4\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01ac\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01b4\n\35\f\35\16\35\u01b7"+
		"\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01bf\n\36\f\36\16\36\u01c2"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01ca\n\37\f\37\16\37\u01cd"+
		"\13\37\3 \3 \3 \3 \3 \3 \5 \u01d5\n \3 \3 \3 \7 \u01da\n \f \16 \u01dd"+
		"\13 \3!\3!\3!\3!\3!\3!\5!\u01e5\n!\3!\3!\3!\7!\u01ea\n!\f!\16!\u01ed\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01f5\n\"\3\"\3\"\3\"\7\"\u01fa\n\"\f\""+
		"\16\"\u01fd\13\"\3#\3#\3#\3#\5#\u0203\n#\3#\3#\3#\3#\3#\3#\5#\u020b\n"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0218\n$\f$\16$\u021b\13$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\7$\u0226\n$\f$\16$\u0229\13$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u023c\n%\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0251\n(\3)\3)\3)\3)\5)\u0257"+
		"\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0264\n+\3,\3,\3,\3,\3,\3,\7,"+
		"\u026c\n,\f,\16,\u026f\13,\5,\u0271\n,\3,\3,\3,\5,\u0276\n,\3,\3,\3,\2"+
		"\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTV\2\2\2\u029e\2[\3\2\2\2\4h\3\2\2\2\6|\3\2\2\2\b\u0084\3\2\2"+
		"\2\n\u00a5\3\2\2\2\f\u00b4\3\2\2\2\16\u00c7\3\2\2\2\20\u00cb\3\2\2\2\22"+
		"\u00d2\3\2\2\2\24\u00d9\3\2\2\2\26\u00eb\3\2\2\2\30\u00fe\3\2\2\2\32\u010c"+
		"\3\2\2\2\34\u0123\3\2\2\2\36\u0125\3\2\2\2 \u0146\3\2\2\2\"\u0157\3\2"+
		"\2\2$\u0167\3\2\2\2&\u016b\3\2\2\2(\u0178\3\2\2\2*\u0180\3\2\2\2,\u0182"+
		"\3\2\2\2.\u0186\3\2\2\2\60\u0191\3\2\2\2\62\u0196\3\2\2\2\64\u01a3\3\2"+
		"\2\2\66\u01a5\3\2\2\28\u01ad\3\2\2\2:\u01b8\3\2\2\2<\u01c3\3\2\2\2>\u01ce"+
		"\3\2\2\2@\u01de\3\2\2\2B\u01ee\3\2\2\2D\u020a\3\2\2\2F\u020c\3\2\2\2H"+
		"\u023b\3\2\2\2J\u023d\3\2\2\2L\u0243\3\2\2\2N\u0250\3\2\2\2P\u0256\3\2"+
		"\2\2R\u0258\3\2\2\2T\u0263\3\2\2\2V\u0265\3\2\2\2XZ\7,\2\2YX\3\2\2\2Z"+
		"]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\5\4\3\2_c\b\2\1"+
		"\2`b\7,\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2"+
		"\2fg\7\2\2\3g\3\3\2\2\2hn\b\3\1\2ij\5\b\5\2jk\b\3\1\2km\3\2\2\2li\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pn\3\2\2\2qr\5\24\13\2rs\b"+
		"\3\1\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3"+
		"\2\2\2yz\5\6\4\2z{\b\3\1\2{\5\3\2\2\2|}\b\4\1\2}~\7\3\2\2~\177\b\4\1\2"+
		"\177\u0080\7%\2\2\u0080\u0081\7&\2\2\u0081\u0082\5\32\16\2\u0082\u0083"+
		"\b\4\1\2\u0083\7\3\2\2\2\u0084\u0085\b\5\1\2\u0085\u0086\7\35\2\2\u0086"+
		"\u0087\b\5\1\2\u0087\u0088\5R*\2\u0088\u009e\b\5\1\2\u0089\u008a\7\30"+
		"\2\2\u008a\u008c\5\16\b\2\u008b\u008d\7,\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\7\31\2\2\u0091\u0092\b\5\1\2\u0092\u009f\3\2\2\2\u0093"+
		"\u0095\7,\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\5\f\7\2\u0099"+
		"\u009b\7+\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\b\5\1\2\u009d\u009f\3\2\2\2\u009e\u0089\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\7,\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\t\3\2\2\2\u00a5\u00a6\5T+\2\u00a6\u00a7\5R*\2\u00a7\u00a8\5\26\f\2\u00a8"+
		"\u00aa\7\30\2\2\u00a9\u00ab\7,\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\5\22\n\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7\31\2\2\u00b1\13\3\2"+
		"\2\2\u00b2\u00b5\5 \21\2\u00b3\u00b5\5\n\6\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\r\3\2\2\2\u00b6\u00b8\7,\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c0"+
		"\3\2\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\7+\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\f\7\2\u00c4"+
		"\u00c6\7+\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00b7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00ce\5\32"+
		"\16\2\u00cd\u00cf\7,\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\21\3\2\2\2\u00d2\u00d3\7 \2\2"+
		"\u00d3\u00d5\5\32\16\2\u00d4\u00d6\7,\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\23\3\2\2\2\u00d9"+
		"\u00de\b\13\1\2\u00da\u00db\5T+\2\u00db\u00dc\b\13\1\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00df\7\5\2\2\u00de\u00da\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\5R*\2\u00e1\u00e2\b\13\1\2\u00e2\u00e3\5\26"+
		"\f\2\u00e3\u00e4\b\13\1\2\u00e4\u00e5\5\32\16\2\u00e5\u00e7\b\13\1\2\u00e6"+
		"\u00e8\7,\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\25\3\2\2\2\u00eb\u00ec\b\f\1\2\u00ec\u00fa"+
		"\7%\2\2\u00ed\u00ee\5T+\2\u00ee\u00ef\5R*\2\u00ef\u00f7\b\f\1\2\u00f0"+
		"\u00f1\7)\2\2\u00f1\u00f2\5T+\2\u00f2\u00f3\5R*\2\u00f3\u00f4\b\f\1\2"+
		"\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00ed\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7&"+
		"\2\2\u00fd\27\3\2\2\2\u00fe\u010a\b\r\1\2\u00ff\u0100\5\66\34\2\u0100"+
		"\u0107\b\r\1\2\u0101\u0102\7)\2\2\u0102\u0103\5\66\34\2\u0103\u0104\b"+
		"\r\1\2\u0104\u0106\3\2\2\2\u0105\u0101\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u00ff\3\2\2\2\u010a\u010b\3\2\2\2\u010b\31\3\2\2\2\u010c\u011a"+
		"\b\16\1\2\u010d\u010e\5\36\20\2\u010e\u010f\b\16\1\2\u010f\u011b\3\2\2"+
		"\2\u0110\u0112\7,\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\5\64\33\2"+
		"\u0116\u0118\b\16\1\2\u0117\u0119\7+\2\2\u0118\u0117\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u010d\3\2\2\2\u011a\u0111\3\2\2\2\u011b"+
		"\33\3\2\2\2\u011c\u0124\5\36\20\2\u011d\u011f\7,\2\2\u011e\u011d\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0124\5\64\33\2\u0123\u011c\3\2\2\2\u0123\u011e\3\2\2\2"+
		"\u0124\35\3\2\2\2\u0125\u0126\b\20\1\2\u0126\u0127\7\30\2\2\u0127\u013b"+
		"\b\20\1\2\u0128\u012a\7,\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0133\3\2\2\2\u012d\u012e\5\64"+
		"\33\2\u012e\u012f\b\20\1\2\u012f\u0130\7+\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012d\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5\64\33\2\u0137"+
		"\u0139\b\20\1\2\u0138\u013a\7+\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0129\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0141\7,"+
		"\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\31\2\2\u0145\37\3\2\2"+
		"\2\u0146\u0147\5T+\2\u0147\u014a\5R*\2\u0148\u0149\7#\2\2\u0149\u014b"+
		"\58\35\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0154\3\2\2\2\u014c"+
		"\u014d\7)\2\2\u014d\u0150\5R*\2\u014e\u014f\7#\2\2\u014f\u0151\58\35\2"+
		"\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u014c"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"!\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0160\5H%\2\u0158\u0159\7%\2\2\u0159"+
		"\u015a\5\30\r\2\u015a\u015b\7&\2\2\u015b\u015f\3\2\2\2\u015c\u015d\7*"+
		"\2\2\u015d\u015f\5R*\2\u015e\u0158\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0162"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0164\7%\2\2\u0164\u0165\5\30\r\2\u0165\u0166\7&"+
		"\2\2\u0166#\3\2\2\2\u0167\u0169\7\4\2\2\u0168\u016a\5\66\34\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a%\3\2\2\2\u016b\u016c\b\24\1\2\u016c"+
		"\u016d\7\t\2\2\u016d\u016e\5\66\34\2\u016e\u0173\b\24\1\2\u016f\u0174"+
		"\5\34\17\2\u0170\u0171\5\32\16\2\u0171\u0172\5(\25\2\u0172\u0174\3\2\2"+
		"\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0174\'\3\2\2\2\u0175\u0177"+
		"\7,\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7\n"+
		"\2\2\u017c\u017d\5\34\17\2\u017d)\3\2\2\2\u017e\u0181\5,\27\2\u017f\u0181"+
		"\5.\30\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181+\3\2\2\2\u0182"+
		"\u0183\7!\2\2\u0183\u0184\5\66\34\2\u0184\u0185\5\34\17\2\u0185-\3\2\2"+
		"\2\u0186\u0187\7\"\2\2\u0187\u018b\5\32\16\2\u0188\u018a\7,\2\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7!\2\2\u018f"+
		"\u0190\5\66\34\2\u0190/\3\2\2\2\u0191\u0192\7\7\2\2\u0192\u0193\7%\2\2"+
		"\u0193\u0194\5\66\34\2\u0194\u0195\7&\2\2\u0195\61\3\2\2\2\u0196\u0197"+
		"\58\35\2\u0197\u0198\7#\2\2\u0198\u0199\5\66\34\2\u0199\63\3\2\2\2\u019a"+
		"\u01a4\5&\24\2\u019b\u01a4\5\60\31\2\u019c\u01a4\5\"\22\2\u019d\u01a4"+
		"\5$\23\2\u019e\u01a4\5\62\32\2\u019f\u01a4\5 \21\2\u01a0\u01a4\5*\26\2"+
		"\u01a1\u01a4\5L\'\2\u01a2\u01a4\5J&\2\u01a3\u019a\3\2\2\2\u01a3\u019b"+
		"\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3"+
		"\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2"+
		"\2\2\u01a4\65\3\2\2\2\u01a5\u01a6\58\35\2\u01a6\u01ab\b\34\1\2\u01a7\u01a8"+
		"\7#\2\2\u01a8\u01a9\5\66\34\2\u01a9\u01aa\b\34\1\2\u01aa\u01ac\3\2\2\2"+
		"\u01ab\u01a7\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\67\3\2\2\2\u01ad\u01ae"+
		"\5:\36\2\u01ae\u01b5\b\35\1\2\u01af\u01b0\7\24\2\2\u01b0\u01b1\5:\36\2"+
		"\u01b1\u01b2\b\35\1\2\u01b2\u01b4\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4\u01b7"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b69\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\5<\37\2\u01b9\u01c0\b\36\1\2\u01ba\u01bb\7"+
		"\23\2\2\u01bb\u01bc\5<\37\2\u01bc\u01bd\b\36\1\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01ba\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1;\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\5> \2\u01c4\u01cb"+
		"\b\37\1\2\u01c5\u01c6\7\17\2\2\u01c6\u01c7\5> \2\u01c7\u01c8\b\37\1\2"+
		"\u01c8\u01ca\3\2\2\2\u01c9\u01c5\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc=\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01cf\5@!\2\u01cf\u01db\b \1\2\u01d0\u01d1\7\21\2\2\u01d1\u01d5\b \1"+
		"\2\u01d2\u01d3\7\22\2\2\u01d3\u01d5\b \1\2\u01d4\u01d0\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\5@!\2\u01d7\u01d8\b \1\2\u01d8"+
		"\u01da\3\2\2\2\u01d9\u01d4\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc?\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df"+
		"\5B\"\2\u01df\u01eb\b!\1\2\u01e0\u01e1\7\13\2\2\u01e1\u01e5\b!\1\2\u01e2"+
		"\u01e3\7\f\2\2\u01e3\u01e5\b!\1\2\u01e4\u01e0\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5B\"\2\u01e7\u01e8\b!\1\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01e4\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ecA\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\5D#\2\u01ef"+
		"\u01fb\b\"\1\2\u01f0\u01f1\7\r\2\2\u01f1\u01f5\b\"\1\2\u01f2\u01f3\7\16"+
		"\2\2\u01f3\u01f5\b\"\1\2\u01f4\u01f0\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\5D#\2\u01f7\u01f8\b\"\1\2\u01f8\u01fa\3\2\2"+
		"\2\u01f9\u01f4\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fcC\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7\25\2\2\u01ff"+
		"\u0203\b#\1\2\u0200\u0201\7\f\2\2\u0201\u0203\b#\1\2\u0202\u01fe\3\2\2"+
		"\2\u0202\u0200\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\5D#\2\u0205\u0206"+
		"\b#\1\2\u0206\u020b\3\2\2\2\u0207\u0208\5F$\2\u0208\u0209\b#\1\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0202\3\2\2\2\u020a\u0207\3\2\2\2\u020bE\3\2\2\2"+
		"\u020c\u020d\5H%\2\u020d\u0219\b$\1\2\u020e\u020f\7%\2\2\u020f\u0210\5"+
		"\30\r\2\u0210\u0211\b$\1\2\u0211\u0212\7&\2\2\u0212\u0218\3\2\2\2\u0213"+
		"\u0214\7*\2\2\u0214\u0215\5R*\2\u0215\u0216\b$\1\2\u0216\u0218\3\2\2\2"+
		"\u0217\u020e\3\2\2\2\u0217\u0213\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0227\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u021d\7\'\2\2\u021d\u021e\5\66\34\2\u021e\u021f\b$\1\2\u021f\u0220\7"+
		"(\2\2\u0220\u0226\3\2\2\2\u0221\u0222\7*\2\2\u0222\u0223\5R*\2\u0223\u0224"+
		"\b$\1\2\u0224\u0226\3\2\2\2\u0225\u021c\3\2\2\2\u0225\u0221\3\2\2\2\u0226"+
		"\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228G\3\2\2\2"+
		"\u0229\u0227\3\2\2\2\u022a\u022b\5N(\2\u022b\u022c\b%\1\2\u022c\u023c"+
		"\3\2\2\2\u022d\u022e\5R*\2\u022e\u022f\b%\1\2\u022f\u023c\3\2\2\2\u0230"+
		"\u0231\7%\2\2\u0231\u0232\5\30\r\2\u0232\u0233\b%\1\2\u0233\u0234\7&\2"+
		"\2\u0234\u023c\3\2\2\2\u0235\u0236\5J&\2\u0236\u0237\b%\1\2\u0237\u023c"+
		"\3\2\2\2\u0238\u0239\5L\'\2\u0239\u023a\b%\1\2\u023a\u023c\3\2\2\2\u023b"+
		"\u022a\3\2\2\2\u023b\u022d\3\2\2\2\u023b\u0230\3\2\2\2\u023b\u0235\3\2"+
		"\2\2\u023b\u0238\3\2\2\2\u023cI\3\2\2\2\u023d\u023e\7\6\2\2\u023e\u023f"+
		"\7%\2\2\u023f\u0240\5\66\34\2\u0240\u0241\b&\1\2\u0241\u0242\7&\2\2\u0242"+
		"K\3\2\2\2\u0243\u0244\7\b\2\2\u0244\u0245\7%\2\2\u0245\u0246\5\66\34\2"+
		"\u0246\u0247\7)\2\2\u0247\u0248\5\66\34\2\u0248\u0249\b\'\1\2\u0249\u024a"+
		"\7&\2\2\u024aM\3\2\2\2\u024b\u024c\5P)\2\u024c\u024d\b(\1\2\u024d\u0251"+
		"\3\2\2\2\u024e\u024f\7-\2\2\u024f\u0251\b(\1\2\u0250\u024b\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0251O\3\2\2\2\u0252\u0253\7\26\2\2\u0253\u0257\b)\1\2"+
		"\u0254\u0255\7\27\2\2\u0255\u0257\b)\1\2\u0256\u0252\3\2\2\2\u0256\u0254"+
		"\3\2\2\2\u0257Q\3\2\2\2\u0258\u0259\7.\2\2\u0259\u025a\b*\1\2\u025aS\3"+
		"\2\2\2\u025b\u0264\7\32\2\2\u025c\u0264\7\33\2\2\u025d\u025e\7\34\2\2"+
		"\u025e\u025f\7$\2\2\u025f\u0264\5T+\2\u0260\u0261\7\35\2\2\u0261\u0264"+
		"\5R*\2\u0262\u0264\5V,\2\u0263\u025b\3\2\2\2\u0263\u025c\3\2\2\2\u0263"+
		"\u025d\3\2\2\2\u0263\u0260\3\2\2\2\u0263\u0262\3\2\2\2\u0264U\3\2\2\2"+
		"\u0265\u0266\7\36\2\2\u0266\u0270\7\22\2\2\u0267\u0271\7\5\2\2\u0268\u026d"+
		"\5T+\2\u0269\u026a\7)\2\2\u026a\u026c\5T+\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271\3\2"+
		"\2\2\u026f\u026d\3\2\2\2\u0270\u0267\3\2\2\2\u0270\u0268\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0275\7\20\2\2\u0273\u0276\5T+\2\u0274\u0276\7\5"+
		"\2\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0278\7\21\2\2\u0278W\3\2\2\2E[cnv\u008e\u0096\u009a\u009e\u00a3\u00ac"+
		"\u00b4\u00b9\u00c0\u00c5\u00c9\u00d0\u00d7\u00de\u00e9\u00f7\u00fa\u0107"+
		"\u010a\u0113\u0118\u011a\u0120\u0123\u012b\u0133\u0139\u013d\u0142\u014a"+
		"\u0150\u0154\u015e\u0160\u0169\u0173\u0178\u0180\u018b\u01a3\u01ab\u01b5"+
		"\u01c0\u01cb\u01d4\u01db\u01e4\u01eb\u01f4\u01fb\u0202\u020a\u0217\u0219"+
		"\u0225\u0227\u023b\u0250\u0256\u0263\u026d\u0270\u0275";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}