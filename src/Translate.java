import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {

    public static void main(String [] args) throws Exception{
        PsicoderLexer lexer = new PsicoderLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PsicoderParser parser = new PsicoderParser(tokens);
        ParseTree tree = parser.commands();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PsicoderToGo(), tree);
    }
}
