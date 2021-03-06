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
		T__0=1, NUM=2, PLUS=3, MINUS=4, MULT=5, DIVIDE=6, COMMA=7, SEMICOLLON=8, 
		DOT=9, GT=10, LT=11, ASSIGN=12, EQ=13, AND=14, OR=15, NEG=16, LPAR=17, 
		RPAR=18, LBRACKET=19, RBRACKET=20, SHARP=21, NEWLINE=22, INT=23, BOOL=24, 
		LIST=25, STRUCT=26, FALSE=27, TRUE=28, BEGIN=29, END=30, RETURN=31, MAIN=32, 
		DISPLAY=33, APPEND=34, SIZE=35, VOID=36, GET=37, SET=38, WHILE=39, DO=40, 
		IF=41, ELSE=42, FPTR=43, IDENTIFIER=44, WS=45, COMMENT=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUM", "PLUS", "MINUS", "MULT", "DIVIDE", "COMMA", "SEMICOLLON", 
			"DOT", "GT", "LT", "ASSIGN", "EQ", "AND", "OR", "NEG", "LPAR", "RPAR", 
			"LBRACKET", "RBRACKET", "SHARP", "NEWLINE", "INT", "BOOL", "LIST", "STRUCT", 
			"FALSE", "TRUE", "BEGIN", "END", "RETURN", "MAIN", "DISPLAY", "APPEND", 
			"SIZE", "VOID", "GET", "SET", "WHILE", "DO", "IF", "ELSE", "FPTR", "IDENTIFIER", 
			"WS", "COMMENT", "DIGIT", "ALPHA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0122\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\6\3h\n\3"+
		"\r\3\16\3i\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\7-\u0105\n-\f-\16-\u0108\13-\3.\6.\u010b\n.\r.\16.\u010c\3.\3.\3/\3"+
		"/\3/\3/\7/\u0115\n/\f/\16/\u0118\13/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\u0116\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2\3\2\5\5\2\13"+
		"\13\17\17\"\"\3\2\62;\5\2C\\aac|\2\u0124\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\3c\3\2\2\2\5g\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13"+
		"o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27"+
		"{\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2"+
		"!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3"+
		"\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0094\3\2\2\2\61\u0098\3\2\2\2\63"+
		"\u009d\3\2\2\2\65\u00a2\3\2\2\2\67\u00a9\3\2\2\29\u00af\3\2\2\2;\u00b4"+
		"\3\2\2\2=\u00ba\3\2\2\2?\u00be\3\2\2\2A\u00c5\3\2\2\2C\u00ca\3\2\2\2E"+
		"\u00d2\3\2\2\2G\u00d9\3\2\2\2I\u00de\3\2\2\2K\u00e3\3\2\2\2M\u00e7\3\2"+
		"\2\2O\u00eb\3\2\2\2Q\u00f1\3\2\2\2S\u00f4\3\2\2\2U\u00f7\3\2\2\2W\u00fc"+
		"\3\2\2\2Y\u0101\3\2\2\2[\u010a\3\2\2\2]\u0110\3\2\2\2_\u011e\3\2\2\2a"+
		"\u0120\3\2\2\2cd\7/\2\2de\7@\2\2e\4\3\2\2\2fh\5_\60\2gf\3\2\2\2hi\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2j\6\3\2\2\2kl\7-\2\2l\b\3\2\2\2mn\7/\2\2n\n\3"+
		"\2\2\2op\7,\2\2p\f\3\2\2\2qr\7\61\2\2r\16\3\2\2\2st\7.\2\2t\20\3\2\2\2"+
		"uv\7=\2\2v\22\3\2\2\2wx\7\60\2\2x\24\3\2\2\2yz\7@\2\2z\26\3\2\2\2{|\7"+
		">\2\2|\30\3\2\2\2}~\7?\2\2~\32\3\2\2\2\177\u0080\7?\2\2\u0080\u0081\7"+
		"?\2\2\u0081\34\3\2\2\2\u0082\u0083\7(\2\2\u0083\36\3\2\2\2\u0084\u0085"+
		"\7~\2\2\u0085 \3\2\2\2\u0086\u0087\7\u0080\2\2\u0087\"\3\2\2\2\u0088\u0089"+
		"\7*\2\2\u0089$\3\2\2\2\u008a\u008b\7+\2\2\u008b&\3\2\2\2\u008c\u008d\7"+
		"]\2\2\u008d(\3\2\2\2\u008e\u008f\7_\2\2\u008f*\3\2\2\2\u0090\u0091\7%"+
		"\2\2\u0091,\3\2\2\2\u0092\u0093\7\f\2\2\u0093.\3\2\2\2\u0094\u0095\7k"+
		"\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097\60\3\2\2\2\u0098\u0099"+
		"\7d\2\2\u0099\u009a\7q\2\2\u009a\u009b\7q\2\2\u009b\u009c\7n\2\2\u009c"+
		"\62\3\2\2\2\u009d\u009e\7n\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\64\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7v\2\2"+
		"\u00a8\66\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7"+
		"n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae8\3\2\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		":\3\2\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7i\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\u00bd\7f\2\2\u00bd>\3\2\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7t\2\2"+
		"\u00c3\u00c4\7p\2\2\u00c4@\3\2\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7c\2"+
		"\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7"+
		"f\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf"+
		"\7n\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7{\2\2\u00d1D\3\2\2\2\u00d2\u00d3"+
		"\7c\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\u00d8\7f\2\2\u00d8F\3\2\2\2\u00d9\u00da\7u\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dc\7|\2\2\u00dc\u00dd\7g\2\2\u00ddH\3\2\2\2\u00de"+
		"\u00df\7x\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7f\2\2"+
		"\u00e2J\3\2\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7v\2"+
		"\2\u00e6L\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7"+
		"v\2\2\u00eaN\3\2\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0P\3\2\2\2\u00f1\u00f2"+
		"\7f\2\2\u00f2\u00f3\7q\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6"+
		"\7h\2\2\u00f6T\3\2\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7u\2\2\u00fa\u00fb\7g\2\2\u00fbV\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe"+
		"\7r\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7t\2\2\u0100X\3\2\2\2\u0101\u0106"+
		"\5a\61\2\u0102\u0105\5a\61\2\u0103\u0105\5_\60\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107Z\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\t\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\b.\2\2\u010f\\\3\2\2\2\u0110\u0111\7\61\2\2"+
		"\u0111\u0112\7,\2\2\u0112\u0116\3\2\2\2\u0113\u0115\13\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7,\2\2\u011a\u011b\7\61"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b/\2\2\u011d^\3\2\2\2\u011e\u011f"+
		"\t\3\2\2\u011f`\3\2\2\2\u0120\u0121\t\4\2\2\u0121b\3\2\2\2\b\2i\u0104"+
		"\u0106\u010c\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}