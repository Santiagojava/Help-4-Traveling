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
public class JAltaPromocion extends javax.swing.JInternalFrame {

    /**
     * Creates new form JAltaPromocion
     */
    public JAltaPromocion() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Alta de Promocion");
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 20, 112, 20);

        jLabel8.setText("Proveedor:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 20, 54, 14);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 60, 112, 130);

        jLabel1.setText("Servicios:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 46, 14);

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 210, 41, 14);

        jLabel3.setText("Descuento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 250, 55, 14);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(169, 216, 0, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 210, 110, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 250, 110, 20);

        jButton1.setText("ACEPTAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 310, 79, 23);

        jButton2.setText("CANCELAR");
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 310, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}