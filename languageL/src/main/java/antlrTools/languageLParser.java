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
		TDIGIT=1, TIF=2, TELSE=3, TWHILE=4, TDO=5, TREAD=6, TWRITE=7, TFUN=8, 
		TVAR=9, TRETURN=10, TBOOL=11, IDENT=12, COMMENT=13, TEQ=14, TMINUS=15, 
		TPLUS=16, TPOW=17, TMULT=18, TDIV=19, TMOD=20, TEQC=21, TNEQ=22, TLT=23, 
		TGT=24, TLE=25, TGE=26, TAND=27, TOR=28, TRPAREN=29, TLPAREN=30, TRBRACES=31, 
		TLBRACES=32, TSEP=33, TCOMMA=34, WS=35;
	public static final int
		RULE_program = 0, RULE_logic_expr = 1, RULE_arithm_expr = 2, RULE_expr = 3, 
		RULE_arithm_prior1 = 4, RULE_arithm_prior2 = 5, RULE_unary_op = 6, RULE_compare_op = 7, 
		RULE_logic_op = 8, RULE_arithm_atom = 9, RULE_logic_atom = 10, RULE_return_expr = 11, 
		RULE_def_func = 12, RULE_if_expr = 13, RULE_while_expr = 14, RULE_def_var = 15, 
		RULE_assign_var = 16, RULE_pass_default = 17, RULE_func_args = 18, RULE_invoke_func = 19, 
		RULE_body = 20, RULE_statment = 21, RULE_read_expr = 22, RULE_write_expr = 23;
	public static final String[] ruleNames = {
		"program", "logic_expr", "arithm_expr", "expr", "arithm_prior1", "arithm_prior2", 
		"unary_op", "compare_op", "logic_op", "arithm_atom", "logic_atom", "return_expr", 
		"def_func", "if_expr", "while_expr", "def_var", "assign_var", "pass_default", 
		"func_args", "invoke_func", "body", "statment", "read_expr", "write_expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'else'", "'while'", "'do'", "'read'", "'write'", 
		"'fun'", "'var'", "'return'", null, null, null, "'='", "'-'", "'+'", "'**'", 
		"'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", 
		"'||'", "'('", "')'", "'{'", "'}'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TDIGIT", "TIF", "TELSE", "TWHILE", "TDO", "TREAD", "TWRITE", "TFUN", 
		"TVAR", "TRETURN", "TBOOL", "IDENT", "COMMENT", "TEQ", "TMINUS", "TPLUS", 
		"TPOW", "TMULT", "TDIV", "TMOD", "TEQC", "TNEQ", "TLT", "TGT", "TLE", 
		"TGE", "TAND", "TOR", "TRPAREN", "TLPAREN", "TRBRACES", "TLBRACES", "TSEP", 
		"TCOMMA", "WS"
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TFUN) {
					{
					{
					setState(48);
					def_func();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIF) | (1L << TWHILE) | (1L << TREAD) | (1L << TWRITE) | (1L << TVAR) | (1L << TRETURN) | (1L << IDENT))) != 0)) {
					{
					{
					setState(54);
					statment();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(EOF);
				}
				break;
			case 2:
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					def_func();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TFUN );
				setState(66);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalCompareExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(71);
				((LogicalCompareExprContext)_localctx).lvalue = arithm_expr(0);
				setState(72);
				((LogicalCompareExprContext)_localctx).op = compare_op();
				setState(73);
				((LogicalCompareExprContext)_localctx).rvalue = arithm_expr(0);
				}
				break;
			case 2:
				{
				_localctx = new LogicalParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(TRPAREN);
				setState(76);
				logic_expr(0);
				setState(77);
				match(TLPAREN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				logic_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
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
					setState(82);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(83);
					((LogicalBinaryExprContext)_localctx).op = logic_op();
					setState(84);
					((LogicalBinaryExprContext)_localctx).rvalue = logic_expr(4);
					}
					} 
				}
				setState(90);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRPAREN:
				{
				_localctx = new ArithmeticParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(92);
				match(TRPAREN);
				setState(93);
				arithm_expr(0);
				setState(94);
				match(TLPAREN);
				}
				break;
			case TDIGIT:
			case IDENT:
				{
				_localctx = new ArithmeticAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				arithm_atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticUnaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticUnaryExprContext)_localctx).lvalue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100);
						((ArithmeticUnaryExprContext)_localctx).op = unary_op();
						setState(101);
						((ArithmeticUnaryExprContext)_localctx).parametr = arithm_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticPrior1BinaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticPrior1BinaryExprContext)_localctx).lvalue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						((ArithmeticPrior1BinaryExprContext)_localctx).op = arithm_prior1();
						setState(105);
						((ArithmeticPrior1BinaryExprContext)_localctx).rvalue = arithm_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticPrior2BinaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticPrior2BinaryExprContext)_localctx).lvalue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(108);
						((ArithmeticPrior2BinaryExprContext)_localctx).op = arithm_prior2();
						setState(109);
						((ArithmeticPrior2BinaryExprContext)_localctx).rvalue = arithm_expr(4);
						}
						break;
					}
					} 
				}
				setState(115);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				logic_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				arithm_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
			setState(121);
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
			setState(123);
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
			setState(125);
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
			setState(127);
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
			setState(129);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(TDIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(TBOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
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
			setState(141);
			match(TRETURN);
			setState(142);
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
			setState(144);
			match(TFUN);
			setState(145);
			match(IDENT);
			setState(146);
			match(TRPAREN);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				{
				setState(148);
				match(IDENT);
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						match(TCOMMA);
						setState(150);
						match(IDENT);
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TCOMMA) {
					{
					{
					setState(156);
					match(TCOMMA);
					setState(157);
					pass_default();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(163);
				pass_default();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TCOMMA) {
					{
					{
					setState(164);
					match(TCOMMA);
					setState(165);
					pass_default();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(173);
			match(TLPAREN);
			setState(174);
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
			setState(176);
			match(TIF);
			setState(177);
			logic_expr(0);
			setState(178);
			((If_exprContext)_localctx).if_body = body();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TELSE) {
				{
				setState(179);
				match(TELSE);
				setState(180);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(TWHILE);
			setState(184);
			logic_expr(0);
			setState(185);
			((While_exprContext)_localctx).while_body = body();
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
		enterRule(_localctx, 30, RULE_def_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(TVAR);
			setState(188);
			match(IDENT);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEQ) {
				{
				setState(189);
				match(TEQ);
				setState(190);
				expr();
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

	public static class Assign_varContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(languageLParser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 32, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IDENT);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEQ) {
				{
				setState(194);
				match(TEQ);
				setState(195);
				expr();
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
		enterRule(_localctx, 34, RULE_pass_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IDENT);
			setState(199);
			match(TEQ);
			setState(200);
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
		enterRule(_localctx, 36, RULE_func_args);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				logic_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				arithm_expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
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
		enterRule(_localctx, 38, RULE_invoke_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IDENT);
			setState(209);
			match(TRPAREN);
			setState(219);
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
				setState(211);
				func_args();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TCOMMA) {
					{
					{
					setState(212);
					match(TCOMMA);
					setState(213);
					func_args();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
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
		enterRule(_localctx, 40, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(TRBRACES);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIF) | (1L << TWHILE) | (1L << TREAD) | (1L << TWRITE) | (1L << TVAR) | (1L << TRETURN) | (1L << IDENT))) != 0)) {
				{
				{
				setState(224);
				statment();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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
		enterRule(_localctx, 42, RULE_statment);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				if_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				while_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				def_var();
				setState(235);
				match(TSEP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				assign_var();
				setState(238);
				match(TSEP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				invoke_func();
				setState(241);
				match(TSEP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				read_expr();
				setState(244);
				match(TSEP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				write_expr();
				setState(247);
				match(TSEP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				return_expr();
				setState(250);
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
		enterRule(_localctx, 44, RULE_read_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(TREAD);
			setState(255);
			match(TRPAREN);
			setState(256);
			match(IDENT);
			setState(257);
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
		enterRule(_localctx, 46, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(TWRITE);
			setState(260);
			match(TRPAREN);
			setState(261);
			func_args();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TCOMMA) {
				{
				{
				setState(262);
				match(TCOMMA);
				setState(263);
				func_args();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\6"+
		"\2A\n\2\r\2\16\2B\3\2\3\2\5\2G\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3S\n\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"r\n\4\f\4\16\4u\13\4\3\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\5\f\u008e\n\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009a\n\16\f\16\16"+
		"\16\u009d\13\16\3\16\3\16\7\16\u00a1\n\16\f\16\16\16\u00a4\13\16\3\16"+
		"\3\16\3\16\7\16\u00a9\n\16\f\16\16\16\u00ac\13\16\5\16\u00ae\n\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00c2\n\21\3\22\3\22\3\22\5\22\u00c7\n\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u00d9\n\25\f\25\16\25\u00dc\13\25\5\25\u00de\n\25"+
		"\3\25\3\25\3\26\3\26\7\26\u00e4\n\26\f\26\16\26\u00e7\13\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ff\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u010b\n\31\f\31\16\31\u010e\13\31\3\31"+
		"\3\31\3\31\2\4\4\6\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\2\7\3\2\24\26\3\2\21\22\3\2\27\34\3\2\35\36\4\2\3\3\r\r\2\u0120\2"+
		"F\3\2\2\2\4R\3\2\2\2\6c\3\2\2\2\by\3\2\2\2\n{\3\2\2\2\f}\3\2\2\2\16\177"+
		"\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0088\3\2\2\2\26\u008d\3"+
		"\2\2\2\30\u008f\3\2\2\2\32\u0092\3\2\2\2\34\u00b2\3\2\2\2\36\u00b9\3\2"+
		"\2\2 \u00bd\3\2\2\2\"\u00c3\3\2\2\2$\u00c8\3\2\2\2&\u00d0\3\2\2\2(\u00d2"+
		"\3\2\2\2*\u00e1\3\2\2\2,\u00fe\3\2\2\2.\u0100\3\2\2\2\60\u0105\3\2\2\2"+
		"\62\64\5\32\16\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66;\3\2\2\2\67\65\3\2\2\28:\5,\27\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;"+
		"<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>G\7\2\2\3?A\5\32\16\2@?\3\2\2\2AB\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\2\2\3EG\3\2\2\2F\65\3\2\2\2F@\3\2"+
		"\2\2G\3\3\2\2\2HI\b\3\1\2IJ\5\6\4\2JK\5\20\t\2KL\5\6\4\2LS\3\2\2\2MN\7"+
		"\37\2\2NO\5\4\3\2OP\7 \2\2PS\3\2\2\2QS\5\26\f\2RH\3\2\2\2RM\3\2\2\2RQ"+
		"\3\2\2\2SZ\3\2\2\2TU\f\5\2\2UV\5\22\n\2VW\5\4\3\6WY\3\2\2\2XT\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\5\3\2\2\2\\Z\3\2\2\2]^\b\4\1\2^_\7\37"+
		"\2\2_`\5\6\4\2`a\7 \2\2ad\3\2\2\2bd\5\24\13\2c]\3\2\2\2cb\3\2\2\2ds\3"+
		"\2\2\2ef\f\7\2\2fg\5\16\b\2gh\5\6\4\bhr\3\2\2\2ij\f\6\2\2jk\5\n\6\2kl"+
		"\5\6\4\7lr\3\2\2\2mn\f\5\2\2no\5\f\7\2op\5\6\4\6pr\3\2\2\2qe\3\2\2\2q"+
		"i\3\2\2\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\7\3\2\2\2us\3\2\2\2"+
		"vz\5\4\3\2wz\5\6\4\2xz\5(\25\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\t\3\2\2"+
		"\2{|\t\2\2\2|\13\3\2\2\2}~\t\3\2\2~\r\3\2\2\2\177\u0080\7\23\2\2\u0080"+
		"\17\3\2\2\2\u0081\u0082\t\4\2\2\u0082\21\3\2\2\2\u0083\u0084\t\5\2\2\u0084"+
		"\23\3\2\2\2\u0085\u0089\7\3\2\2\u0086\u0089\7\16\2\2\u0087\u0089\5(\25"+
		"\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\25"+
		"\3\2\2\2\u008a\u008e\7\r\2\2\u008b\u008e\7\16\2\2\u008c\u008e\5(\25\2"+
		"\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\27"+
		"\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5\b\5\2\u0091\31\3\2\2\2\u0092"+
		"\u0093\7\n\2\2\u0093\u0094\7\16\2\2\u0094\u00ad\7\37\2\2\u0095\u00ae\3"+
		"\2\2\2\u0096\u009b\7\16\2\2\u0097\u0098\7$\2\2\u0098\u009a\7\16\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u00a2\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7$\2\2\u009f"+
		"\u00a1\5$\23\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ae\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00aa\5$\23\2\u00a6\u00a7\7$\2\2\u00a7\u00a9\5$\23\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u0095\3\2\2\2\u00ad\u0096\3\2"+
		"\2\2\u00ad\u00a5\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7 \2\2\u00b0"+
		"\u00b1\5*\26\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5\4\3"+
		"\2\u00b4\u00b7\5*\26\2\u00b5\u00b6\7\5\2\2\u00b6\u00b8\5*\26\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\6\2\2\u00ba"+
		"\u00bb\5\4\3\2\u00bb\u00bc\5*\26\2\u00bc\37\3\2\2\2\u00bd\u00be\7\13\2"+
		"\2\u00be\u00c1\7\16\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c2\5\b\5\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c6\7\16\2\2"+
		"\u00c4\u00c5\7\20\2\2\u00c5\u00c7\5\b\5\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7\16\2\2\u00c9\u00ca\7\20\2\2\u00ca"+
		"\u00cb\t\6\2\2\u00cb%\3\2\2\2\u00cc\u00d1\7\16\2\2\u00cd\u00d1\5\4\3\2"+
		"\u00ce\u00d1\5\6\4\2\u00cf\u00d1\5(\25\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\'\3\2\2\2\u00d2"+
		"\u00d3\7\16\2\2\u00d3\u00dd\7\37\2\2\u00d4\u00de\3\2\2\2\u00d5\u00da\5"+
		"&\24\2\u00d6\u00d7\7$\2\2\u00d7\u00d9\5&\24\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\7 \2\2\u00e0)\3\2\2\2\u00e1\u00e5\7!\2\2\u00e2"+
		"\u00e4\5,\27\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7\"\2\2\u00e9+\3\2\2\2\u00ea\u00ff\5\34\17\2\u00eb\u00ff\5\36\20"+
		"\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\7#\2\2\u00ee\u00ff\3\2\2\2\u00ef\u00f0"+
		"\5\"\22\2\u00f0\u00f1\7#\2\2\u00f1\u00ff\3\2\2\2\u00f2\u00f3\5(\25\2\u00f3"+
		"\u00f4\7#\2\2\u00f4\u00ff\3\2\2\2\u00f5\u00f6\5.\30\2\u00f6\u00f7\7#\2"+
		"\2\u00f7\u00ff\3\2\2\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\7#\2\2\u00fa"+
		"\u00ff\3\2\2\2\u00fb\u00fc\5\30\r\2\u00fc\u00fd\7#\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00ea\3\2\2\2\u00fe\u00eb\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe"+
		"\u00ef\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3\2"+
		"\2\2\u00fe\u00fb\3\2\2\2\u00ff-\3\2\2\2\u0100\u0101\7\b\2\2\u0101\u0102"+
		"\7\37\2\2\u0102\u0103\7\16\2\2\u0103\u0104\7 \2\2\u0104/\3\2\2\2\u0105"+
		"\u0106\7\t\2\2\u0106\u0107\7\37\2\2\u0107\u010c\5&\24\2\u0108\u0109\7"+
		"$\2\2\u0109\u010b\5&\24\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0110\7 \2\2\u0110\61\3\2\2\2\33\65;BFRZcqsy\u0088\u008d\u009b"+
		"\u00a2\u00aa\u00ad\u00b7\u00c1\u00c6\u00d0\u00da\u00dd\u00e5\u00fe\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}