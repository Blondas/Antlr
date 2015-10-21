package pl.edu.agh.java.gui;
import javax.swing.JLabel;

/**
 *
 * @author Krystian
 */
public class UmlDiagramPanel extends javax.swing.JPanel {

    private String name;
    /**
     * Creates new form Test
     */
    public UmlDiagramPanel(String className, String fields, String methods) {
        initComponents();
        this.name = className;
        setClassName(className);
        setFields(fields);
        setMethods(methods);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel4 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFields = new javax.swing.JLabel();
        jLabelMethods = new javax.swing.JLabel();
        jLabelClassName = new javax.swing.JLabel();
        jLabelConnector = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("fields:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jLabel4, gridBagConstraints);

        jLabel.setText("name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jLabel, gridBagConstraints);

        jLabel5.setText("methods:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jLabel5, gridBagConstraints);

        jLabelFields.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        add(jLabelFields, gridBagConstraints);

        jLabelMethods.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        add(jLabelMethods, gridBagConstraints);

        jLabelClassName.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        add(jLabelClassName, gridBagConstraints);

        jLabelConnector.setText("c");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        add(jLabelConnector, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClassName;
    private javax.swing.JLabel jLabelConnector;
    private javax.swing.JLabel jLabelFields;
    private javax.swing.JLabel jLabelMethods;
    // End of variables declaration//GEN-END:variables
    private void setClassName(String n){ jLabelClassName.setText("<html>"+n+"</html>"); }
    public String getClassNameWithoutHtml() { return name; }
    private void setFields(String n)   { jLabelFields.setText("<html>"+n+"</html>"); }
    private void setMethods(String n)  { jLabelMethods.setText("<html>"+n+"</html>"); }

    public String getClassName() {
        return jLabelClassName.getText();
    }

    public JLabel getConnector() {
        return jLabelConnector;
    }
    
    
    

}