package com.mycompany.sistemahospitalmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registros extends javax.swing.JInternalFrame {
    Connection con;
    public Registros() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtfnumerodocumento = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        jtfapellido = new javax.swing.JTextField();
        jdcfechanacimiento = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        rbmasculino = new javax.swing.JRadioButton();
        rbfemenino = new javax.swing.JRadioButton();
        jbregistrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Registros Pacientes");

        jtfnumerodocumento.setText("Ingrese N° de Documento");
        jtfnumerodocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfnumerodocumentoFocusGained(evt);
            }
        });
        jtfnumerodocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnumerodocumentoActionPerformed(evt);
            }
        });

        jtfnombre.setText("Nombre");
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

        jtfapellido.setText("Apellido");
        jtfapellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfapellidoFocusGained(evt);
            }
        });
        jtfapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfapellidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de Nacimiento:");

        Sexo.add(rbmasculino);
        rbmasculino.setText("Masculino");

        Sexo.add(rbfemenino);
        rbfemenino.setText("Femenino");

        jbregistrar.setText("Registrar");
        jbregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResgistrarButtonmetodoaccion(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfnumerodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbmasculino)
                                        .addGap(78, 78, 78)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbfemenino)
                                    .addComponent(jdcfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jbregistrar)))
                .addGap(80, 99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfnumerodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbfemenino)
                    .addComponent(rbmasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbregistrar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfnumerodocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnumerodocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnumerodocumentoActionPerformed

    private void jtfnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnombreActionPerformed

    private void ResgistrarButtonmetodoaccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResgistrarButtonmetodoaccion
        // TODO add your handling code here:
        int year= jdcfechanacimiento.getCalendar().get(Calendar.YEAR);
        int month= jdcfechanacimiento.getCalendar().get(Calendar.MONTH);
        int day= jdcfechanacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
        
        String fechanacimiento=""+year+"-"+month+"-"+day;
        
        String sexo="";
        
        if(rbmasculino.isSelected()){
            sexo="M";
        }if(rbfemenino.isSelected()){
            sexo="F";
        }
        
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/sistemahospital","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO pacientes VALUES('"+jtfnumerodocumento.getText()+"','"+jtfnombre.getText()+"','"+jtfapellido.getText()+"','"+fechanacimiento+"','"+sexo+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se puede conectar");
        }
            
        JOptionPane.showMessageDialog(null, "El paciente fue registrado correctamente", "Registro",0);
        
    }//GEN-LAST:event_ResgistrarButtonmetodoaccion

    private void jtfapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfapellidoActionPerformed

    private void jtfnumerodocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfnumerodocumentoFocusGained
        // TODO add your handling code here:
        jtfnumerodocumento.setText("");
    }//GEN-LAST:event_jtfnumerodocumentoFocusGained

    private void jtfnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfnombreFocusGained
        // TODO add your handling code here:
        jtfnombre.setText("");
    }//GEN-LAST:event_jtfnombreFocusGained

    private void jtfapellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfapellidoFocusGained
        // TODO add your handling code here:
        jtfapellido.setText("");
    }//GEN-LAST:event_jtfapellidoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbregistrar;
    private com.toedter.calendar.JDateChooser jdcfechanacimiento;
    private javax.swing.JTextField jtfapellido;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtfnumerodocumento;
    private javax.swing.JRadioButton rbfemenino;
    private javax.swing.JRadioButton rbmasculino;
    // End of variables declaration//GEN-END:variables
}
