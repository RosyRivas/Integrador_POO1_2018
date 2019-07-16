/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.Controlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
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
     *
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

        jPanelCliente = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        BotonNuevoCliente = new javax.swing.JButton();
        botonGuardarCliente = new javax.swing.JButton();
        BotonEliminarCliente = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaDeposito = new javax.swing.JList();
        agregarDepositoaCli = new javax.swing.JButton();
        quitarDepositoaCli = new javax.swing.JButton();
        comboDeposito = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCliente = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPicnic = new javax.swing.JList();
        agregarPicnicaCli = new javax.swing.JButton();
        QuitarPicnicaCli = new javax.swing.JButton();
        comboPicnic = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jLabel6.setText("Calle");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });

        jTextFieldNroCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNroCalleActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre ");

        jTextFieldTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jTextField5Calle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5CalleActionPerformed(evt);
            }
        });

        jLabel4.setText("Nro de Telefono");

        jLabel5.setText("Nro");

        jTextFielLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielLocalidadActionPerformed(evt);
            }
        });

        jLabel8.setText("Localidad");

        BotonNuevoCliente.setText("Nuevo");
        BotonNuevoCliente.setActionCommand("");
        BotonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoClienteActionPerformed(evt);
            }
        });

        botonGuardarCliente.setText("Guardar");
        botonGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarClienteActionPerformed(evt);
            }
        });

        BotonEliminarCliente.setText("Eliminar");
        BotonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BotonNuevoCliente)
                .addGap(30, 30, 30)
                .addComponent(botonGuardarCliente)
                .addGap(18, 18, 18)
                .addComponent(BotonEliminarCliente)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarCliente)
                    .addComponent(BotonEliminarCliente))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5Calle, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNroCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFielLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5Calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNroCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFielLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Depositos asociados al cliente"));

        listaDeposito.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaDeposito.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDepositoValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaDeposito);

        agregarDepositoaCli.setText("Agregar");
        agregarDepositoaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDepositoaCliActionPerformed(evt);
            }
        });

        quitarDepositoaCli.setText("Quitar");
        quitarDepositoaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarDepositoaCliActionPerformed(evt);
            }
        });

        comboDeposito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "item" }));
        comboDeposito.setMaximumSize(new java.awt.Dimension(2, 2));
        comboDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarDepositoaCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitarDepositoaCli, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(comboDeposito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarDepositoaCli)
                        .addGap(18, 18, 18)
                        .addComponent(quitarDepositoaCli))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Clientes"));

        listaCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaCliente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaClienteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaCliente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Picnic Asociado al Cliente"));

        listaPicnic.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPicnic.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPicnicValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaPicnic);

        agregarPicnicaCli.setText("Agregar");
        agregarPicnicaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPicnicaCliActionPerformed(evt);
            }
        });

        QuitarPicnicaCli.setText("Quitar");
        QuitarPicnicaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarPicnicaCliActionPerformed(evt);
            }
        });

        comboPicnic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "item" }));
        comboPicnic.setMaximumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarPicnicaCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QuitarPicnicaCli, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(comboPicnic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(comboPicnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarPicnicaCli)
                        .addGap(18, 18, 18)
                        .addComponent(QuitarPicnicaCli))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(volver)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// boton guardar
    private void botonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarClienteActionPerformed
        if (!this.listaCliente.isSelectionEmpty()) {
            Cliente c = (Cliente) this.listaCliente.getSelectedValue();
              
                this.controlador.editarCliente(c, this.jTextFieldDNI.getText(), this.jTextNombre.getText(), this.jTextFieldApellido.getText(), this.jTextFieldTelef.getText(), this.jTextField5Calle.getText(), this.jTextFieldNroCalle.getText(), this.jTextFielLocalidad.getText());
             // this.jTextFieldDNI.setEditable(false);
            
            
        } else {
            this.controlador.agregarCliente(this.jTextFieldDNI.getText(), this.jTextNombre.getText(), this.jTextFieldApellido.getText(), this.jTextFieldTelef.getText(), this.jTextField5Calle.getText(), this.jTextFieldNroCalle.getText(), this.jTextFielLocalidad.getText());
          /*if( this.listaCliente.getSelectedValue().equals(this.jTextFieldDNI.toString())){
               JOptionPane.showMessageDialog(null, "ya existe el Cliente", "Error", JOptionPane.ERROR_MESSAGE);
          }else{  
        }*/
            
           
        
        }
        limpiar();
       
    }//GEN-LAST:event_botonGuardarClienteActionPerformed

// boton nuevo cliente
    private void BotonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoClienteActionPerformed
        limpiar();

    }//GEN-LAST:event_BotonNuevoClienteActionPerformed

//boton eliminar cliente
    private void BotonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarClienteActionPerformed
        Cliente c = (Cliente) this.listaCliente.getSelectedValue();
        if (c != null) {
            int i = this.controlador.eliminarCliente(c);
            if (i != 0) {
                JOptionPane.showMessageDialog(null, "No es posible eliminar el Cliente", "Error", JOptionPane.ERROR_MESSAGE);

            }
            limpiar();
        }

    }//GEN-LAST:event_BotonEliminarClienteActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        JFormattedTextField j = new JFormattedTextField();
      // jTextFieldDNI.setValue(new Integer());
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
      
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefActionPerformed

//boton volver
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        dispose();
        this.previo.setVisible(true);


    }//GEN-LAST:event_volverActionPerformed

// lista clientes
    private void listaClienteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaClienteValueChanged
        if (!this.listaCliente.isSelectionEmpty()) {
            Cliente c = (Cliente) this.listaCliente.getSelectedValue();
            this.jTextFieldDNI.setText(c.getDni());
            this.jTextFieldDNI.setEditable(false);
            this.jTextNombre.setText(c.getNombres());
            this.jTextFieldApellido.setText(c.getApellido());
            this.jTextFieldTelef.setText(c.getNumeroTelefono());
            Direccion d = c.getDireccion();
            if (d != null) {
                this.jTextField5Calle.setText(d.getCalle());
                this.jTextFieldNroCalle.setText(d.getNumero());
                this.jTextFielLocalidad.setText(d.getLocalidad());
            }
            if (c.getPic()!= null){
                this.comboPicnic.setSelectedItem(c.getPic());
            }else{
                this.comboPicnic.setSelectedItem(null);
            }
            
            if(c.getDep()!=null){
                this.comboDeposito.setSelectedItem(c.getDep());
            }else{
                this.comboDeposito.setSelectedItem(null);
            
            }
            this.listaDeposito.setListData(c.getDep().toArray());
            this.listaPicnic.setListData(c.getPic().toArray());
        }


    }//GEN-LAST:event_listaClienteValueChanged

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextField5CalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5CalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5CalleActionPerformed

    private void jTextFieldNroCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNroCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNroCalleActionPerformed

    private void jTextFielLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielLocalidadActionPerformed

    private void listaPicnicValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPicnicValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPicnicValueChanged

    private void listaDepositoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDepositoValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDepositoValueChanged
//              QUITAR DEPOSITO
    private void quitarDepositoaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarDepositoaCliActionPerformed
       if (this.listaCliente.getSelectedValue()!= null && this.listaDeposito.getSelectedValue()!= null){
            Deposito d= (Deposito) this.listaDeposito.getSelectedValue();
            Cliente c= (Cliente )this.listaCliente.getSelectedValue();
            this.controlador.quitarDepositoCliente(c, d);
            this.listaDeposito.setListData(c.getDep().toArray());
       }
    }//GEN-LAST:event_quitarDepositoaCliActionPerformed
//               BOTON   QUITAR PICNIC
    private void QuitarPicnicaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarPicnicaCliActionPerformed
       if (this.listaCliente.getSelectedValue()!= null && this.listaPicnic.getSelectedValue()!= null){
            Picnic p = (Picnic) this.listaPicnic.getSelectedValue();
            Cliente c= (Cliente )this.listaCliente.getSelectedValue();
            this.controlador.quitarPicnicCliente(p, c);
            this.listaPicnic.setListData(c.getDep().toArray());
       }
    }//GEN-LAST:event_QuitarPicnicaCliActionPerformed
//                 BOTON  AGREGAR DEPOSITO AL CLIENTE
    private void agregarDepositoaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDepositoaCliActionPerformed
       if (this.listaCliente.getSelectedValue()!= null && this.comboDeposito.getSelectedItem()!= null){
           Deposito d = (Deposito) this.comboDeposito.getSelectedItem();
           Cliente c = (Cliente) this.listaCliente.getSelectedValue();
           this.controlador.agregarDepositoaCliente(c, d);
           this.listaDeposito.setListData(c.getDep().toArray());
       
       }else{
           JOptionPane.showMessageDialog(null, "Por favor seleccione un Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_agregarDepositoaCliActionPerformed
//                BOTON  AGREGAR PICNIC AL CLIENTE
    private void agregarPicnicaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPicnicaCliActionPerformed
        if (this.listaCliente.getSelectedValue()!= null && this.comboPicnic.getSelectedItem()!= null){
           Picnic p= (Picnic) this.comboPicnic.getSelectedItem();
           Cliente c = (Cliente) this.listaCliente.getSelectedValue();
           this.controlador.agregarClientePicnic(p, c);
           this.listaPicnic.setListData(c.getPic().toArray());
       
       }else{
        JOptionPane.showMessageDialog(null, "Por favor seleccione un Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarPicnicaCliActionPerformed

    private void comboDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepositoActionPerformed
       
    }//GEN-LAST:event_comboDepositoActionPerformed
//         BOTON  LIMPIAR CAMPOS
    private void limpiar() {
        this.jTextFieldDNI.setText("");
        this.jTextFieldDNI.setEditable(true);
        this.jTextNombre.setText("");
        this.jTextFieldApellido.setText("");
        this.jTextFieldTelef.setText("");
        this.jTextField5Calle.setText("");
        this.jTextFieldNroCalle.setText("");
        this.jTextFielLocalidad.setText("");
        //lista cliente
        this.listaCliente.setListData(this.controlador.listarCliente().toArray());
        this.listaCliente.clearSelection();
        //combo picnic
         DefaultComboBoxModel comboPic = new DefaultComboBoxModel(this.controlador.listarPicnic().toArray());
        this.comboPicnic.setModel(comboPic);

        //combo deposito
         DefaultComboBoxModel comboDep = new DefaultComboBoxModel(this.controlador.listarDeposito().toArray());
        this.comboDeposito.setModel(comboDep);
        //lista picnic
         DefaultListModel modeloListPic = new DefaultListModel();
        this.listaPicnic.setModel(modeloListPic);

        //lista deposito
         DefaultListModel modeloListDep = new DefaultListModel();
         this.listaDeposito.setModel(modeloListDep);
         
         this.comboDeposito.setSelectedIndex(-1);
         this.comboPicnic.setSelectedIndex(-1);
      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarCliente;
    private javax.swing.JButton BotonNuevoCliente;
    private javax.swing.JButton QuitarPicnicaCli;
    private javax.swing.JButton agregarDepositoaCli;
    private javax.swing.JButton agregarPicnicaCli;
    private javax.swing.JButton botonGuardarCliente;
    private javax.swing.JComboBox comboDeposito;
    private javax.swing.JComboBox comboPicnic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFielLocalidad;
    private javax.swing.JTextField jTextField5Calle;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNroCalle;
    private javax.swing.JTextField jTextFieldTelef;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JList listaCliente;
    private javax.swing.JList listaDeposito;
    private javax.swing.JList listaPicnic;
    private javax.swing.JButton quitarDepositoaCli;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
