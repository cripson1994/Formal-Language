package antlrTools;// Generated from languageL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageLParser}.
 */
public interface languageLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(languageLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(languageLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalCompareExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalCompareExpr(languageLParser.LogicalCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalCompareExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalCompareExpr(languageLParser.LogicalCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalBinaryExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinaryExpr(languageLParser.LogicalBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalBinaryExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinaryExpr(languageLParser.LogicalBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalParensExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalParensExpr(languageLParser.LogicalParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalParensExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalParensExpr(languageLParser.LogicalParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAtomExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAtomExpr(languageLParser.LogicalAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAtomExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAtomExpr(languageLParser.LogicalAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticParensExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticParensExpr(languageLParser.ArithmeticParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticParensExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticParensExpr(languageLParser.ArithmeticParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticUnaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnaryExpr(languageLParser.ArithmeticUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticUnaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnaryExpr(languageLParser.ArithmeticUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticPrior2BinaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPrior2BinaryExpr(languageLParser.ArithmeticPrior2BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticPrior2BinaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPrior2BinaryExpr(languageLParser.ArithmeticPrior2BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticAtomExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAtomExpr(languageLParser.ArithmeticAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticAtomExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAtomExpr(languageLParser.ArithmeticAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticPrior1BinaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPrior1BinaryExpr(languageLParser.ArithmeticPrior1BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticPrior1BinaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPrior1BinaryExpr(languageLParser.ArithmeticPrior1BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(languageLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(languageLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#arithm_prior1}.
	 * @param ctx the parse tree
	 */
	void enterArithm_prior1(languageLParser.Arithm_prior1Context ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#arithm_prior1}.
	 * @param ctx the parse tree
	 */
	void exitArithm_prior1(languageLParser.Arithm_prior1Context ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#arithm_prior2}.
	 * @param ctx the parse tree
	 */
	void enterArithm_prior2(languageLParser.Arithm_prior2Context ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#arithm_prior2}.
	 * @param ctx the parse tree
	 */
	void exitArithm_prior2(languageLParser.Arithm_prior2Context ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(languageLParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(languageLParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(languageLParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(languageLParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#logic_op}.
	 * @param ctx the parse tree
	 */
	void enterLogic_op(languageLParser.Logic_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#logic_op}.
	 * @param ctx the parse tree
	 */
	void exitLogic_op(languageLParser.Logic_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#arithm_atom}.
	 * @param ctx the parse tree
	 */
	void enterArithm_atom(languageLParser.Arithm_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#arithm_atom}.
	 * @param ctx the parse tree
	 */
	void exitArithm_atom(languageLParser.Arithm_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#logic_atom}.
	 * @param ctx the parse tree
	 */
	void enterLogic_atom(languageLParser.Logic_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#logic_atom}.
	 * @param ctx the parse tree
	 */
	void exitLogic_atom(languageLParser.Logic_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#return_expr}.
	 * @param ctx the parse tree
	 */
	void enterReturn_expr(languageLParser.Return_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#return_expr}.
	 * @param ctx the parse tree
	 */
	void exitReturn_expr(languageLParser.Return_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#def_func}.
	 * @param ctx the parse tree
	 */
	void enterDef_func(languageLParser.Def_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#def_func}.
	 * @param ctx the parse tree
	 */
	void exitDef_func(languageLParser.Def_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(languageLParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(languageLParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expr(languageLParser.While_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expr(languageLParser.While_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr(languageLParser.For_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr(languageLParser.For_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(languageLParser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(languageLParser.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(languageLParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(languageLParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#for_change}.
	 * @param ctx the parse tree
	 */
	void enterFor_change(languageLParser.For_changeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#for_change}.
	 * @param ctx the parse tree
	 */
	void exitFor_change(languageLParser.For_changeContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#def_var}.
	 * @param ctx the parse tree
	 */
	void enterDef_var(languageLParser.Def_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#def_var}.
	 * @param ctx the parse tree
	 */
	void exitDef_var(languageLParser.Def_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(languageLParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(languageLParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#ternary_expr}.
	 * @param ctx the parse tree
	 */
	void enterTernary_expr(languageLParser.Ternary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#ternary_expr}.
	 * @param ctx the parse tree
	 */
	void exitTernary_expr(languageLParser.Ternary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#inc_expr}.
	 * @param ctx the parse tree
	 */
	void enterInc_expr(languageLParser.Inc_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#inc_expr}.
	 * @param ctx the parse tree
	 */
	void exitInc_expr(languageLParser.Inc_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#dec_expr}.
	 * @param ctx the parse tree
	 */
	void enterDec_expr(languageLParser.Dec_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#dec_expr}.
	 * @param ctx the parse tree
	 */
	void exitDec_expr(languageLParser.Dec_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#pass_default}.
	 * @param ctx the parse tree
	 */
	void enterPass_default(languageLParser.Pass_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#pass_default}.
	 * @param ctx the parse tree
	 */
	void exitPass_default(languageLParser.Pass_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(languageLParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(languageLParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#invoke_func}.
	 * @param ctx the parse tree
	 */
	void enterInvoke_func(languageLParser.Invoke_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#invoke_func}.
	 * @param ctx the parse tree
	 */
	void exitInvoke_func(languageLParser.Invoke_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(languageLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(languageLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(languageLParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(languageLParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void enterRead_expr(languageLParser.Read_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#read_expr}.
	 * @param ctx the parse tree
	 */
	void exitRead_expr(languageLParser.Read_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageLParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void enterWrite_expr(languageLParser.Write_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageLParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void exitWrite_expr(languageLParser.Write_exprContext ctx);
}