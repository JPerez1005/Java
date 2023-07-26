package bd_registros;
import java.sql.*;
import javax.swing.JOptionPane;
public class Registrar extends javax.swing.JInternalFrame {

    Conexion conectar = Conexion.getInstance();
    public Registrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfnombre = new javax.swing.JTextField();
        jtftelefono = new javax.swing.JTextField();
        jcbfacultad = new javax.swing.JComboBox<>();
        jbregistrardatos = new javax.swing.JButton();
        jbactualizar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Digite su nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Digite su facultad:");

        jtfnombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtfnombre.setText("Digite su Nombre");
        jtfnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfnombreFocusGained(evt);
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

        jbregistrardatos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jbregistrardatos.setText("Registrar Datos");
        jbregistrardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistrardatosActionPerformed(evt);
            }
        });

        jbactualizar.setText("Actualizar");
        jbactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbactualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jcbfacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jbregistrardatos)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbregistrardatos)
                    .addComponent(jcbfacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jbactualizar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfnombreFocusGained
        // TODO add your handling code here:
        jtfnombre.setText("");
    }//GEN-LAST:event_jtfnombreFocusGained

    private void jtftelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtftelefonoFocusGained
        // TODO add your handling code here:
        jtftelefono.setText("");
    }//GEN-LAST:event_jtftelefonoFocusGained

    private void jbregistrardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrardatosActionPerformed
        // TODO add your handling code here:
        try {

            Connection conexion= conectar.conectar();
            PreparedStatement insertar= conexion.prepareStatement("insert into empleados values(?,?,?,?)");

            insertar.setString(1,"0");
            insertar.setString(2,jtfnombre.getText().trim());
            insertar.setString(3,jtftelefono.getText().trim());
            insertar.setString(4,jcbfacultad.getSelectedItem().toString());
            insertar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Registrados!!");

            conectar.cerrarConexion();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Hubo un Error: "+error);
        }
    }//GEN-LAST:event_jbregistrardatosActionPerformed

    private void jbactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbactualizarActionPerformed
        // TODO add your handling code here:
        jtfnombre.setText("");
        jtftelefono.setText("");
        jcbfacultad.setSelectedItem("Facultad");
    }//GEN-LAST:event_jbactualizarActionPerformed

    private void jcbfacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbfacultadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbactualizar;
    private javax.swing.JButton jbregistrardatos;
    private javax.swing.JComboBox<String> jcbfacultad;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    // End of variables declaration//GEN-END:variables
}
