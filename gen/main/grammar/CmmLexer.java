// Generated from /home/amin/Desktop/compiler/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUM=2, PLUS=3, MINUS=4, MULT=5, DIVIDE=6, COMMA=7, DOT=8, GT=9, 
		LT=10, ASSIGN=11, EQ=12, AND=13, OR=14, NEG=15, LPAR=16, RPAR=17, NEWLINE=18, 
		INT=19, BOOL=20, LIST=21, STRUCT=22, FALSE=23, TRUE=24, BEGIN=25, END=26, 
		RETURN=27, MAIN=28, DISPLAY=29, APPEND=30, SIZE=31, VOID=32, GET=33, SET=34, 
		WHILE=35, DO=36, IF=37, ELSE=38, FPTR=39, IDENTIFIER=40, WS=41, COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUM", "PLUS", "MINUS", "MULT", "DIVIDE", "COMMA", "DOT", "GT", 
			"LT", "ASSIGN", "EQ", "AND", "OR", "NEG", "LPAR", "RPAR", "NEWLINE", 
			"INT", "BOOL", "LIST", "STRUCT", "FALSE", "TRUE", "BEGIN", "END", "RETURN", 
			"MAIN", "DISPLAY", "APPEND", "SIZE", "VOID", "GET", "SET", "WHILE", "DO", 
			"IF", "ELSE", "FPTR", "IDENTIFIER", "WS", "COMMENT", "DIGIT", "ALPHA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, "'+'", "'-'", "'*'", "'/'", "','", "'.'", "'>'", "'<'", 
			"'='", "'=='", "'&'", "'|'", "'~'", "'('", "')'", null, "'int'", "'bool'", 
			"'list'", "'struct'", "'false'", "'true'", "'begin'", "'end'", "'return'", 
			"'main'", "'display'", "'append'", "'size'", "'void'", "'get'", "'set'", 
			"'while'", "'do'", "'if'", "'else'", "'fptr'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUM", "PLUS", "MINUS", "MULT", "DIVIDE", "COMMA", "DOT", 
			"GT", "LT", "ASSIGN", "EQ", "AND", "OR", "NEG", "LPAR", "RPAR", "NEWLINE", 
			"INT", "BOOL", "LIST", "STRUCT", "FALSE", "TRUE", "BEGIN", "END", "RETURN", 
			"MAIN", "DISPLAY", "APPEND", "SIZE", "VOID", "GET", "SET", "WHILE", "DO", 
			"IF", "ELSE", "FPTR", "IDENTIFIER", "WS", "COMMENT"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\6\3_\n\3\r\3\16\3`\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\7)\u00f4\n)\f)\16)\u00f7\13"+
		")\3*\6*\u00fa\n*\r*\16*\u00fb\3*\3*\3+\3+\7+\u0102\n+\f+\16+\u0105\13"+
		"+\3+\3+\3+\3+\3+\3,\3,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2\3\2"+
		"\6\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\5\2C\\aac|\2\u0111\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\3[\3\2\2\2\5^\3\2\2\2\7b\3\2\2\2\td\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2"+
		"\17j\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2"+
		"\2\33w\3\2\2\2\35y\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3"+
		"\2\2\2\'\u0083\3\2\2\2)\u0087\3\2\2\2+\u008c\3\2\2\2-\u0091\3\2\2\2/\u0098"+
		"\3\2\2\2\61\u009e\3\2\2\2\63\u00a3\3\2\2\2\65\u00a9\3\2\2\2\67\u00ad\3"+
		"\2\2\29\u00b4\3\2\2\2;\u00b9\3\2\2\2=\u00c1\3\2\2\2?\u00c8\3\2\2\2A\u00cd"+
		"\3\2\2\2C\u00d2\3\2\2\2E\u00d6\3\2\2\2G\u00da\3\2\2\2I\u00e0\3\2\2\2K"+
		"\u00e3\3\2\2\2M\u00e6\3\2\2\2O\u00eb\3\2\2\2Q\u00f0\3\2\2\2S\u00f9\3\2"+
		"\2\2U\u0103\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2[\\\7=\2\2\\\4\3\2\2"+
		"\2]_\5W,\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\6\3\2\2\2bc\7-\2\2"+
		"c\b\3\2\2\2de\7/\2\2e\n\3\2\2\2fg\7,\2\2g\f\3\2\2\2hi\7\61\2\2i\16\3\2"+
		"\2\2jk\7.\2\2k\20\3\2\2\2lm\7\60\2\2m\22\3\2\2\2no\7@\2\2o\24\3\2\2\2"+
		"pq\7>\2\2q\26\3\2\2\2rs\7?\2\2s\30\3\2\2\2tu\7?\2\2uv\7?\2\2v\32\3\2\2"+
		"\2wx\7(\2\2x\34\3\2\2\2yz\7~\2\2z\36\3\2\2\2{|\7\u0080\2\2| \3\2\2\2}"+
		"~\7*\2\2~\"\3\2\2\2\177\u0080\7+\2\2\u0080$\3\2\2\2\u0081\u0082\t\2\2"+
		"\2\u0082&\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7"+
		"v\2\2\u0086(\3\2\2\2\u0087\u0088\7d\2\2\u0088\u0089\7q\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7n\2\2\u008b*\3\2\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7u\2\2\u008f\u0090\7v\2\2\u0090,\3\2\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7w\2\2\u0095"+
		"\u0096\7e\2\2\u0096\u0097\7v\2\2\u0097.\3\2\2\2\u0098\u0099\7h\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2"+
		"\u009d\60\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7"+
		"w\2\2\u00a1\u00a2\7g\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\64\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac"+
		"\66\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b38\3\2\2\2\u00b4"+
		"\u00b5\7o\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8:\3\2\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7u\2"+
		"\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0"+
		"\7{\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4"+
		"\7r\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7"+
		">\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7|\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc@\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7q\2\2\u00cf"+
		"\u00d0\7k\2\2\u00d0\u00d1\7f\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7i\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7v\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9F\3\2\2\2\u00da\u00db\7y\2\2\u00db"+
		"\u00dc\7j\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2"+
		"\u00dfH\3\2\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7q\2\2\u00e2J\3\2\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7h\2\2\u00e5L\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00eaN\3\2\2\2\u00eb"+
		"\u00ec\7h\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7t\2\2"+
		"\u00efP\3\2\2\2\u00f0\u00f5\5Y-\2\u00f1\u00f4\5Y-\2\u00f2\u00f4\5W,\2"+
		"\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6R\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fa\t\3\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b*\2\2\u00fe"+
		"T\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0102\7,\2\2\u0101\u00ff\3\2\2\2"+
		"\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7,\2\2\u0107\u0108\7\61\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\b+\2\2\u010aV\3\2\2\2\u010b\u010c\t\4\2\2\u010c"+
		"X\3\2\2\2\u010d\u010e\t\5\2\2\u010eZ\3\2\2\2\b\2`\u00f3\u00f5\u00fb\u0103"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}