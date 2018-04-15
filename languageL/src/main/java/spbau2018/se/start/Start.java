package spbau2018.se.start;

import java.io.IOException;

public class Start {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("File not found");
            return;
        }
        TokensWrap tokens = new TokensWrap();
        try {
            tokens.setFileName(args[0]);
            for (String str : tokens.getTokenList()) {
                System.out.println(str);
            }
        } catch (IOException e){
            System.out.println("File not exist");
        }
    }
}