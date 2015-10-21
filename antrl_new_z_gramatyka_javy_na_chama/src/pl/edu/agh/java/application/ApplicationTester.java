package pl.edu.agh.java.application;

import pl.edu.agh.java.extended.UmlClass;
import pl.edu.agh.java.gui.ComponentLinkerTest;
import pl.edu.agh.java.gui.DiagramObject;
import pl.edu.agh.java.gui.MapOfConnections;

import java.util.ArrayList;

/**
 *
 * @author Krystian
 */
public class ApplicationTester {
    
    public static void main(String[] args) {
        new ApplicationTester().test();
    }
    
    public void test(){
        MapOfConnections m = new MapOfConnections();
//        m.recognize("kot"); // nazwy klas
//        m.recognize("pies");
//        m.recognize("mruczek extends kot");
//        m.recognize("lol extends kot");

        Starter starter = new Starter();
        starter.parseFile("antlr/Demo.java");
        ArrayList<UmlClass> extractedClasses = starter.getUmlClasses();

        // recognize classes:
        for (UmlClass u: extractedClasses) {
            m.recognize(u.getClassName());
        }

        for (UmlClass u: extractedClasses) {
            m.addDiagram(new DiagramObject(u));
        }
        
//        DiagramObject diagramObjectCat = new DiagramObject();
//        diagramObjectCat.setClassName("kot");
//        diagramObjectCat.setFields("String mrrrr");
//        diagramObjectCat.setMethods("void miau()");
//
//        DiagramObject diagramObjectDog = new DiagramObject();
//        diagramObjectDog.setClassName("pies");
//        diagramObjectDog.setFields("String hau");
//        diagramObjectDog.setMethods("void hau()");
//
//        DiagramObject diagramObjectMruczek = new DiagramObject();
//        diagramObjectMruczek.setClassName("mruczek");
//        diagramObjectMruczek.setFields("String mrrrr");
//        diagramObjectMruczek.setMethods("void mrrrr()");
//
//        DiagramObject diagramObjectMm = new DiagramObject();
//        diagramObjectMm.setClassName("lol");
//        diagramObjectMm.setFields("String dsadas");
//        diagramObjectMm.setMethods("void dsadas()");
//
//        m.addDiagram(diagramObjectCat);
//        m.addDiagram(diagramObjectDog);
//        m.addDiagram(diagramObjectMruczek);
//        m.addDiagram(diagramObjectMm);
        
        ComponentLinkerTest c = new ComponentLinkerTest(m);
//        HashMap<String,ArrayList<String>> map = m.map;
//
//        for(Map.Entry<String,ArrayList<String>> entry : map.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        
        
        
    }

}
