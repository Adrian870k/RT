package admin;

import java.util.ArrayList;

public class salas extends javax.swing.JFrame {

    ArrayList<sala> listaSalas = new ArrayList<sala>();

    public salas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        txtidSala = new javax.swing.JTextField();
        txtnombreSala = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtRecursos = new javax.swing.JTextField();
        btninsertar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtObservacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Capacidad", "Recursos", "Observaciones"
            }
        ));
        datos.setRowHeight(20);
        jScrollPane1.setViewportView(datos);

        txtidSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidSalaActionPerformed(evt);
            }
        });

        txtnombreSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreSalaActionPerformed(evt);
            }
        });

        btninsertar.setText("Insertar");
        btninsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninsertarMouseClicked(evt);
            }
        });
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btninsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 182, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(txtidSala, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtnombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtidSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btninsertar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidSalaActionPerformed

    private void txtnombreSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreSalaActionPerformed

    private void btninsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertarMouseClicked

    }//GEN-LAST:event_btninsertarMouseClicked

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        sala s = new sala(txtidSala.getText(), txtnombreSala.getText(), txtCapacidad.getText(), txtRecursos.getText(), txtObservacion.getText());
        listaSalas.add(s);

        mostrar();

        txtidSala.setText("");
        txtnombreSala.setText("");
        txtCapacidad.setText("");
        txtRecursos.setText("");
        txtObservacion.setText("");

    }//GEN-LAST:event_btninsertarActionPerformed
    public void mostrar() {
        String mat[][] = new String[listaSalas.size()][4];
        for (int i = 0; i < listaSalas.size(); i++) {
            mat[i][0] = listaSalas.get(i).getId();
            mat[i][1] = listaSalas.get(i).getNombre();
            mat[i][2] = listaSalas.get(i).getCapacidad();
            mat[i][3] = listaSalas.get(i).getObservacion();
        }
        datos.setModel(new javax.swing.table.DefaultTableModel(
                mat,
                new String[]{
                    "Id", "Nombre sala", "Capacidad", "Recursos","Observaciones"
                }
        ));
    }
    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        for (int j = 0; j < listaSalas.size(); j++) {
            if (listaSalas.get(j).getId().equals(txtidSala.getText())) {

                if (!txtnombreSala.getText().equals("")) {
                    listaSalas.get(j).setNombre(txtnombreSala.getText());
                }
                if (!txtCapacidad.getText().equals("")) {
                    listaSalas.get(j).setCapacidad(txtCapacidad.getText());
                }
                if (!txtRecursos.getText().equals("")) {
                    listaSalas.get(j).setDescripcion(txtRecursos.getText());
                }
                if (!txtObservacion.getText().equals("")) {
                    listaSalas.get(j).setObservacion(txtObservacion.getText());
                }
            }

        }

        mostrar();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        for (int j = 0; j < listaSalas.size(); j++) {
            if (listaSalas.get(j).getId().equals(txtidSala.getText())) {
                listaSalas.remove(j);
            } else {
                System.out.println("lakjlk");
            }

        }

        mostrar();
    }//GEN-LAST:event_btneliminarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JTable datos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtObservacion;
    public javax.swing.JTextField txtRecursos;
    private javax.swing.JTextField txtidSala;
    private javax.swing.JTextField txtnombreSala;
    // End of variables declaration//GEN-END:variables
}
