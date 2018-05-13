package antlrTools;// Generated from languageL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_logic_expr = 1, RULE_arithm_expr = 2, RULE_expr = 3, 
		RULE_arithm_prior1 = 4, RULE_arithm_prior2 = 5, RULE_unary_op = 6, RULE_compare_op = 7, 
		RULE_logic_op = 8, RULE_arithm_atom = 9, RULE_logic_atom = 10, RULE_return_expr = 11, 
		RULE_def_func = 12, RULE_if_expr = 13, RULE_while_expr = 14, RULE_for_expr = 15, 
		RULE_for_init = 16, RULE_for_condition = 17, RULE_for_change = 18, RULE_def_var = 19, 
		RULE_assign_var = 20, RULE_ternary_expr = 21, RULE_inc_expr = 22, RULE_dec_expr = 23, 
		RULE_pass_default = 24, RULE_func_args = 25, RULE_invoke_func = 26, RULE_body = 27, 
		RULE_statment = 28, RULE_read_expr = 29, RULE_write_expr = 30;
	public static final String[] ruleNames = {
		"program", "logic_expr", "arithm_expr", "expr", "arithm_prior1", "arithm_prior2", 
		"unary_op", "compare_op", "logic_op", "arithm_atom", "logic_atom", "return_expr", 
		"def_func", "if_expr", "while_expr", "for_expr", "for_init", "for_condition", 
		"for_change", "def_var", "assign_var", "ternary_expr", "inc_expr", "dec_expr", 
		"pass_default", "func_args", "invoke_func", "body", "statment", "read_expr", 
		"write_expr"
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

	@Override
	public String getGrammarFileName() { return "languageL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public languageLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(languageLParser.EOF, 0); }
		public List<Def_funcContext> def_func() {
			return getRuleContexts(Def_funcContext.class);
		}
		public Def_funcContext def_func(int i) {
			return getRuleContext(Def_funcContext.class,i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TFUN) {
					{
					{
					setState(62);
					def_func();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIF) | (1L << TWHILE) | (1L << TREAD) | (1L << TWRITE) | (1L << TVAR) | (1L << TRETURN) | (1L << TFOR) | (1L << IDENT))) != 0)) {
					{
					{
					setState(68);
					statment();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(EOF);
				}
				break;
			case 2:
				{
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					def_func();
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TFUN );
				setState(80);
				match(EOF);
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

	public static class Logic_exprContext extends ParserRuleContext {
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
	 
		public Logic_exprContext() { }
		public void copyFrom(Logic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalCompareExprContext extends Logic_exprContext {
		public Arithm_exprContext lvalue;
		public Compare_opContext op;
		public Arithm_exprContext rvalue;
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public Compare_opContext compare_op() {
			return getRuleContext(Compare_opContext.class,0);
		}
		public LogicalCompareExprContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterLogicalCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitLogicalCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitLogicalCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryExprContext extends Logic_exprContext {
		public Logic_exprContext lvalue;
		public Logic_opContext op;
		public Logic_exprContext rvalue;
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public LogicalBinaryExprContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterLogicalBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitLogicalBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitLogicalBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalParensExprContext extends Logic_exprContext {
		public TerminalNode TRPAREN() { return getToken(languageLParser.TRPAREN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode TLPAREN() { return getToken(languageLParser.TLPAREN, 0); }
		public LogicalParensExprContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterLogicalParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitLogicalParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitLogicalParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAtomExprContext extends Logic_exprContext {
		public Logic_atomContext logic_atom() {
			return getRuleContext(Logic_atomContext.class,0);
		}
		public LogicalAtomExprContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterLogicalAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitLogicalAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitLogicalAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		return logic_expr(0);
	}

	private Logic_exprContext logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, _parentState);
		Logic_exprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_logic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalCompareExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				((LogicalCompareExprContext)_localctx).lvalue = arithm_expr(0);
				setState(86);
				((LogicalCompareExprContext)_localctx).op = compare_op();
				setState(87);
				((LogicalCompareExprContext)_localctx).rvalue = arithm_expr(0);
				}
				break;
			case 2:
				{
				_localctx = new LogicalParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(TRPAREN);
				setState(90);
				logic_expr(0);
				setState(91);
				match(TLPAREN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				logic_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalBinaryExprContext(new Logic_exprContext(_parentctx, _parentState));
					((LogicalBinaryExprContext)_localctx).lvalue = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
					setState(96);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(97);
					((LogicalBinaryExprContext)_localctx).op = logic_op();
					setState(98);
					((LogicalBinaryExprContext)_localctx).rvalue = logic_expr(4);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Arithm_exprContext extends ParserRuleContext {
		public Arithm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_expr; }
	 
		public Arithm_exprContext() { }
		public void copyFrom(Arithm_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticParensExprContext extends Arithm_exprContext {
		public TerminalNode TRPAREN() { return getToken(languageLParser.TRPAREN, 0); }
		public Arithm_exprContext arithm_expr() {
			return getRuleContext(Arithm_exprContext.class,0);
		}
		public TerminalNode TLPAREN() { return getToken(languageLParser.TLPAREN, 0); }
		public ArithmeticParensExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithmeticParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithmeticParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithmeticParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryExprContext extends Arithm_exprContext {
		public Arithm_exprContext lvalue;
		public Unary_opContext op;
		public Arithm_exprContext parametr;
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public ArithmeticUnaryExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithmeticUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithmeticUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithmeticUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticPrior2BinaryExprContext extends Arithm_exprContext {
		public Arithm_exprContext lvalue;
		public Arithm_prior2Context op;
		public Arithm_exprContext rvalue;
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public Arithm_prior2Context arithm_prior2() {
			return getRuleContext(Arithm_prior2Context.class,0);
		}
		public ArithmeticPrior2BinaryExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithmeticPrior2BinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithmeticPrior2BinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithmeticPrior2BinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticAtomExprContext extends Arithm_exprContext {
		public Arithm_atomContext arithm_atom() {
			return getRuleContext(Arithm_atomContext.class,0);
		}
		public ArithmeticAtomExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithmeticAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithmeticAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithmeticAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticPrior1BinaryExprContext extends Arithm_exprContext {
		public Arithm_exprContext lvalue;
		public Arithm_prior1Context op;
		public Arithm_exprContext rvalue;
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public Arithm_prior1Context arithm_prior1() {
			return getRuleContext(Arithm_prior1Context.class,0);
		}
		public ArithmeticPrior1BinaryExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithmeticPrior1BinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithmeticPrior1BinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithmeticPrior1BinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_exprContext arithm_expr() throws RecognitionException {
		return arithm_expr(0);
	}

	private Arithm_exprContext arithm_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithm_exprContext _localctx = new Arithm_exprContext(_ctx, _parentState);
		Arithm_exprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_arithm_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRPAREN:
				{
				_localctx = new ArithmeticParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				match(TRPAREN);
				setState(107);
				arithm_expr(0);
				setState(108);
				match(TLPAREN);
				}
				break;
			case TDIGIT:
			case IDENT:
				{
				_localctx = new ArithmeticAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				arithm_atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticUnaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticUnaryExprContext)_localctx).lvalue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						((ArithmeticUnaryExprContext)_localctx).op = unary_op();
						setState(115);
						((ArithmeticUnaryExprContext)_localctx).parametr = arithm_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticPrior1BinaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticPrior1BinaryExprContext)_localctx).lvalue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(117);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						((ArithmeticPrior1BinaryExprContext)_localctx).op = arithm_prior1();
						setState(119);
						((ArithmeticPrior1BinaryExprContext)_localctx).rvalue = arithm_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticPrior2BinaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticPrior2BinaryExprContext)_localctx).lvalue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(121);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(122);
						((ArithmeticPrior2BinaryExprContext)_localctx).op = arithm_prior2();
						setState(123);
						((ArithmeticPrior2BinaryExprContext)_localctx).rvalue = arithm_expr(4);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Arithm_exprContext arithm_expr() {
			return getRuleContext(Arithm_exprContext.class,0);
		}
		public Invoke_funcContext invoke_func() {
			return getRuleContext(Invoke_funcContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				logic_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				arithm_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				invoke_func();
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

	public static class Arithm_prior1Context extends ParserRuleContext {
		public TerminalNode TMULT() { return getToken(languageLParser.TMULT, 0); }
		public TerminalNode TDIV() { return getToken(languageLParser.TDIV, 0); }
		public TerminalNode TMOD() { return getToken(languageLParser.TMOD, 0); }
		public Arithm_prior1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_prior1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithm_prior1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithm_prior1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithm_prior1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_prior1Context arithm_prior1() throws RecognitionException {
		Arithm_prior1Context _localctx = new Arithm_prior1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithm_prior1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TMULT) | (1L << TDIV) | (1L << TMOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arithm_prior2Context extends ParserRuleContext {
		public TerminalNode TPLUS() { return getToken(languageLParser.TPLUS, 0); }
		public TerminalNode TMINUS() { return getToken(languageLParser.TMINUS, 0); }
		public Arithm_prior2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_prior2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithm_prior2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithm_prior2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithm_prior2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_prior2Context arithm_prior2() throws RecognitionException {
		Arithm_prior2Context _localctx = new Arithm_prior2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithm_prior2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==TMINUS || _la==TPLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode TPOW() { return getToken(languageLParser.TPOW, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(TPOW);
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

	public static class Compare_opContext extends ParserRuleContext {
		public TerminalNode TEQC() { return getToken(languageLParser.TEQC, 0); }
		public TerminalNode TNEQ() { return getToken(languageLParser.TNEQ, 0); }
		public TerminalNode TLT() { return getToken(languageLParser.TLT, 0); }
		public TerminalNode TGT() { return getToken(languageLParser.TGT, 0); }
		public TerminalNode TLE() { return getToken(languageLParser.TLE, 0); }
		public TerminalNode TGE() { return getToken(languageLParser.TGE, 0); }
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterCompare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitCompare_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitCompare_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEQC) | (1L << TNEQ) | (1L << TLT) | (1L << TGT) | (1L << TLE) | (1L << TGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Logic_opContext extends ParserRuleContext {
		public TerminalNode TAND() { return getToken(languageLParser.TAND, 0); }
		public TerminalNode TOR() { return getToken(languageLParser.TOR, 0); }
		public Logic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterLogic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitLogic_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitLogic_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_opContext logic_op() throws RecognitionException {
		Logic_opContext _localctx = new Logic_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==TAND || _la==TOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arithm_atomContext extends ParserRuleContext {
		public TerminalNode TDIGIT() { return getToken(languageLParser.TDIGIT, 0); }
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public Invoke_funcContext invoke_func() {
			return getRuleContext(Invoke_funcContext.class,0);
		}
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Arithm_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterArithm_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitArithm_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitArithm_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_atomContext arithm_atom() throws RecognitionException {
		Arithm_atomContext _localctx = new Arithm_atomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithm_atom);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(TDIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				invoke_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				assign_var();
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

	public static class Logic_atomContext extends ParserRuleContext {
		public TerminalNode TBOOL() { return getToken(languageLParser.TBOOL, 0); }
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public Invoke_funcContext invoke_func() {
			return getRuleContext(Invoke_funcContext.class,0);
		}
		public Logic_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterLogic_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitLogic_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitLogic_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_atomContext logic_atom() throws RecognitionException {
		Logic_atomContext _localctx = new Logic_atomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logic_atom);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(TBOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				invoke_func();
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

	public static class Return_exprContext extends ParserRuleContext {
		public TerminalNode TRETURN() { return getToken(languageLParser.TRETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterReturn_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitReturn_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitReturn_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_exprContext return_expr() throws RecognitionException {
		Return_exprContext _localctx = new Return_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TRETURN);
			setState(157);
			expr();
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

	public static class Def_funcContext extends ParserRuleContext {
		public BodyContext func_body;
		public TerminalNode TFUN() { return getToken(languageLParser.TFUN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(languageLParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(languageLParser.IDENT, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<Pass_defaultContext> pass_default() {
			return getRuleContexts(Pass_defaultContext.class);
		}
		public Pass_defaultContext pass_default(int i) {
			return getRuleContext(Pass_defaultContext.class,i);
		}
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitDef_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitDef_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_def_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(TFUN);
			setState(160);
			match(IDENT);
			setState(161);
			match(TRPAREN);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				{
				setState(163);
				match(IDENT);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						match(TCOMMA);
						setState(165);
						match(IDENT);
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TCOMMA) {
					{
					{
					setState(171);
					match(TCOMMA);
					setState(172);
					pass_default();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(178);
				pass_default();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TCOMMA) {
					{
					{
					setState(179);
					match(TCOMMA);
					setState(180);
					pass_default();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(188);
			match(TLPAREN);
			setState(189);
			((Def_funcContext)_localctx).func_body = body();
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

	public static class If_exprContext extends ParserRuleContext {
		public BodyContext if_body;
		public BodyContext else_body;
		public TerminalNode TIF() { return getToken(languageLParser.TIF, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode TELSE() { return getToken(languageLParser.TELSE, 0); }
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitIf_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitIf_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(TIF);
			setState(192);
			logic_expr(0);
			setState(193);
			((If_exprContext)_localctx).if_body = body();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TELSE) {
				{
				setState(194);
				match(TELSE);
				setState(195);
				((If_exprContext)_localctx).else_body = body();
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

	public static class While_exprContext extends ParserRuleContext {
		public BodyContext while_body;
		public TerminalNode TWHILE() { return getToken(languageLParser.TWHILE, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterWhile_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitWhile_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitWhile_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_expr);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TWHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(TWHILE);
				setState(199);
				logic_expr(0);
				setState(200);
				((While_exprContext)_localctx).while_body = body();
				}
				break;
			case TFOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				for_expr();
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

	public static class For_exprContext extends ParserRuleContext {
		public BodyContext for_body;
		public TerminalNode TFOR() { return getToken(languageLParser.TFOR, 0); }
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public For_conditionContext for_condition() {
			return getRuleContext(For_conditionContext.class,0);
		}
		public For_changeContext for_change() {
			return getRuleContext(For_changeContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitFor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitFor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(TFOR);
			setState(206);
			match(TRPAREN);
			setState(207);
			for_init();
			setState(208);
			match(TSEP);
			setState(209);
			for_condition();
			setState(210);
			match(TSEP);
			setState(211);
			for_change();
			setState(212);
			match(TLPAREN);
			setState(213);
			((For_exprContext)_localctx).for_body = body();
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

	public static class For_initContext extends ParserRuleContext {
		public Def_varContext def_var() {
			return getRuleContext(Def_varContext.class,0);
		}
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TSEP:
				{
				}
				break;
			case TVAR:
				{
				setState(216);
				def_var();
				}
				break;
			case IDENT:
				{
				setState(217);
				assign_var();
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

	public static class For_conditionContext extends ParserRuleContext {
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public For_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterFor_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitFor_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitFor_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_conditionContext for_condition() throws RecognitionException {
		For_conditionContext _localctx = new For_conditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TSEP:
				{
				}
				break;
			case TDIGIT:
			case TBOOL:
			case IDENT:
			case TRPAREN:
				{
				setState(221);
				logic_expr(0);
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

	public static class For_changeContext extends ParserRuleContext {
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public For_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterFor_change(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitFor_change(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitFor_change(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_changeContext for_change() throws RecognitionException {
		For_changeContext _localctx = new For_changeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_change);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TLPAREN:
				{
				}
				break;
			case IDENT:
				{
				setState(225);
				assign_var();
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

	public static class Def_varContext extends ParserRuleContext {
		public TerminalNode TVAR() { return getToken(languageLParser.TVAR, 0); }
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ternary_exprContext ternary_expr() {
			return getRuleContext(Ternary_exprContext.class,0);
		}
		public Def_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterDef_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitDef_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitDef_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_varContext def_var() throws RecognitionException {
		Def_varContext _localctx = new Def_varContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_def_var);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(TVAR);
				setState(229);
				match(IDENT);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEQ) {
					{
					setState(230);
					match(TEQ);
					setState(231);
					expr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(TVAR);
				setState(235);
				ternary_expr();
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

	public static class Assign_varContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ternary_exprContext ternary_expr() {
			return getRuleContext(Ternary_exprContext.class,0);
		}
		public Inc_exprContext inc_expr() {
			return getRuleContext(Inc_exprContext.class,0);
		}
		public Dec_exprContext dec_expr() {
			return getRuleContext(Dec_exprContext.class,0);
		}
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_var);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(IDENT);
				setState(239);
				match(TEQ);
				setState(240);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				ternary_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				inc_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				dec_expr();
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

	public static class Ternary_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ternary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterTernary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitTernary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitTernary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_exprContext ternary_expr() throws RecognitionException {
		Ternary_exprContext _localctx = new Ternary_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ternary_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IDENT);
			setState(247);
			match(TEQ);
			setState(248);
			logic_expr(0);
			setState(249);
			match(T__0);
			setState(250);
			expr();
			setState(251);
			match(T__1);
			setState(252);
			expr();
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

	public static class Inc_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public TerminalNode TINC() { return getToken(languageLParser.TINC, 0); }
		public Inc_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterInc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitInc_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitInc_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_exprContext inc_expr() throws RecognitionException {
		Inc_exprContext _localctx = new Inc_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inc_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(IDENT);
			setState(255);
			match(TINC);
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

	public static class Dec_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public TerminalNode TDEC() { return getToken(languageLParser.TDEC, 0); }
		public Dec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterDec_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitDec_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitDec_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_exprContext dec_expr() throws RecognitionException {
		Dec_exprContext _localctx = new Dec_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dec_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IDENT);
			setState(258);
			match(TDEC);
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

	public static class Pass_defaultContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public TerminalNode TDIGIT() { return getToken(languageLParser.TDIGIT, 0); }
		public TerminalNode TBOOL() { return getToken(languageLParser.TBOOL, 0); }
		public Pass_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterPass_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitPass_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitPass_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_defaultContext pass_default() throws RecognitionException {
		Pass_defaultContext _localctx = new Pass_defaultContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pass_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IDENT);
			setState(261);
			match(TEQ);
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==TDIGIT || _la==TBOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Func_argsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Arithm_exprContext arithm_expr() {
			return getRuleContext(Arithm_exprContext.class,0);
		}
		public Invoke_funcContext invoke_func() {
			return getRuleContext(Invoke_funcContext.class,0);
		}
		public Func_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterFunc_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitFunc_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitFunc_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_argsContext func_args() throws RecognitionException {
		Func_argsContext _localctx = new Func_argsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_func_args);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				logic_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				arithm_expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				invoke_func();
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

	public static class Invoke_funcContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public List<Func_argsContext> func_args() {
			return getRuleContexts(Func_argsContext.class);
		}
		public Func_argsContext func_args(int i) {
			return getRuleContext(Func_argsContext.class,i);
		}
		public Invoke_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterInvoke_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitInvoke_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitInvoke_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invoke_funcContext invoke_func() throws RecognitionException {
		Invoke_funcContext _localctx = new Invoke_funcContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_invoke_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(IDENT);
			setState(271);
			match(TRPAREN);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TLPAREN:
				{
				}
				break;
			case TDIGIT:
			case TBOOL:
			case IDENT:
			case TRPAREN:
				{
				setState(273);
				func_args();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TCOMMA) {
					{
					{
					setState(274);
					match(TCOMMA);
					setState(275);
					func_args();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			match(TLPAREN);
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
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(TRBRACES);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIF) | (1L << TWHILE) | (1L << TREAD) | (1L << TWRITE) | (1L << TVAR) | (1L << TRETURN) | (1L << TFOR) | (1L << IDENT))) != 0)) {
				{
				{
				setState(286);
				statment();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(TLBRACES);
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

	public static class StatmentContext extends ParserRuleContext {
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public Def_varContext def_var() {
			return getRuleContext(Def_varContext.class,0);
		}
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Invoke_funcContext invoke_func() {
			return getRuleContext(Invoke_funcContext.class,0);
		}
		public Read_exprContext read_expr() {
			return getRuleContext(Read_exprContext.class,0);
		}
		public Write_exprContext write_expr() {
			return getRuleContext(Write_exprContext.class,0);
		}
		public Return_exprContext return_expr() {
			return getRuleContext(Return_exprContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statment);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				if_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				while_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				def_var();
				setState(297);
				match(TSEP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				assign_var();
				setState(300);
				match(TSEP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				invoke_func();
				setState(303);
				match(TSEP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				read_expr();
				setState(306);
				match(TSEP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				write_expr();
				setState(309);
				match(TSEP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				return_expr();
				setState(312);
				match(TSEP);
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

	public static class Read_exprContext extends ParserRuleContext {
		public TerminalNode TREAD() { return getToken(languageLParser.TREAD, 0); }
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public Read_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterRead_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitRead_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitRead_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_exprContext read_expr() throws RecognitionException {
		Read_exprContext _localctx = new Read_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_read_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TREAD);
			setState(317);
			match(TRPAREN);
			setState(318);
			match(IDENT);
			setState(319);
			match(TLPAREN);
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

	public static class Write_exprContext extends ParserRuleContext {
		public TerminalNode TWRITE() { return getToken(languageLParser.TWRITE, 0); }
		public List<Func_argsContext> func_args() {
			return getRuleContexts(Func_argsContext.class);
		}
		public Func_argsContext func_args(int i) {
			return getRuleContext(Func_argsContext.class,i);
		}
		public Write_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).enterWrite_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageLListener ) ((languageLListener)listener).exitWrite_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageLVisitor ) return ((languageLVisitor<? extends T>)visitor).visitWrite_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_exprContext write_expr() throws RecognitionException {
		Write_exprContext _localctx = new Write_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(TWRITE);
			setState(322);
			match(TRPAREN);
			setState(323);
			func_args();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TCOMMA) {
				{
				{
				setState(324);
				match(TCOMMA);
				setState(325);
				func_args();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(TLPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		case 2:
			return arithm_expr_sempred((Arithm_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arithm_expr_sempred(Arithm_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\6\2O\n\2"+
		"\r\2\16\2P\3\2\3\2\5\2U\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3a\n\3\3\3\3\3\3\3\3\3\7\3g\n\3\f\3\16\3j\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4r\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0080"+
		"\n\4\f\4\16\4\u0083\13\4\3\5\3\5\3\5\5\5\u0088\n\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\5"+
		"\f\u009d\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a9"+
		"\n\16\f\16\16\16\u00ac\13\16\3\16\3\16\7\16\u00b0\n\16\f\16\16\16\u00b3"+
		"\13\16\3\16\3\16\3\16\7\16\u00b8\n\16\f\16\16\16\u00bb\13\16\5\16\u00bd"+
		"\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00c7\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ce\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00dd\n\22\3\23\3\23\5\23\u00e1\n\23\3"+
		"\24\3\24\5\24\u00e5\n\24\3\25\3\25\3\25\3\25\5\25\u00eb\n\25\3\25\3\25"+
		"\5\25\u00ef\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f7\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u010f\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0117\n\34\f\34\16\34\u011a\13\34\5\34\u011c\n\34\3\34"+
		"\3\34\3\35\3\35\7\35\u0122\n\35\f\35\16\35\u0125\13\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u013d\n\36\3\37\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \7 \u0149\n \f \16 \u014c\13 \3 \3 \3 \2\4\4\6!\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\3\2\30\32\4"+
		"\2\24\24\26\26\3\2\33 \3\2!\"\4\2\5\5\17\17\2\u0160\2T\3\2\2\2\4`\3\2"+
		"\2\2\6q\3\2\2\2\b\u0087\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2\2\16\u008d"+
		"\3\2\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u0097\3\2\2\2\26\u009c\3"+
		"\2\2\2\30\u009e\3\2\2\2\32\u00a1\3\2\2\2\34\u00c1\3\2\2\2\36\u00cd\3\2"+
		"\2\2 \u00cf\3\2\2\2\"\u00dc\3\2\2\2$\u00e0\3\2\2\2&\u00e4\3\2\2\2(\u00ee"+
		"\3\2\2\2*\u00f6\3\2\2\2,\u00f8\3\2\2\2.\u0100\3\2\2\2\60\u0103\3\2\2\2"+
		"\62\u0106\3\2\2\2\64\u010e\3\2\2\2\66\u0110\3\2\2\28\u011f\3\2\2\2:\u013c"+
		"\3\2\2\2<\u013e\3\2\2\2>\u0143\3\2\2\2@B\5\32\16\2A@\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2EC\3\2\2\2FH\5:\36\2GF\3\2\2\2HK\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LU\7\2\2\3MO\5\32\16\2NM\3\2\2"+
		"\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\2\2\3SU\3\2\2\2TC\3\2\2"+
		"\2TN\3\2\2\2U\3\3\2\2\2VW\b\3\1\2WX\5\6\4\2XY\5\20\t\2YZ\5\6\4\2Za\3\2"+
		"\2\2[\\\7#\2\2\\]\5\4\3\2]^\7$\2\2^a\3\2\2\2_a\5\26\f\2`V\3\2\2\2`[\3"+
		"\2\2\2`_\3\2\2\2ah\3\2\2\2bc\f\5\2\2cd\5\22\n\2de\5\4\3\6eg\3\2\2\2fb"+
		"\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2\2\2kl\b\4\1\2"+
		"lm\7#\2\2mn\5\6\4\2no\7$\2\2or\3\2\2\2pr\5\24\13\2qk\3\2\2\2qp\3\2\2\2"+
		"r\u0081\3\2\2\2st\f\7\2\2tu\5\16\b\2uv\5\6\4\bv\u0080\3\2\2\2wx\f\6\2"+
		"\2xy\5\n\6\2yz\5\6\4\7z\u0080\3\2\2\2{|\f\5\2\2|}\5\f\7\2}~\5\6\4\6~\u0080"+
		"\3\2\2\2\177s\3\2\2\2\177w\3\2\2\2\177{\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0088\5\4\3\2\u0085\u0088\5\6\4\2\u0086\u0088\5\66\34\2\u0087\u0084\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\t\3\2\2\2\u0089\u008a"+
		"\t\2\2\2\u008a\13\3\2\2\2\u008b\u008c\t\3\2\2\u008c\r\3\2\2\2\u008d\u008e"+
		"\7\27\2\2\u008e\17\3\2\2\2\u008f\u0090\t\4\2\2\u0090\21\3\2\2\2\u0091"+
		"\u0092\t\5\2\2\u0092\23\3\2\2\2\u0093\u0098\7\5\2\2\u0094\u0098\7\21\2"+
		"\2\u0095\u0098\5\66\34\2\u0096\u0098\5*\26\2\u0097\u0093\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2"+
		"\2\u0099\u009d\7\17\2\2\u009a\u009d\7\21\2\2\u009b\u009d\5\66\34\2\u009c"+
		"\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\27\3\2\2"+
		"\2\u009e\u009f\7\16\2\2\u009f\u00a0\5\b\5\2\u00a0\31\3\2\2\2\u00a1\u00a2"+
		"\7\f\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00bc\7#\2\2\u00a4\u00bd\3\2\2\2\u00a5"+
		"\u00aa\7\21\2\2\u00a6\u00a7\7(\2\2\u00a7\u00a9\7\21\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00b1\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae\u00b0\5\62"+
		"\32\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00bd\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b9\5\62"+
		"\32\2\u00b5\u00b6\7(\2\2\u00b6\u00b8\5\62\32\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00a4\3\2\2\2\u00bc\u00a5\3\2\2\2\u00bc"+
		"\u00b4\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7$\2\2\u00bf\u00c0\58\35"+
		"\2\u00c0\33\3\2\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\5\4\3\2\u00c3\u00c6"+
		"\58\35\2\u00c4\u00c5\7\7\2\2\u00c5\u00c7\58\35\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\5\4\3"+
		"\2\u00ca\u00cb\58\35\2\u00cb\u00ce\3\2\2\2\u00cc\u00ce\5 \21\2\u00cd\u00c8"+
		"\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\37\3\2\2\2\u00cf\u00d0\7\20\2\2\u00d0"+
		"\u00d1\7#\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\7\'\2\2\u00d3\u00d4\5$"+
		"\23\2\u00d4\u00d5\7\'\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\7$\2\2\u00d7"+
		"\u00d8\58\35\2\u00d8!\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dd\5(\25\2"+
		"\u00db\u00dd\5*\26\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd#\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\4\3\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1%\3\2\2\2\u00e2\u00e5\3\2\2\2"+
		"\u00e3\u00e5\5*\26\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\'\3"+
		"\2\2\2\u00e6\u00e7\7\r\2\2\u00e7\u00ea\7\21\2\2\u00e8\u00e9\7\22\2\2\u00e9"+
		"\u00eb\5\b\5\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2"+
		"\2\2\u00ec\u00ed\7\r\2\2\u00ed\u00ef\5,\27\2\u00ee\u00e6\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00f1\7\21\2\2\u00f1\u00f2\7\22\2"+
		"\2\u00f2\u00f7\5\b\5\2\u00f3\u00f7\5,\27\2\u00f4\u00f7\5.\30\2\u00f5\u00f7"+
		"\5\60\31\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\u00f6\u00f5\3\2\2\2\u00f7+\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9\u00fa\7"+
		"\22\2\2\u00fa\u00fb\5\4\3\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5\b\5\2\u00fd"+
		"\u00fe\7\4\2\2\u00fe\u00ff\5\b\5\2\u00ff-\3\2\2\2\u0100\u0101\7\21\2\2"+
		"\u0101\u0102\7\25\2\2\u0102/\3\2\2\2\u0103\u0104\7\21\2\2\u0104\u0105"+
		"\7\23\2\2\u0105\61\3\2\2\2\u0106\u0107\7\21\2\2\u0107\u0108\7\22\2\2\u0108"+
		"\u0109\t\6\2\2\u0109\63\3\2\2\2\u010a\u010f\7\21\2\2\u010b\u010f\5\4\3"+
		"\2\u010c\u010f\5\6\4\2\u010d\u010f\5\66\34\2\u010e\u010a\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\65\3\2\2"+
		"\2\u0110\u0111\7\21\2\2\u0111\u011b\7#\2\2\u0112\u011c\3\2\2\2\u0113\u0118"+
		"\5\64\33\2\u0114\u0115\7(\2\2\u0115\u0117\5\64\33\2\u0116\u0114\3\2\2"+
		"\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0112\3\2\2\2\u011b\u0113\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\7$\2\2\u011e\67\3\2\2\2\u011f\u0123\7%\2\2"+
		"\u0120\u0122\5:\36\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0127\7&\2\2\u01279\3\2\2\2\u0128\u013d\5\34\17\2\u0129\u013d\5\36\20"+
		"\2\u012a\u012b\5(\25\2\u012b\u012c\7\'\2\2\u012c\u013d\3\2\2\2\u012d\u012e"+
		"\5*\26\2\u012e\u012f\7\'\2\2\u012f\u013d\3\2\2\2\u0130\u0131\5\66\34\2"+
		"\u0131\u0132\7\'\2\2\u0132\u013d\3\2\2\2\u0133\u0134\5<\37\2\u0134\u0135"+
		"\7\'\2\2\u0135\u013d\3\2\2\2\u0136\u0137\5> \2\u0137\u0138\7\'\2\2\u0138"+
		"\u013d\3\2\2\2\u0139\u013a\5\30\r\2\u013a\u013b\7\'\2\2\u013b\u013d\3"+
		"\2\2\2\u013c\u0128\3\2\2\2\u013c\u0129\3\2\2\2\u013c\u012a\3\2\2\2\u013c"+
		"\u012d\3\2\2\2\u013c\u0130\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u0136\3\2"+
		"\2\2\u013c\u0139\3\2\2\2\u013d;\3\2\2\2\u013e\u013f\7\n\2\2\u013f\u0140"+
		"\7#\2\2\u0140\u0141\7\21\2\2\u0141\u0142\7$\2\2\u0142=\3\2\2\2\u0143\u0144"+
		"\7\13\2\2\u0144\u0145\7#\2\2\u0145\u014a\5\64\33\2\u0146\u0147\7(\2\2"+
		"\u0147\u0149\5\64\33\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u014e\7$\2\2\u014e?\3\2\2\2 CIPT`hq\177\u0081\u0087\u0097\u009c\u00aa"+
		"\u00b1\u00b9\u00bc\u00c6\u00cd\u00dc\u00e0\u00e4\u00ea\u00ee\u00f6\u010e"+
		"\u0118\u011b\u0123\u013c\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}