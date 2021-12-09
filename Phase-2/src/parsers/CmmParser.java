// Generated from /home/amin/Desktop/compiler/Phase-2/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(135);
				match(BEGIN);
				setState(136);
				((StructDeclarationContext)_localctx).b1 = structBody();
				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).b1.structBodyRet);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					match(NEWLINE);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(143);
				match(END);
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
				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).b2.singleStatementStructBodyRet);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(152);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				match(NEWLINE);
				}
				}
				setState(160); 
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
			setState(163);
			((SingleVarWithGetAndSetContext)_localctx).t = type();
			_localctx.singleVarWithGetAndSetRet.setVarType(((SingleVarWithGetAndSetContext)_localctx).t.typeRet);
			setState(165);
			((SingleVarWithGetAndSetContext)_localctx).id = identifier();
			_localctx.singleVarWithGetAndSetRet.setVarName(((SingleVarWithGetAndSetContext)_localctx).id.identifierRet);
			    _localctx.singleVarWithGetAndSetRet.setLine(((SingleVarWithGetAndSetContext)_localctx).id.line);
			setState(167);
			((SingleVarWithGetAndSetContext)_localctx).fa = functionArgsDec();
			_localctx.singleVarWithGetAndSetRet.setArgs(((SingleVarWithGetAndSetContext)_localctx).fa.functionArgsDecRet);
			setState(169);
			match(BEGIN);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				match(NEWLINE);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(175);
			((SingleVarWithGetAndSetContext)_localctx).sb = setBody();
			_localctx.singleVarWithGetAndSetRet.setSetterBody(((SingleVarWithGetAndSetContext)_localctx).sb.setBodyRet);
			setState(177);
			((SingleVarWithGetAndSetContext)_localctx).gb = getBody();
			_localctx.singleVarWithGetAndSetRet.setGetterBody(((SingleVarWithGetAndSetContext)_localctx).gb.getBodyRet);
			setState(179);
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
		public Statement singleStatementStructBodyRet;
		public VarDecStatementContext vd;
		public SingleVarWithGetAndSetContext sv;
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
			enterOuterAlt(_localctx, 1);
			{
			((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  new BlockStmt();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(182);
				((SingleStatementStructBodyContext)_localctx).vd = varDecStatement();

				        ((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).vd.varDecStatementRet;
				    
				}
				break;
			case 2:
				{
				setState(185);
				((SingleStatementStructBodyContext)_localctx).sv = singleVarWithGetAndSet();

				        ((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).sv.singleVarWithGetAndSetRet;
				    
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

	public static class StructBodyContext extends ParserRuleContext {
		public BlockStmt structBodyRet;
		public SingleStatementStructBodyContext s1;
		public SingleStatementStructBodyContext s2;
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
			((StructBodyContext)_localctx).structBodyRet =  new BlockStmt();
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(191);
						match(NEWLINE);
						}
						}
						setState(194); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(196);
							((StructBodyContext)_localctx).s1 = singleStatementStructBody();

							        _localctx.structBodyRet.addStatement(((StructBodyContext)_localctx).s1.singleStatementStructBodyRet);
							//        _localctx.structBodyRet.setLine(((StructBodyContext)_localctx).s1.singleStatementStructBodyRet.getLine());
							    
							setState(198);
							match(SEMICOLON);
							}
							} 
						}
						setState(204);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(205);
					((StructBodyContext)_localctx).s2 = singleStatementStructBody();

					        _localctx.structBodyRet.addStatement(((StructBodyContext)_localctx).s2.singleStatementStructBodyRet);
					//        _localctx.structBodyRet.setLine(((StructBodyContext)_localctx).s2.singleStatementStructBodyRet.getLine());
					    
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(207);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
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
			setState(214);
			match(GET);
			setState(215);
			((GetBodyContext)_localctx).bd = body();
			((GetBodyContext)_localctx).getBodyRet =  ((GetBodyContext)_localctx).bd.bodyRet;
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(NEWLINE);
				}
				}
				setState(220); 
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
			setState(222);
			match(SET);
			setState(223);
			((SetBodyContext)_localctx).bd = body();
			((SetBodyContext)_localctx).setBodyRet =  ((SetBodyContext)_localctx).bd.bodyRet;
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(NEWLINE);
				}
				}
				setState(228); 
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
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(231);
				((FunctionDeclarationContext)_localctx).t = type();
				_localctx.functionDeclarationRet.setReturnType(((FunctionDeclarationContext)_localctx).t.typeRet);
				}
				break;
			case VOID:
				{
				setState(234);
				match(VOID);
				_localctx.functionDeclarationRet.setReturnType(new VoidType());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(238);
			((FunctionDeclarationContext)_localctx).id = identifier();

			        _localctx.functionDeclarationRet.setFunctionName(((FunctionDeclarationContext)_localctx).id.identifierRet);
			        _localctx.functionDeclarationRet.setLine(((FunctionDeclarationContext)_localctx).id.line);
			    
			setState(240);
			((FunctionDeclarationContext)_localctx).a = functionArgsDec();
			_localctx.functionDeclarationRet.setArgs(((FunctionDeclarationContext)_localctx).a.functionArgsDecRet);
			setState(242);
			((FunctionDeclarationContext)_localctx).b = body();
			_localctx.functionDeclarationRet.setBody(((FunctionDeclarationContext)_localctx).b.bodyRet);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				match(NEWLINE);
				}
				}
				setState(247); 
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
			setState(250);
			match(LPAR);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(251);
				((FunctionArgsDecContext)_localctx).t = type();
				setState(252);
				((FunctionArgsDecContext)_localctx).i = identifier();

				     VariableDeclaration v1 = new VariableDeclaration(((FunctionArgsDecContext)_localctx).i.identifierRet, ((FunctionArgsDecContext)_localctx).t.typeRet);
				     
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(254);
					match(COMMA);
					setState(255);
					((FunctionArgsDecContext)_localctx).t = type();
					setState(256);
					((FunctionArgsDecContext)_localctx).i = identifier();
					VariableDeclaration v2 = new VariableDeclaration(((FunctionArgsDecContext)_localctx).i.identifierRet, ((FunctionArgsDecContext)_localctx).t.typeRet);
					        _localctx.functionArgsDecRet.add(v2);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(266);
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
			    
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(269);
				((FunctionArgumentsContext)_localctx).ex = expression();
				inputs.add(((FunctionArgumentsContext)_localctx).ex.expressionRet);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(271);
					match(COMMA);
					setState(272);
					((FunctionArgumentsContext)_localctx).ex = expression();
					inputs.add(((FunctionArgumentsContext)_localctx).ex.expressionRet);
					}
					}
					setState(279);
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
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(284);
				((BodyContext)_localctx).b = blockStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).b.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(287);
					match(NEWLINE);
					}
					}
					setState(290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(292);
				((BodyContext)_localctx).b1 = singleStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).b1.singleStatementRet;
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(294);
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
		public Statement loopCondBodyRet;
		public BlockStatementContext bs;
		public SingleStatementContext ss;
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
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(299);
				((LoopCondBodyContext)_localctx).bs = blockStatement();

				        ((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).bs.blockStatementRet;
				     
				}
				break;
			case NEWLINE:
				{
				{
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(302);
					match(NEWLINE);
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(307);
				((LoopCondBodyContext)_localctx).ss = singleStatement();

				        ((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).ss.singleStatementRet;
				     
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
			setState(313);
			((BlockStatementContext)_localctx).bg = match(BEGIN);

			    _localctx.blockStatementRet.setLine(((BlockStatementContext)_localctx).bg.getLine());
			    
			setState(334); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(315);
						match(NEWLINE);
						}
						}
						setState(318); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(326);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(320);
							((BlockStatementContext)_localctx).ss = singleStatement();

							     _localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss.singleStatementRet);
							     
							setState(322);
							match(SEMICOLON);
							}
							} 
						}
						setState(328);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(329);
					((BlockStatementContext)_localctx).ss = singleStatement();

					     _localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss.singleStatementRet);
					     
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(331);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(336); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				match(NEWLINE);
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(343);
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
			    
			setState(346);
			((VarDecStatementContext)_localctx).tp = type();
			setState(347);
			((VarDecStatementContext)_localctx).id = identifier();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(348);
				match(ASSIGN);
				setState(349);
				((VarDecStatementContext)_localctx).oe = orExpression();

				        VariableDeclaration vd = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifierRet, ((VarDecStatementContext)_localctx).tp.typeRet);
				        vd.setDefaultValue(((VarDecStatementContext)_localctx).oe.orExpressionRet);
				        vars.add(vd);
				        _localctx.varDecStatementRet.setLine(((VarDecStatementContext)_localctx).id.line);
				    
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
				setState(355);
				((VarDecStatementContext)_localctx).id = identifier();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(356);
					match(ASSIGN);
					setState(357);
					((VarDecStatementContext)_localctx).oe = orExpression();

					        VariableDeclaration vd = new VariableDeclaration(((VarDecStatementContext)_localctx).id.identifierRet, ((VarDecStatementContext)_localctx).tp.typeRet);
					        vd.setDefaultValue(((VarDecStatementContext)_localctx).oe.orExpressionRet);
					        vars.add(vd);
					        _localctx.varDecStatementRet.setLine(((VarDecStatementContext)_localctx).id.line);
					    
					}
				}

				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.varDecStatementRet.setVars(vars);
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
		public FunctionCallStmt functionCallStmtRet;
		public FunctionCall functionCall;
		public OtherExpressionContext oe;
		public Token lp;
		public FunctionArgumentsContext fa;
		public IdentifierContext id;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
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
			setState(369);
			((FunctionCallStmtContext)_localctx).oe = otherExpression();

			        ((FunctionCallStmtContext)_localctx).functionCall =  new FunctionCall(((FunctionCallStmtContext)_localctx).oe.otherExpressionRet);
			     
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(381);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(371);
						((FunctionCallStmtContext)_localctx).lp = match(LPAR);
						setState(372);
						((FunctionCallStmtContext)_localctx).fa = functionArguments();

						        _localctx.functionCall.setArgs(((FunctionCallStmtContext)_localctx).fa.functionArgumentsRet.getInputs());
						        _localctx.functionCall.setLine(((FunctionCallStmtContext)_localctx).lp.getLine());
						     
						setState(374);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{

						        Expression sa = ((FunctionCallStmtContext)_localctx).oe.otherExpressionRet;
						     
						{
						setState(377);
						match(DOT);
						setState(378);
						((FunctionCallStmtContext)_localctx).id = identifier();

						        StructAccess tmp = new StructAccess(sa, ((FunctionCallStmtContext)_localctx).id.identifierRet);
						        sa = tmp;
						     
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(386);
			((FunctionCallStmtContext)_localctx).lp = match(LPAR);
			setState(387);
			((FunctionCallStmtContext)_localctx).fa = functionArguments();

			        _localctx.functionCall.setArgs(((FunctionCallStmtContext)_localctx).fa.functionArgumentsRet.getInputs());
			        _localctx.functionCall.setLine(((FunctionCallStmtContext)_localctx).lp.getLine());
			     
			setState(389);
			match(RPAR);
			}
			((FunctionCallStmtContext)_localctx).functionCallStmtRet =  new FunctionCallStmt(_localctx.functionCall);
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
		public ReturnStmt returnStatementRet;
		public Token ret;
		public ExpressionContext ex;
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
			((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStmt();
			setState(394);
			((ReturnStatementContext)_localctx).ret = match(RETURN);
			_localctx.returnStatementRet.setLine(((ReturnStatementContext)_localctx).ret.getLine());
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(396);
				((ReturnStatementContext)_localctx).ex = expression();
				_localctx.returnStatementRet.setReturnedExpr(((ReturnStatementContext)_localctx).ex.expressionRet);
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
		public Token iftemp;
		public ExpressionContext e;
		public LoopCondBodyContext lc;
		public BodyContext bd;
		public ElseStatementContext es;
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
			setState(401);
			((IfStatementContext)_localctx).iftemp = match(IF);
			setState(402);
			((IfStatementContext)_localctx).e = expression();
			((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).e.expressionRet);
			     {_localctx.ifStatementRet.setLine(((IfStatementContext)_localctx).iftemp.getLine());}
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(404);
				((IfStatementContext)_localctx).lc = loopCondBody();

				        _localctx.ifStatementRet.setThenBody(((IfStatementContext)_localctx).lc.loopCondBodyRet);
				    
				}
				break;
			case 2:
				{
				setState(407);
				((IfStatementContext)_localctx).bd = body();
				setState(408);
				((IfStatementContext)_localctx).es = elseStatement();

				        _localctx.ifStatementRet.setThenBody(((IfStatementContext)_localctx).bd.bodyRet);
				        _localctx.ifStatementRet.setElseBody(((IfStatementContext)_localctx).es.elseStatementRet);
				    
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
		public Statement elseStatementRet;
		public LoopCondBodyContext lc;
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
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(413);
				match(NEWLINE);
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(ELSE);
			setState(420);
			((ElseStatementContext)_localctx).lc = loopCondBody();
			((ElseStatementContext)_localctx).elseStatementRet =  ((ElseStatementContext)_localctx).lc.loopCondBodyRet;
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
		public LoopStmt loopStatementRet;
		public WhileLoopStatementContext wl;
		public DoWhileLoopStatementContext dwl;
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
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				((LoopStatementContext)_localctx).wl = whileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).wl.whileLoopStatementRet;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				((LoopStatementContext)_localctx).dwl = doWhileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).dwl.doWhileLoopStatementRet;
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
		public LoopStmt whileLoopStatementRet;
		public Token w;
		public ExpressionContext ex;
		public LoopCondBodyContext lc;
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
			((WhileLoopStatementContext)_localctx).whileLoopStatementRet =  new LoopStmt();
			setState(432);
			((WhileLoopStatementContext)_localctx).w = match(WHILE);
			setState(433);
			((WhileLoopStatementContext)_localctx).ex = expression();
			setState(434);
			((WhileLoopStatementContext)_localctx).lc = loopCondBody();

			        _localctx.whileLoopStatementRet.setCondition(((WhileLoopStatementContext)_localctx).ex.expressionRet);
			        _localctx.whileLoopStatementRet.setBody(((WhileLoopStatementContext)_localctx).lc.loopCondBodyRet);
			        _localctx.whileLoopStatementRet.setLine(((WhileLoopStatementContext)_localctx).w.getLine());
			    
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
		public LoopStmt doWhileLoopStatementRet;
		public Token d;
		public BodyContext bd;
		public ExpressionContext ex;
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
			((DoWhileLoopStatementContext)_localctx).doWhileLoopStatementRet =  new LoopStmt();
			setState(438);
			((DoWhileLoopStatementContext)_localctx).d = match(DO);
			setState(439);
			((DoWhileLoopStatementContext)_localctx).bd = body();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(440);
				match(NEWLINE);
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(WHILE);
			setState(447);
			((DoWhileLoopStatementContext)_localctx).ex = expression();

			        _localctx.doWhileLoopStatementRet.setCondition(((DoWhileLoopStatementContext)_localctx).ex.expressionRet);
			        _localctx.doWhileLoopStatementRet.setBody(((DoWhileLoopStatementContext)_localctx).bd.bodyRet);
			        _localctx.doWhileLoopStatementRet.setLine(((DoWhileLoopStatementContext)_localctx).d.getLine());
			    
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
		public DisplayStmt displayStatementRet;
		public Token dis;
		public ExpressionContext ex;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(450);
			((DisplayStatementContext)_localctx).dis = match(DISPLAY);
			setState(451);
			match(LPAR);
			setState(452);
			((DisplayStatementContext)_localctx).ex = expression();

			    ((DisplayStatementContext)_localctx).displayStatementRet =  new DisplayStmt(((DisplayStatementContext)_localctx).ex.expressionRet);
			    _localctx.displayStatementRet.setLine(((DisplayStatementContext)_localctx).dis.getLine());
			    
			setState(454);
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
		public AssignmentStmt assignmentStatementRet;
		public OrExpressionContext lv;
		public Token as;
		public ExpressionContext rv;
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
			setState(456);
			((AssignmentStatementContext)_localctx).lv = orExpression();
			setState(457);
			((AssignmentStatementContext)_localctx).as = match(ASSIGN);
			setState(458);
			((AssignmentStatementContext)_localctx).rv = expression();

			        ((AssignmentStatementContext)_localctx).assignmentStatementRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).lv.orExpressionRet, ((AssignmentStatementContext)_localctx).rv.expressionRet);
			        _localctx.assignmentStatementRet.setLine(((AssignmentStatementContext)_localctx).as.getLine());
			    
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
		public IfStatementContext is;
		public DisplayStatementContext ds;
		public FunctionCallStmtContext fc;
		public ReturnStatementContext rs;
		public AssignmentStatementContext as;
		public VarDecStatementContext vd;
		public LoopStatementContext ls;
		public AppendContext ap;
		public SizeContext sz;
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
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				((SingleStatementContext)_localctx).is = ifStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).is.ifStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				((SingleStatementContext)_localctx).ds = displayStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).ds.displayStatementRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				((SingleStatementContext)_localctx).fc = functionCallStmt();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).fc.functionCallStmtRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				((SingleStatementContext)_localctx).rs = returnStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).rs.returnStatementRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				((SingleStatementContext)_localctx).as = assignmentStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).as.assignmentStatementRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(476);
				((SingleStatementContext)_localctx).vd = varDecStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).vd.varDecStatementRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(479);
				((SingleStatementContext)_localctx).ls = loopStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).ls.loopStatementRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(482);
				((SingleStatementContext)_localctx).ap = append();
				((SingleStatementContext)_localctx).singleStatementRet =  new ListAppendStmt(((SingleStatementContext)_localctx).ap.appendRet);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(485);
				((SingleStatementContext)_localctx).sz = size();
				((SingleStatementContext)_localctx).singleStatementRet =  new ListSizeStmt(((SingleStatementContext)_localctx).sz.sizeRet);
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
			setState(490);
			((ExpressionContext)_localctx).oe = orExpression();
			((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).oe.orExpressionRet;
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(492);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(493);
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
			setState(498);
			((OrExpressionContext)_localctx).ael = andExpression();
			 ((OrExpressionContext)_localctx).orExpressionRet =  ((OrExpressionContext)_localctx).ael.andExpressionRet;
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(500);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(501);
				((OrExpressionContext)_localctx).aer = andExpression();

				    BinaryOperator bo = BinaryOperator.or;
				    ((OrExpressionContext)_localctx).orExpressionRet =  new BinaryExpression(((OrExpressionContext)_localctx).ael.andExpressionRet, ((OrExpressionContext)_localctx).aer.andExpressionRet, bo);
				    _localctx.orExpressionRet.setLine(((OrExpressionContext)_localctx).op.getLine());

				}
				}
				setState(508);
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
			setState(509);
			((AndExpressionContext)_localctx).eql = equalityExpression();
			((AndExpressionContext)_localctx).andExpressionRet =  ((AndExpressionContext)_localctx).eql.equalityExpressionRet;
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(511);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(512);
				((AndExpressionContext)_localctx).eqr = equalityExpression();
				   
				    BinaryOperator bo = BinaryOperator.and;
				    ((AndExpressionContext)_localctx).andExpressionRet =  new BinaryExpression(((AndExpressionContext)_localctx).eql.equalityExpressionRet, ((AndExpressionContext)_localctx).eqr.equalityExpressionRet, bo);
				    _localctx.andExpressionRet.setLine(((AndExpressionContext)_localctx).op.getLine());

				}
				}
				setState(519);
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
			setState(520);
			((EqualityExpressionContext)_localctx).rel = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExpressionRet =  ((EqualityExpressionContext)_localctx).rel.relationalExpressionRet;
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(522);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(523);
				((EqualityExpressionContext)_localctx).rer = relationalExpression();

				    BinaryOperator bo = BinaryOperator.eq;
				    ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(((EqualityExpressionContext)_localctx).rel.relationalExpressionRet, ((EqualityExpressionContext)_localctx).rer.relationalExpressionRet, bo);
				    _localctx.equalityExpressionRet.setLine(((EqualityExpressionContext)_localctx).op.getLine());

				}
				}
				setState(530);
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
			setState(531);
			((RelationalExpressionContext)_localctx).ael = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExpressionRet =  ((RelationalExpressionContext)_localctx).ael.additiveExpressionRet;
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(533);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					((RelationalExpressionContext)_localctx).bo =  BinaryOperator.gt;
					}
					break;
				case LESS_THAN:
					{
					setState(535);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					((RelationalExpressionContext)_localctx).bo =  BinaryOperator.lt;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(539);
				((RelationalExpressionContext)_localctx).aer = additiveExpression();

				    ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(((RelationalExpressionContext)_localctx).ael.additiveExpressionRet, ((RelationalExpressionContext)_localctx).aer.additiveExpressionRet, _localctx.bo);
				    _localctx.relationalExpressionRet.setLine(((RelationalExpressionContext)_localctx).op.getLine());

				}
				}
				setState(546);
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
			setState(547);
			((AdditiveExpressionContext)_localctx).mpl = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExpressionRet =  ((AdditiveExpressionContext)_localctx).mpl.multiplicativeExpressionRet;
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(553);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(549);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					((AdditiveExpressionContext)_localctx).bo =  BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(551);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					((AdditiveExpressionContext)_localctx).bo =  BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(555);
				((AdditiveExpressionContext)_localctx).mpr = multiplicativeExpression();

				    ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(((AdditiveExpressionContext)_localctx).mpl.multiplicativeExpressionRet, ((AdditiveExpressionContext)_localctx).mpr.multiplicativeExpressionRet, _localctx.bo);
				    _localctx.additiveExpressionRet.setLine(((AdditiveExpressionContext)_localctx).op.getLine());

				}
				}
				setState(562);
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
			setState(563);
			((MultiplicativeExpressionContext)_localctx).pul = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  ((MultiplicativeExpressionContext)_localctx).pul.preUnaryExpressionRet;
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(569);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(565);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					((MultiplicativeExpressionContext)_localctx).bo =  BinaryOperator.mult;
					}
					break;
				case DIVIDE:
					{
					setState(567);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					((MultiplicativeExpressionContext)_localctx).bo =  BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(571);
				((MultiplicativeExpressionContext)_localctx).pur = preUnaryExpression();

				    ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).pul.preUnaryExpressionRet, ((MultiplicativeExpressionContext)_localctx).pur.preUnaryExpressionRet, _localctx.bo);
				    _localctx.multiplicativeExpressionRet.setLine(((MultiplicativeExpressionContext)_localctx).op.getLine());

				}
				}
				setState(578);
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
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(583);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(579);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					((PreUnaryExpressionContext)_localctx).bo =  UnaryOperator.not; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				case MINUS:
					{
					setState(581);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					((PreUnaryExpressionContext)_localctx).bo =  UnaryOperator.minus; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(585);
				((PreUnaryExpressionContext)_localctx).pue = preUnaryExpression();

				        System.out.println("one");
				        System.out.println(_localctx.bo == null);
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
				setState(588);
				((PreUnaryExpressionContext)_localctx).ae = accessExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  ((PreUnaryExpressionContext)_localctx).ae.accessExpressionRet;
				    
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
			setState(593);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			((AccessExpressionContext)_localctx).accessExpressionRet =  ((AccessExpressionContext)_localctx).oe.otherExpressionRet;
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(604);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(595);
						((AccessExpressionContext)_localctx).lp = match(LPAR);
						setState(596);
						((AccessExpressionContext)_localctx).fa = functionArguments();

						        ((AccessExpressionContext)_localctx).accessExpressionRet =  new FunctionCall(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).fa.functionArgumentsRet.getInputs());
						        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lp.getLine());
						    
						setState(598);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(600);
						((AccessExpressionContext)_localctx).d = match(DOT);
						setState(601);
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
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(618);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(609);
					((AccessExpressionContext)_localctx).lb = match(LBRACK);
					setState(610);
					((AccessExpressionContext)_localctx).ex = expression();

					        ((AccessExpressionContext)_localctx).accessExpressionRet =  new ListAccessByIndex(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).ex.expressionRet);
					        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lb.getLine());
					    
					setState(612);
					match(RBRACK);
					}
					}
					break;
				case DOT:
					{
					{
					setState(614);
					((AccessExpressionContext)_localctx).d = match(DOT);
					setState(615);
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
				setState(622);
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
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				((OtherExpressionContext)_localctx).vl = value();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).vl.valueRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				((OtherExpressionContext)_localctx).id = identifier();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).id.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				((OtherExpressionContext)_localctx).lp = match(LPAR);
				{
				setState(630);
				((OtherExpressionContext)_localctx).fa = functionArguments();
				}
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).fa.functionArgumentsRet;
				setState(632);
				match(RPAR);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				((OtherExpressionContext)_localctx).sz = size();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).sz.sizeRet;
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(637);
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
		public ListSize sizeRet;
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
			setState(642);
			((SizeContext)_localctx).sz = match(SIZE);
			setState(643);
			match(LPAR);
			setState(644);
			((SizeContext)_localctx).ex = expression();

			        ((SizeContext)_localctx).sizeRet =  new ListSize(((SizeContext)_localctx).ex.expressionRet);
			        _localctx.sizeRet.setLine(((SizeContext)_localctx).sz.getLine());
			    
			setState(646);
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
		public ListAppend appendRet;
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
			setState(648);
			((AppendContext)_localctx).ap = match(APPEND);
			setState(649);
			match(LPAR);
			setState(650);
			((AppendContext)_localctx).ex1 = expression();
			setState(651);
			match(COMMA);
			setState(652);
			((AppendContext)_localctx).ex2 = expression();

			        ((AppendContext)_localctx).appendRet =  new ListAppend(((AppendContext)_localctx).ex1.expressionRet, ((AppendContext)_localctx).ex2.expressionRet);
			        _localctx.appendRet.setLine(((AppendContext)_localctx).ap.getLine());
			    
			setState(654);
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
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				((ValueContext)_localctx).bv = boolValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).bv.boolValueRet;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
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
		public Token tr;
		public Token fa;
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
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				((BoolValueContext)_localctx).tr = match(TRUE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true); _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).tr.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				((BoolValueContext)_localctx).fa = match(FALSE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false); _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).fa.getLine());
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
			setState(669);
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
		public TypeContext t;
		public IdentifierContext i;
		public FptrTypeContext ft;
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
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(BOOL);
				((TypeContext)_localctx).typeRet =  new BoolType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				match(LIST);
				setState(677);
				match(SHARP);
				setState(678);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).typeRet =  new ListType(((TypeContext)_localctx).t.typeRet);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(681);
				match(STRUCT);
				setState(682);
				((TypeContext)_localctx).i = identifier();
				((TypeContext)_localctx).typeRet =  new StructType(((TypeContext)_localctx).i.identifierRet);
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(685);
				((TypeContext)_localctx).ft = fptrType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).ft.fptrTypeRet;
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
		public FptrType fptrTypeRet;
		public TypeContext t;
		public TypeContext tp;
		public TypeContext tpp;
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
			((FptrTypeContext)_localctx).fptrTypeRet =  new FptrType(new ArrayList<Type>(), new VoidType());
			setState(691);
			match(FPTR);
			setState(692);
			match(LESS_THAN);
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(693);
				match(VOID);
				_localctx.fptrTypeRet.addArgType(new VoidType());
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				{
				setState(695);
				((FptrTypeContext)_localctx).t = type();
				_localctx.fptrTypeRet.addArgType(((FptrTypeContext)_localctx).t.typeRet);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(697);
					match(COMMA);
					setState(698);
					((FptrTypeContext)_localctx).tp = type();
					_localctx.fptrTypeRet.addArgType(((FptrTypeContext)_localctx).tp.typeRet);
					}
					}
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(708);
			match(ARROW);
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(709);
				((FptrTypeContext)_localctx).tpp = type();
				_localctx.fptrTypeRet.setReturnType(((FptrTypeContext)_localctx).tpp.typeRet);
				}
				break;
			case VOID:
				{
				setState(712);
				match(VOID);
				_localctx.fptrTypeRet.addArgType(new VoidType());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(716);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u02d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u008e\n\5\r\5\16\5\u008f\3\5\3\5\3\5\6\5"+
		"\u0095\n\5\r\5\16\5\u0096\3\5\3\5\3\5\5\5\u009c\n\5\5\5\u009e\n\5\3\5"+
		"\6\5\u00a1\n\5\r\5\16\5\u00a2\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6"+
		"\u00ae\n\6\r\6\16\6\u00af\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00bf\n\7\3\b\3\b\6\b\u00c3\n\b\r\b\16\b\u00c4\3\b\3\b\3"+
		"\b\3\b\7\b\u00cb\n\b\f\b\16\b\u00ce\13\b\3\b\3\b\3\b\5\b\u00d3\n\b\6\b"+
		"\u00d5\n\b\r\b\16\b\u00d6\3\t\3\t\3\t\3\t\6\t\u00dd\n\t\r\t\16\t\u00de"+
		"\3\n\3\n\3\n\3\n\6\n\u00e5\n\n\r\n\16\n\u00e6\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00ef\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00f8\n"+
		"\13\r\13\16\13\u00f9\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0106"+
		"\n\f\f\f\16\f\u0109\13\f\5\f\u010b\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\5\r\u011b\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\6\16\u0123\n\16\r\16\16\16\u0124\3\16\3\16\3\16\5\16\u012a"+
		"\n\16\5\16\u012c\n\16\3\17\3\17\3\17\3\17\6\17\u0132\n\17\r\17\16\17\u0133"+
		"\3\17\3\17\3\17\5\17\u0139\n\17\3\20\3\20\3\20\3\20\6\20\u013f\n\20\r"+
		"\20\16\20\u0140\3\20\3\20\3\20\3\20\7\20\u0147\n\20\f\20\16\20\u014a\13"+
		"\20\3\20\3\20\3\20\5\20\u014f\n\20\6\20\u0151\n\20\r\20\16\20\u0152\3"+
		"\20\6\20\u0156\n\20\r\20\16\20\u0157\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0163\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u016b\n"+
		"\21\7\21\u016d\n\21\f\21\16\21\u0170\13\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0180\n\22\f\22\16\22"+
		"\u0183\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0192\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u019e\n\24\3\25\7\25\u01a1\n\25\f\25\16\25\u01a4\13\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01b0\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u01bc\n\30\f\30\16\30\u01bf"+
		"\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u01eb\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01f3\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\7\35\u01fb\n\35\f\35\16\35\u01fe\13\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\7\36\u0206\n\36\f\36\16\36\u0209\13\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\7\37\u0211\n\37\f\37\16\37\u0214\13\37\3"+
		" \3 \3 \3 \3 \3 \5 \u021c\n \3 \3 \3 \7 \u0221\n \f \16 \u0224\13 \3!"+
		"\3!\3!\3!\3!\3!\5!\u022c\n!\3!\3!\3!\7!\u0231\n!\f!\16!\u0234\13!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u023c\n\"\3\"\3\"\3\"\7\"\u0241\n\"\f\"\16\""+
		"\u0244\13\"\3#\3#\3#\3#\5#\u024a\n#\3#\3#\3#\3#\3#\3#\5#\u0252\n#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u025f\n$\f$\16$\u0262\13$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\7$\u026d\n$\f$\16$\u0270\13$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0283\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0298\n(\3)\3)\3)\3)\5)\u029e\n)"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02b3\n+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u02c0\n,\f,\16,\u02c3\13,\5,\u02c5"+
		"\n,\3,\3,\3,\3,\3,\3,\5,\u02cd\n,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\2\u02f5\2[\3"+
		"\2\2\2\4h\3\2\2\2\6|\3\2\2\2\b\u0084\3\2\2\2\n\u00a4\3\2\2\2\f\u00b7\3"+
		"\2\2\2\16\u00c0\3\2\2\2\20\u00d8\3\2\2\2\22\u00e0\3\2\2\2\24\u00e8\3\2"+
		"\2\2\26\u00fb\3\2\2\2\30\u010e\3\2\2\2\32\u012b\3\2\2\2\34\u0138\3\2\2"+
		"\2\36\u013a\3\2\2\2 \u015b\3\2\2\2\"\u0173\3\2\2\2$\u018b\3\2\2\2&\u0193"+
		"\3\2\2\2(\u01a2\3\2\2\2*\u01af\3\2\2\2,\u01b1\3\2\2\2.\u01b7\3\2\2\2\60"+
		"\u01c4\3\2\2\2\62\u01ca\3\2\2\2\64\u01ea\3\2\2\2\66\u01ec\3\2\2\28\u01f4"+
		"\3\2\2\2:\u01ff\3\2\2\2<\u020a\3\2\2\2>\u0215\3\2\2\2@\u0225\3\2\2\2B"+
		"\u0235\3\2\2\2D\u0251\3\2\2\2F\u0253\3\2\2\2H\u0282\3\2\2\2J\u0284\3\2"+
		"\2\2L\u028a\3\2\2\2N\u0297\3\2\2\2P\u029d\3\2\2\2R\u029f\3\2\2\2T\u02b2"+
		"\3\2\2\2V\u02b4\3\2\2\2XZ\7,\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\^\3\2\2\2][\3\2\2\2^_\5\4\3\2_c\b\2\1\2`b\7,\2\2a`\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hn\b"+
		"\3\1\2ij\5\b\5\2jk\b\3\1\2km\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2ov\3\2\2\2pn\3\2\2\2qr\5\24\13\2rs\b\3\1\2su\3\2\2\2tq\3\2\2\2u"+
		"x\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\5\6\4\2z{\b\3\1\2"+
		"{\5\3\2\2\2|}\b\4\1\2}~\7\3\2\2~\177\b\4\1\2\177\u0080\7%\2\2\u0080\u0081"+
		"\7&\2\2\u0081\u0082\5\32\16\2\u0082\u0083\b\4\1\2\u0083\7\3\2\2\2\u0084"+
		"\u0085\b\5\1\2\u0085\u0086\7\35\2\2\u0086\u0087\b\5\1\2\u0087\u0088\5"+
		"R*\2\u0088\u009d\b\5\1\2\u0089\u008a\7\30\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\u008d\b\5\1\2\u008c\u008e\7,\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\31\2\2\u0092\u009e\3\2\2\2\u0093\u0095\7,\2\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\5\f\7\2\u0099\u009b\b\5\1\2\u009a\u009c\7+"+
		"\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0089\3\2\2\2\u009d\u0094\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\7,"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\b\6\1\2\u00a5\u00a6\5T+\2\u00a6"+
		"\u00a7\b\6\1\2\u00a7\u00a8\5R*\2\u00a8\u00a9\b\6\1\2\u00a9\u00aa\5\26"+
		"\f\2\u00aa\u00ab\b\6\1\2\u00ab\u00ad\7\30\2\2\u00ac\u00ae\7,\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\b\6\1\2\u00b3"+
		"\u00b4\5\20\t\2\u00b4\u00b5\b\6\1\2\u00b5\u00b6\7\31\2\2\u00b6\13\3\2"+
		"\2\2\u00b7\u00be\b\7\1\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\b\7\1\2\u00ba"+
		"\u00bf\3\2\2\2\u00bb\u00bc\5\n\6\2\u00bc\u00bd\b\7\1\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\r\3\2\2\2\u00c0\u00d4"+
		"\b\b\1\2\u00c1\u00c3\7,\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\5\f"+
		"\7\2\u00c7\u00c8\b\b\1\2\u00c8\u00c9\7+\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\f\7\2\u00d0"+
		"\u00d2\b\b\1\2\u00d1\u00d3\7+\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\17\3\2\2\2\u00d8\u00d9\7\37\2"+
		"\2\u00d9\u00da\5\32\16\2\u00da\u00dc\b\t\1\2\u00db\u00dd\7,\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\21\3\2\2\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e4"+
		"\b\n\1\2\u00e3\u00e5\7,\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\23\3\2\2\2\u00e8\u00ee\b\13\1"+
		"\2\u00e9\u00ea\5T+\2\u00ea\u00eb\b\13\1\2\u00eb\u00ef\3\2\2\2\u00ec\u00ed"+
		"\7\5\2\2\u00ed\u00ef\b\13\1\2\u00ee\u00e9\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5R*\2\u00f1\u00f2\b\13\1\2\u00f2\u00f3"+
		"\5\26\f\2\u00f3\u00f4\b\13\1\2\u00f4\u00f5\5\32\16\2\u00f5\u00f7\b\13"+
		"\1\2\u00f6\u00f8\7,\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\25\3\2\2\2\u00fb\u00fc\b\f\1"+
		"\2\u00fc\u010a\7%\2\2\u00fd\u00fe\5T+\2\u00fe\u00ff\5R*\2\u00ff\u0107"+
		"\b\f\1\2\u0100\u0101\7)\2\2\u0101\u0102\5T+\2\u0102\u0103\5R*\2\u0103"+
		"\u0104\b\f\1\2\u0104\u0106\3\2\2\2\u0105\u0100\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u00fd\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\7&\2\2\u010d\27\3\2\2\2\u010e\u011a\b\r\1\2\u010f\u0110"+
		"\5\66\34\2\u0110\u0117\b\r\1\2\u0111\u0112\7)\2\2\u0112\u0113\5\66\34"+
		"\2\u0113\u0114\b\r\1\2\u0114\u0116\3\2\2\2\u0115\u0111\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\b\r\1\2\u011d\31\3\2\2\2\u011e\u011f\5\36\20\2\u011f"+
		"\u0120\b\16\1\2\u0120\u012c\3\2\2\2\u0121\u0123\7,\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\5\64\33\2\u0127\u0129\b\16\1\2\u0128\u012a"+
		"\7+\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u011e\3\2\2\2\u012b\u0122\3\2\2\2\u012c\33\3\2\2\2\u012d\u012e\5\36\20"+
		"\2\u012e\u012f\b\17\1\2\u012f\u0139\3\2\2\2\u0130\u0132\7,\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\5\64\33\2\u0136\u0137\b\17\1\2\u0137\u0139"+
		"\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u0131\3\2\2\2\u0139\35\3\2\2\2\u013a"+
		"\u013b\b\20\1\2\u013b\u013c\7\30\2\2\u013c\u0150\b\20\1\2\u013d\u013f"+
		"\7,\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0148\3\2\2\2\u0142\u0143\5\64\33\2\u0143\u0144\b"+
		"\20\1\2\u0144\u0145\7+\2\2\u0145\u0147\3\2\2\2\u0146\u0142\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u014c\5\64\33\2\u014c\u014e\b\20\1\2\u014d"+
		"\u014f\7+\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u013e\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\7,\2\2\u0155\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\7\31\2\2\u015a\37\3\2\2\2\u015b\u015c\b\21"+
		"\1\2\u015c\u015d\5T+\2\u015d\u0162\5R*\2\u015e\u015f\7#\2\2\u015f\u0160"+
		"\58\35\2\u0160\u0161\b\21\1\2\u0161\u0163\3\2\2\2\u0162\u015e\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u016e\3\2\2\2\u0164\u0165\7)\2\2\u0165\u016a"+
		"\5R*\2\u0166\u0167\7#\2\2\u0167\u0168\58\35\2\u0168\u0169\b\21\1\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u0164\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\b\21"+
		"\1\2\u0172!\3\2\2\2\u0173\u0174\5H%\2\u0174\u0181\b\22\1\2\u0175\u0176"+
		"\7%\2\2\u0176\u0177\5\30\r\2\u0177\u0178\b\22\1\2\u0178\u0179\7&\2\2\u0179"+
		"\u0180\3\2\2\2\u017a\u017b\b\22\1\2\u017b\u017c\7*\2\2\u017c\u017d\5R"+
		"*\2\u017d\u017e\b\22\1\2\u017e\u0180\3\2\2\2\u017f\u0175\3\2\2\2\u017f"+
		"\u017a\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7%\2\2\u0185"+
		"\u0186\5\30\r\2\u0186\u0187\b\22\1\2\u0187\u0188\7&\2\2\u0188\u0189\3"+
		"\2\2\2\u0189\u018a\b\22\1\2\u018a#\3\2\2\2\u018b\u018c\b\23\1\2\u018c"+
		"\u018d\7\4\2\2\u018d\u0191\b\23\1\2\u018e\u018f\5\66\34\2\u018f\u0190"+
		"\b\23\1\2\u0190\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u0192\3\2\2\2"+
		"\u0192%\3\2\2\2\u0193\u0194\7\t\2\2\u0194\u0195\5\66\34\2\u0195\u019d"+
		"\b\24\1\2\u0196\u0197\5\34\17\2\u0197\u0198\b\24\1\2\u0198\u019e\3\2\2"+
		"\2\u0199\u019a\5\32\16\2\u019a\u019b\5(\25\2\u019b\u019c\b\24\1\2\u019c"+
		"\u019e\3\2\2\2\u019d\u0196\3\2\2\2\u019d\u0199\3\2\2\2\u019e\'\3\2\2\2"+
		"\u019f\u01a1\7,\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a6\7\n\2\2\u01a6\u01a7\5\34\17\2\u01a7\u01a8\b\25\1\2\u01a8)\3\2\2"+
		"\2\u01a9\u01aa\5,\27\2\u01aa\u01ab\b\26\1\2\u01ab\u01b0\3\2\2\2\u01ac"+
		"\u01ad\5.\30\2\u01ad\u01ae\b\26\1\2\u01ae\u01b0\3\2\2\2\u01af\u01a9\3"+
		"\2\2\2\u01af\u01ac\3\2\2\2\u01b0+\3\2\2\2\u01b1\u01b2\b\27\1\2\u01b2\u01b3"+
		"\7!\2\2\u01b3\u01b4\5\66\34\2\u01b4\u01b5\5\34\17\2\u01b5\u01b6\b\27\1"+
		"\2\u01b6-\3\2\2\2\u01b7\u01b8\b\30\1\2\u01b8\u01b9\7\"\2\2\u01b9\u01bd"+
		"\5\32\16\2\u01ba\u01bc\7,\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2"+
		"\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01c0\u01c1\7!\2\2\u01c1\u01c2\5\66\34\2\u01c2\u01c3\b\30\1\2"+
		"\u01c3/\3\2\2\2\u01c4\u01c5\7\7\2\2\u01c5\u01c6\7%\2\2\u01c6\u01c7\5\66"+
		"\34\2\u01c7\u01c8\b\31\1\2\u01c8\u01c9\7&\2\2\u01c9\61\3\2\2\2\u01ca\u01cb"+
		"\58\35\2\u01cb\u01cc\7#\2\2\u01cc\u01cd\5\66\34\2\u01cd\u01ce\b\32\1\2"+
		"\u01ce\63\3\2\2\2\u01cf\u01d0\5&\24\2\u01d0\u01d1\b\33\1\2\u01d1\u01eb"+
		"\3\2\2\2\u01d2\u01d3\5\60\31\2\u01d3\u01d4\b\33\1\2\u01d4\u01eb\3\2\2"+
		"\2\u01d5\u01d6\5\"\22\2\u01d6\u01d7\b\33\1\2\u01d7\u01eb\3\2\2\2\u01d8"+
		"\u01d9\5$\23\2\u01d9\u01da\b\33\1\2\u01da\u01eb\3\2\2\2\u01db\u01dc\5"+
		"\62\32\2\u01dc\u01dd\b\33\1\2\u01dd\u01eb\3\2\2\2\u01de\u01df\5 \21\2"+
		"\u01df\u01e0\b\33\1\2\u01e0\u01eb\3\2\2\2\u01e1\u01e2\5*\26\2\u01e2\u01e3"+
		"\b\33\1\2\u01e3\u01eb\3\2\2\2\u01e4\u01e5\5L\'\2\u01e5\u01e6\b\33\1\2"+
		"\u01e6\u01eb\3\2\2\2\u01e7\u01e8\5J&\2\u01e8\u01e9\b\33\1\2\u01e9\u01eb"+
		"\3\2\2\2\u01ea\u01cf\3\2\2\2\u01ea\u01d2\3\2\2\2\u01ea\u01d5\3\2\2\2\u01ea"+
		"\u01d8\3\2\2\2\u01ea\u01db\3\2\2\2\u01ea\u01de\3\2\2\2\u01ea\u01e1\3\2"+
		"\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e7\3\2\2\2\u01eb\65\3\2\2\2\u01ec\u01ed"+
		"\58\35\2\u01ed\u01f2\b\34\1\2\u01ee\u01ef\7#\2\2\u01ef\u01f0\5\66\34\2"+
		"\u01f0\u01f1\b\34\1\2\u01f1\u01f3\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\67\3\2\2\2\u01f4\u01f5\5:\36\2\u01f5\u01fc\b\35\1\2\u01f6"+
		"\u01f7\7\24\2\2\u01f7\u01f8\5:\36\2\u01f8\u01f9\b\35\1\2\u01f9\u01fb\3"+
		"\2\2\2\u01fa\u01f6\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd9\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\5<\37\2"+
		"\u0200\u0207\b\36\1\2\u0201\u0202\7\23\2\2\u0202\u0203\5<\37\2\u0203\u0204"+
		"\b\36\1\2\u0204\u0206\3\2\2\2\u0205\u0201\3\2\2\2\u0206\u0209\3\2\2\2"+
		"\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208;\3\2\2\2\u0209\u0207\3"+
		"\2\2\2\u020a\u020b\5> \2\u020b\u0212\b\37\1\2\u020c\u020d\7\17\2\2\u020d"+
		"\u020e\5> \2\u020e\u020f\b\37\1\2\u020f\u0211\3\2\2\2\u0210\u020c\3\2"+
		"\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"=\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\5@!\2\u0216\u0222\b \1\2\u0217"+
		"\u0218\7\21\2\2\u0218\u021c\b \1\2\u0219\u021a\7\22\2\2\u021a\u021c\b"+
		" \1\2\u021b\u0217\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\5@!\2\u021e\u021f\b \1\2\u021f\u0221\3\2\2\2\u0220\u021b\3\2\2"+
		"\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223?"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\5B\"\2\u0226\u0232\b!\1\2\u0227"+
		"\u0228\7\13\2\2\u0228\u022c\b!\1\2\u0229\u022a\7\f\2\2\u022a\u022c\b!"+
		"\1\2\u022b\u0227\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\5B\"\2\u022e\u022f\b!\1\2\u022f\u0231\3\2\2\2\u0230\u022b\3\2\2"+
		"\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233A"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\5D#\2\u0236\u0242\b\"\1\2\u0237"+
		"\u0238\7\r\2\2\u0238\u023c\b\"\1\2\u0239\u023a\7\16\2\2\u023a\u023c\b"+
		"\"\1\2\u023b\u0237\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\5D#\2\u023e\u023f\b\"\1\2\u023f\u0241\3\2\2\2\u0240\u023b\3\2\2"+
		"\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243C"+
		"\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7\25\2\2\u0246\u024a\b#\1\2\u0247"+
		"\u0248\7\f\2\2\u0248\u024a\b#\1\2\u0249\u0245\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024b\u024c\5D#\2\u024c\u024d\b#\1\2\u024d\u0252"+
		"\3\2\2\2\u024e\u024f\5F$\2\u024f\u0250\b#\1\2\u0250\u0252\3\2\2\2\u0251"+
		"\u0249\3\2\2\2\u0251\u024e\3\2\2\2\u0252E\3\2\2\2\u0253\u0254\5H%\2\u0254"+
		"\u0260\b$\1\2\u0255\u0256\7%\2\2\u0256\u0257\5\30\r\2\u0257\u0258\b$\1"+
		"\2\u0258\u0259\7&\2\2\u0259\u025f\3\2\2\2\u025a\u025b\7*\2\2\u025b\u025c"+
		"\5R*\2\u025c\u025d\b$\1\2\u025d\u025f\3\2\2\2\u025e\u0255\3\2\2\2\u025e"+
		"\u025a\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u026e\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7\'\2\2\u0264"+
		"\u0265\5\66\34\2\u0265\u0266\b$\1\2\u0266\u0267\7(\2\2\u0267\u026d\3\2"+
		"\2\2\u0268\u0269\7*\2\2\u0269\u026a\5R*\2\u026a\u026b\b$\1\2\u026b\u026d"+
		"\3\2\2\2\u026c\u0263\3\2\2\2\u026c\u0268\3\2\2\2\u026d\u0270\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026fG\3\2\2\2\u0270\u026e\3\2\2\2"+
		"\u0271\u0272\5N(\2\u0272\u0273\b%\1\2\u0273\u0283\3\2\2\2\u0274\u0275"+
		"\5R*\2\u0275\u0276\b%\1\2\u0276\u0283\3\2\2\2\u0277\u0278\7%\2\2\u0278"+
		"\u0279\5\30\r\2\u0279\u027a\b%\1\2\u027a\u027b\7&\2\2\u027b\u0283\3\2"+
		"\2\2\u027c\u027d\5J&\2\u027d\u027e\b%\1\2\u027e\u0283\3\2\2\2\u027f\u0280"+
		"\5L\'\2\u0280\u0281\b%\1\2\u0281\u0283\3\2\2\2\u0282\u0271\3\2\2\2\u0282"+
		"\u0274\3\2\2\2\u0282\u0277\3\2\2\2\u0282\u027c\3\2\2\2\u0282\u027f\3\2"+
		"\2\2\u0283I\3\2\2\2\u0284\u0285\7\6\2\2\u0285\u0286\7%\2\2\u0286\u0287"+
		"\5\66\34\2\u0287\u0288\b&\1\2\u0288\u0289\7&\2\2\u0289K\3\2\2\2\u028a"+
		"\u028b\7\b\2\2\u028b\u028c\7%\2\2\u028c\u028d\5\66\34\2\u028d\u028e\7"+
		")\2\2\u028e\u028f\5\66\34\2\u028f\u0290\b\'\1\2\u0290\u0291\7&\2\2\u0291"+
		"M\3\2\2\2\u0292\u0293\5P)\2\u0293\u0294\b(\1\2\u0294\u0298\3\2\2\2\u0295"+
		"\u0296\7-\2\2\u0296\u0298\b(\1\2\u0297\u0292\3\2\2\2\u0297\u0295\3\2\2"+
		"\2\u0298O\3\2\2\2\u0299\u029a\7\26\2\2\u029a\u029e\b)\1\2\u029b\u029c"+
		"\7\27\2\2\u029c\u029e\b)\1\2\u029d\u0299\3\2\2\2\u029d\u029b\3\2\2\2\u029e"+
		"Q\3\2\2\2\u029f\u02a0\7.\2\2\u02a0\u02a1\b*\1\2\u02a1S\3\2\2\2\u02a2\u02a3"+
		"\7\32\2\2\u02a3\u02b3\b+\1\2\u02a4\u02a5\7\33\2\2\u02a5\u02b3\b+\1\2\u02a6"+
		"\u02a7\7\34\2\2\u02a7\u02a8\7$\2\2\u02a8\u02a9\5T+\2\u02a9\u02aa\b+\1"+
		"\2\u02aa\u02b3\3\2\2\2\u02ab\u02ac\7\35\2\2\u02ac\u02ad\5R*\2\u02ad\u02ae"+
		"\b+\1\2\u02ae\u02b3\3\2\2\2\u02af\u02b0\5V,\2\u02b0\u02b1\b+\1\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02a2\3\2\2\2\u02b2\u02a4\3\2\2\2\u02b2\u02a6\3\2"+
		"\2\2\u02b2\u02ab\3\2\2\2\u02b2\u02af\3\2\2\2\u02b3U\3\2\2\2\u02b4\u02b5"+
		"\b,\1\2\u02b5\u02b6\7\36\2\2\u02b6\u02c4\7\22\2\2\u02b7\u02b8\7\5\2\2"+
		"\u02b8\u02c5\b,\1\2\u02b9\u02ba\5T+\2\u02ba\u02c1\b,\1\2\u02bb\u02bc\7"+
		")\2\2\u02bc\u02bd\5T+\2\u02bd\u02be\b,\1\2\u02be\u02c0\3\2\2\2\u02bf\u02bb"+
		"\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02b7\3\2\2\2\u02c4\u02b9\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02cc\7\20\2\2\u02c7\u02c8\5T+\2\u02c8"+
		"\u02c9\b,\1\2\u02c9\u02cd\3\2\2\2\u02ca\u02cb\7\5\2\2\u02cb\u02cd\b,\1"+
		"\2\u02cc\u02c7\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf"+
		"\7\21\2\2\u02cfW\3\2\2\2E[cnv\u008f\u0096\u009b\u009d\u00a2\u00af\u00be"+
		"\u00c4\u00cc\u00d2\u00d6\u00de\u00e6\u00ee\u00f9\u0107\u010a\u0117\u011a"+
		"\u0124\u0129\u012b\u0133\u0138\u0140\u0148\u014e\u0152\u0157\u0162\u016a"+
		"\u016e\u017f\u0181\u0191\u019d\u01a2\u01af\u01bd\u01ea\u01f2\u01fc\u0207"+
		"\u0212\u021b\u0222\u022b\u0232\u023b\u0242\u0249\u0251\u025e\u0260\u026c"+
		"\u026e\u0282\u0297\u029d\u02b2\u02c1\u02c4\u02cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}