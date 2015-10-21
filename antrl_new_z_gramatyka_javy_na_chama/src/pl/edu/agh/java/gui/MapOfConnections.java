package pl.edu.agh.java.gui;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Krystian
 */
public class MapOfConnections {
    // parent + dzieci do rysowania strzalek wylacznie
    // bierzemy imiona dzieci i strzalka do ojca po kolei
    
//    private HashMap<String,ArrayList<DiagramObject>> map = new HashMap<>();
    public HashMap<String,ArrayList<String>> map = new HashMap();
    private ArrayList<DiagramObject> listOfDiagrams = new ArrayList();
    
    
    // 1. rozpoznajemy  i wrzucamy wszystkich parentow(po extends i implements)
    // 2. potem lecimy po kolei i dodajemy dzieci do danych parentow
    // 3. jezeli klasa jest sama w sobie parentem to taka tez jest dodana ale na samym koncu 
    public void recognize(String name){
        if (name.contains("extends")){
            String parentName = name.substring(name.indexOf("extends")+"extends".length()+1, name.length());
            String childName = name.substring(0,name.indexOf("extends"));
//            System.out.println("1");
//            System.out.println("parentName:"+parentName);
//            System.out.println("childName:"+childName);
            addParentToMap(parentName);
            addChildToMap(parentName, childName);
        }else if(name.contains("implements")){
            String parentName = name.substring(name.indexOf("implements")+"implements".length()+1, name.length());
            String childName = name.substring(0,name.indexOf("implements"));
//            System.out.println("2");
//            System.out.println("parentName:"+parentName);
//            System.out.println("childName:"+childName);
            addParentToMap(parentName);
            addChildToMap(parentName, childName);
        }
        else{
//            System.out.println("3");
            addParentToMap(name);
//            System.out.println("parentName:"+name);
        }
        
    }
    
     // Dodajemy parenta
    public void addParentToMap(String parentName){
        if(!map.containsKey(parentName)){
            ArrayList<String> list = new ArrayList();
            map.put(parentName, list);
        }
    }
    // Dodawanie dziecka
    public void addChildToMap(String parentName, String childName){
        map.get(parentName).add(childName);
    }
    
    public void addDiagram(DiagramObject d){
        if(!listOfDiagrams.contains(d)){
            listOfDiagrams.add(d);
        }
    }
    public ArrayList<DiagramObject> getListOfDiagrams(){
        return listOfDiagrams;
    }
    
      public HashMap<String, ArrayList<String>> getMap() {
        return map;
    }
   
    
    // Wszystko po extends i implements to parent ktorego umieszczamy, wczesniejsze klasy to dzieci 
    // foo extends bar, bar to parent a foo dodajemy do listy
    // rysowanie bedzie sie odbywac od parenta do wszystkich dzieci
//    public void putToMap(String parentName, DiagramObject diagramObject){
//        if(map.containsKey(parentName)){
//            map.get(parentName).add(diagramObject);
//        }else{
//            ArrayList<DiagramObject> list = new ArrayList<>();
//            list.add(diagramObject);
//            map.put(parentName, list);
//        }
//    }
   
    
    
//        String text = "0123hello9012hello8901hello7890";
//        String word = "hello";
//
//        System.out.println(text.indexOf(word)); // prints "4"
//        System.out.println(text.lastIndexOf(word)); // prints "22"
//
//        // find all occurrences forward
//        for (int i = -1; (i = text.indexOf(word, i + 1)) != -1; ) {
//            System.out.println(i);
//        } // prints "4", "13", "22"
}
