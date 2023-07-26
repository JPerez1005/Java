package bd_registros;

import java.sql.*;
import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    Registrar r;
    consultastotales ct;
    Modificar_y_Eliminar mye;
    Conexion conectar = Conexion.getInstance();
    public Index() {
        initComponents();
        
        r= new Registrar();
        ct= new consultastotales();
        mye= new Modificar_y_Eliminar();
        add(r);
        add(ct);
        add(mye);
        this.setLocationRelativeTo(null);//centrar
        this.setTitle("Registro de Datos");//titulo
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmadmin = new javax.swing.JMenu();
        jmiregistrodedatos = new javax.swing.JMenuItem();
        jmialldatos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jmadmin.setText("Administracion de Datos");

        jmiregistrodedatos.setText("Registrar datos");
        jmiregistrodedatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiregistrodedatosActionPerformed(evt);
            }
        });
        jmadmin.add(jmiregistrodedatos);

        jmialldatos.setText("Consultar todos los datos");
        jmialldatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmialldatosActionPerformed(evt);
            }
        });
        jmadmin.add(jmialldatos);

        jMenuItem1.setText("modificar o eliminar datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmadmin.add(jMenuItem1);

        jMenuBar1.add(jmadmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmialldatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmialldatosActionPerformed
        // TODO add your handling code here:
        ct.setVisible(true);
        r.setVisible(false);
        mye.setVisible(false);
    }//GEN-LAST:event_jmialldatosActionPerformed

    private void jmiregistrodedatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiregistrodedatosActionPerformed
        // TODO add your handling code here:
        ct.setVisible(false);
        r.setVisible(true);
        mye.setVisible(false);
    }//GEN-LAST:event_jmiregistrodedatosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ct.setVisible(false);
        r.setVisible(false);
        mye.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmadmin;
    private javax.swing.JMenuItem jmialldatos;
    private javax.swing.JMenuItem jmiregistrodedatos;
    // End of variables declaration//GEN-END:variables
}
