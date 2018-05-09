package spbau2018.se.start;

import antlrTools.languageLLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TokensWrap {
    private languageLLexer lex;
    private List<Token> tokens;

    public TokensWrap() {
        lex = null;
        tokens = null;
    }

    public void setFileName(String fileName) throws IOException {
        lex = new languageLLexer(CharStreams.fromFileName(fileName));
        fillTokenList();
    }

    public void setString(String str) {
        lex = new languageLLexer(CharStreams.fromString(str));
        fillTokenList();
    }

    private void fillTokenList () {
        CommonTokenStream c = new CommonTokenStream(lex);
        tokens = new ArrayList<>();
        int step = 1;
        Token t = c.LT(step);
        while (t.getType() != -1) {
            tokens.add(t);
            step++;
            t = c.LT(step);
        }
    }

    public ArrayList<String> getTokenList () {
        ArrayList<String> res = new ArrayList<>();
        for (Token token : tokens) {
            String builder = lex.getVocabulary().getSymbolicName(token.getType()) + "(" +
                    "\"" + token.getText() + "\", " +
                    (token.getLine() - 1) + ", " +
                    token.getCharPositionInLine() + ", " +
                    (token.getCharPositionInLine() + token.getText().length() - 1) + ")";
            res.add(builder);
        }
        return res;
    }
}




