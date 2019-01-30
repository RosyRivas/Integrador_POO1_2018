/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Rosi-PC
 */
public class VentanaSuministro extends javax.swing.JFrame {
    private final Controlador controlador;
    private final JFrame previo;
    
    /**
     * Creates new form VentanaMen
     */
    public VentanaSuministro(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
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

        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaSuministro = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ideSuministro = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nombreSumi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cantidadSuministro = new javax.swing.JTextField();
        jButtonNuevoAlimento1 = new javax.swing.JButton();
        jButtonGuardarSuministro = new javax.swing.JButton();
        jButtonEliminarSuministro = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel18.setText("Lista Suministro");

        listaSuministro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaSuministro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaSuministroValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(listaSuministro);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel14.setText("IdSuministro");

        ideSuministro.setText("Id");

        jLabel16.setText("Nombre");

        jLabel17.setText("Cantidad");

        jButtonNuevoAlimento1.setText("Nuevo");
        jButtonNuevoAlimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoAlimento1ActionPerformed(evt);
            }
        });

        jButtonGuardarSuministro.setText("Guardar");
        jButtonGuardarSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarSuministroActionPerformed(evt);
            }
        });

        jButtonEliminarSuministro.setText("Eliminar");
        jButtonEliminarSuministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarSuministroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(52, 52, 52)
                        .addComponent(ideSuministro))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreSumi, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(cantidadSuministro)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonNuevoAlimento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardarSuministro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarSuministro)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ideSuministro))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(nombreSumi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cantidadSuministro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoAlimento1)
                    .addComponent(jButtonGuardarSuministro)
                    .addComponent(jButtonEliminarSuministro))
                .addGap(28, 28, 28))
        );

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(volver)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//eliminar suministro 
    private void jButtonEliminarSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarSuministroActionPerformed
      Suministro s= (Suministro) this.listaSuministro.getSelectedValue() ;
        if (s != null){
            int i = this.controlador.eliminarSuministro(s);
            if (i != 0){
                  JOptionPane.showMessageDialog(null, "No es posible eliminar el empleado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            limpiar(); 
      }
      
    }//GEN-LAST:event_jButtonEliminarSuministroActionPerformed




    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
      this.previo.setVisible(true);
    
        
    }//GEN-LAST:event_volverActionPerformed


    private void jButtonNuevoAlimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoAlimento1ActionPerformed
        limpiar ();
    }//GEN-LAST:event_jButtonNuevoAlimento1ActionPerformed
// guardar suministro
    private void jButtonGuardarSuministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarSuministroActionPerformed
         if (!this.listaSuministro.isSelectionEmpty()){
            Suministro s = (Suministro ) this.listaSuministro.getSelectedValue();
            this.controlador.editarSuministro(s,this.nombreSumi.getText(),this.cantidadSuministro.getText() );
        }else{
            this.controlador.agregarSuministro(this.nombreSumi.getText(),this.cantidadSuministro.getText());
        
        }
         limpiar();
         
    }//GEN-LAST:event_jButtonGuardarSuministroActionPerformed

    private void listaSuministroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaSuministroValueChanged
       if (!this.listaSuministro.isSelectionEmpty()){
       
            Suministro s= (Suministro) this.listaSuministro.getSelectedValue();
            this.ideSuministro.setText(s.getIdSuministro().toString());
            this.cantidadSuministro.setText(s.getDescripcion());
            this.cantidadSuministro.setText(s.getcSuministro());
    
            
       }
      
        
        
        
    }//GEN-LAST:event_listaSuministroValueChanged

    /**
     * @param args the command line arguments
     */
    private void limpiar(){
       
        //suministro
        this.ideSuministro.setText("");
        this.nombreSumi.setText("");
        this.cantidadSuministro.setText("");
       
       this.listaSuministro.setListData(this.controlador.listarMenu().toArray());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadSuministro;
    private javax.swing.JLabel ideSuministro;
    private javax.swing.JButton jButtonEliminarSuministro;
    private javax.swing.JButton jButtonGuardarSuministro;
    private javax.swing.JButton jButtonNuevoAlimento1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList listaSuministro;
    private javax.swing.JTextField nombreSumi;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
