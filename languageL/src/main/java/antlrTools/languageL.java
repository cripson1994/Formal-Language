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
		TFUN=9, TVAR=10, TRETURN=11, IDENT=12, COMMENT=13, TEQ=14, TMINUS=15, 
		TPLUS=16, TMULT=17, TDIV=18, TMOD=19, TEQC=20, TNEQ=21, TLT=22, TGT=23, 
		TLE=24, TGE=25, TAND=26, TOR=27, TRPAREN=28, TLPAREN=29, TRBRACES=30, 
		TLBRACES=31, TSEP=32, TCOMMA=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "EXPONENT", "LETTER", "DIGIT", "TDIGIT", "TIF", "TTHEN", 
		"TELSE", "TWHILE", "TDO", "TREAD", "TWRITE", "TFUN", "TVAR", "TRETURN", 
		"IDENT", "COMMENT", "TEQ", "TMINUS", "TPLUS", "TMULT", "TDIV", "TMOD", 
		"TEQC", "TNEQ", "TLT", "TGT", "TLE", "TGE", "TAND", "TOR", "TRPAREN", 
		"TLPAREN", "TRBRACES", "TLBRACES", "TSEP", "TCOMMA", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'then'", "'else'", "'while'", "'do'", "'read'", "'write'", 
		"'fun'", "'var'", "'return'", null, null, "'='", "'-'", "'+'", "'*'", 
		"'/'", "'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", 
		"'('", "')'", "'{'", "'}'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TDIGIT", "TIF", "TTHEN", "TELSE", "TWHILE", "TDO", "TREAD", "TWRITE", 
		"TFUN", "TVAR", "TRETURN", "IDENT", "COMMENT", "TEQ", "TMINUS", "TPLUS", 
		"TMULT", "TDIV", "TMOD", "TEQC", "TNEQ", "TLT", "TGT", "TLE", "TGE", "TAND", 
		"TOR", "TRPAREN", "TLPAREN", "TRBRACES", "TLBRACES", "TSEP", "TCOMMA", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0109\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\6\2S\n\2\r\2\16"+
		"\2T\3\3\6\3X\n\3\r\3\16\3Y\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\3\5\3d\n"+
		"\3\3\3\3\3\6\3h\n\3\r\3\16\3i\3\3\5\3m\n\3\3\3\6\3p\n\3\r\3\16\3q\3\3"+
		"\5\3u\n\3\3\4\3\4\5\4y\n\4\3\4\6\4|\n\4\r\4\16\4}\3\5\3\5\3\6\3\6\5\6"+
		"\u0084\n\6\3\7\5\7\u0087\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00bd\n\22"+
		"\3\22\3\22\3\22\7\22\u00c2\n\22\f\22\16\22\u00c5\13\22\3\23\3\23\3\23"+
		"\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\5(\u0100\n(\3(\3(\6(\u0104\n"+
		"(\r(\16(\u0105\3(\3(\2\2)\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7"+
		"\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26"+
		"\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$\3\2\6\4\2GGgg\4\2"+
		"--//\4\2C\\c|\4\2\f\f\17\17\2\u0119\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\3R\3\2\2\2\5t\3\2\2\2\7v\3\2\2\2\t\177\3\2\2\2\13"+
		"\u0083\3\2\2\2\r\u0086\3\2\2\2\17\u008a\3\2\2\2\21\u008d\3\2\2\2\23\u0092"+
		"\3\2\2\2\25\u0097\3\2\2\2\27\u009d\3\2\2\2\31\u00a0\3\2\2\2\33\u00a5\3"+
		"\2\2\2\35\u00ab\3\2\2\2\37\u00af\3\2\2\2!\u00b3\3\2\2\2#\u00bc\3\2\2\2"+
		"%\u00c6\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3\2\2\2-\u00d5\3"+
		"\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63\u00db\3\2\2\2\65\u00de\3\2\2"+
		"\2\67\u00e1\3\2\2\29\u00e3\3\2\2\2;\u00e5\3\2\2\2=\u00e8\3\2\2\2?\u00eb"+
		"\3\2\2\2A\u00ee\3\2\2\2C\u00f1\3\2\2\2E\u00f3\3\2\2\2G\u00f5\3\2\2\2I"+
		"\u00f7\3\2\2\2K\u00f9\3\2\2\2M\u00fb\3\2\2\2O\u0103\3\2\2\2QS\4\62;\2"+
		"RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\4\3\2\2\2VX\4\62;\2WV\3\2\2"+
		"\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[_\7\60\2\2\\^\4\62;\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\5\7\4\2cb\3"+
		"\2\2\2cd\3\2\2\2du\3\2\2\2eg\7\60\2\2fh\4\62;\2gf\3\2\2\2hi\3\2\2\2ig"+
		"\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5\7\4\2lk\3\2\2\2lm\3\2\2\2mu\3\2\2\2n"+
		"p\4\62;\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5\7\4\2"+
		"tW\3\2\2\2te\3\2\2\2to\3\2\2\2u\6\3\2\2\2vx\t\2\2\2wy\t\3\2\2xw\3\2\2"+
		"\2xy\3\2\2\2y{\3\2\2\2z|\4\62;\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\b\3\2\2\2\177\u0080\t\4\2\2\u0080\n\3\2\2\2\u0081\u0084\5\3\2\2\u0082"+
		"\u0084\5\5\3\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\f\3\2\2\2"+
		"\u0085\u0087\7/\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\5\13\6\2\u0089\16\3\2\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7h\2\2\u008c\20\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7j\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\22\3\2\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\24\3\2\2\2\u0097"+
		"\u0098\7y\2\2\u0098\u0099\7j\2\2\u0099\u009a\7k\2\2\u009a\u009b\7n\2\2"+
		"\u009b\u009c\7g\2\2\u009c\26\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f\7"+
		"q\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7f\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7"+
		"\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\34\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\36\3\2\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2"+
		" \3\2\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7p\2\2\u00b9\"\3\2\2\2\u00ba"+
		"\u00bd\5\t\5\2\u00bb\u00bd\7a\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\u00c3\3\2\2\2\u00be\u00c2\5\t\5\2\u00bf\u00c2\7a\2\2\u00c0"+
		"\u00c2\5\13\6\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"$\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\7\61\2"+
		"\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\n\5\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd&\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2"+
		"*\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6."+
		"\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7\'\2\2\u00da"+
		"\62\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\u00dd\7?\2\2\u00dd\64\3\2\2\2\u00de"+
		"\u00df\7#\2\2\u00df\u00e0\7?\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2"+
		"8\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7"+
		"\7?\2\2\u00e7<\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9\u00ea\7?\2\2\u00ea>\3"+
		"\2\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\7(\2\2\u00ed@\3\2\2\2\u00ee\u00ef"+
		"\7~\2\2\u00ef\u00f0\7~\2\2\u00f0B\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2D\3"+
		"\2\2\2\u00f3\u00f4\7+\2\2\u00f4F\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6H\3\2"+
		"\2\2\u00f7\u00f8\7\177\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7=\2\2\u00faL\3"+
		"\2\2\2\u00fb\u00fc\7.\2\2\u00fcN\3\2\2\2\u00fd\u0104\7\13\2\2\u00fe\u0100"+
		"\7\17\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u0104\7\f\2\2\u0102\u0104\7\"\2\2\u0103\u00fd\3\2\2\2\u0103\u00ff"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b(\2\2\u0108P\3\2\2\2\26"+
		"\2TY_cilqtx}\u0083\u0086\u00bc\u00c1\u00c3\u00cc\u00ff\u0103\u0105\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}