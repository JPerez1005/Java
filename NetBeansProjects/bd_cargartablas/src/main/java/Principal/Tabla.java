package Principal;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.JFreeChart;


public class Tabla extends javax.swing.JFrame {

    Conexion conecxion= Conexion.getInstance();
    vertabla vt;
    verestadisticas ve;
    
    
    public Tabla() {
        initComponents();
        
        vt = new vertabla();
        ve =new verestadisticas();
        
        add(vt);
        add(ve);
        
        this.setLocationRelativeTo(null);
        this.setTitle("Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmimostrartabla = new javax.swing.JMenuItem();
        jmimostrarestadisticas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setFocusTraversalPolicyProvider(true);

        jMenu1.setText("Principal");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar");

        jmimostrartabla.setText("Mostrar Tabla");
        jmimostrartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmimostrartablaActionPerformed(evt);
            }
        });
        jMenu2.add(jmimostrartabla);

        jmimostrarestadisticas.setText("Mostrar Estadisticas");
        jmimostrarestadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmimostrarestadisticasActionPerformed(evt);
            }
        });
        jMenu2.add(jmimostrarestadisticas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Menu");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmimostrartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmimostrartablaActionPerformed
        // TODO add your handling code here:
        vt.setVisible(true);
        ve.setVisible(false);
    }//GEN-LAST:event_jmimostrartablaActionPerformed

    private void jmimostrarestadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmimostrarestadisticasActionPerformed
        // TODO add your handling code here:
        vt.setVisible(false);
        ve.setVisible(true);
    }//GEN-LAST:event_jmimostrarestadisticasActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmimostrarestadisticas;
    private javax.swing.JMenuItem jmimostrartabla;
    // End of variables declaration//GEN-END:variables
}
