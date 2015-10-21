package pl.edu.agh.java.gui;

import pl.edu.agh.java.extended.UmlClass;

/**
 *
 * @author Krystian
 */
public class DiagramObject {
    
    private String className;
    private String fields;
    private String methods;

    public DiagramObject(UmlClass uml) {
        className = uml.getClassName();
        fields = uml.getFields();
        methods = uml.getMethods();
        System.out.println(uml.getFields());
    }

    public DiagramObject() {
    }

    // kto z kim sie laczy nazwa klasy z druga nazwa i albo jakies id
    // Pies , haski ,  - para 
    // para, typ wiazania
    // 1 na ktorego wskazujemy strzalka, 2gi z ktorego kreska wychodzi

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }
    
}
