package pl.edu.agh.java.application;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pl.edu.agh.java.antlr.Java2Lexer;
import pl.edu.agh.java.antlr.Java2Parser;
import pl.edu.agh.java.extended.MyListener;
import pl.edu.agh.java.extended.UmlClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
* Created by chris on 2015-01-24.
*/
public class Starter {
    public static final File folder = new File("./inputData");

    private MyListener extractor;

    public ArrayList<UmlClass> getUmlClasses() {
        return extractor.getExtractedClasses();
    }

    public static void main(String[] args) throws IOException {
        new Starter().parseFile("antlr/Demo.java");
//        new Starter().parseFolder(Starter.folder);
    }

    public void parseString(String input) {
        CharStream charStream = new ANTLRInputStream(input);
        parse2(charStream);
    }

    public void parseFile(String filename) {
        try {
            parse2(new ANTLRFileStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseFolder(final File folder) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                parseFolder(fileEntry);
            } else {
                parseFile(fileEntry.getName());
            }
        }
    }

    private void parse(CharStream charStream) {
        Java2Lexer lexer = new Java2Lexer(charStream);
        TokenStream stream = new CommonTokenStream(lexer);
        new Java2Parser(stream).compilationUnit();
    }

    private void parse2(CharStream charStream) {
        Java2Lexer lexer = new Java2Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java2Parser parser = new Java2Parser(tokens);

        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();

        extractor = new MyListener(parser);
        walker.walk(extractor, tree);
    }
}
