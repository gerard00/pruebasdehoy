/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Datos.Empleado;
import Datos.Empresa;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 203pc1
 */
public class pnlModificaciones extends javax.swing.JPanel {
    Empresa email;
    //para volver a administrador al cancelar
    VentanaAdministrador ventana;
    private DefaultListModel modelo;
    
    public pnlModificaciones(Empresa email, VentanaAdministrador administrador) {
       //INSTANCIAR MODELOS SIIEMMPRREEE
        modelo= new DefaultListModel();
        this.email = email;
        //para volver a administrador al cancelar
        this.ventana = administrador;
        
        initComponents();
        
        
        // SE RELLENA DEBAJO DE INICIAR SINO NO HABRIA COMPONENTE PARA MOSTRARLOS
        cargaEmpleados();
    }
    
    private void cargaEmpleados(){
        ArrayList<Empleado> misEmpleados=email.getMisEmpleados();
        // AÑADIR TODOS LOS DATOS DE LA COLECCION MIS EMPLEADOS
        for (int i=0; i<misEmpleados.size(); i++){
            modelo.addElement(misEmpleados.get(i));
        }
         //ASI SOLO MUESTRA LA DIRECCION NO LOS DATOS
        //lstEmpleados.setModel(modelo);
       lstEmpleados.setModel(modelo);
             
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmpleados = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbTipoUsuario = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        pwdContra = new javax.swing.JPasswordField();

        lstEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEmpleadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEmpleados);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("USUARIOS");
        jLabel1.setToolTipText("");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("CONTRASEÑA");

        jLabel4.setText("USUARIO");

        jLabel5.setText("IDENTIFICADOR");

        jLabel6.setText("TIPO USUARIO");

        txtIdentificador.setEnabled(false);

        txtLogin.setEnabled(false);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuario" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("MODIFICACION USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIdentificador)
                                            .addComponent(txtLogin)
                                            .addComponent(txtNombre)
                                            .addComponent(cmbTipoUsuario, 0, 234, Short.MAX_VALUE)
                                            .addComponent(pwdContra)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(btnGrabar)
                                        .addGap(63, 63, 63)
                                        .addComponent(btnCancelar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel7)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGrabar)
                            .addComponent(btnCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
      int indice=lstEmpleados.getSelectedIndex();
      int pos = email.BuscarUsuario(txtLogin.getText());
      if (pos==-1) {
          JOptionPane.showMessageDialog(this, "Empleado no encontrado");
          
      } else {
          //cambiar email
          //getMisEmpleados() y setPass METODOS CREADOS POR NOSOTROS
          //new String(pwdContra.getPassword() COGE EL TEXTO DE UNA CASILLA TIPO JPASSWORD
          // modificar SOLO UN DATO (en este caso contraseña)
          // email.getMisEmpleados().get(pos).setPass(new String(pwdContra.getPassword()));
          // modificar LOS QUE SE QUIERAN (metodo creado en Empresa
          //email.modificarEmpleado(pos, new String(pwdContra.getPassword()),
          // txtNombre.getText(),cmbTipoUsuario.getSelectedIndex());
          // actualizar modelo
          //modificar TODOS LOS DATOS
          //SE CREA UN EMPLEADO
          Empleado e=new Empleado(cmbTipoUsuario.getSelectedIndex()+1  ,
                  txtLogin.getText(),new String(pwdContra.getPassword()),txtNombre.getText(),Integer.parseInt(txtIdentificador.getText()));
          //SE GUARDA EMPLEADO MODIFICADO
          email.getMisEmpleados().set(pos, e);
          // ACTUALIZA EL MODELO
          modelo.set(indice, e);
      }
      
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void lstEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEmpleadosValueChanged
        // TODO add your handling code here:
       
       txtNombre.setText(email.getMisEmpleados().get(lstEmpleados.getSelectedIndex()).getNombre());
       txtLogin.setText(email.getMisEmpleados().get(lstEmpleados.getSelectedIndex()).getLogin());
       pwdContra.setText(email.getMisEmpleados().get(lstEmpleados.getSelectedIndex()).getPass());
       txtIdentificador.setText(String.valueOf(email.getMisEmpleados().get(lstEmpleados.getSelectedIndex()).getIdentificador()));
       cmbTipoUsuario.setSelectedIndex(email.getMisEmpleados().get(lstEmpleados.getSelectedIndex()).getTipoUsuario()-1);
       
    }//GEN-LAST:event_lstEmpleadosValueChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //qutar el panel y volver a ventanaAdministrador
        ventana.remove(this);
        ventana.pack();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstEmpleados;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
