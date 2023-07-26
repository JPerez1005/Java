package bd_registros;

import javax.swing.JOptionPane;
import java.sql.*;


public class consultastotales extends javax.swing.JInternalFrame {
    Conexion conectar = Conexion.getInstance();
    public consultastotales() {
        initComponents();
        this.setTitle("Todas las consultas");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        jbconsultar = new javax.swing.JButton();
        jbverificacion = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();
        jtfbuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        informacion.setColumns(20);
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        jbconsultar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jbconsultar.setText("Consultar");
        jbconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbconsultarActionPerformed(evt);
            }
        });

        jbverificacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jbverificacion.setText("Verificar base de datos");
        jbverificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbverificacionActionPerformed(evt);
            }
        });

        jbbuscar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jtfbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfbuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Digite el id que quiere encontrar:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("ver todas las tablas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jtfbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbconsultar)
                        .addGap(53, 53, 53)
                        .addComponent(jbverificacion))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(jtfbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbverificacion)
                    .addComponent(jbconsultar)
                    .addComponent(jLabel2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbverificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbverificacionActionPerformed
        try {
            
            Connection conexion= conectar.conectar();
            PreparedStatement seleccionar=conexion.prepareStatement("SELECT * FROM empleados");
            
            ResultSet consulta=seleccionar.executeQuery();
            
            if(consulta.next()){
                JOptionPane.showMessageDialog(null, "La base de Datos tiene datos");
            }else{
                JOptionPane.showMessageDialog(null, "La Base de Datos no tiene datos");
            }
            
            conectar.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
    }//GEN-LAST:event_jbverificacionActionPerformed

    private void jbconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconsultarActionPerformed
        informacion.setText("");
        try {
            
            Connection conexion= conectar.conectar();
            PreparedStatement seleccionar=conexion.prepareStatement("SELECT * FROM empleados");
            ResultSet consulta=seleccionar.executeQuery();
            
            while(consulta.next()){
                informacion.append(consulta.getString(1));
                informacion.append("   ");
                informacion.append(consulta.getString(2));
                informacion.append("   ");
                informacion.append(consulta.getString(3));
                informacion.append("   ");
                informacion.append(consulta.getString(4));
                informacion.append("\n");
            }
            
            conectar.cerrarConexion();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog
            (null, "Fallo la consulta a la base de datos por:"+e);
        }
    }//GEN-LAST:event_jbconsultarActionPerformed

    private void jtfbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfbuscarActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        // TODO add your handling code here:
        try {
            informacion.setText("");
            Connection conexion= conectar.conectar();
            PreparedStatement buscar=conexion.prepareStatement("SELECT * FROM empleados WHERE id = ?");
            buscar.setString(1, jtfbuscar.getText().trim());
            
            ResultSet consulta = buscar.executeQuery();
            while (consulta.next()) {                
                informacion.append(consulta.getString(1));
                informacion.append("   ");
                informacion.append(consulta.getString(2));
                informacion.append("   ");
                informacion.append(consulta.getString(3));
                informacion.append("   ");
                informacion.append(consulta.getString(4));
                informacion.append("\n");
            }
            
            JOptionPane.showMessageDialog(null, "Datos Encontrados");
            conectar.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_jbbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbconsultar;
    private javax.swing.JButton jbverificacion;
    private javax.swing.JTextField jtfbuscar;
    // End of variables declaration//GEN-END:variables
}
