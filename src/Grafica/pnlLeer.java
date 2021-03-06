/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Datos.Correo;
import Datos.Empleado;
import Datos.Empresa;
import Datos.modeloTabla;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 203pc1
 */
public class pnlLeer extends javax.swing.JPanel {

   Empresa email;
   modeloTabla modelo;
   int usuarioValidado;
    public pnlLeer(Empresa email, int usuarioValidado) {
        initComponents();
        this.usuarioValidado=usuarioValidado;
        this.email=email;
        modelo=new modeloTabla();
        //TITULOS DEL JTABLE
        String [] titulos={"Fecha","Emisor","Asuntos"};
        modelo.setColumnIdentifiers(titulos);
        tblCorreos.setModel(modelo);
        cargarMensajes();
    }
    
    public void cargarMensajes(){
        //SABER CUANTOS MENSAJES TIENE EL USUARIO VALIDADO
        // se crea usuario
        Empleado usuario;
        //para guardar los correos
        ArrayList <Correo> bentrada;
        //buscamos la posicion METODO CREADO
        int pos=email.BuscarIdentificador(usuarioValidado);
        //guardamos el usuario TODOS LOS DATOS INCLUIDA LA BANDEJA ENTRADA
        usuario=email.getMisEmpleados().get(pos);
        // se coge solo la bandeja de entrada
        bentrada=usuario.getbEntrada();
       // bentrada=email.getMisEmpleados().get(pos).getbEntrada();
        
        for(int i=0; i<bentrada.size();i++){
            //siempre que se añaden datos son de tipo String []
            // en este caso 3 que son las columnas del JTABLE
            String[] datos=new String[3];
            //datos[0]=bentrada.get(i).getFecha().visualizar();
            int x=email.BuscarIdentificador(bentrada.get(i).getCodigoEmisor());
            datos[0]="20/04/2015";
            datos[1]=email.getMisEmpleados().get(x).getNombre();
            datos[1]=String.valueOf(bentrada.get(i).getCodigoEmisor());
            datos[2]=bentrada.get(i).getAsunto();
            modelo.addRow(datos);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCorreos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMensaje = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmisor = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(100, 100));

        tblCorreos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Emisor", "Asunto"
            }
        ));
        tblCorreos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCorreosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCorreos);

        txaMensaje.setColumns(20);
        txaMensaje.setRows(5);
        txaMensaje.setEnabled(false);
        txaMensaje.setPreferredSize(getMaximumSize());
        jScrollPane2.setViewportView(txaMensaje);

        jLabel1.setText("Emisor");

        jLabel2.setText("Fecha");

        jLabel3.setText("Asunto");

        txtEmisor.setEnabled(false);

        txtFecha.setEnabled(false);

        txtAsunto.setEnabled(false);
        txtAsunto.setFocusCycleRoot(true);

        jLabel4.setText("Mensaje");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAsunto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmisor, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                    .addComponent(txtFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCorreosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCorreosMouseClicked
        // TODO add your handling code here:
        int fila=tblCorreos.getSelectedRow();
        int pos=email.BuscarIdentificador(usuarioValidado);
        Correo correo = email.getMisEmpleados().get(pos).getbEntrada().get(fila);
        int x =email.BuscarIdentificador(correo.getCodigoEmisor());
        txtEmisor.setText(email.getMisEmpleados().get(x).getNombre());
        txtFecha.setText(correo.getFecha());
        txtAsunto.setText(correo.getAsunto());
        txaMensaje.setText(correo.getTexto());
    }//GEN-LAST:event_tblCorreosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int fila=tblCorreos.getSelectedRow();
        if(fila==-1)
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        else {
            modelo.removeRow(fila);
            int pos=email.BuscarIdentificador(usuarioValidado);
            email.getMisEmpleados().get(pos).getbEntrada().remove(fila);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCorreos;
    private javax.swing.JTextArea txaMensaje;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtEmisor;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
