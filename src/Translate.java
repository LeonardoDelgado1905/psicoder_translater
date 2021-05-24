import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {

    public static void main(String [] args) throws Exception{
        PsicoderLexer lexer = new PsicoderLexer(CharStreams.fromFileName("Input-Output/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PsicoderParser parser = new PsicoderParser(tokens);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        System.out.println(tree.toStringTree());
        walker.walk(new PsicoderToGo(), tree);
    }
}
