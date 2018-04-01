package spbau2018.se.start;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LexerTest {

    TokensWrap[] tokens = new TokensWrap[16];
    List<String>[] valid = new List[16];

    @Before
    public void  initTestData() {
        for (int i = 0; i < 16; i++) {
            tokens[i] = new TokensWrap();
        }
        tokens[0].setString("read x;");
        tokens[1].setString("var                  c = 43.123e-1               +                          5");
        tokens[2].setString("if y + 1 == x then write y else write x");
        tokens[3].setString("read x\n read y");
        tokens[4].setString("fun main(a) {\n write a\n}");
        tokens[5].setString("var if = 10");
        tokens[6].setString("435.0e4 != 435000");
        tokens[7].setString("\n\n\n\n\n\n var x=cthen-34;");
        tokens[8].setString("_x234 != 67");
        tokens[9].setString("x==c-1");
        tokens[10].setString("                                       \n                                 write (5>7)");
        tokens[11].setString("12zxc");
        tokens[12].setString("this_is_long_variables_name");
        tokens[13].setString("ifthen write 1");
        tokens[14].setString("do{write(x)x=x+1}while(x<10)");
        tokens[15].setString("//this is some comment\n var x = 5\n //commen number two\n write x");
    }

    @Before
    public void  initValidationData() {
        for (int i = 0; i < 16; i++) {
            valid[i] = new ArrayList<>();
        }
        valid[0] = Arrays.asList("TREAD(\"read\", 0, 0, 3)", "IDENT(\"x\", 0, 5, 5)", "TSEP(\";\", 0, 6, 6)");
        valid[1] = Arrays.asList("TVAR(\"var\", 0, 0, 2)", "IDENT(\"c\", 0, 21, 21)", "TEQ(\"=\", 0, 23, 23)",
                "DIGIT(\"43.123e-1\", 0, 25, 33)", "TPLUS(\"+\", 0, 49, 49)", "DIGIT(\"5\", 0, 76, 76)");
        valid[2] = Arrays.asList("TIF(\"if\", 0, 0, 1)", "IDENT(\"y\", 0, 3, 3)", "TPLUS(\"+\", 0, 5, 5)", "DIGIT(\"1\", 0, 7, 7)",
                "TEQC(\"==\", 0, 9, 10)", "IDENT(\"x\", 0, 12, 12)", "TTHEN(\"then\", 0, 14, 17)", "TWRITE(\"write\", 0, 19, 23)",
                "IDENT(\"y\", 0, 25, 25)", "TELSE(\"else\", 0, 27, 30)", "TWRITE(\"write\", 0, 32, 36)", "IDENT(\"x\", 0, 38, 38)");
        valid[3] = Arrays.asList("TREAD(\"read\", 0, 0, 3)", "IDENT(\"x\", 0, 5, 5)", "TREAD(\"read\", 1, 1, 4)", "IDENT(\"y\", 1, 6, 6)");
        valid[4] = Arrays.asList("TFUN(\"fun\", 0, 0, 2)", "IDENT(\"main\", 0, 4, 7)", "TRPAREN(\"(\", 0, 8, 8)",
                "IDENT(\"a\", 0, 9, 9)", "TLPAREN(\")\", 0, 10, 10)", "TRBRACES(\"{\", 0, 12, 12)", "TWRITE(\"write\", 1, 1, 5)",
                "IDENT(\"a\", 1, 7, 7)", "TLBRACES(\"}\", 2, 0, 0)");
        valid[5] = Arrays.asList("TVAR(\"var\", 0, 0, 2)", "TIF(\"if\", 0, 4, 5)", "TEQ(\"=\", 0, 7, 7)", "DIGIT(\"10\", 0, 9, 10)");
        valid[6] = Arrays.asList("DIGIT(\"435.0e4\", 0, 0, 6)", "TNEQ(\"!=\", 0, 8, 9)", "DIGIT(\"435000\", 0, 11, 16)");
        valid[7] = Arrays.asList("TVAR(\"var\", 6, 1, 3)", "IDENT(\"x\", 6, 5, 5)", "TEQ(\"=\", 6, 6, 6)", "IDENT(\"cthen\", 6, 7, 11)",
                "TMINUS(\"-\", 6, 12, 12)", "DIGIT(\"34\", 6, 13, 14)", "TSEP(\";\", 6, 15, 15)");
        valid[8] = Arrays.asList("IDENT(\"_x234\", 0, 0, 4)", "TNEQ(\"!=\", 0, 6, 7)", "DIGIT(\"67\", 0, 9, 10)");
        valid[9] = Arrays.asList("IDENT(\"x\", 0, 0, 0)", "TEQC(\"==\", 0, 1, 2)", "IDENT(\"c\", 0, 3, 3)", "TMINUS(\"-\", 0, 4, 4)",
                "DIGIT(\"1\", 0, 5, 5)");
        valid[10] = Arrays.asList("TWRITE(\"write\", 1, 33, 37)", "TRPAREN(\"(\", 1, 39, 39)", "DIGIT(\"5\", 1, 40, 40)",
                "TGT(\">\", 1, 41, 41)", "DIGIT(\"7\", 1, 42, 42)", "TLPAREN(\")\", 1, 43, 43)");
        valid[11] = Arrays.asList("DIGIT(\"12\", 0, 0, 1)", "IDENT(\"zxc\", 0, 2, 4)");
        valid[12] = Arrays.asList("IDENT(\"this_is_long_variables_name\", 0, 0, 26)");
        valid[13] = Arrays.asList("IDENT(\"ifthen\", 0, 0, 5)", "TWRITE(\"write\", 0, 7, 11)", "DIGIT(\"1\", 0, 13, 13)");
        valid[14] = Arrays.asList("TDO(\"do\", 0, 0, 1)", "TRBRACES(\"{\", 0, 2, 2)", "TWRITE(\"write\", 0, 3, 7)", "TRPAREN(\"(\", 0, 8, 8)",
                "IDENT(\"x\", 0, 9, 9)", "TLPAREN(\")\", 0, 10, 10)", "IDENT(\"x\", 0, 11, 11)", "TEQ(\"=\", 0, 12, 12)",
                "IDENT(\"x\", 0, 13, 13)", "TPLUS(\"+\", 0, 14, 14)", "DIGIT(\"1\", 0, 15, 15)", "TLBRACES(\"}\", 0, 16, 16)",
                "TWHILE(\"while\", 0, 17, 21)", "TRPAREN(\"(\", 0, 22, 22)", "IDENT(\"x\", 0, 23, 23)", "TLT(\"<\", 0, 24, 24)",
                "DIGIT(\"10\", 0, 25, 26)", "TLPAREN(\")\", 0, 27, 27)");
        valid[15] = Arrays.asList("TVAR(\"var\", 1, 1, 3)", "IDENT(\"x\", 1, 5, 5)", "TEQ(\"=\", 1, 7, 7)", "DIGIT(\"5\", 1, 9, 9)",
                "TWRITE(\"write\", 3, 1, 5)", "IDENT(\"x\", 3, 7, 7)");
    }


    @Test
    public void TokensTest() {
        for (int i = 0; i < valid.length; i++) {
            assertEquals((List) tokens[i].getTokenList(), valid[i]);
        }
    }
}