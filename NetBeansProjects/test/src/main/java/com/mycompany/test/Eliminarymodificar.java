package com.mycompany.test;

public class Eliminarymodificar extends javax.swing.JInternalFrame {

    public Eliminarymodificar() {
        initComponents();
        this.setTitle("Eliminar y modificar");
        jbelimminar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbseleccion = new javax.swing.JComboBox<>();
        jTxtproductV1 = new javax.swing.JTextField();
        jTxtnombre1 = new javax.swing.JTextField();
        jTxtproductA1 = new javax.swing.JTextField();
        jTxtmarca1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtCodigo1 = new javax.swing.JTextField();
        jTxtfechaV1 = new javax.swing.JTextField();
        jbmodificar = new javax.swing.JButton();
        jbelimminar = new javax.swing.JButton();
        jbtnReiniciar = new javax.swing.JButton();

        jcbseleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modificar", "Eliminar" }));
        jcbseleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbseleccionActionPerformed(evt);
            }
        });

        jTxtproductV1.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto Vendido"));
        jTxtproductV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtproductV1ActionPerformed(evt);
            }
        });

        jTxtnombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jTxtnombre1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtnombre1FocusGained(evt);
            }
        });

        jTxtproductA1.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto Adquirido"));

        jTxtmarca1.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));
        jTxtmarca1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtmarca1FocusGained(evt);
            }
        });
        jTxtmarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtmarca1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo");

        jTxtfechaV1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Vencimiento"));

        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jbelimminar.setText("Eliminar");

        jbtnReiniciar.setText("Reiniciar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTxtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jTxtfechaV1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jTxtmarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTxtproductV1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTxtproductA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jTxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jcbseleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jbtnReiniciar)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbelimminar)
                    .addComponent(jbmodificar)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtfechaV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtmarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtproductV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtproductA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbseleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnReiniciar)
                    .addComponent(jbelimminar)
                    .addComponent(jbmodificar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtproductV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtproductV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtproductV1ActionPerformed

    private void jTxtnombre1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtnombre1FocusGained
        // TODO add your handling code here:
        jTxtnombre1.setText("");
    }//GEN-LAST:event_jTxtnombre1FocusGained

    private void jTxtmarca1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtmarca1FocusGained
        // TODO add your handling code here:
        jTxtmarca1.setText("");
    }//GEN-LAST:event_jTxtmarca1FocusGained

    private void jTxtmarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtmarca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtmarca1ActionPerformed

    private void jcbseleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbseleccionActionPerformed
        // TODO add your handling code here:
        String seleccion=(String) jcbseleccion.getSelectedItem();
        
        if(seleccion.equals("Modificar")){
            jTxtnombre1.setVisible(true);
            jTxtmarca1.setVisible(true);
            jTxtfechaV1.setVisible(true);
            jTxtproductA1.setVisible(true);
            jTxtproductV1.setVisible(true);
            jbelimminar.setVisible(false);
            jbtnReiniciar.setVisible(true);
            jbmodificar.setVisible(true);
        }else if(seleccion.equals("Eliminar")){
            jTxtnombre1.setVisible(false);
            jTxtmarca1.setVisible(false);
            jTxtfechaV1.setVisible(false);
            jTxtproductA1.setVisible(false);
            jTxtproductV1.setVisible(false);
            jbelimminar.setVisible(true);
            jbmodificar.setVisible(false);
            jbtnReiniciar.setVisible(false);

            
        }
    }//GEN-LAST:event_jcbseleccionActionPerformed

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTxtCodigo1;
    private javax.swing.JTextField jTxtfechaV1;
    private javax.swing.JTextField jTxtmarca1;
    private javax.swing.JTextField jTxtnombre1;
    private javax.swing.JTextField jTxtproductA1;
    private javax.swing.JTextField jTxtproductV1;
    private javax.swing.JButton jbelimminar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbtnReiniciar;
    private javax.swing.JComboBox<String> jcbseleccion;
    // End of variables declaration//GEN-END:variables
}