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
public class VentanaAlimento extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;

    /**
     * Creates new form VentanaMen
     *
     * @param c
     * @param p
     */
    public VentanaAlimento(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();
        this.setResizable(false);
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaAlimento = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ideAlimento = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        texDescripcionAliento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textoCantidadAlimento = new javax.swing.JTextField();
        jButtonNuevoAlimento = new javax.swing.JButton();
        jButtonGuardarAlimento = new javax.swing.JButton();
        jButtonEliminarAlimento = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista De Alimento"));

        listaAlimento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaAlimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaAlimento.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAlimentoValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaAlimento);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Alimento"));

        jLabel10.setText("IdAlimento");

        ideAlimento.setText("Id");

        jLabel12.setText("Descripcion");

        texDescripcionAliento.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                texDescripcionAlientoInputMethodTextChanged(evt);
            }
        });
        texDescripcionAliento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texDescripcionAlientoActionPerformed(evt);
            }
        });
        texDescripcionAliento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texDescripcionAlientoKeyTyped(evt);
            }
        });

        jLabel13.setText("Cantidad");

        textoCantidadAlimento.setText("      ");
        textoCantidadAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCantidadAlimentoActionPerformed(evt);
            }
        });
        textoCantidadAlimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCantidadAlimentoKeyTyped(evt);
            }
        });

        jButtonNuevoAlimento.setText("Nuevo");
        jButtonNuevoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoAlimentoActionPerformed(evt);
            }
        });

        jButtonGuardarAlimento.setText("Guardar");
        jButtonGuardarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarAlimentoActionPerformed(evt);
            }
        });

        jButtonEliminarAlimento.setText("Eliminar");
        jButtonEliminarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarAlimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonNuevoAlimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardarAlimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarAlimento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(42, 42, 42)
                                .addComponent(ideAlimento))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(texDescripcionAliento, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(textoCantidadAlimento))))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ideAlimento))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(texDescripcionAliento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textoCantidadAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoAlimento)
                    .addComponent(jButtonGuardarAlimento)
                    .addComponent(jButtonEliminarAlimento))
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
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(volver)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// eliminiar alimento 
    private void jButtonEliminarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarAlimentoActionPerformed
          Alimento a = (Alimento) this.listaAlimento.getSelectedValue();
        if (a != null) {
            int i = this.controlador.eliminarAlimento(a);
            if (i != 0) {
                 JOptionPane.showMessageDialog(null, "No es posible eliminar el Alimento", "Error", JOptionPane.ERROR_MESSAGE);
            }
            limpiar();
        }
    }//GEN-LAST:event_jButtonEliminarAlimentoActionPerformed


    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
        this.previo.setVisible(true);


    }//GEN-LAST:event_volverActionPerformed
// nuevo alimento 
    private void jButtonNuevoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoAlimentoActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonNuevoAlimentoActionPerformed
// guardar alimento 
    private void jButtonGuardarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarAlimentoActionPerformed
        if(!this.listaAlimento.isSelectionEmpty()){
            Alimento a = (Alimento) this.listaAlimento.getSelectedValue();
            this.controlador.editarAlimento(a, this.texDescripcionAliento.getText(),this.textoCantidadAlimento.getText());
        
        }else{
            this.controlador.agregarAlimento(this.texDescripcionAliento.getText(),this.textoCantidadAlimento.getText());
        
        }
        limpiar();

    }//GEN-LAST:event_jButtonGuardarAlimentoActionPerformed

    private void listaAlimentoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAlimentoValueChanged
      if(!this.listaAlimento.isSelectionEmpty()){
          Alimento a=(Alimento)this.listaAlimento.getSelectedValue();
          this.ideAlimento.setText(a.getIdAlimento().toString());
          this.texDescripcionAliento.setText(a.getNombre());
          this.textoCantidadAlimento.setText(a.getCantidad());
      }
        
    }//GEN-LAST:event_listaAlimentoValueChanged

    private void texDescripcionAlientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texDescripcionAlientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texDescripcionAlientoActionPerformed

    private void textoCantidadAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCantidadAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCantidadAlimentoActionPerformed

    private void texDescripcionAlientoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_texDescripcionAlientoInputMethodTextChanged
        
    }//GEN-LAST:event_texDescripcionAlientoInputMethodTextChanged

    private void texDescripcionAlientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texDescripcionAlientoKeyTyped
       char letra = evt.getKeyChar();
        if (Character.isDigit(letra)){
                evt.consume();
                JOptionPane.showMessageDialog(rootPane, "Ingrese una Descripcion");
        
        }
    }//GEN-LAST:event_texDescripcionAlientoKeyTyped

    private void textoCantidadAlimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCantidadAlimentoKeyTyped
       char letra = evt.getKeyChar();
        if (!Character.isDigit(letra)){
                evt.consume();
                JOptionPane.showMessageDialog(rootPane, "Ingrese cantidad");
        
        }
    }//GEN-LAST:event_textoCantidadAlimentoKeyTyped

    /**
     * @param args the command line arguments
     */
    private void limpiar() {

        //alimento
        this.ideAlimento.setText("");
        this.texDescripcionAliento.setText("");
        this.textoCantidadAlimento.setText("");
         this.listaAlimento.setListData(this.controlador.listarAlimento().toArray());
      // this.listaAlimento.clearSelection();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ideAlimento;
    private javax.swing.JButton jButtonEliminarAlimento;
    private javax.swing.JButton jButtonGuardarAlimento;
    private javax.swing.JButton jButtonNuevoAlimento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaAlimento;
    private javax.swing.JTextField texDescripcionAliento;
    private javax.swing.JTextField textoCantidadAlimento;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
