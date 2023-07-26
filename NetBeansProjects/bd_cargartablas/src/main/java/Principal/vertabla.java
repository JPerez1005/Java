package Principal;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class vertabla extends javax.swing.JInternalFrame {

    Conexion conecxion= Conexion.getInstance();
    JFreeChart grafico;
    DefaultCategoryDataset datos = new DefaultCategoryDataset();
    
    public vertabla() {
        initComponents();
        this.setTitle("Ver tabla");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jbverdatos = new javax.swing.JButton();
        jbgrafica = new javax.swing.JButton();

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Visitas", "Negocio", "Días"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jbverdatos.setText("Ver Datos");
        jbverdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbverdatosActionPerformed(evt);
            }
        });

        jbgrafica.setText("Graficar");
        jbgrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbgraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jbverdatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbgrafica)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbgrafica)
                    .addComponent(jbverdatos))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbgraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbgraficaActionPerformed
        // TODO add your handling code here:
        
        try {
            ChartPanel panel = new ChartPanel(grafico);
            for (int i = 0; i < tabla.getRowCount(); i++) {
                datos.addValue(Integer.parseInt(tabla.getValueAt(i, 0).toString()), tabla.getValueAt(i, 1).toString(), tabla.getValueAt(i, 2).toString());
            }
            
            grafico = ChartFactory.createBarChart("Grafico de Visitas", "Visitas", "Dias", datos, PlotOrientation.VERTICAL, true, true, false);
            
            this.add(panel);
            panel.setBounds(50, 10, 400, 250);
            
            panel.setVisible(true);
            tabla.setVisible(false);
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jbgraficaActionPerformed

    private void jbverdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbverdatosActionPerformed

        try {

            DefaultTableModel modelo = new DefaultTableModel();

            tabla.setModel(modelo);

            Connection conexionMySQL = conecxion.conectar();

            PreparedStatement seleccion= conexionMySQL.prepareStatement("select * from productos");
            ResultSet consulta = seleccion.executeQuery();

            ResultSetMetaData datos = consulta.getMetaData();
            int CantidaColumnas = datos.getColumnCount();

            modelo.addColumn("Visitas");
            modelo.addColumn("Negocio");
            modelo.addColumn("Días");

            int anchos[] = {90,90,90};

            for (int i = 0; i < CantidaColumnas; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (consulta.next()) {
                Object arreglo[] = new Object[CantidaColumnas];
                for (int i = 0; i < CantidaColumnas; i++) {
                    arreglo[i]= consulta.getObject(i+1);
                }
                modelo.addRow(arreglo);
            }

            conecxion.cerrarConexion();

            
            tabla.setVisible(true);

        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_jbverdatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbgrafica;
    private javax.swing.JButton jbverdatos;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
