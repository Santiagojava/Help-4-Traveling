/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Estado;
import Logica.Reserva;
import Logica.Sistema;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author PERSONAL
 */
public class JActualizarEstadoReserva extends javax.swing.JInternalFrame {
Sistema sis;
Map<Integer, Reserva> map;
    /**
     * Creates new form JActualizarEstadoReserva
     */
    public JActualizarEstadoReserva() {
        sis = Sistema.getInstance();
        map = sis.getReservas();
        for (Integer key : map.keySet()) {
            if(map.get(key).getEstado().toString().equals("REGISTRADA")) {
                jcbxCodigo.addItem(key.toString());
            }
        }
        jcbxCodigo.addItem("CANCELADA");
        jcbxCodigo.addItem("PAGADA");
        jcbxCodigo.addItem("FACTURADA");
        initComponents();
    }
    
    public void llenar_combos(){
        sis = Sistema.getInstance();
        map = sis.getReservas();
    for (Integer key : map.keySet()) {
        if(map.get(key).getEstado().toString().equals("REGISTRADA")) {
            jcbxCodigo.addItem(key.toString());
        }
    }
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
        jcbxCodigo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbxEstado = new javax.swing.JComboBox<>();
        jbtnAceptar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setTitle("Actualizar Estado de Reserva");
        getContentPane().setLayout(null);

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(33, 38, 37, 14);

        jcbxCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbxCodigo);
        jcbxCodigo.setBounds(90, 40, 80, 20);

        jLabel2.setText("Estado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 40, 14);

        jcbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbxEstado.setToolTipText("Cancelada\nPagada\nFacturada");
        getContentPane().add(jcbxEstado);
        jcbxEstado.setBounds(90, 80, 80, 20);

        jbtnAceptar.setText("ACEPTAR");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAceptar);
        jbtnAceptar.setBounds(10, 140, 79, 23);

        jbtnCancelar.setText("CANCELAR");
        getContentPane().add(jbtnCancelar);
        jbtnCancelar.setBounds(100, 140, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxCodigoActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
     int codigo = (int) jcbxCodigo.getSelectedItem();
     Estado estado = (Estado) jcbxEstado.getSelectedItem();
     Sistema sist = new Sistema();
     sist.ActualizarEstadoReserva(codigo,estado);
     llenar_combos();
    }//GEN-LAST:event_jbtnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JComboBox<String> jcbxCodigo;
    private javax.swing.JComboBox<String> jcbxEstado;
    // End of variables declaration//GEN-END:variables
}
