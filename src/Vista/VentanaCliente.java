/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.Controlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;
/**
 *
 * @author Rosi-PC
 */
public class VentanaCliente extends javax.swing.JFrame {
    private final Controlador controlador;
    private final JFrame previo;
    
    /**
     * Creates new form Empleados
     * @param c : controlador
     * @param p : previo JFrame
     */
    
    
    public VentanaCliente(Controlador c, JFrame p) {
         this.controlador = c;
        this.previo = p;
        initComponents();
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

        PanelLPicnic = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListPicnic = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jBAgregarPicnic = new javax.swing.JButton();
        jComPicnic = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCliente = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jPanelCliente = new javax.swing.JPanel();
        botonGuardarCliente = new javax.swing.JButton();
        BotonNuevoCliente = new javax.swing.JButton();
        BotonEliminarCliente = new javax.swing.JButton();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNroCalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTelef = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5Calle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFielLocalidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        PanelLPicnic1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListDeposito = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jBAgregarDeposito = new javax.swing.JButton();
        jComDeposito = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jListPicnic.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jListPicnic);

        jLabel9.setText("Lista de Picnic");

        jBAgregarPicnic.setText("Agregar");
        jBAgregarPicnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarPicnicActionPerformed(evt);
            }
        });

        jComPicnic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelLPicnicLayout = new javax.swing.GroupLayout(PanelLPicnic);
        PanelLPicnic.setLayout(PanelLPicnicLayout);
        PanelLPicnicLayout.setHorizontalGroup(
            PanelLPicnicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLPicnicLayout.createSequentialGroup()
                .addGroup(PanelLPicnicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLPicnicLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(PanelLPicnicLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelLPicnicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAgregarPicnic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComPicnic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelLPicnicLayout.setVerticalGroup(
            PanelLPicnicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLPicnicLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLPicnicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLPicnicLayout.createSequentialGroup()
                        .addComponent(jComPicnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAgregarPicnic)
                        .addGap(53, 53, 53)))
                .addContainerGap())
        );

        jListCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListCliente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListClienteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListCliente);

        jLabel7.setText("Lista de Clientes");

        botonGuardarCliente.setText("Guardar");
        botonGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarClienteActionPerformed(evt);
            }
        });

        BotonNuevoCliente.setText("Nuevo");
        BotonNuevoCliente.setActionCommand("");
        BotonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoClienteActionPerformed(evt);
            }
        });

        BotonEliminarCliente.setText("Eliminar");
        BotonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarClienteActionPerformed(evt);
            }
        });

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jLabel6.setText("Calle");

        jLabel1.setText("DNI");

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre ");

        jTextFieldTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel4.setText("Nro de Telefono");

        jLabel5.setText("Nro");

        jLabel8.setText("Localidad");

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jTextNombre)
                            .addComponent(jTextFieldTelef)
                            .addComponent(jTextField5Calle)
                            .addComponent(jTextFieldApellido)
                            .addComponent(jTextFieldNroCalle)
                            .addComponent(jTextFielLocalidad)))
                    .addComponent(jLabel1)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(BotonNuevoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEliminarCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5Calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(jTextFieldNroCalle)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFielLocalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarCliente)
                    .addComponent(BotonEliminarCliente))
                .addGap(41, 41, 41))
        );

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jListDeposito.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jListDeposito);

        jLabel11.setText("Lista de Deposito");

        jBAgregarDeposito.setText("Agregar");
        jBAgregarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarDepositoActionPerformed(evt);
            }
        });

        jComDeposito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelLPicnic1Layout = new javax.swing.GroupLayout(PanelLPicnic1);
        PanelLPicnic1.setLayout(PanelLPicnic1Layout);
        PanelLPicnic1Layout.setHorizontalGroup(
            PanelLPicnic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLPicnic1Layout.createSequentialGroup()
                .addGroup(PanelLPicnic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLPicnic1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(PanelLPicnic1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelLPicnic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAgregarDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelLPicnic1Layout.setVerticalGroup(
            PanelLPicnic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLPicnic1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(PanelLPicnic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLPicnic1Layout.createSequentialGroup()
                        .addComponent(jComDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregarDeposito))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelLPicnic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelLPicnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                        .addComponent(volver)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelLPicnic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelLPicnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


// boton guardar
    private void botonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarClienteActionPerformed
    if (! this.jListCliente.isSelectionEmpty()){
         Cliente c =(Cliente )this.jListCliente.getSelectedValuesList();
         this.controlador.editarCliente(c,this.jTextFieldDNI.getText(), this.jTextNombre.getText(),this.jTextFieldApellido.getText(),this.jTextFieldTelef.getText(),this.jTextField5Calle.getText(),this.jTextField5Calle.getText(),this.jTextFielLocalidad.getText());
     }else{ 
        this.controlador.agregarCliente(this.jTextFieldDNI.getText(),this.jTextNombre.getText(),this.jTextFieldApellido.getText(),this.jTextFieldTelef.getText(),this.jTextField5Calle.getText(),this.jTextField5Calle.getText(),this.jTextFielLocalidad.getText());
     }
     limpiar();
    }//GEN-LAST:event_botonGuardarClienteActionPerformed


// boton nuevo cliente
    private void BotonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoClienteActionPerformed
        limpiar();
     
    }//GEN-LAST:event_BotonNuevoClienteActionPerformed


//boton eliminar cliente
    private void BotonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarClienteActionPerformed
        Cliente c= (Cliente ) this.jListCliente.getSelectedValue();
        if (c!=null){
            int i = this.controlador.eliminarCliente(c);
            if (i !=0 ){
                JOptionPane.showMessageDialog(null, "No es posible eliminar el empleado", "Error", JOptionPane.ERROR_MESSAGE);
            
            }
           limpiar(); 
        }
        
    }//GEN-LAST:event_BotonEliminarClienteActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    
    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefActionPerformed
//boton volver
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        
        dispose();
      this.previo.setVisible(true);
    
        
              
    }//GEN-LAST:event_volverActionPerformed


//boton agregar picnic a cliente
    private void jBAgregarPicnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarPicnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAgregarPicnicActionPerformed


// lista clientes
    private void jListClienteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListClienteValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListClienteValueChanged


//agregar deposito
    private void jBAgregarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAgregarDepositoActionPerformed

 
  
private void limpiar(){
   this.jTextFieldDNI.setText("");
    this.jTextNombre.setText("");
    this.jTextFieldApellido.setText("");
    this.jTextFieldTelef.setText("");
    this.jTextField5Calle.setText("");
    this.jTextFieldNroCalle.setText("");
    this.jTextFielLocalidad.setText("");

    DefaultComboBoxModel modeloComboPic = new DefaultComboBoxModel(this.controlador.listarPicnic().toArray());
    this.jComPicnic.setModel(modeloComboPic);
    
    DefaultComboBoxModel modeloComboDep = new DefaultComboBoxModel(this.controlador.listarDeposito().toArray());
    this.jComDeposito.setModel(modeloComboDep);
    
    this.jListCliente.setListData( this.controlador.listarCliente().toArray());
    this.jListCliente.clearSelection();
    
    DefaultListModel modeloLista = new DefaultListModel();
    this.jListPicnic.setModel(modeloLista);
    this.jComPicnic.setSelectedIndex(-1);



}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarCliente;
    private javax.swing.JButton BotonNuevoCliente;
    private javax.swing.JPanel PanelLPicnic;
    private javax.swing.JPanel PanelLPicnic1;
    private javax.swing.JButton botonGuardarCliente;
    private javax.swing.JButton jBAgregarDeposito;
    private javax.swing.JButton jBAgregarPicnic;
    private javax.swing.JComboBox jComDeposito;
    private javax.swing.JComboBox jComPicnic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListCliente;
    private javax.swing.JList jListDeposito;
    private javax.swing.JList jListPicnic;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextFielLocalidad;
    private javax.swing.JTextField jTextField5Calle;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNroCalle;
    private javax.swing.JTextField jTextFieldTelef;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
