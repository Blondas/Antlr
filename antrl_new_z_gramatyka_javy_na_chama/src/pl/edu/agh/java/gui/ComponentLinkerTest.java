package pl.edu.agh.java.gui;

/**
 *
 * @author Krystian
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ComponentLinkerTest extends JComponent{
    private Map<JComponent, JComponent> linked = new HashMap<JComponent, JComponent> ();;
//    private static ComponentLinkerTest linker;
//    private static JButton last = null;
//    private static JTextField last = null;
    private MapOfConnections mapOfConnections;
    private ArrayList<UmlDiagramPanel> diagrams = new ArrayList();
    

    public ComponentLinkerTest (MapOfConnections mapOfConnections){
        super ();
        this.mapOfConnections = mapOfConnections;
        create();
    }

   

    
    protected void paintComponent ( Graphics g ){
        Graphics2D g2d = ( Graphics2D ) g;
        g2d.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

        g2d.setPaint ( Color.BLACK );
        for ( JComponent c1 : linked.keySet () ){
            Point p1 = getRectCenter ( getBoundsInWindow ( c1 ) );
            Point p2 = getRectCenter ( getBoundsInWindow ( linked.get ( c1 ) ) );
            g2d.drawLine ( p1.x, p1.y, p2.x, p2.y );
        }
    }

    private Point getRectCenter ( Rectangle rect )    {
        return new Point ( rect.x + rect.width / 2, rect.y + rect.height / 2 );
    }

    private Rectangle getBoundsInWindow ( Component component ){
        return getRelativeBounds ( component, getRootPaneAncestor ( component ) );
    }

    private Rectangle getRelativeBounds ( Component component, Component relativeTo ){
        return new Rectangle ( getRelativeLocation ( component, relativeTo ),
                component.getSize () );
    }

    private Point getRelativeLocation ( Component component, Component relativeTo ){
        Point los = component.getLocationOnScreen ();
        Point rt = relativeTo.getLocationOnScreen ();
        return new Point ( los.x - rt.x, los.y - rt.y );
    }

    private JRootPane getRootPaneAncestor ( Component c ){
        for ( Container p = c.getParent (); p != null; p = p.getParent () ){
            if ( p instanceof JRootPane ){
                return ( JRootPane ) p;
            }
        }
        return null;
    }

    public boolean contains ( int x, int y ){
        return false;
    }

   

    public static void main ( String[] args ){
        ComponentLinkerTest c = new ComponentLinkerTest(null);
        c.create();
    }

    public void create(){
        setupLookAndFeel ();

        JFrame frame = new JFrame ();

//        linker = new ComponentLinkerTest ();
        frame.setGlassPane(this);
        setVisible(true);

        JPanel content = new JPanel ();
//        content.setLayout ( new GridLayout ( 10, 5, 25, 25 ) );
        content.setLayout ( new GridLayout ( 2, 5, 100, 100 ) );
        content.setBorder ( BorderFactory.createEmptyBorder ( 5, 5, 5, 5 ) );
        frame.add ( content );

        for ( int i = 0; i < mapOfConnections.getListOfDiagrams().size(); i++ ){
//            final JButton button = new JButton ( "Button" + i );
            DiagramObject diagramObject = mapOfConnections.getListOfDiagrams().get(i);
            UmlDiagramPanel umlPanel = new UmlDiagramPanel(diagramObject.getClassName(),diagramObject.getFields(),diagramObject.getMethods());
            diagrams.add(umlPanel);
//            button.addActionListener ( new ActionListener (){
//                public void actionPerformed ( ActionEvent e ){
//                    link ( button );
//                }
//            } );
            content.add ( umlPanel );
        }
        
        
        for(UmlDiagramPanel parentDiagram : diagrams){
            String parentName = parentDiagram.getClassNameWithoutHtml();

            if(mapOfConnections.getMap().containsKey(parentName)){
                ArrayList<String> listOfChilds = mapOfConnections.getMap().get(parentName);
                
                for(String childName : listOfChilds){
                    
                    for(UmlDiagramPanel childDiagram : diagrams){
                        
                        if(childDiagram.getClassNameWithoutHtml().trim().equalsIgnoreCase(childName.trim())){
                            link(parentDiagram.getConnector(), childDiagram.getConnector());
                        }
                        
                    }
                }
                
            }
        }
        
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.pack ();
        frame.setLocationRelativeTo ( null );
        frame.setVisible ( true );
    }
    
    
     public void link ( JComponent c1, JComponent c2 ){
        linked.put ( c1, c2 );
        repaint ();
    }
    

//    private void link ( JTextField textField ){
//        if ( last == null ){
//            last = textField;
//        }else{
//            link ( last, textField );
//            last = null;
//        }
//    }
//    private void link ( JButton button ){
//        if ( last == null ){
//            last = button;
//        }else{
//            link ( last, button );
//            last = null;
//        }
//    }
    private static void setupLookAndFeel (){
        try{
            UIManager.setLookAndFeel ( UIManager.getSystemLookAndFeelClassName () );
        }catch ( ClassNotFoundException e ){
            e.printStackTrace ();
        }catch ( InstantiationException e ){
            e.printStackTrace ();
        }catch ( IllegalAccessException e ){
            e.printStackTrace ();
        }catch ( UnsupportedLookAndFeelException e ){
            e.printStackTrace ();
        }
    }
}
