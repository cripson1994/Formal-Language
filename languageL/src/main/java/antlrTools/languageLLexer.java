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
public class languageLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TDIGIT=3, TIF=4, TELSE=5, TWHILE=6, TDO=7, TREAD=8, TWRITE=9, 
		TFUN=10, TVAR=11, TRETURN=12, TBOOL=13, TFOR=14, IDENT=15, TEQ=16, TDEC=17, 
		TMINUS=18, TINC=19, TPLUS=20, TPOW=21, TMULT=22, TDIV=23, TMOD=24, TEQC=25, 
		TNEQ=26, TLT=27, TGT=28, TLE=29, TGE=30, TAND=31, TOR=32, TRPAREN=33, 
		TLPAREN=34, TRBRACES=35, TLBRACES=36, TSEP=37, TCOMMA=38, WS=39, LINE_COMMENT=40, 
		MULTY_COMMENT=41, COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INT", "FLOAT", "EXPONENT", "LETTER", "DIGIT", "TDIGIT", 
		"TIF", "TELSE", "TWHILE", "TDO", "TREAD", "TWRITE", "TFUN", "TVAR", "TRETURN", 
		"TBOOL", "TFOR", "IDENT", "TEQ", "TDEC", "TMINUS", "TINC", "TPLUS", "TPOW", 
		"TMULT", "TDIV", "TMOD", "TEQC", "TNEQ", "TLT", "TGT", "TLE", "TGE", "TAND", 
		"TOR", "TRPAREN", "TLPAREN", "TRBRACES", "TLBRACES", "TSEP", "TCOMMA", 
		"WS", "LINE_COMMENT", "MULTY_COMMENT", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", "':'", null, "'if'", "'else'", "'while'", "'do'", "'read'", 
		"'write'", "'fun'", "'var'", "'return'", null, "'for'", null, "'='", "'--'", 
		"'-'", "'++'", "'+'", "'**'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", 
		"'>'", "'<='", "'>='", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "';'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "TDIGIT", "TIF", "TELSE", "TWHILE", "TDO", "TREAD", 
		"TWRITE", "TFUN", "TVAR", "TRETURN", "TBOOL", "TFOR", "IDENT", "TEQ", 
		"TDEC", "TMINUS", "TINC", "TPLUS", "TPOW", "TMULT", "TDIV", "TMOD", "TEQC", 
		"TNEQ", "TLT", "TGT", "TLE", "TGE", "TAND", "TOR", "TRPAREN", "TLPAREN", 
		"TRBRACES", "TLBRACES", "TSEP", "TCOMMA", "WS", "LINE_COMMENT", "MULTY_COMMENT", 
		"COMMENT"
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


	public languageLLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\6\4g\n\4\r\4\16\4"+
		"h\3\5\6\5l\n\5\r\5\16\5m\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\5\5\5x\n\5"+
		"\3\5\3\5\6\5|\n\5\r\5\16\5}\3\5\5\5\u0081\n\5\3\5\6\5\u0084\n\5\r\5\16"+
		"\5\u0085\3\5\5\5\u0089\n\5\3\6\3\6\5\6\u008d\n\6\3\6\6\6\u0090\n\6\r\6"+
		"\16\6\u0091\3\7\3\7\3\b\3\b\5\b\u0098\n\b\3\t\5\t\u009b\n\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\5\25\u00db\n\25\3\25\3\25\3\25\7\25\u00e0\n\25\f\25\16"+
		"\25\u00e3\13\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\5-\u011e\n-\3-\3-\6-\u0122\n-\r-\16-\u0123"+
		"\3-\3-\3.\3.\3.\3.\7.\u012c\n.\f.\16.\u012f\13.\3.\3.\3/\3/\3/\3/\7/\u0137"+
		"\n/\f/\16/\u013a\13/\3/\3/\3/\3/\3/\3\60\3\60\5\60\u0143\n\60\3\u0138"+
		"\2\61\3\3\5\4\7\2\t\2\13\2\r\2\17\2\21\5\23\6\25\7\27\b\31\t\33\n\35\13"+
		"\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32"+
		"=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,\3\2\6\4\2GGgg\4\2--/"+
		"/\4\2C\\c|\4\2\f\f\17\17\2\u0157\2\3\3\2\2\2\2\5\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\t"+
		"\u0088\3\2\2\2\13\u008a\3\2\2\2\r\u0093\3\2\2\2\17\u0097\3\2\2\2\21\u009a"+
		"\3\2\2\2\23\u009e\3\2\2\2\25\u00a1\3\2\2\2\27\u00a6\3\2\2\2\31\u00ac\3"+
		"\2\2\2\33\u00af\3\2\2\2\35\u00b4\3\2\2\2\37\u00ba\3\2\2\2!\u00be\3\2\2"+
		"\2#\u00c2\3\2\2\2%\u00d2\3\2\2\2\'\u00d4\3\2\2\2)\u00da\3\2\2\2+\u00e4"+
		"\3\2\2\2-\u00e6\3\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2\63\u00ee\3\2\2"+
		"\2\65\u00f0\3\2\2\2\67\u00f3\3\2\2\29\u00f5\3\2\2\2;\u00f7\3\2\2\2=\u00f9"+
		"\3\2\2\2?\u00fc\3\2\2\2A\u00ff\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G"+
		"\u0106\3\2\2\2I\u0109\3\2\2\2K\u010c\3\2\2\2M\u010f\3\2\2\2O\u0111\3\2"+
		"\2\2Q\u0113\3\2\2\2S\u0115\3\2\2\2U\u0117\3\2\2\2W\u0119\3\2\2\2Y\u0121"+
		"\3\2\2\2[\u0127\3\2\2\2]\u0132\3\2\2\2_\u0142\3\2\2\2ab\7A\2\2b\4\3\2"+
		"\2\2cd\7<\2\2d\6\3\2\2\2eg\4\62;\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2i\b\3\2\2\2jl\4\62;\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3"+
		"\2\2\2os\7\60\2\2pr\4\62;\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw"+
		"\3\2\2\2us\3\2\2\2vx\5\13\6\2wv\3\2\2\2wx\3\2\2\2x\u0089\3\2\2\2y{\7\60"+
		"\2\2z|\4\62;\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2"+
		"\177\u0081\5\13\6\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0089"+
		"\3\2\2\2\u0082\u0084\4\62;\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\5\13"+
		"\6\2\u0088k\3\2\2\2\u0088y\3\2\2\2\u0088\u0083\3\2\2\2\u0089\n\3\2\2\2"+
		"\u008a\u008c\t\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\4\62;\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\f\3\2\2\2"+
		"\u0093\u0094\t\4\2\2\u0094\16\3\2\2\2\u0095\u0098\5\7\4\2\u0096\u0098"+
		"\5\t\5\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\20\3\2\2\2\u0099"+
		"\u009b\7/\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\5\17\b\2\u009d\22\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7y\2\2\u00a7\u00a8"+
		"\7j\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\30\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7q\2\2\u00ae\32\3\2\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7f\2\2"+
		"\u00b3\34\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7"+
		"k\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\36\3\2\2\2\u00ba\u00bb"+
		"\7h\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7p\2\2\u00bd \3\2\2\2\u00be\u00bf"+
		"\7x\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7t\2\2\u00c1\"\3\2\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7w\2\2\u00c6"+
		"\u00c7\7t\2\2\u00c7\u00c8\7p\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7w\2\2\u00cc\u00d3\7g\2\2\u00cd\u00ce\7h\2\2"+
		"\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d3"+
		"\7g\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3&\3\2\2\2\u00d4\u00d5"+
		"\7h\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7(\3\2\2\2\u00d8\u00db"+
		"\5\r\7\2\u00d9\u00db\7a\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00e1\3\2\2\2\u00dc\u00e0\5\r\7\2\u00dd\u00e0\7a\2\2\u00de\u00e0\5\17"+
		"\b\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2*\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7/"+
		"\2\2\u00e7\u00e8\7/\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\60\3\2"+
		"\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed\7-\2\2\u00ed\62\3\2\2\2\u00ee\u00ef"+
		"\7-\2\2\u00ef\64\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\7,\2\2\u00f2\66"+
		"\3\2\2\2\u00f3\u00f4\7,\2\2\u00f48\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6"+
		":\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa"+
		"\u00fb\7?\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\7?\2\2\u00fe"+
		"@\3\2\2\2\u00ff\u0100\7>\2\2\u0100B\3\2\2\2\u0101\u0102\7@\2\2\u0102D"+
		"\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0105\7?\2\2\u0105F\3\2\2\2\u0106\u0107"+
		"\7@\2\2\u0107\u0108\7?\2\2\u0108H\3\2\2\2\u0109\u010a\7(\2\2\u010a\u010b"+
		"\7(\2\2\u010bJ\3\2\2\2\u010c\u010d\7~\2\2\u010d\u010e\7~\2\2\u010eL\3"+
		"\2\2\2\u010f\u0110\7*\2\2\u0110N\3\2\2\2\u0111\u0112\7+\2\2\u0112P\3\2"+
		"\2\2\u0113\u0114\7}\2\2\u0114R\3\2\2\2\u0115\u0116\7\177\2\2\u0116T\3"+
		"\2\2\2\u0117\u0118\7=\2\2\u0118V\3\2\2\2\u0119\u011a\7.\2\2\u011aX\3\2"+
		"\2\2\u011b\u0122\7\13\2\2\u011c\u011e\7\17\2\2\u011d\u011c\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122\7\f\2\2\u0120\u0122\7\""+
		"\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\b-\2\2\u0126Z\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129"+
		"\7\61\2\2\u0129\u012d\3\2\2\2\u012a\u012c\n\5\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\b.\2\2\u0131\\\3\2\2\2\u0132"+
		"\u0133\7\61\2\2\u0133\u0134\7,\2\2\u0134\u0138\3\2\2\2\u0135\u0137\13"+
		"\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7,"+
		"\2\2\u013c\u013d\7\61\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b/\2\2\u013f"+
		"^\3\2\2\2\u0140\u0143\5[.\2\u0141\u0143\5]/\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143`\3\2\2\2\31\2hmsw}\u0080\u0085\u0088\u008c\u0091"+
		"\u0097\u009a\u00d2\u00da\u00df\u00e1\u011d\u0121\u0123\u012d\u0138\u0142"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}