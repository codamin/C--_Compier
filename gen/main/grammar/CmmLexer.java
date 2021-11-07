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
		T__0=1, T__1=2, NUM=3, PLUS=4, MINUS=5, MULT=6, DIVIDE=7, COMMA=8, DOT=9, 
		GT=10, LT=11, ASSIGN=12, EQ=13, AND=14, OR=15, NEG=16, LPAR=17, RPAR=18, 
		SHARP=19, NEWLINE=20, INT=21, BOOL=22, LIST=23, STRUCT=24, FALSE=25, TRUE=26, 
		BEGIN=27, END=28, RETURN=29, MAIN=30, DISPLAY=31, APPEND=32, SIZE=33, 
		VOID=34, GET=35, SET=36, WHILE=37, DO=38, IF=39, ELSE=40, FPTR=41, IDENTIFIER=42, 
		WS=43, COMMENT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUM", "PLUS", "MINUS", "MULT", "DIVIDE", "COMMA", "DOT", 
			"GT", "LT", "ASSIGN", "EQ", "AND", "OR", "NEG", "LPAR", "RPAR", "SHARP", 
			"NEWLINE", "INT", "BOOL", "LIST", "STRUCT", "FALSE", "TRUE", "BEGIN", 
			"END", "RETURN", "MAIN", "DISPLAY", "APPEND", "SIZE", "VOID", "GET", 
			"SET", "WHILE", "DO", "IF", "ELSE", "FPTR", "IDENTIFIER", "WS", "COMMENT", 
			"DIGIT", "ALPHA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\4\6\4f\n\4\r\4\16\4g\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\7+\u00fd\n+\f+\16+\u0100"+
		"\13+\3,\6,\u0103\n,\r,\16,\u0104\3,\3,\3-\3-\7-\u010b\n-\f-\16-\u010e"+
		"\13-\3-\3-\3-\3-\3-\3.\3.\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"\2]\2\3\2\6\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\5\2C\\aac|\2\u011a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7e\3\2\2\2\ti\3"+
		"\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25u"+
		"\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35~\3\2\2\2\37\u0080\3\2"+
		"\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0086\3\2\2\2\'\u0088\3\2\2\2)\u008a"+
		"\3\2\2\2+\u008c\3\2\2\2-\u0090\3\2\2\2/\u0095\3\2\2\2\61\u009a\3\2\2\2"+
		"\63\u00a1\3\2\2\2\65\u00a7\3\2\2\2\67\u00ac\3\2\2\29\u00b2\3\2\2\2;\u00b6"+
		"\3\2\2\2=\u00bd\3\2\2\2?\u00c2\3\2\2\2A\u00ca\3\2\2\2C\u00d1\3\2\2\2E"+
		"\u00d6\3\2\2\2G\u00db\3\2\2\2I\u00df\3\2\2\2K\u00e3\3\2\2\2M\u00e9\3\2"+
		"\2\2O\u00ec\3\2\2\2Q\u00ef\3\2\2\2S\u00f4\3\2\2\2U\u00f9\3\2\2\2W\u0102"+
		"\3\2\2\2Y\u010c\3\2\2\2[\u0114\3\2\2\2]\u0116\3\2\2\2_`\7=\2\2`\4\3\2"+
		"\2\2ab\7/\2\2bc\7@\2\2c\6\3\2\2\2df\5[.\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2h\b\3\2\2\2ij\7-\2\2j\n\3\2\2\2kl\7/\2\2l\f\3\2\2\2mn\7,\2"+
		"\2n\16\3\2\2\2op\7\61\2\2p\20\3\2\2\2qr\7.\2\2r\22\3\2\2\2st\7\60\2\2"+
		"t\24\3\2\2\2uv\7@\2\2v\26\3\2\2\2wx\7>\2\2x\30\3\2\2\2yz\7?\2\2z\32\3"+
		"\2\2\2{|\7?\2\2|}\7?\2\2}\34\3\2\2\2~\177\7(\2\2\177\36\3\2\2\2\u0080"+
		"\u0081\7~\2\2\u0081 \3\2\2\2\u0082\u0083\7\u0080\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0085\7*\2\2\u0085$\3\2\2\2\u0086\u0087\7+\2\2\u0087&\3\2\2\2\u0088\u0089"+
		"\7%\2\2\u0089(\3\2\2\2\u008a\u008b\t\2\2\2\u008b*\3\2\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f,\3\2\2\2\u0090\u0091"+
		"\7d\2\2\u0091\u0092\7q\2\2\u0092\u0093\7q\2\2\u0093\u0094\7n\2\2\u0094"+
		".\3\2\2\2\u0095\u0096\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098\7u\2\2\u0098"+
		"\u0099\7v\2\2\u0099\60\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7w\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\62\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7"+
		"n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\64\3\2\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\66\3\2\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7i\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b18\3\2\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7f\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2"+
		"\u00bb\u00bc\7p\2\2\u00bc<\3\2\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7c\2"+
		"\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7"+
		"f\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7{\2\2\u00c9@\3\2\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7f\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7u\2\2\u00d2"+
		"\u00d3\7k\2\2\u00d3\u00d4\7|\2\2\u00d4\u00d5\7g\2\2\u00d5D\3\2\2\2\u00d6"+
		"\u00d7\7x\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7f\2\2"+
		"\u00daF\3\2\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7v\2"+
		"\2\u00deH\3\2\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7"+
		"v\2\2\u00e2J\3\2\2\2\u00e3\u00e4\7y\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6"+
		"\7k\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8L\3\2\2\2\u00e9\u00ea"+
		"\7f\2\2\u00ea\u00eb\7q\2\2\u00ebN\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee"+
		"\7h\2\2\u00eeP\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2"+
		"\7u\2\2\u00f2\u00f3\7g\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6"+
		"\7r\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8T\3\2\2\2\u00f9\u00fe"+
		"\5]/\2\u00fa\u00fd\5]/\2\u00fb\u00fd\5[.\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"V\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\t\3\2\2\u0102\u0101\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\b,\2\2\u0107X\3\2\2\2\u0108\u0109\7\61\2\2\u0109"+
		"\u010b\7,\2\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\7,\2\2\u0110\u0111\7\61\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b-"+
		"\2\2\u0113Z\3\2\2\2\u0114\u0115\t\4\2\2\u0115\\\3\2\2\2\u0116\u0117\t"+
		"\5\2\2\u0117^\3\2\2\2\b\2g\u00fc\u00fe\u0104\u010c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}