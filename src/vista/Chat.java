/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Arrays;

/**
 *
 * @author yordan.quintero
 */
public class Chat extends javax.swing.JFrame {
String recuros[] = new String[5];
    /**
     * Creates new form Chat
     */
    public Chat() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jButtonPregunta1 = new javax.swing.JButton();
        jButtonPregunta3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneCharla = new javax.swing.JTextPane();
        jTextPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        checkTv = new javax.swing.JCheckBox();
        checkVideoBeam = new javax.swing.JCheckBox();
        CheckPc = new javax.swing.JCheckBox();
        CheckDesarrollo = new javax.swing.JCheckBox();
        checkRedes = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jButtonPregunta1.setText("Deseo reservar una sala");
        jButtonPregunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPregunta1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPregunta1);

        jButtonPregunta3.setText("Mis reservas");
        jButtonPregunta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPregunta3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPregunta3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 28, 200, -1));

        jScrollPane1.setViewportView(jTextPaneCharla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 454, 600));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Escoja los recursos");

        jPanel7.setLayout(new java.awt.GridLayout(0, 1, 1, 0));

        checkTv.setText("tv");
        checkTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTvActionPerformed(evt);
            }
        });
        jPanel7.add(checkTv);
        checkTv.getAccessibleContext().setAccessibleDescription("");

        checkVideoBeam.setText("Video Beam");
        checkVideoBeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVideoBeamActionPerformed(evt);
            }
        });
        jPanel7.add(checkVideoBeam);
        checkVideoBeam.getAccessibleContext().setAccessibleDescription("");

        CheckPc.setText("Pc");
        CheckPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckPcActionPerformed(evt);
            }
        });
        jPanel7.add(CheckPc);
        CheckPc.getAccessibleContext().setAccessibleDescription("");

        CheckDesarrollo.setText("Desarrollo");
        CheckDesarrollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDesarrolloActionPerformed(evt);
            }
        });
        jPanel7.add(CheckDesarrollo);
        CheckDesarrollo.getAccessibleContext().setAccessibleDescription("");

        checkRedes.setText("Redes");
        checkRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRedesActionPerformed(evt);
            }
        });
        jPanel7.add(checkRedes);
        checkRedes.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel6);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione el horario");

        jPanel5.setLayout(new java.awt.GridLayout(0, 1, 1, 0));

        jCheckBox3.setText("06:00- 07:00");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox3);

        jCheckBox4.setText("07:00-08:00");
        jPanel5.add(jCheckBox4);

        jCheckBox5.setText("09:00:10:00");
        jPanel5.add(jCheckBox5);

        jCheckBox6.setText("10:00-11:00");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox6);

        jCheckBox7.setText("11:00:12:00");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox7);

        jCheckBox8.setText("12:00-13:00");
        jPanel5.add(jCheckBox8);

        jCheckBox9.setText("13:00-14:00");
        jPanel5.add(jCheckBox9);

        jCheckBox11.setText("jCheckBox11");
        jPanel5.add(jCheckBox11);

        jCheckBox2.setText("jCheckBox2");
        jPanel5.add(jCheckBox2);

        jCheckBox1.setText("jCheckBox1");
        jPanel5.add(jCheckBox1);

        jCheckBox10.setText("jCheckBox10");
        jPanel5.add(jCheckBox10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout jTextPaneLayout = new javax.swing.GroupLayout(jTextPane);
        jTextPane.setLayout(jTextPaneLayout);
        jTextPaneLayout.setHorizontalGroup(
            jTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jTextPaneLayout.setVerticalGroup(
            jTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jTextPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 350, 250));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Escoge una pregunta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 184, 27));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPregunta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPregunta1ActionPerformed

    private void jButtonPregunta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPregunta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPregunta3ActionPerformed

    private void checkVideoBeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVideoBeamActionPerformed
        recuros[1] = checkVideoBeam.getText();
    }//GEN-LAST:event_checkVideoBeamActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        System.out.println(Arrays.toString(recuros));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void checkTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTvActionPerformed
        recuros[0] = checkTv.getText();
        
    }//GEN-LAST:event_checkTvActionPerformed

    private void CheckPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPcActionPerformed
        recuros[2] = CheckPc.getText();
    }//GEN-LAST:event_CheckPcActionPerformed

    private void checkRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRedesActionPerformed
        recuros[4] = checkRedes.getText();
    }//GEN-LAST:event_checkRedesActionPerformed

    private void CheckDesarrolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDesarrolloActionPerformed
        recuros[3] = CheckDesarrollo.getText();
    }//GEN-LAST:event_CheckDesarrolloActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox CheckDesarrollo;
    public javax.swing.JCheckBox CheckPc;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JCheckBox checkRedes;
    public javax.swing.JCheckBox checkTv;
    public javax.swing.JCheckBox checkVideoBeam;
    public javax.swing.JButton jButtonPregunta1;
    public javax.swing.JButton jButtonPregunta3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jTextPane;
    public javax.swing.JTextPane jTextPaneCharla;
    // End of variables declaration//GEN-END:variables
}
