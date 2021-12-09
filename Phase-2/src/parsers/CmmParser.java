// Generated from /home/ho/C--_Compier/Phase-2/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package parsers;

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
			_localctx.mainRet.setBody(((MainContext)_localctx).b.bodyRet);
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
			((StructDeclarationContext)_localctx).structDeclarationRet =  new StructDeclaration();
			setState(131);
			((StructDeclarationContext)_localctx).s = match(STRUCT);
			_localctx.structDeclarationRet.setLine(((StructDeclarationContext)_localctx).s.getLine());
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
		public SetGetVarDeclaration singleVarWithGetAndSetRet;
		public TypeContext t;
		public IdentifierContext id;
		public FunctionArgsDecContext fa;
		public SetBodyContext sb;
		public GetBodyContext gb;
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
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
			((SingleVarWithGetAndSetContext)_localctx).singleVarWithGetAndSetRet =  new SetGetVarDeclaration();
			setState(164);
			((SingleVarWithGetAndSetContext)_localctx).t = type();
			_localctx.singleVarWithGetAndSetRet.setVarType(((SingleVarWithGetAndSetContext)_localctx).t.typeRet);
			setState(166);
			((SingleVarWithGetAndSetContext)_localctx).id = identifier();
			_localctx.singleVarWithGetAndSetRet.setVarName(((SingleVarWithGetAndSetContext)_localctx).id.identifierRet);
			    _localctx.singleVarWithGetAndSetRet.setLine(((SingleVarWithGetAndSetContext)_localctx).id.line);
			setState(168);
			((SingleVarWithGetAndSetContext)_localctx).fa = functionArgsDec();
			_localctx.singleVarWithGetAndSetRet.setArgs(((SingleVarWithGetAndSetContext)_localctx).fa.functionArgsDecRet);
			setState(170);
			match(BEGIN);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				match(NEWLINE);
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(176);
			((SingleVarWithGetAndSetContext)_localctx).sb = setBody();
			_localctx.singleVarWithGetAndSetRet.setSetterBody(((SingleVarWithGetAndSetContext)_localctx).sb.setBodyRet);
			setState(178);
			((SingleVarWithGetAndSetContext)_localctx).gb = getBody();
			_localctx.singleVarWithGetAndSetRet.setGetterBody(((SingleVarWithGetAndSetContext)_localctx).gb.getBodyRet);
			setState(180);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				varDecStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
			setState(203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(186);
						match(NEWLINE);
						}
						}
						setState(189); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(191);
							singleStatementStructBody();
							setState(192);
							match(SEMICOLON);
							}
							} 
						}
						setState(198);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(199);
					singleStatementStructBody();
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(200);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205); 
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
		public Statement getBodyRet;
		public BodyContext bd;
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
			setState(207);
			match(GET);
			setState(208);
			((GetBodyContext)_localctx).bd = body();
			((GetBodyContext)_localctx).getBodyRet =  ((GetBodyContext)_localctx).bd.bodyRet;
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

	public static class SetBodyContext extends ParserRuleContext {
		public Statement setBodyRet;
		public BodyContext bd;
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
			setState(215);
			match(SET);
			setState(216);
			((SetBodyContext)_localctx).bd = body();
			((SetBodyContext)_localctx).setBodyRet =  ((SetBodyContext)_localctx).bd.bodyRet;
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(NEWLINE);
				}
				}
				setState(221); 
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
			((FunctionDeclarationContext)_localctx).functionDeclarationRet =  new FunctionDeclaration();
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(224);
				((FunctionDeclarationContext)_localctx).t = type();
				_localctx.functionDeclarationRet.setReturnType(((FunctionDeclarationContext)_localctx).t.typeRet);
				}
				break;
			case VOID:
				{
				setState(227);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(230);
			((FunctionDeclarationContext)_localctx).id = identifier();

			        _localctx.functionDeclarationRet.setFunctionName(((FunctionDeclarationContext)_localctx).id.identifierRet);
			        _localctx.functionDeclarationRet.setLine(((FunctionDeclarationContext)_localctx).id.line);
			    
			setState(232);
			((FunctionDeclarationContext)_localctx).a = functionArgsDec();
			_localctx.functionDeclarationRet.setArgs(((FunctionDeclarationContext)_localctx).a.functionArgsDecRet);
			setState(234);
			((FunctionDeclarationContext)_localctx).b = body();
			_localctx.functionDeclarationRet.setBody(((FunctionDeclarationContext)_localctx).b.bodyRet);
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				match(NEWLINE);
				}
				}
				setState(239); 
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
			((FunctionArgsDecContext)_localctx).functionArgsDecRet =  new ArrayList<>();
			setState(242);
			match(LPAR);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(243);
				((FunctionArgsDecContext)_localctx).t = type();
				setState(244);
				((FunctionArgsDecContext)_localctx).i = identifier();
				VariableDeclaration v1 = new VariableDeclaration(((FunctionArgsDecContext)_localctx).i.identifierRet, ((FunctionArgsDecContext)_localctx).t.typeRet);  _localctx.functionArgsDecRet.add(v1);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					((FunctionArgsDecContext)_localctx).t = type();
					setState(248);
					((FunctionArgsDecContext)_localctx).i = identifier();
					VariableDeclaration v2 = new VariableDeclaration(((FunctionArgsDecContext)_localctx).i.identifierRet, ((FunctionArgsDecContext)_localctx).t.typeRet);
					        _localctx.functionArgsDecRet.add(v2);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(258);
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
		public ExprInPar functionArgumentsRet;
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

			        ArrayList<Expression> inputs = new ArrayList<>();
			        ((FunctionArgumentsContext)_localctx).functionArgumentsRet =  new ExprInPar(inputs);
			    
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(261);
				((FunctionArgumentsContext)_localctx).ex = expression();
				inputs.add(((FunctionArgumentsContext)_localctx).ex.expressionRet);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					((FunctionArgumentsContext)_localctx).ex = expression();
					inputs.add(((FunctionArgumentsContext)_localctx).ex.expressionRet);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			_localctx.functionArgumentsRet.setInputs(inputs);
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
		public BlockStmt bodyRet;
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
			((BodyContext)_localctx).bodyRet =  new BlockStmt();
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(277);
				((BodyContext)_localctx).b = blockStatement();
				_localctx.bodyRet.addStatement(((BodyContext)_localctx).b.blockStatementRet);
				}
				break;
			case NEWLINE:
				{
				{
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					match(NEWLINE);
					}
					}
					setState(283); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(285);
				((BodyContext)_localctx).b1 = singleStatement();
				_localctx.bodyRet.addStatement(((BodyContext)_localctx).b1.singleStatementRet);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(287);
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
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(292);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(293);
					match(NEWLINE);
					}
					}
					setState(296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(298);
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
		public BlockStmt blockStatementRet;
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
			((BlockStatementContext)_localctx).blockStatementRet =  new BlockStmt();
			setState(302);
			((BlockStatementContext)_localctx).bg = match(BEGIN);
			_localctx.blockStatementRet.setLine(((BlockStatementContext)_localctx).bg.getLine());
			setState(323); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(304);
						match(NEWLINE);
						}
						}
						setState(307); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(309);
							((BlockStatementContext)_localctx).ss = singleStatement();
							_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss.singleStatementRet);
							setState(311);
							match(SEMICOLON);
							}
							} 
						}
						setState(317);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(318);
					((BlockStatementContext)_localctx).ss = singleStatement();
					_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss.singleStatementRet);
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(320);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(325); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(327);
				match(NEWLINE);
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(332);
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
		public VarDecStmt varDecStatementRet;
		public TypeContext tp;
		public IdentifierContext id;
		public OrExpressionContext oe;
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
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
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

			    ((VarDecStatementContext)_localctx).varDecStatementRet =  new VarDecStmt();
			    ArrayList<VariableDeclaration> vars = new ArrayList<>();
			    
			setState(335);
			((VarDecStatementContext)_localctx).tp = type();
			setState(336);
			((VarDecStatementContext)_localctx).id = identifier();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(337);
				match(ASSIGN);
				setState(338);
				((VarDecStatementContext)_localctx).oe = orExpression();

				        VariableDeclaration vd = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifierRet, ((VarDecStatementContext)_localctx).tp.typeRet);
				        vd.setDefaultValue(((VarDecStatementContext)_localctx).oe.orExpressionRet);
				        vars.add(vd);
				    
				}
			}

			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343);
				match(COMMA);
				setState(344);
				((VarDecStatementContext)_localctx).id = identifier();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(345);
					match(ASSIGN);
					setState(346);
					((VarDecStatementContext)_localctx).oe = orExpression();
					}
				}


				        VariableDeclaration vd = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifierRet, ((VarDecStatementContext)_localctx).tp.typeRet);
				        vd.setDefaultValue(((VarDecStatementContext)_localctx).oe.orExpressionRet);
				    
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			VarDecStatementRet.setVars(vd);
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
			setState(358);
			otherExpression();
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(365);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(359);
						match(LPAR);
						setState(360);
						functionArguments();
						setState(361);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(363);
						match(DOT);
						setState(364);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(370);
			match(LPAR);
			setState(371);
			functionArguments();
			setState(372);
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
			setState(374);
			match(RETURN);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(375);
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
		public ConditionalStmt ifStatementRet;
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
			setState(378);
			match(IF);
			setState(379);
			((IfStatementContext)_localctx).e = expression();
			((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).e.expressionRet);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(381);
				loopCondBody();
				}
				break;
			case 2:
				{
				setState(382);
				body();
				setState(383);
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
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(387);
				match(NEWLINE);
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(ELSE);
			setState(394);
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
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				whileLoopStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
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
			setState(400);
			match(WHILE);
			setState(401);
			expression();
			setState(402);
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
			setState(404);
			match(DO);
			setState(405);
			body();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(406);
				match(NEWLINE);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(WHILE);
			setState(413);
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
			setState(415);
			match(DISPLAY);
			setState(416);
			match(LPAR);
			setState(417);
			expression();
			setState(418);
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
			setState(420);
			orExpression();
			setState(421);
			match(ASSIGN);
			setState(422);
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
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				displayStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				functionCallStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				assignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				varDecStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(431);
				append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(432);
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
			setState(435);
			((ExpressionContext)_localctx).oe = orExpression();
			((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).oe.orExpressionRet;
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(437);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(438);
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
			setState(443);
			((OrExpressionContext)_localctx).ael = andExpression();
			 ((OrExpressionContext)_localctx).orExpressionRet =  ((OrExpressionContext)_localctx).ael.andExpressionRet;
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(445);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(446);
				((OrExpressionContext)_localctx).aer = andExpression();

				    BinaryOperator bo = BinaryOperator.or;
				    ((OrExpressionContext)_localctx).orExpressionRet =  new BinaryExpression(((OrExpressionContext)_localctx).ael.andExpressionRet, ((OrExpressionContext)_localctx).aer.andExpressionRet, bo);
				    _localctx.orExpressionRet.setLine(((OrExpressionContext)_localctx).op.getLine());

				}
				}
				setState(453);
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
			setState(454);
			((AndExpressionContext)_localctx).eql = equalityExpression();
			((AndExpressionContext)_localctx).andExpressionRet =  ((AndExpressionContext)_localctx).eql.equalityExpressionRet;
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(456);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(457);
				((AndExpressionContext)_localctx).eqr = equalityExpression();
				   
				    BinaryOperator bo = BinaryOperator.and;
				    ((AndExpressionContext)_localctx).andExpressionRet =  new BinaryExpression(((AndExpressionContext)_localctx).eql.equalityExpressionRet, ((AndExpressionContext)_localctx).eqr.equalityExpressionRet, bo);
				    _localctx.andExpressionRet.setLine(((AndExpressionContext)_localctx).op.getLine());

				}
				}
				setState(464);
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
			setState(465);
			((EqualityExpressionContext)_localctx).rel = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExpressionRet =  ((EqualityExpressionContext)_localctx).rel.relationalExpressionRet;
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(467);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(468);
				((EqualityExpressionContext)_localctx).rer = relationalExpression();

				    BinaryOperator bo = BinaryOperator.eq;
				    ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(((EqualityExpressionContext)_localctx).rel.relationalExpressionRet, ((EqualityExpressionContext)_localctx).rer.relationalExpressionRet, bo);
				    _localctx.equalityExpressionRet.setLine(((EqualityExpressionContext)_localctx).op.getLine());

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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relationalExpressionRet;
		public BinaryOperator bo;
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
			setState(476);
			((RelationalExpressionContext)_localctx).ael = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExpressionRet =  ((RelationalExpressionContext)_localctx).ael.additiveExpressionRet;
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(478);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					((RelationalExpressionContext)_localctx).bo =  BinaryOperator.gt;
					}
					break;
				case LESS_THAN:
					{
					setState(480);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					((RelationalExpressionContext)_localctx).bo =  BinaryOperator.lt;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(484);
				((RelationalExpressionContext)_localctx).aer = additiveExpression();

				    ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(((RelationalExpressionContext)_localctx).ael.additiveExpressionRet, ((RelationalExpressionContext)_localctx).aer.additiveExpressionRet, _localctx.bo);
				    _localctx.relationalExpressionRet.setLine(((RelationalExpressionContext)_localctx).op.getLine());

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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExpressionRet;
		public BinaryOperator bo;
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
			setState(492);
			((AdditiveExpressionContext)_localctx).mpl = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExpressionRet =  ((AdditiveExpressionContext)_localctx).mpl.multiplicativeExpressionRet;
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(498);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(494);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					((AdditiveExpressionContext)_localctx).bo =  BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(496);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					((AdditiveExpressionContext)_localctx).bo =  BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500);
				((AdditiveExpressionContext)_localctx).mpr = multiplicativeExpression();

				    ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(((AdditiveExpressionContext)_localctx).mpl.multiplicativeExpressionRet, ((AdditiveExpressionContext)_localctx).mpr.multiplicativeExpressionRet, _localctx.bo);
				    _localctx.additiveExpressionRet.setLine(((AdditiveExpressionContext)_localctx).op.getLine());

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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiplicativeExpressionRet;
		public BinaryOperator bo;
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
			setState(508);
			((MultiplicativeExpressionContext)_localctx).pul = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  ((MultiplicativeExpressionContext)_localctx).pul.preUnaryExpressionRet;
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(514);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(510);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					((MultiplicativeExpressionContext)_localctx).bo =  BinaryOperator.mult;
					}
					break;
				case DIVIDE:
					{
					setState(512);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					((MultiplicativeExpressionContext)_localctx).bo =  BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(516);
				((MultiplicativeExpressionContext)_localctx).pur = preUnaryExpression();

				    ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).pul.preUnaryExpressionRet, ((MultiplicativeExpressionContext)_localctx).pur.preUnaryExpressionRet, _localctx.bo);
				    _localctx.multiplicativeExpressionRet.setLine(((MultiplicativeExpressionContext)_localctx).op.getLine());

				}
				}
				setState(523);
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
		public UnaryOperator bo;
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
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(528);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(524);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					((PreUnaryExpressionContext)_localctx).bo =  UnaryOperator.not; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				case MINUS:
					{
					setState(526);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					((PreUnaryExpressionContext)_localctx).bo =  UnaryOperator.minus; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(530);
				((PreUnaryExpressionContext)_localctx).pue = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pue.preUnaryExpressionRet, _localctx.bo);
				        _localctx.preUnaryExpressionRet.setLine(_localctx.line);
				    
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
				setState(533);
				((PreUnaryExpressionContext)_localctx).ae = accessExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).ae.accessExpressionRet, _localctx.bo);
				        _localctx.preUnaryExpressionRet.setLine(_localctx.line);
				    
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
			setState(538);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			((AccessExpressionContext)_localctx).accessExpressionRet =  ((AccessExpressionContext)_localctx).oe.otherExpressionRet;
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(549);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(540);
						((AccessExpressionContext)_localctx).lp = match(LPAR);
						setState(541);
						((AccessExpressionContext)_localctx).fa = functionArguments();

						        ((AccessExpressionContext)_localctx).accessExpressionRet =  new FunctionCall(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).fa.functionArgumentsRet.getInputs());
						        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lp.getLine());
						    
						setState(543);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(545);
						((AccessExpressionContext)_localctx).d = match(DOT);
						setState(546);
						((AccessExpressionContext)_localctx).id = identifier();

						        ((AccessExpressionContext)_localctx).accessExpressionRet =  new StructAccess(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).id.identifierRet);
						        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).d.getLine());
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(563);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(554);
					((AccessExpressionContext)_localctx).lb = match(LBRACK);
					setState(555);
					((AccessExpressionContext)_localctx).ex = expression();

					        ((AccessExpressionContext)_localctx).accessExpressionRet =  new ListAccessByIndex(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).ex.expressionRet);
					        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lb.getLine());
					    
					setState(557);
					match(RBRACK);
					}
					}
					break;
				case DOT:
					{
					{
					setState(559);
					((AccessExpressionContext)_localctx).d = match(DOT);
					setState(560);
					((AccessExpressionContext)_localctx).id = identifier();

					        ((AccessExpressionContext)_localctx).accessExpressionRet =  new StructAccess(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).id.identifierRet);
					        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).d.getLine());
					    
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
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
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				((OtherExpressionContext)_localctx).vl = value();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).vl.valueRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				((OtherExpressionContext)_localctx).id = identifier();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).id.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				((OtherExpressionContext)_localctx).lp = match(LPAR);
				{
				setState(575);
				((OtherExpressionContext)_localctx).fa = functionArguments();
				}
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).fa.functionArgumentsRet;
				setState(577);
				match(RPAR);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				((OtherExpressionContext)_localctx).sz = size();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).sz.sizeRet;
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				((OtherExpressionContext)_localctx).ap = append();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).ap.appendRet;
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
			setState(587);
			((SizeContext)_localctx).sz = match(SIZE);
			setState(588);
			match(LPAR);
			setState(589);
			((SizeContext)_localctx).ex = expression();

			        ((SizeContext)_localctx).sizeRet =  new ListSize(((SizeContext)_localctx).ex.expressionRet);
			        _localctx.sizeRet.setLine(((SizeContext)_localctx).sz.getLine());
			    
			setState(591);
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
			setState(593);
			((AppendContext)_localctx).ap = match(APPEND);
			setState(594);
			match(LPAR);
			setState(595);
			((AppendContext)_localctx).ex1 = expression();
			setState(596);
			match(COMMA);
			setState(597);
			((AppendContext)_localctx).ex2 = expression();

			        ((AppendContext)_localctx).appendRet =  new ListAppend(((AppendContext)_localctx).ex1.expressionRet, ((AppendContext)_localctx).ex2.expressionRet);
			        _localctx.appendRet.setLine(((AppendContext)_localctx).ap.getLine());
			    
			setState(599);
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
		public Token i;
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
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				((ValueContext)_localctx).bv = boolValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).bv.boolValueRet;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				((ValueContext)_localctx).i = match(INT_VALUE);
				((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).i!=null?Integer.valueOf(((ValueContext)_localctx).i.getText()):0));
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
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(TRUE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(FALSE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false);
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
			setState(614);
			((IdentifierContext)_localctx).i = match(IDENTIFIER);

			    ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).i!=null?((IdentifierContext)_localctx).i.getText():null));
			    _localctx.identifierRet.setLine(((IdentifierContext)_localctx).i.getLine());
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
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(BOOL);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				match(LIST);
				setState(620);
				match(SHARP);
				setState(621);
				type();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				match(STRUCT);
				setState(623);
				identifier();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(624);
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
			setState(627);
			match(FPTR);
			setState(628);
			match(LESS_THAN);
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(629);
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
				setState(630);
				type();
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(631);
					match(COMMA);
					setState(632);
					type();
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(640);
			match(ARROW);
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(641);
				type();
				}
				break;
			case VOID:
				{
				setState(642);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(645);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u028a\4\2\t\2"+
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
		"\3\5\6\5\u00a2\n\5\r\5\16\5\u00a3\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\6\6\u00af\n\6\r\6\16\6\u00b0\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u00bb"+
		"\n\7\3\b\6\b\u00be\n\b\r\b\16\b\u00bf\3\b\3\b\3\b\7\b\u00c5\n\b\f\b\16"+
		"\b\u00c8\13\b\3\b\3\b\5\b\u00cc\n\b\6\b\u00ce\n\b\r\b\16\b\u00cf\3\t\3"+
		"\t\3\t\3\t\6\t\u00d6\n\t\r\t\16\t\u00d7\3\n\3\n\3\n\3\n\6\n\u00de\n\n"+
		"\r\n\16\n\u00df\3\13\3\13\3\13\3\13\3\13\5\13\u00e7\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\6\13\u00f0\n\13\r\13\16\13\u00f1\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00fe\n\f\f\f\16\f\u0101\13\f\5\f\u0103\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010e\n\r\f\r\16\r\u0111\13"+
		"\r\5\r\u0113\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u011c\n\16\r\16"+
		"\16\16\u011d\3\16\3\16\3\16\5\16\u0123\n\16\5\16\u0125\n\16\3\17\3\17"+
		"\6\17\u0129\n\17\r\17\16\17\u012a\3\17\5\17\u012e\n\17\3\20\3\20\3\20"+
		"\3\20\6\20\u0134\n\20\r\20\16\20\u0135\3\20\3\20\3\20\3\20\7\20\u013c"+
		"\n\20\f\20\16\20\u013f\13\20\3\20\3\20\3\20\5\20\u0144\n\20\6\20\u0146"+
		"\n\20\r\20\16\20\u0147\3\20\6\20\u014b\n\20\r\20\16\20\u014c\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0158\n\21\3\21\3\21\3\21\3\21"+
		"\5\21\u015e\n\21\3\21\3\21\7\21\u0162\n\21\f\21\16\21\u0165\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0170\n\22\f\22\16\22\u0173"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u017b\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0184\n\24\3\25\7\25\u0187\n\25\f\25\16\25\u018a"+
		"\13\25\3\25\3\25\3\25\3\26\3\26\5\26\u0191\n\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\7\30\u019a\n\30\f\30\16\30\u019d\13\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u01b4\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01bc\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01c4\n\35\f\35\16\35\u01c7"+
		"\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01cf\n\36\f\36\16\36\u01d2"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01da\n\37\f\37\16\37\u01dd"+
		"\13\37\3 \3 \3 \3 \3 \3 \5 \u01e5\n \3 \3 \3 \7 \u01ea\n \f \16 \u01ed"+
		"\13 \3!\3!\3!\3!\3!\3!\5!\u01f5\n!\3!\3!\3!\7!\u01fa\n!\f!\16!\u01fd\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0205\n\"\3\"\3\"\3\"\7\"\u020a\n\"\f\""+
		"\16\"\u020d\13\"\3#\3#\3#\3#\5#\u0213\n#\3#\3#\3#\3#\3#\3#\5#\u021b\n"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0228\n$\f$\16$\u022b\13$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\7$\u0236\n$\f$\16$\u0239\13$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u024c\n%\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0261\n(\3)\3)\3)\3)\5)\u0267"+
		"\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0274\n+\3,\3,\3,\3,\3,\3,\7,"+
		"\u027c\n,\f,\16,\u027f\13,\5,\u0281\n,\3,\3,\3,\5,\u0286\n,\3,\3,\3,\2"+
		"\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTV\2\2\2\u02ae\2[\3\2\2\2\4h\3\2\2\2\6|\3\2\2\2\b\u0084\3\2\2"+
		"\2\n\u00a5\3\2\2\2\f\u00ba\3\2\2\2\16\u00cd\3\2\2\2\20\u00d1\3\2\2\2\22"+
		"\u00d9\3\2\2\2\24\u00e1\3\2\2\2\26\u00f3\3\2\2\2\30\u0106\3\2\2\2\32\u0116"+
		"\3\2\2\2\34\u012d\3\2\2\2\36\u012f\3\2\2\2 \u0150\3\2\2\2\"\u0168\3\2"+
		"\2\2$\u0178\3\2\2\2&\u017c\3\2\2\2(\u0188\3\2\2\2*\u0190\3\2\2\2,\u0192"+
		"\3\2\2\2.\u0196\3\2\2\2\60\u01a1\3\2\2\2\62\u01a6\3\2\2\2\64\u01b3\3\2"+
		"\2\2\66\u01b5\3\2\2\28\u01bd\3\2\2\2:\u01c8\3\2\2\2<\u01d3\3\2\2\2>\u01de"+
		"\3\2\2\2@\u01ee\3\2\2\2B\u01fe\3\2\2\2D\u021a\3\2\2\2F\u021c\3\2\2\2H"+
		"\u024b\3\2\2\2J\u024d\3\2\2\2L\u0253\3\2\2\2N\u0260\3\2\2\2P\u0266\3\2"+
		"\2\2R\u0268\3\2\2\2T\u0273\3\2\2\2V\u0275\3\2\2\2XZ\7,\2\2YX\3\2\2\2Z"+
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
		"\t\3\2\2\2\u00a5\u00a6\b\6\1\2\u00a6\u00a7\5T+\2\u00a7\u00a8\b\6\1\2\u00a8"+
		"\u00a9\5R*\2\u00a9\u00aa\b\6\1\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\b\6"+
		"\1\2\u00ac\u00ae\7\30\2\2\u00ad\u00af\7,\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\b\6\1\2\u00b4\u00b5\5\20\t\2\u00b5"+
		"\u00b6\b\6\1\2\u00b6\u00b7\7\31\2\2\u00b7\13\3\2\2\2\u00b8\u00bb\5 \21"+
		"\2\u00b9\u00bb\5\n\6\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\r"+
		"\3\2\2\2\u00bc\u00be\7,\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\5\f"+
		"\7\2\u00c2\u00c3\7+\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\5\f\7\2\u00ca\u00cc\7+\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00bd\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\17\3\2\2\2\u00d1\u00d2\7\37\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d5\b\t"+
		"\1\2\u00d4\u00d6\7,\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\21\3\2\2\2\u00d9\u00da\7 \2\2"+
		"\u00da\u00db\5\32\16\2\u00db\u00dd\b\n\1\2\u00dc\u00de\7,\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\23\3\2\2\2\u00e1\u00e6\b\13\1\2\u00e2\u00e3\5T+\2\u00e3\u00e4\b\13\1"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\7\5\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5R*\2\u00e9\u00ea\b\13\1\2\u00ea"+
		"\u00eb\5\26\f\2\u00eb\u00ec\b\13\1\2\u00ec\u00ed\5\32\16\2\u00ed\u00ef"+
		"\b\13\1\2\u00ee\u00f0\7,\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\25\3\2\2\2\u00f3\u00f4\b\f\1"+
		"\2\u00f4\u0102\7%\2\2\u00f5\u00f6\5T+\2\u00f6\u00f7\5R*\2\u00f7\u00ff"+
		"\b\f\1\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\5T+\2\u00fa\u00fb\5R*\2\u00fb"+
		"\u00fc\b\f\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\7&\2\2\u0105\27\3\2\2\2\u0106\u0112\b\r\1\2\u0107\u0108"+
		"\5\66\34\2\u0108\u010f\b\r\1\2\u0109\u010a\7)\2\2\u010a\u010b\5\66\34"+
		"\2\u010b\u010c\b\r\1\2\u010c\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0107\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\b\r\1\2\u0115\31\3\2\2\2\u0116\u0124\b\16\1\2\u0117\u0118"+
		"\5\36\20\2\u0118\u0119\b\16\1\2\u0119\u0125\3\2\2\2\u011a\u011c\7,\2\2"+
		"\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\64\33\2\u0120\u0122\b\16\1"+
		"\2\u0121\u0123\7+\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0117\3\2\2\2\u0124\u011b\3\2\2\2\u0125\33\3\2\2\2\u0126"+
		"\u012e\5\36\20\2\u0127\u0129\7,\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\5\64\33\2\u012d\u0126\3\2\2\2\u012d\u0128\3\2\2\2\u012e\35\3\2"+
		"\2\2\u012f\u0130\b\20\1\2\u0130\u0131\7\30\2\2\u0131\u0145\b\20\1\2\u0132"+
		"\u0134\7,\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u013d\3\2\2\2\u0137\u0138\5\64\33\2\u0138"+
		"\u0139\b\20\1\2\u0139\u013a\7+\2\2\u013a\u013c\3\2\2\2\u013b\u0137\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5\64\33\2\u0141\u0143\b"+
		"\20\1\2\u0142\u0144\7+\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0133\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\7,\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\31\2\2\u014f\37\3\2\2\2\u0150\u0151"+
		"\b\21\1\2\u0151\u0152\5T+\2\u0152\u0157\5R*\2\u0153\u0154\7#\2\2\u0154"+
		"\u0155\58\35\2\u0155\u0156\b\21\1\2\u0156\u0158\3\2\2\2\u0157\u0153\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u0163\3\2\2\2\u0159\u015a\7)\2\2\u015a"+
		"\u015d\5R*\2\u015b\u015c\7#\2\2\u015c\u015e\58\35\2\u015d\u015b\3\2\2"+
		"\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\21\1\2\u0160"+
		"\u0162\3\2\2\2\u0161\u0159\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\b\21\1\2\u0167!\3\2\2\2\u0168\u0171\5H%\2\u0169\u016a\7%\2\2\u016a"+
		"\u016b\5\30\r\2\u016b\u016c\7&\2\2\u016c\u0170\3\2\2\2\u016d\u016e\7*"+
		"\2\2\u016e\u0170\5R*\2\u016f\u0169\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\7%\2\2\u0175\u0176\5\30\r\2\u0176\u0177\7&"+
		"\2\2\u0177#\3\2\2\2\u0178\u017a\7\4\2\2\u0179\u017b\5\66\34\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b%\3\2\2\2\u017c\u017d\7\t\2\2\u017d"+
		"\u017e\5\66\34\2\u017e\u0183\b\24\1\2\u017f\u0184\5\34\17\2\u0180\u0181"+
		"\5\32\16\2\u0181\u0182\5(\25\2\u0182\u0184\3\2\2\2\u0183\u017f\3\2\2\2"+
		"\u0183\u0180\3\2\2\2\u0184\'\3\2\2\2\u0185\u0187\7,\2\2\u0186\u0185\3"+
		"\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7\n\2\2\u018c\u018d\5\34"+
		"\17\2\u018d)\3\2\2\2\u018e\u0191\5,\27\2\u018f\u0191\5.\30\2\u0190\u018e"+
		"\3\2\2\2\u0190\u018f\3\2\2\2\u0191+\3\2\2\2\u0192\u0193\7!\2\2\u0193\u0194"+
		"\5\66\34\2\u0194\u0195\5\34\17\2\u0195-\3\2\2\2\u0196\u0197\7\"\2\2\u0197"+
		"\u019b\5\32\16\2\u0198\u019a\7,\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3"+
		"\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u019f\7!\2\2\u019f\u01a0\5\66\34\2\u01a0/\3\2\2\2"+
		"\u01a1\u01a2\7\7\2\2\u01a2\u01a3\7%\2\2\u01a3\u01a4\5\66\34\2\u01a4\u01a5"+
		"\7&\2\2\u01a5\61\3\2\2\2\u01a6\u01a7\58\35\2\u01a7\u01a8\7#\2\2\u01a8"+
		"\u01a9\5\66\34\2\u01a9\63\3\2\2\2\u01aa\u01b4\5&\24\2\u01ab\u01b4\5\60"+
		"\31\2\u01ac\u01b4\5\"\22\2\u01ad\u01b4\5$\23\2\u01ae\u01b4\5\62\32\2\u01af"+
		"\u01b4\5 \21\2\u01b0\u01b4\5*\26\2\u01b1\u01b4\5L\'\2\u01b2\u01b4\5J&"+
		"\2\u01b3\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3\u01ad"+
		"\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\65\3\2\2\2\u01b5\u01b6\58\35"+
		"\2\u01b6\u01bb\b\34\1\2\u01b7\u01b8\7#\2\2\u01b8\u01b9\5\66\34\2\u01b9"+
		"\u01ba\b\34\1\2\u01ba\u01bc\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01bc\3"+
		"\2\2\2\u01bc\67\3\2\2\2\u01bd\u01be\5:\36\2\u01be\u01c5\b\35\1\2\u01bf"+
		"\u01c0\7\24\2\2\u01c0\u01c1\5:\36\2\u01c1\u01c2\b\35\1\2\u01c2\u01c4\3"+
		"\2\2\2\u01c3\u01bf\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c69\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\5<\37\2"+
		"\u01c9\u01d0\b\36\1\2\u01ca\u01cb\7\23\2\2\u01cb\u01cc\5<\37\2\u01cc\u01cd"+
		"\b\36\1\2\u01cd\u01cf\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf\u01d2\3\2\2\2"+
		"\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1;\3\2\2\2\u01d2\u01d0\3"+
		"\2\2\2\u01d3\u01d4\5> \2\u01d4\u01db\b\37\1\2\u01d5\u01d6\7\17\2\2\u01d6"+
		"\u01d7\5> \2\u01d7\u01d8\b\37\1\2\u01d8\u01da\3\2\2\2\u01d9\u01d5\3\2"+
		"\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"=\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\5@!\2\u01df\u01eb\b \1\2\u01e0"+
		"\u01e1\7\21\2\2\u01e1\u01e5\b \1\2\u01e2\u01e3\7\22\2\2\u01e3\u01e5\b"+
		" \1\2\u01e4\u01e0\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\5@!\2\u01e7\u01e8\b \1\2\u01e8\u01ea\3\2\2\2\u01e9\u01e4\3\2\2"+
		"\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec?"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\5B\"\2\u01ef\u01fb\b!\1\2\u01f0"+
		"\u01f1\7\13\2\2\u01f1\u01f5\b!\1\2\u01f2\u01f3\7\f\2\2\u01f3\u01f5\b!"+
		"\1\2\u01f4\u01f0\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\5B\"\2\u01f7\u01f8\b!\1\2\u01f8\u01fa\3\2\2\2\u01f9\u01f4\3\2\2"+
		"\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcA"+
		"\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\5D#\2\u01ff\u020b\b\"\1\2\u0200"+
		"\u0201\7\r\2\2\u0201\u0205\b\"\1\2\u0202\u0203\7\16\2\2\u0203\u0205\b"+
		"\"\1\2\u0204\u0200\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\5D#\2\u0207\u0208\b\"\1\2\u0208\u020a\3\2\2\2\u0209\u0204\3\2\2"+
		"\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020cC"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7\25\2\2\u020f\u0213\b#\1\2\u0210"+
		"\u0211\7\f\2\2\u0211\u0213\b#\1\2\u0212\u020e\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u0215\5D#\2\u0215\u0216\b#\1\2\u0216\u021b"+
		"\3\2\2\2\u0217\u0218\5F$\2\u0218\u0219\b#\1\2\u0219\u021b\3\2\2\2\u021a"+
		"\u0212\3\2\2\2\u021a\u0217\3\2\2\2\u021bE\3\2\2\2\u021c\u021d\5H%\2\u021d"+
		"\u0229\b$\1\2\u021e\u021f\7%\2\2\u021f\u0220\5\30\r\2\u0220\u0221\b$\1"+
		"\2\u0221\u0222\7&\2\2\u0222\u0228\3\2\2\2\u0223\u0224\7*\2\2\u0224\u0225"+
		"\5R*\2\u0225\u0226\b$\1\2\u0226\u0228\3\2\2\2\u0227\u021e\3\2\2\2\u0227"+
		"\u0223\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u0237\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7\'\2\2\u022d"+
		"\u022e\5\66\34\2\u022e\u022f\b$\1\2\u022f\u0230\7(\2\2\u0230\u0236\3\2"+
		"\2\2\u0231\u0232\7*\2\2\u0232\u0233\5R*\2\u0233\u0234\b$\1\2\u0234\u0236"+
		"\3\2\2\2\u0235\u022c\3\2\2\2\u0235\u0231\3\2\2\2\u0236\u0239\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238G\3\2\2\2\u0239\u0237\3\2\2\2"+
		"\u023a\u023b\5N(\2\u023b\u023c\b%\1\2\u023c\u024c\3\2\2\2\u023d\u023e"+
		"\5R*\2\u023e\u023f\b%\1\2\u023f\u024c\3\2\2\2\u0240\u0241\7%\2\2\u0241"+
		"\u0242\5\30\r\2\u0242\u0243\b%\1\2\u0243\u0244\7&\2\2\u0244\u024c\3\2"+
		"\2\2\u0245\u0246\5J&\2\u0246\u0247\b%\1\2\u0247\u024c\3\2\2\2\u0248\u0249"+
		"\5L\'\2\u0249\u024a\b%\1\2\u024a\u024c\3\2\2\2\u024b\u023a\3\2\2\2\u024b"+
		"\u023d\3\2\2\2\u024b\u0240\3\2\2\2\u024b\u0245\3\2\2\2\u024b\u0248\3\2"+
		"\2\2\u024cI\3\2\2\2\u024d\u024e\7\6\2\2\u024e\u024f\7%\2\2\u024f\u0250"+
		"\5\66\34\2\u0250\u0251\b&\1\2\u0251\u0252\7&\2\2\u0252K\3\2\2\2\u0253"+
		"\u0254\7\b\2\2\u0254\u0255\7%\2\2\u0255\u0256\5\66\34\2\u0256\u0257\7"+
		")\2\2\u0257\u0258\5\66\34\2\u0258\u0259\b\'\1\2\u0259\u025a\7&\2\2\u025a"+
		"M\3\2\2\2\u025b\u025c\5P)\2\u025c\u025d\b(\1\2\u025d\u0261\3\2\2\2\u025e"+
		"\u025f\7-\2\2\u025f\u0261\b(\1\2\u0260\u025b\3\2\2\2\u0260\u025e\3\2\2"+
		"\2\u0261O\3\2\2\2\u0262\u0263\7\26\2\2\u0263\u0267\b)\1\2\u0264\u0265"+
		"\7\27\2\2\u0265\u0267\b)\1\2\u0266\u0262\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"Q\3\2\2\2\u0268\u0269\7.\2\2\u0269\u026a\b*\1\2\u026aS\3\2\2\2\u026b\u0274"+
		"\7\32\2\2\u026c\u0274\7\33\2\2\u026d\u026e\7\34\2\2\u026e\u026f\7$\2\2"+
		"\u026f\u0274\5T+\2\u0270\u0271\7\35\2\2\u0271\u0274\5R*\2\u0272\u0274"+
		"\5V,\2\u0273\u026b\3\2\2\2\u0273\u026c\3\2\2\2\u0273\u026d\3\2\2\2\u0273"+
		"\u0270\3\2\2\2\u0273\u0272\3\2\2\2\u0274U\3\2\2\2\u0275\u0276\7\36\2\2"+
		"\u0276\u0280\7\22\2\2\u0277\u0281\7\5\2\2\u0278\u027d\5T+\2\u0279\u027a"+
		"\7)\2\2\u027a\u027c\5T+\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0277\3\2\2\2\u0280\u0278\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0285\7\20\2\2\u0283\u0286\5T+\2\u0284\u0286\7\5\2\2\u0285\u0283\3\2"+
		"\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7\21\2\2\u0288"+
		"W\3\2\2\2E[cnv\u008e\u0096\u009a\u009e\u00a3\u00b0\u00ba\u00bf\u00c6\u00cb"+
		"\u00cf\u00d7\u00df\u00e6\u00f1\u00ff\u0102\u010f\u0112\u011d\u0122\u0124"+
		"\u012a\u012d\u0135\u013d\u0143\u0147\u014c\u0157\u015d\u0163\u016f\u0171"+
		"\u017a\u0183\u0188\u0190\u019b\u01b3\u01bb\u01c5\u01d0\u01db\u01e4\u01eb"+
		"\u01f4\u01fb\u0204\u020b\u0212\u021a\u0227\u0229\u0235\u0237\u024b\u0260"+
		"\u0266\u0273\u027d\u0280\u0285";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}