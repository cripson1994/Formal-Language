package spbau2018.se.start;

import antlrTools.languageLLexer;
import antlrTools.languageLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;

public class Start {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("File not found");
            return;
        }

        languageLLexer lexer = null;
        try {
            lexer = new languageLLexer(CharStreams.fromFileName(args[0]));
        } catch (IOException e) {
            System.out.println("File not found");
            return;
        }

        lexer.removeErrorListeners();
        lexer.addErrorListener(ErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        languageLParser parser = new languageLParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ErrorListener.INSTANCE);

        try {
            parser.program().enterRule(new Printer());
        } catch (ParseCancellationException e) {
            System.out.println(e.getMessage());
        }
    }
}