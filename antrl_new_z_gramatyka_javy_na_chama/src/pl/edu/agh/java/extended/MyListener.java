package pl.edu.agh.java.extended;

import org.antlr.v4.runtime.misc.NotNull;
import pl.edu.agh.java.antlr.Java2BaseListener;
import pl.edu.agh.java.antlr.Java2Parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 2015-02-03.
 */
public class MyListener extends Java2BaseListener{
    Java2Parser parser;

    private ArrayList <UmlClass> extractedClasses = new ArrayList<UmlClass>();


    public MyListener(Java2Parser parser) {
        this.parser = parser;
    }

    public ArrayList<UmlClass> getExtractedClasses() {
        return extractedClasses;
    }

    @Override
    public void enterTypeDeclaration(@NotNull Java2Parser.TypeDeclarationContext ctx) {
        UmlClass umlClass = new UmlClass();

        String classDeclaration = "";
        String fieldDeclaration = "";
        String methodDeclaration = "";


        // CLASS DECLARATION:
        if (ctx.classDeclaration() != null) {
            // get modifiers (i.e. "public"):
            if (ctx.classOrInterfaceModifier() != null) {
                for (int i = 0; i < ctx.classOrInterfaceModifier().size(); i++) {
                    classDeclaration += ctx.classOrInterfaceModifier().get(i).getText() + " ";
                }

            }

            // get "class" + class name :
            classDeclaration += "class " + ctx.classDeclaration().Identifier().getText() + " ";

            // get extended class
            if (ctx.classDeclaration().type() != null) {
                classDeclaration += "extends " + ctx.classDeclaration().type().getText() + " ";
            }

            // get implemented interface
            if (ctx.classDeclaration().typeList() != null) {
                classDeclaration += "implements " + ctx.classDeclaration().typeList().type().get(0).getText() + " ";
            }

            classDeclaration += "\n";
        }

        umlClass.setClassName(classDeclaration);


        // FIELD/CONSTRUCTOR/METHOD DECLARATION:
        if (ctx.classDeclaration() != null) {
            if (ctx.classDeclaration().classBody().classBodyDeclaration() != null) {
                for (int i = 0; i < ctx.classDeclaration().classBody().classBodyDeclaration().size(); i++) {

                    Java2Parser.MemberContext member = ctx.classDeclaration().classBody().classBodyDeclaration().get(i).member();
                    List<Java2Parser.ModifierContext> modifier = ctx.classDeclaration().classBody().classBodyDeclaration().get(i).modifiers().modifier();


                    // GET MODIFIER:
                    String modifierString = "";
                    if (modifier != null) {
                        for (int j = 0; j < modifier.size(); j++) {
                            modifierString += modifier.get(j).getText() + " ";
                        }
                    }


                    // GET FIELD:
                    if (member.fieldDeclaration() != null) {
                        fieldDeclaration += modifierString + member.fieldDeclaration().type().getText() + " ";

                        // get field info only up to equation mark
                        List<Java2Parser.VariableDeclaratorContext> varDec = member.fieldDeclaration().variableDeclarators().variableDeclarator();
                        if (varDec != null) {
                            for (int j = 0; j < varDec.size(); j++) {
                                fieldDeclaration += varDec.get(j).variableDeclaratorId().getText() + " ";
                            }
                        }

                        umlClass.AddField(fieldDeclaration);
                    }


                    // GET METHOD:
                    if (member.methodDeclaration() != null) {
                        methodDeclaration += modifierString;

                        // get method type:
                        if (member.methodDeclaration().type() != null) {
                            methodDeclaration += member.methodDeclaration().type().getText() + " ";
                        }

                        // get method name + formal parameters:
                        methodDeclaration += member.methodDeclaration().Identifier().getText() + " "
                            + member.methodDeclaration().formalParameters().getText() + ";";

                        umlClass.addMethod(methodDeclaration);
                    }
                }
            }
        }

        extractedClasses.add(umlClass);

        System.out.println("NAGLOWEK KLASY:\n" + classDeclaration);
        System.out.println("NAGLOWEK PÓL:\n" + fieldDeclaration);
        System.out.println("NAGŁÓWEK METOD:\n" + methodDeclaration);
    }

}
