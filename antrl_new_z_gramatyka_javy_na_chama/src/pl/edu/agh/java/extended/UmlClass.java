package pl.edu.agh.java.extended;

import java.util.ArrayList;

/**
 * Created by chris on 2015-02-05.
 */
public class UmlClass {
    private String className;
    private ArrayList<String> fields = new ArrayList<String>();
    private ArrayList<String> methods = new ArrayList<String>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFields() {
        StringBuilder ret = new StringBuilder();
        for (String s: fields) {
            ret.append(s).append("<br>");
        }

        return ret.toString();
    }

    public void AddField(String field) {
        fields.add(field);
    }

    public String getMethods() {
        StringBuilder ret = new StringBuilder();
        for (String s: methods) {
            ret.append(s).append("<br>");
        }

        return ret.toString();
    }

    public void addMethod(String method) {
        methods.add(method);
    }
}
