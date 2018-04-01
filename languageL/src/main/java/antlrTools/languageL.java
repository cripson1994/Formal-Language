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
		DIGIT=1, TIF=2, TTHEN=3, TELSE=4, TWHILE=5, TDO=6, TREAD=7, TWRITE=8, 
		TFUN=9, TVAR=10, TRETURN=11, IDENT=12, TEQ=13, TMINUS=14, TPLUS=15, TMULT=16, 
		TDIV=17, TMOD=18, TEQC=19, TNEQ=20, TLT=21, TGT=22, TLE=23, TGE=24, TAND=25, 
		TOR=26, TRPAREN=27, TLPAREN=28, TRBRACES=29, TLBRACES=30, TSEP=31, TCOMMA=32, 
		COMMENT=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "EXPONENT", "LETTER", "DIGIT", "TIF", "TTHEN", "TELSE", 
		"TWHILE", "TDO", "TREAD", "TWRITE", "TFUN", "TVAR", "TRETURN", "IDENT", 
		"TEQ", "TMINUS", "TPLUS", "TMULT", "TDIV", "TMOD", "TEQC", "TNEQ", "TLT", 
		"TGT", "TLE", "TGE", "TAND", "TOR", "TRPAREN", "TLPAREN", "TRBRACES", 
		"TLBRACES", "TSEP", "TCOMMA", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'then'", "'else'", "'while'", "'do'", "'read'", "'write'", 
		"'fun'", "'var'", "'return'", null, "'='", "'-'", "'+'", "'*'", "'\\'", 
		"'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'('", 
		"')'", "'{'", "'}'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIGIT", "TIF", "TTHEN", "TELSE", "TWHILE", "TDO", "TREAD", "TWRITE", 
		"TFUN", "TVAR", "TRETURN", "IDENT", "TEQ", "TMINUS", "TPLUS", "TMULT", 
		"TDIV", "TMOD", "TEQC", "TNEQ", "TLT", "TGT", "TLE", "TGE", "TAND", "TOR", 
		"TRPAREN", "TLPAREN", "TRBRACES", "TLBRACES", "TSEP", "TCOMMA", "COMMENT", 
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
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2Q\n\2\r\2\16\2R\3\3"+
		"\6\3V\n\3\r\3\16\3W\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\3\5\3b\n\3\3\3"+
		"\3\3\6\3f\n\3\r\3\16\3g\3\3\5\3k\n\3\3\3\6\3n\n\3\r\3\16\3o\3\3\5\3s\n"+
		"\3\3\4\3\4\5\4w\n\4\3\4\6\4z\n\4\r\4\16\4{\3\5\3\5\3\6\3\6\5\6\u0082\n"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\5\21\u00b6\n\21\3\21\3\21\3\21\7\21\u00bb\n\21\f\21\16\21"+
		"\u00be\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3&\3&\7&\u00f2\n&\f&\16&\u00f5\13&\3&\5&\u00f8\n&\3"+
		"&\3&\3&\3&\3\'\3\'\5\'\u0100\n\'\3\'\3\'\6\'\u0104\n\'\r\'\16\'\u0105"+
		"\3\'\3\'\2\2(\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33"+
		"\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\31"+
		"9\32;\33=\34?\35A\36C\37E G!I\"K#M$\3\2\6\4\2GGgg\4\2--//\4\2C\\c|\4\2"+
		"\f\f\17\17\2\u011a\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\3P\3\2\2\2\5r\3\2\2\2\7t\3\2\2\2\t}\3\2\2\2\13\u0081\3\2\2\2\r"+
		"\u0083\3\2\2\2\17\u0086\3\2\2\2\21\u008b\3\2\2\2\23\u0090\3\2\2\2\25\u0096"+
		"\3\2\2\2\27\u0099\3\2\2\2\31\u009e\3\2\2\2\33\u00a4\3\2\2\2\35\u00a8\3"+
		"\2\2\2\37\u00ac\3\2\2\2!\u00b5\3\2\2\2#\u00bf\3\2\2\2%\u00c1\3\2\2\2\'"+
		"\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2"+
		"\2\2\61\u00ce\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2"+
		"\29\u00d8\3\2\2\2;\u00db\3\2\2\2=\u00de\3\2\2\2?\u00e1\3\2\2\2A\u00e3"+
		"\3\2\2\2C\u00e5\3\2\2\2E\u00e7\3\2\2\2G\u00e9\3\2\2\2I\u00eb\3\2\2\2K"+
		"\u00ed\3\2\2\2M\u0103\3\2\2\2OQ\4\62;\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\4\3\2\2\2TV\4\62;\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2XY\3\2\2\2Y]\7\60\2\2Z\\\4\62;\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2`b\5\7\4\2a`\3\2\2\2ab\3\2\2\2bs\3\2\2\2ce\7"+
		"\60\2\2df\4\62;\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik"+
		"\5\7\4\2ji\3\2\2\2jk\3\2\2\2ks\3\2\2\2ln\4\62;\2ml\3\2\2\2no\3\2\2\2o"+
		"m\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\5\7\4\2rU\3\2\2\2rc\3\2\2\2rm\3\2\2\2"+
		"s\6\3\2\2\2tv\t\2\2\2uw\t\3\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\4\62;"+
		"\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\b\3\2\2\2}~\t\4\2\2~\n\3\2"+
		"\2\2\177\u0082\5\3\2\2\u0080\u0082\5\5\3\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\f\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085\16"+
		"\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7j\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7p\2\2\u008a\20\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\22\3\2\2\2\u0090\u0091\7y\2\2\u0091"+
		"\u0092\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2"+
		"\u0095\24\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7q\2\2\u0098\26\3\2\2"+
		"\2\u0099\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7c\2\2\u009c\u009d"+
		"\7f\2\2\u009d\30\3\2\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7g\2\2\u00a3\32\3\2\2\2\u00a4\u00a5"+
		"\7h\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7p\2\2\u00a7\34\3\2\2\2\u00a8\u00a9"+
		"\7x\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\36\3\2\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7w\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7p\2\2\u00b2 \3\2\2\2\u00b3\u00b6\5\t\5\2\u00b4"+
		"\u00b6\7a\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00bc\3\2"+
		"\2\2\u00b7\u00bb\5\t\5\2\u00b8\u00bb\7a\2\2\u00b9\u00bb\5\13\6\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\"\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7/\2\2\u00c2&\3"+
		"\2\2\2\u00c3\u00c4\7-\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6*\3\2"+
		"\2\2\u00c7\u00c8\7^\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca.\3\2"+
		"\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd\7?\2\2\u00cd\60\3\2\2\2\u00ce\u00cf"+
		"\7#\2\2\u00cf\u00d0\7?\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\64"+
		"\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6"+
		"\u00d7\7?\2\2\u00d78\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da\7?\2\2\u00da"+
		":\3\2\2\2\u00db\u00dc\7(\2\2\u00dc\u00dd\7(\2\2\u00dd<\3\2\2\2\u00de\u00df"+
		"\7~\2\2\u00df\u00e0\7~\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2@\3"+
		"\2\2\2\u00e3\u00e4\7+\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7}\2\2\u00e6D\3\2"+
		"\2\2\u00e7\u00e8\7\177\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7=\2\2\u00eaH\3"+
		"\2\2\2\u00eb\u00ec\7.\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef"+
		"\7\61\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\n\5\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\17\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\f\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\b&\2\2\u00fcL\3\2\2\2\u00fd\u0104\7\13\2\2\u00fe"+
		"\u0100\7\17\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u0104\7\f\2\2\u0102\u0104\7\"\2\2\u0103\u00fd\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\'\2\2\u0108"+
		"N\3\2\2\2\26\2RW]agjorv{\u0081\u00b5\u00ba\u00bc\u00f3\u00f7\u00ff\u0103"+
		"\u0105\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}