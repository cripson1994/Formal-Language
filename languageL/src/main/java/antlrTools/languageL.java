package antlrTools;// Generated from languageL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageL extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TDIGIT=1, TIF=2, TTHEN=3, TELSE=4, TWHILE=5, TDO=6, TREAD=7, TWRITE=8, 
		TFUN=9, TVAR=10, TRETURN=11, TTRUE=12, TFALSE=13, IDENT=14, COMMENT=15, 
		TEQ=16, TMINUS=17, TPLUS=18, TPOW=19, TMULT=20, TDIV=21, TMOD=22, TEQC=23, 
		TNEQ=24, TLT=25, TGT=26, TLE=27, TGE=28, TAND=29, TOR=30, TRPAREN=31, 
		TLPAREN=32, TRBRACES=33, TLBRACES=34, TSEP=35, TCOMMA=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "EXPONENT", "LETTER", "DIGIT", "TDIGIT", "TIF", "TTHEN", 
		"TELSE", "TWHILE", "TDO", "TREAD", "TWRITE", "TFUN", "TVAR", "TRETURN", 
		"TTRUE", "TFALSE", "IDENT", "COMMENT", "TEQ", "TMINUS", "TPLUS", "TPOW", 
		"TMULT", "TDIV", "TMOD", "TEQC", "TNEQ", "TLT", "TGT", "TLE", "TGE", "TAND", 
		"TOR", "TRPAREN", "TLPAREN", "TRBRACES", "TLBRACES", "TSEP", "TCOMMA", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'then'", "'else'", "'while'", "'do'", "'read'", "'write'", 
		"'fun'", "'var'", "'return'", "'true'", "'false'", null, null, "'='", 
		"'-'", "'+'", "'**'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'>'", 
		"'<='", "'>='", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TDIGIT", "TIF", "TTHEN", "TELSE", "TWHILE", "TDO", "TREAD", "TWRITE", 
		"TFUN", "TVAR", "TRETURN", "TTRUE", "TFALSE", "IDENT", "COMMENT", "TEQ", 
		"TMINUS", "TPLUS", "TPOW", "TMULT", "TDIV", "TMOD", "TEQC", "TNEQ", "TLT", 
		"TGT", "TLE", "TGE", "TAND", "TOR", "TRPAREN", "TLPAREN", "TRBRACES", 
		"TLBRACES", "TSEP", "TCOMMA", "WS"
	};
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


	public languageL(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "languageL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u012a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2Y\n\2\r\2\16\2Z\3\3\6\3^\n\3\r\3\16\3_\3\3\3\3\7\3d\n\3\f\3\16\3"+
		"g\13\3\3\3\5\3j\n\3\3\3\3\3\6\3n\n\3\r\3\16\3o\3\3\5\3s\n\3\3\3\6\3v\n"+
		"\3\r\3\16\3w\3\3\5\3{\n\3\3\4\3\4\5\4\177\n\4\3\4\6\4\u0082\n\4\r\4\16"+
		"\4\u0083\3\5\3\5\3\6\3\6\5\6\u008a\n\6\3\7\5\7\u008d\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5"+
		"\24\u00ce\n\24\3\24\3\24\3\24\7\24\u00d3\n\24\f\24\16\24\u00d6\13\24\3"+
		"\25\3\25\3\25\3\25\7\25\u00dc\n\25\f\25\16\25\u00df\13\25\3\25\3\25\3"+
		"\25\3\25\7\25\u00e5\n\25\f\25\16\25\u00e8\13\25\3\25\3\25\5\25\u00ec\n"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\5"+
		"+\u0121\n+\3+\3+\6+\u0125\n+\r+\16+\u0126\3+\3+\3\u00e6\2,\3\2\5\2\7\2"+
		"\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17"+
		"\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36"+
		"E\37G I!K\"M#O$Q%S&U\'\3\2\6\4\2GGgg\4\2--//\4\2C\\c|\4\2\f\f\17\17\2"+
		"\u013c\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\3X\3\2\2\2\5z\3\2\2\2\7|\3\2\2\2\t\u0085\3\2"+
		"\2\2\13\u0089\3\2\2\2\r\u008c\3\2\2\2\17\u0090\3\2\2\2\21\u0093\3\2\2"+
		"\2\23\u0098\3\2\2\2\25\u009d\3\2\2\2\27\u00a3\3\2\2\2\31\u00a6\3\2\2\2"+
		"\33\u00ab\3\2\2\2\35\u00b1\3\2\2\2\37\u00b5\3\2\2\2!\u00b9\3\2\2\2#\u00c0"+
		"\3\2\2\2%\u00c5\3\2\2\2\'\u00cd\3\2\2\2)\u00eb\3\2\2\2+\u00ed\3\2\2\2"+
		"-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63\u00f6\3\2\2\2\65\u00f8"+
		"\3\2\2\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00ff\3\2\2\2=\u0102\3\2\2\2"+
		"?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0109\3\2\2\2E\u010c\3\2\2\2G\u010f\3"+
		"\2\2\2I\u0112\3\2\2\2K\u0114\3\2\2\2M\u0116\3\2\2\2O\u0118\3\2\2\2Q\u011a"+
		"\3\2\2\2S\u011c\3\2\2\2U\u0124\3\2\2\2WY\4\62;\2XW\3\2\2\2YZ\3\2\2\2Z"+
		"X\3\2\2\2Z[\3\2\2\2[\4\3\2\2\2\\^\4\62;\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2"+
		"\2_`\3\2\2\2`a\3\2\2\2ae\7\60\2\2bd\4\62;\2cb\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\5\7\4\2ih\3\2\2\2ij\3\2\2\2j{\3\2"+
		"\2\2km\7\60\2\2ln\4\62;\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qs\5\7\4\2rq\3\2\2\2rs\3\2\2\2s{\3\2\2\2tv\4\62;\2ut\3\2\2\2vw\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5\7\4\2z]\3\2\2\2zk\3\2\2\2zu\3"+
		"\2\2\2{\6\3\2\2\2|~\t\2\2\2}\177\t\3\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080\u0082\4\62;\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\b\3\2\2\2\u0085\u0086\t\4\2\2"+
		"\u0086\n\3\2\2\2\u0087\u008a\5\3\2\2\u0088\u008a\5\5\3\2\u0089\u0087\3"+
		"\2\2\2\u0089\u0088\3\2\2\2\u008a\f\3\2\2\2\u008b\u008d\7/\2\2\u008c\u008b"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5\13\6\2"+
		"\u008f\16\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h\2\2\u0092\20\3\2\2"+
		"\2\u0093\u0094\7v\2\2\u0094\u0095\7j\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7p\2\2\u0097\22\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7u\2\2\u009b\u009c\7g\2\2\u009c\24\3\2\2\2\u009d\u009e\7y\2\2\u009e\u009f"+
		"\7j\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7q\2\2\u00a5\30\3\2\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7f\2\2"+
		"\u00aa\32\3\2\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7"+
		"k\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0\34\3\2\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7p\2\2\u00b4\36\3\2\2\2\u00b5\u00b6"+
		"\7x\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8 \3\2\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7w\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\u00bf\7p\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7g\2\2\u00c4$\3\2\2\2\u00c5"+
		"\u00c6\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca&\3\2\2\2\u00cb\u00ce\5\t\5\2\u00cc\u00ce\7a"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d4\3\2\2\2\u00cf"+
		"\u00d3\5\t\5\2\u00d0\u00d3\7a\2\2\u00d1\u00d3\5\13\6\2\u00d2\u00cf\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5(\3\2\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d7\u00d8\7\61\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc"+
		"\n\5\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00ec\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\61"+
		"\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea"+
		"\u00ec\7\61\2\2\u00eb\u00d7\3\2\2\2\u00eb\u00e0\3\2\2\2\u00ec*\3\2\2\2"+
		"\u00ed\u00ee\7?\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0.\3\2\2\2\u00f1"+
		"\u00f2\7-\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f5\7,\2\2\u00f5"+
		"\62\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9"+
		"\66\3\2\2\2\u00fa\u00fb\7\'\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd"+
		"\u00fe\7?\2\2\u00fe:\3\2\2\2\u00ff\u0100\7#\2\2\u0100\u0101\7?\2\2\u0101"+
		"<\3\2\2\2\u0102\u0103\7>\2\2\u0103>\3\2\2\2\u0104\u0105\7@\2\2\u0105@"+
		"\3\2\2\2\u0106\u0107\7>\2\2\u0107\u0108\7?\2\2\u0108B\3\2\2\2\u0109\u010a"+
		"\7@\2\2\u010a\u010b\7?\2\2\u010bD\3\2\2\2\u010c\u010d\7(\2\2\u010d\u010e"+
		"\7(\2\2\u010eF\3\2\2\2\u010f\u0110\7~\2\2\u0110\u0111\7~\2\2\u0111H\3"+
		"\2\2\2\u0112\u0113\7*\2\2\u0113J\3\2\2\2\u0114\u0115\7+\2\2\u0115L\3\2"+
		"\2\2\u0116\u0117\7}\2\2\u0117N\3\2\2\2\u0118\u0119\7\177\2\2\u0119P\3"+
		"\2\2\2\u011a\u011b\7=\2\2\u011bR\3\2\2\2\u011c\u011d\7.\2\2\u011dT\3\2"+
		"\2\2\u011e\u0125\7\13\2\2\u011f\u0121\7\17\2\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\7\f\2\2\u0123\u0125\7\""+
		"\2\2\u0124\u011e\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0129\b+\2\2\u0129V\3\2\2\2\30\2Z_eiorwz~\u0083\u0089\u008c"+
		"\u00cd\u00d2\u00d4\u00dd\u00e6\u00eb\u0120\u0124\u0126\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}