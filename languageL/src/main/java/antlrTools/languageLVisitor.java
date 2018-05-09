package antlrTools;// Generated from languageL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link languageLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface languageLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link languageLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(languageLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalCompareExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalCompareExpr(languageLParser.LogicalCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalBinaryExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinaryExpr(languageLParser.LogicalBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalParensExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalParensExpr(languageLParser.LogicalParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAtomExpr}
	 * labeled alternative in {@link languageLParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAtomExpr(languageLParser.LogicalAtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticParensExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticParensExpr(languageLParser.ArithmeticParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticUnaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnaryExpr(languageLParser.ArithmeticUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticPrior2BinaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPrior2BinaryExpr(languageLParser.ArithmeticPrior2BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticAtomExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAtomExpr(languageLParser.ArithmeticAtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticPrior1BinaryExpr}
	 * labeled alternative in {@link languageLParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPrior1BinaryExpr(languageLParser.ArithmeticPrior1BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(languageLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#arithm_prior1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_prior1(languageLParser.Arithm_prior1Context ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#arithm_prior2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_prior2(languageLParser.Arithm_prior2Context ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(languageLParser.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_op(languageLParser.Compare_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#logic_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_op(languageLParser.Logic_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#arithm_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_atom(languageLParser.Arithm_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#logic_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_atom(languageLParser.Logic_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#return_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_expr(languageLParser.Return_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#def_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_func(languageLParser.Def_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#if_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expr(languageLParser.If_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#while_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_expr(languageLParser.While_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#def_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_var(languageLParser.Def_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(languageLParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#pass_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_default(languageLParser.Pass_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(languageLParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#invoke_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke_func(languageLParser.Invoke_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(languageLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(languageLParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#read_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_expr(languageLParser.Read_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageLParser#write_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_expr(languageLParser.Write_exprContext ctx);
}