package spbau2018.se.start;

import antlrTools.languageLBaseListener;
import antlrTools.languageLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class Printer extends languageLBaseListener {
    StringBuilder prefix = new StringBuilder();

    private void incPrefix() {
        prefix.append("    ");
    }

    private void decPrefix() {
        prefix.delete(0,4);
    }

    private void print(String str) {
        System.out.print(prefix.toString() + str);
    }

    private String getContextInfo(ParserRuleContext ctx) {
        return "(" + ctx.start.getLine() + ", " + ctx.start.getCharPositionInLine() + ") -> (" +
                ctx.stop.getLine() + ", " + ctx.stop.getCharPositionInLine() + ")";
    }

    private String getTokenInfo(TerminalNode tok) {
        return "(" +  tok.getSymbol().getText() + ", " + tok.getSymbol().getLine() + ", " +
                tok.getSymbol().getCharPositionInLine() + ")";
    }

    private String getTokenName(Token tok) {
        return languageLParser.VOCABULARY.getSymbolicName(tok.getType());
    }

    public void enterProgram(languageLParser.ProgramContext ctx) {
        List<String> lst = new ArrayList<>();
        print("Program: " + getContextInfo(ctx) + "\n");
        incPrefix();
        ctx.def_func().forEach(it -> it.enterRule(this));
        if (ctx.statment().size() > 0) {
            print("Main body:\n");
            incPrefix();
            ctx.statment().forEach(it -> it.enterRule(this));
        }
    }

    public void enterDef_func(languageLParser.Def_funcContext ctx) {
        print("Function definition: " + getContextInfo(ctx) + "\n");
        incPrefix();
        print("Name: " + ctx.IDENT(0) + "\n");
        if (ctx.IDENT().size() > 1) {
            print("arguments: ");
            ctx.IDENT().stream().skip(1).forEach(System.out::print);
            System.out.println();
        }
        if (ctx.pass_default() != null) {
            print("Default arguments: ");
            ctx.pass_default().forEach(it -> System.out.print(it.getText() + " "));
            System.out.println();
        }
        print("Body:\n");
        incPrefix();
        ctx.func_body.enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterBody(languageLParser.BodyContext ctx) {
        ctx.statment().forEach(it -> it.enterRule(this));
    }

    public void enterStatment(languageLParser.StatmentContext ctx) {
        if (ctx.assign_var() != null) {
            ctx.assign_var().enterRule(this);
        }
        if (ctx.def_var() != null) {
            ctx.def_var().enterRule(this);
        }
        if (ctx.if_expr() != null) {
            ctx.if_expr().enterRule(this);
        }
        if (ctx.invoke_func() != null) {
            ctx.invoke_func().enterRule(this);
        }
        if (ctx.read_expr() != null) {
            ctx.read_expr().enterRule(this);
        }
        if (ctx.return_expr() != null) {
            ctx.return_expr().enterRule(this);
        }
        if (ctx.while_expr() != null) {
            ctx.while_expr().enterRule(this);
        }
        if (ctx.write_expr() != null) {
            ctx.write_expr().enterRule(this);
        }
    }

    public void enterIf_expr(languageLParser.If_exprContext ctx) {
        print("If statment: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Condition:\n");
        incPrefix();
        ctx.logic_expr().enterRule(this);
        decPrefix();
        print("Body:\n");
        incPrefix();
        ctx.if_body.enterRule(this);
        decPrefix();
        if (ctx.else_body != null) {
            print("Else:\n");
            incPrefix();
            ctx.else_body.enterRule(this);
            decPrefix();
        }
        decPrefix();
    }

    public void enterWhile_expr(languageLParser.While_exprContext ctx) {
        print("While statment: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Condition:\n");
        incPrefix();
        ctx.logic_expr().enterRule(this);
        decPrefix();
        print("Body:\n");
        incPrefix();
        ctx.while_body.enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterDef_var(languageLParser.Def_varContext ctx) {
        print("Var definition: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Name: " + ctx.IDENT() + '\n');
        if (ctx.expr() != null) {
            print("Value: \n");
            incPrefix();
            ctx.expr().enterRule(this);
            decPrefix();
        }
        decPrefix();
    }

    public void enterAssign_var(languageLParser.Assign_varContext ctx) {
        print("Var assignment: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Name: " + ctx.IDENT() + '\n');
        print("Value: \n");
        incPrefix();
        ctx.expr().enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterInvoke_func(languageLParser.Invoke_funcContext ctx) {
        print("Invoke function: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Name: " + ctx.IDENT() + '\n');
        if (ctx.func_args().size() != 0) {
            print("Arguments:\n");
        }
        incPrefix();
        for (int i = 0; i < ctx.func_args().size(); i++) {
            print("Arg" + (i + 1) + ": \n");
            incPrefix();
            ctx.func_args().get(i).enterRule(this);
            decPrefix();
        }
        decPrefix();
        decPrefix();
    }

    public void enterFunc_args(languageLParser.Func_argsContext ctx) {
        if (ctx.IDENT() != null) {
            print("Ident: " + getTokenInfo(ctx.IDENT()) + '\n');
        }
        if (ctx.logic_expr() != null) {
            ctx.logic_expr().enterRule(this);
        }
        if (ctx.arithm_expr() != null) {
            ctx.arithm_expr().enterRule(this);
        }
        if (ctx.invoke_func() != null) {
            ctx.invoke_func().enterRule(this);
        }
    }

    public void enterRead_expr(languageLParser.Read_exprContext ctx) {
        print("Invoke read: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Var: " + getTokenInfo(ctx.IDENT()) + '\n');
        decPrefix();
    }

    public void enterWrite_expr(languageLParser.Write_exprContext ctx) {
        print("Invoke write: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Arguments:\n");
        incPrefix();
        for (int i = 0; i < ctx.func_args().size(); i++) {
            print("Arg" + (i + 1) + ": \n");
            incPrefix();
            ctx.func_args().get(i).enterRule(this);
            decPrefix();
        }
        decPrefix();
        decPrefix();
    }

    public void enterReturn_expr(languageLParser.Return_exprContext ctx) {
        print("Return expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Value:\n");
        incPrefix();
        ctx.expr().enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterLogicalCompareExpr(languageLParser.LogicalCompareExprContext ctx) {
        print("Logical compare expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Operand: " + getTokenName(ctx.op.start) + '\n');
        print("Left:\n");
        incPrefix();
        ctx.lvalue.enterRule(this);
        decPrefix();
        print("Right:\n");
        incPrefix();
        ctx.rvalue.enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterLogicalBinaryExpr(languageLParser.LogicalBinaryExprContext ctx) {
        print("Logical binary expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Operand: " + getTokenName(ctx.op.start) + '\n');
        print("Left:\n");
        incPrefix();
        ctx.lvalue.enterRule(this);
        decPrefix();
        print("Right:\n");
        incPrefix();
        ctx.rvalue.enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterLogicalParensExpr(languageLParser.LogicalParensExprContext ctx) {
        print("Logical parens expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        ctx.logic_expr().enterRule(this);
        decPrefix();
    }

    public void enterLogicalAtomExpr(languageLParser.LogicalAtomExprContext ctx) {
        ctx.logic_atom().enterRule(this);
    }

    public void enterLogic_atom(languageLParser.Logic_atomContext ctx) {
        print("Logical atom expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        if (ctx.TBOOL() != null)
            print("Value: " + getTokenInfo(ctx.TBOOL()) + '\n');
        if (ctx.IDENT() != null)
            print("Var: " +  getTokenInfo(ctx.IDENT()) + '\n');
        if (ctx.invoke_func() != null) {
            incPrefix();
            ctx.invoke_func().enterRule(this);
            decPrefix();
        }
        decPrefix();
    }

    public void enterExpr(languageLParser.ExprContext ctx) {
        if (ctx.arithm_expr() != null) {
            ctx.arithm_expr().enterRule(this);
        }
        if (ctx.logic_expr() != null) {
            ctx.logic_expr().enterRule(this);
        }
        if (ctx.invoke_func() != null) {
            ctx.invoke_func().enterRule(this);
        }
    }

    public void enterArithmeticPrior1BinaryExpr(languageLParser.ArithmeticPrior1BinaryExprContext ctx) {
        print("Arithmetic first prior expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Operand: " + getTokenName(ctx.op.start) + '\n');
        print("Left:\n");
        incPrefix();
        ctx.lvalue.enterRule(this);
        decPrefix();
        print("Right:\n");
        incPrefix();
        ctx.rvalue.enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterArithmeticPrior2BinaryExpr(languageLParser.ArithmeticPrior2BinaryExprContext ctx) {
        print("Arithmetic second prior expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Operand: " + getTokenName(ctx.op.start) + '\n');
        print("Left:\n");
        incPrefix();
        ctx.lvalue.enterRule(this);
        decPrefix();
        print("Right:\n");
        incPrefix();
        ctx.rvalue.enterRule(this);
        decPrefix();
        decPrefix();
    }

    public void enterArithmeticParensExpr(languageLParser.ArithmeticParensExprContext ctx) {
        print("Arithmetic parens expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        ctx.arithm_expr().enterRule(this);
        decPrefix();
    }

    public void enterArithmeticAtomExpr(languageLParser.ArithmeticAtomExprContext ctx) {
        ctx.arithm_atom().enterRule(this);
    }

    public void enterArithm_atom(languageLParser.Arithm_atomContext ctx) {
        print("Arithmetic atom expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        if (ctx.TDIGIT() != null)
            print("Value: " + getTokenInfo(ctx.TDIGIT()) + '\n');
        if (ctx.IDENT() != null)
            print("Var: " +  getTokenInfo(ctx.IDENT()) + '\n');
        if (ctx.invoke_func() != null) {
            incPrefix();
            ctx.invoke_func().enterRule(this);
            decPrefix();
        }
        decPrefix();
    }

    public void enterArithmeticUnaryExpr(languageLParser.ArithmeticUnaryExprContext ctx) {
        print("Arithmetic unary expression: " + getContextInfo(ctx) + '\n');
        incPrefix();
        print("Operand: " + getTokenName(ctx.op.start) + '\n');
        print("Left:\n");
        incPrefix();
        ctx.lvalue.enterRule(this);
        decPrefix();
        print("Right:\n");
        incPrefix();
        ctx.parametr.enterRule(this);
        decPrefix();
        decPrefix();
    }

}
