/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author PERSONAL
 */
public class JActualizarServicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form JActualizarServicio
     */
    public JActualizarServicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setTitle("Actualizar Servicio");
        getContentPane().setLayout(null);

        jLabel1.setText("Ingrese Nombre del Servicio:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 138, 14);

        jButton1.setText("Ingresar");
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 30, 73, 20);

        jLabel2.setText("Descripcion:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 60, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 30, 70, 20);

        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 33, 14);

        jLabel4.setText("Ciudad Destino:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 280, 80, 14);

        jLabel5.setText("Ciudad Origen:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 250, 80, 14);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(480, 110, 90, 260);

        jLabel7.setText("Todas las Categorias");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 90, 120, 14);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(346, 110, 90, 260);

        jLabel8.setText("Categorias del Servicio:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 90, 120, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 220, 96);

        jLabel6.setText("Imagenes:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 310, 60, 14);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(90, 310, 160, 60);

        jButton2.setText("Examinar");
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 390, 90, 23);

        jButton3.setText("ACEPTAR");
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 410, 90, 23);

        jButton4.setText("CANCELAR");
        getContentPane().add(jButton4);
        jButton4.setBounds(470, 410, 85, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
