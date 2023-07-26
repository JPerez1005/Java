package personas;

import interfaces.DAOEmpleado;
import interfaces.DAOEmpleadoImplementacion;
import javax.swing.JOptionPane;

public class Diseño extends javax.swing.JFrame {

    public Diseño() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Crud con DAO");
    }
    
    private void limpiar(){
        jtfid.setText("");
        jtfnombre.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbactualizar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfnombre = new javax.swing.JTextField();
        jtfid = new javax.swing.JTextField();
        jbregistrar = new javax.swing.JButton();
        jbactualizar = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbmodificar = new javax.swing.JButton();

        jbactualizar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbactualizar1.setText("Actualizar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Digite su nombre:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Digite su id:");

        jtfnombre.setText("Digite el nombre");
        jtfnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfnombreFocusGained(evt);
            }
        });

        jtfid.setText("Digite el id");
        jtfid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfidFocusGained(evt);
            }
        });

        jbregistrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbregistrar.setText("Registrar");
        jbregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistrarActionPerformed(evt);
            }
        });

        jbactualizar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbactualizar.setText("Actualizar");

        jbbuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jbeliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbmodificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbbuscar)
                    .addComponent(jbactualizar)
                    .addComponent(jbregistrar)
                    .addComponent(jbmodificar)
                    .addComponent(jbeliminar))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbactualizar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbregistrar)))
                .addGap(18, 18, 18)
                .addComponent(jbmodificar)
                .addGap(18, 18, 18)
                .addComponent(jbeliminar)
                .addGap(18, 18, 18)
                .addComponent(jbbuscar)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        // TODO add your handling code here:
        DAOEmpleadoImplementacion empleado_dao = new DAOEmpleadoImplementacion();
        empleado empleado= new empleado();
            
        
        if(jtfid.getText().equals("")){
            int id=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el id que quiere buscar"));
            
            empleado.setId(id);
            empleado_dao.buscar(empleado);
            
            jtfid.setText(String.valueOf(empleado.getId()));
            jtfnombre.setText(empleado.getEmpleado());
            
            if(jtfnombre.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
            }else{
                JOptionPane.showMessageDialog(null, "Registro encontrado");
            }
        }else{
            int id = Integer.parseInt(jtfid.getText());
            empleado.setId(id);
            empleado_dao.buscar(empleado);
            
            jtfid.setText(String.valueOf(empleado.getId()));
            jtfnombre.setText(empleado.getEmpleado());
            
            if(jtfnombre.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
            }else{
                JOptionPane.showMessageDialog(null, "Registro encontrado");
            }
        }
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrarActionPerformed
        // TODO add your handling code here:
        try {
            
            DAOEmpleadoImplementacion empleado_dao = new DAOEmpleadoImplementacion();
            empleado empleado= new empleado();
            if (jtfid.getText().equals("") && jtfnombre.getText().equals("")) {
                int id= Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el id\nque desea registrar\n"));
                String nombre=JOptionPane.showInputDialog("Por favor digite el nombre\nque desea registrar");
                
                empleado.setId(id);
                empleado.setEmpleado(nombre);

                empleado_dao.registrar(empleado);
            }else{
                int id = Integer.parseInt(jtfid.getText());
                String nombre = jtfnombre.getText();

                empleado.setId(id);
                empleado.setEmpleado(nombre);

                empleado_dao.registrar(empleado);
            }
            
            limpiar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jbregistrarActionPerformed

    private void jtfnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfnombreFocusGained
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jtfnombreFocusGained

    private void jtfidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfidFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidFocusGained

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
        DAOEmpleadoImplementacion empleado_dao = new DAOEmpleadoImplementacion();
        empleado empleado= new empleado();
        
        if(jtfid.getText().equals("")){
            int id=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el id que quiere eliminar"));
            empleado.setId(id);
            empleado_dao.eliminar(empleado);
            
            JOptionPane.showMessageDialog(null, "El empleado con el id: "+id+"\nYa no se encuentra en la base de datos");
            
        }else{
            int id = Integer.parseInt(jtfid.getText());
            empleado.setId(id);
            empleado_dao.eliminar(empleado);
            
            JOptionPane.showMessageDialog(null, "El empleado con el id: "+id+"\nYa no se encuentra en la base de datos");
        }
        
        limpiar();
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed
        // TODO add your handling code here:
        DAOEmpleadoImplementacion empleado_dao = new DAOEmpleadoImplementacion();
        empleado empleado= new empleado();
        
        try {
            if (jtfid.getText().equals("") && jtfnombre.getText().equals("")) {
                int id= Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el id\nque desea modificar\n"));
                String nombre=JOptionPane.showInputDialog("Por favor digite el nombre que desea modificar");
                
                empleado.setId(id);
                empleado.setEmpleado(nombre);

                empleado_dao.modificar(empleado);
            }else{
                int id = Integer.parseInt(jtfid.getText());
                String nombre = jtfnombre.getText();

                empleado.setId(id);
                empleado.setEmpleado(nombre);

                empleado_dao.modificar(empleado);
            }
            limpiar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbmodificarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diseño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbactualizar;
    private javax.swing.JButton jbactualizar1;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbregistrar;
    private javax.swing.JTextField jtfid;
    private javax.swing.JTextField jtfnombre;
    // End of variables declaration//GEN-END:variables
}
