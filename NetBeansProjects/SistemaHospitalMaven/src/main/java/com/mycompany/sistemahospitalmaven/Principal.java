package com.mycompany.sistemahospitalmaven;

public class Principal extends javax.swing.JFrame {
    Registros R;
    Consultas C;
    public Principal() {
        initComponents();
        R=new Registros();
        add(R);
        C=new Consultas();
        add(C);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmarchivos = new javax.swing.JMenu();
        jm1salir = new javax.swing.JMenuItem();
        jmpacientes = new javax.swing.JMenu();
        jm1consultas = new javax.swing.JMenuItem();
        jm1registros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmarchivos.setText("Archivos");

        jm1salir.setText("Salir");
        jmarchivos.add(jm1salir);

        jMenuBar1.add(jmarchivos);

        jmpacientes.setText("Pacientes");

        jm1consultas.setText("Consultas");
        jm1consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm1consultasActionPerformed(evt);
            }
        });
        jmpacientes.add(jm1consultas);

        jm1registros.setText("Registros");
        jm1registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm1registrosActionPerformed(evt);
            }
        });
        jmpacientes.add(jm1registros);

        jMenuBar1.add(jmpacientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm1registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm1registrosActionPerformed
        // TODO add your handling code here:
        R.setVisible(true);
        C.setVisible(false);
    }//GEN-LAST:event_jm1registrosActionPerformed

    private void jm1consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm1consultasActionPerformed
        // TODO add your handling code here:
        R.setVisible(false);
        C.setVisible(true);
    }//GEN-LAST:event_jm1consultasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jm1consultas;
    private javax.swing.JMenuItem jm1registros;
    private javax.swing.JMenuItem jm1salir;
    private javax.swing.JMenu jmarchivos;
    private javax.swing.JMenu jmpacientes;
    // End of variables declaration//GEN-END:variables
}
