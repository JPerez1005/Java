package bd_registros;

import java.sql.*;
import javax.swing.JOptionPane;
import bd_registros.Registrar;
public class Modificar_y_Eliminar extends javax.swing.JInternalFrame {
    
    Conexion conectar = Conexion.getInstance();
    public Modificar_y_Eliminar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbeliminar = new javax.swing.JButton();
        jtfbusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbmodificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfnombre = new javax.swing.JTextField();
        jtftelefono = new javax.swing.JTextField();
        jcbfacultad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Digite el id que desea eliminar o modificar:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Para hacer una modificacion primero llene los parametros");

        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Si solo quiere eliminar un campo digite el id y de click en eliminar");

        jtfnombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfnombre.setText("Digite su Nombre");
        jtfnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfnombreFocusGained(evt);
            }
        });
        jtfnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnombreActionPerformed(evt);
            }
        });

        jtftelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtftelefono.setText("Telefono");
        jtftelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtftelefonoFocusGained(evt);
            }
        });

        jcbfacultad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jcbfacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facultad", "Ingenieria de Sistemas", "Ingenieria Civil", "Ingenieria Industrial", "Ingenieria Quimica", "Ingenieria Electronica" }));
        jcbfacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfacultadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("digite el nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jbeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbmodificar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(jcbfacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbfacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbeliminar)
                    .addComponent(jbmodificar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection conexion= conectar.conectar();
            PreparedStatement eliminar= conexion.prepareStatement("delete from empleados WHERE id = ?");
            eliminar.setString(1, jtfbusqueda.getText().trim());
            eliminar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay un error: "+e);
        }
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed
        // TODO add your handling code here:
        try {

            Connection conexion= conectar.conectar();
            String id= jtfbusqueda.getText().trim();
            PreparedStatement modificar=conexion.prepareStatement("UPDATE empleados SET nombre = ?, telefono = ?, profesion = ? WHERE id = "+id);
            modificar.setString(1,jtfnombre.getText().trim());
            modificar.setString(2,jtftelefono.getText().trim());
            modificar.setString(3,jcbfacultad.getSelectedItem().toString());
            modificar.executeUpdate();

            JOptionPane.showMessageDialog(null, "El id ah sido modificado"
                    + "\nModificacion Exitosa...");
            
            conectar.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jtfnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfnombreFocusGained
        // TODO add your handling code here:
        jtfnombre.setText("");
    }//GEN-LAST:event_jtfnombreFocusGained

    private void jtftelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtftelefonoFocusGained
        // TODO add your handling code here:
        jtftelefono.setText("");
    }//GEN-LAST:event_jtftelefonoFocusGained

    private void jcbfacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbfacultadActionPerformed

    private void jtfnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JComboBox<String> jcbfacultad;
    private javax.swing.JTextField jtfbusqueda;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    // End of variables declaration//GEN-END:variables
}
