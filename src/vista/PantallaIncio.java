/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import admin.salas;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class PantallaIncio extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public PantallaIncio() {
        initComponents();
        this.setLocationRelativeTo(null);

        File IconoChat = new File("src\\images\\chat.png");
        File IconoMas = new File("src\\images\\anadir.png");
        File IconoCancel = new File("src\\images\\cerrar.png");
        File IconMinimizar = new File("src\\images\\minimizar.png");
        File IconHome = new File("src\\images\\home.png");

        rsscalelabel.RSScaleLabel.setScaleLabel(labelChat, IconoChat.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(labelMas, IconoMas.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(LabelCerrar, IconoCancel.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(IconoMinimizar, IconMinimizar.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(LabelHome, IconHome.getAbsolutePath());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        FrameChat = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        FrameMas = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        JButtonSalir = new javax.swing.JButton();
        JButtonMisReservas = new javax.swing.JButton();
        LabelHome = new javax.swing.JLabel();
        Informacion = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        CerrarInfoSalas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        LabelCerrar = new javax.swing.JLabel();
        labelMas = new javax.swing.JLabel();
        labelChat = new javax.swing.JLabel();
        IconoMinimizar = new javax.swing.JLabel();
        IconCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelprincipal.setBackground(new java.awt.Color(204, 204, 255));
        panelprincipal.setMinimumSize(new java.awt.Dimension(46, 25));
        panelprincipal.setPreferredSize(new java.awt.Dimension(1000, 550));
        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FrameChat.setVisible(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 5, 0));

        jButton1.setText("Pregunta1");
        jPanel4.add(jButton1);

        jButton2.setText("Pregunta2");
        jPanel4.add(jButton2);

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameChatLayout = new javax.swing.GroupLayout(FrameChat.getContentPane());
        FrameChat.getContentPane().setLayout(FrameChatLayout);
        FrameChatLayout.setHorizontalGroup(
            FrameChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameChatLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FrameChatLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrameChatLayout.setVerticalGroup(
            FrameChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameChatLayout.createSequentialGroup()
                .addGroup(FrameChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        panelprincipal.add(FrameChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 30, 860, 440));

        FrameMas.setFocusTraversalPolicyProvider(true);
        FrameMas.setVisible(false);

        JButtonSalir.setText("Salir");
        JButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonSalirMouseClicked(evt);
            }
        });
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        JButtonMisReservas.setText("Mis reservas");

        LabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(JButtonSalir)
                .addGap(107, 107, 107)
                .addComponent(JButtonMisReservas)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonSalir)
                    .addComponent(JButtonMisReservas))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout FrameMasLayout = new javax.swing.GroupLayout(FrameMas.getContentPane());
        FrameMas.getContentPane().setLayout(FrameMasLayout);
        FrameMasLayout.setHorizontalGroup(
            FrameMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FrameMasLayout.setVerticalGroup(
            FrameMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelprincipal.add(FrameMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 490, 260));

        Informacion.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Informacion.setAutoscrolls(true);
        Informacion.setFocusTraversalPolicyProvider(true);
        Informacion.setVisible(false);

        CerrarInfoSalas.setText("cerrar");
        CerrarInfoSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarInfoSalasMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        jLabel3.setText("Capacidad:");

        jLabel4.setText("Recursos");

        jTextField1.setText("22");
        jTextField1.setDragEnabled(true);
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("java, 30 equipos en buen estado, video beam");
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Informacion Adicional");

        jTextField3.setText("El tablero esta dañado");
        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarInfoSalas)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(CerrarInfoSalas)
                .addGap(31, 31, 31))
        );

        Informacion.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        panelprincipal.add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 590, 410));

        LabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCerrarMouseClicked(evt);
            }
        });
        panelprincipal.add(LabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, 30));

        labelMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMasMouseClicked(evt);
            }
        });
        panelprincipal.add(labelMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 70, 70));

        labelChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelChatMouseClicked(evt);
            }
        });
        panelprincipal.add(labelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 70, 70));

        IconoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconoMinimizarMouseClicked(evt);
            }
        });
        panelprincipal.add(IconoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 30));

        IconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrarMouseClicked(evt);
            }
        });
        panelprincipal.add(IconCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("Salas");
        panelprincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, 30));

        jLabel6.setText("jLabel6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panelprincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel7.setText("jLabel7");
        panelprincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel8.setText("jLabel8");
        panelprincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        getContentPane().add(panelprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelCerrarMouseClicked

    private void IconoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_IconoMinimizarMouseClicked

    private void IconCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_IconCerrarMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void CerrarInfoSalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarInfoSalasMouseClicked
        Informacion.setVisible(false);
        

    }//GEN-LAST:event_CerrarInfoSalasMouseClicked

    private void labelChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChatMouseClicked
        labelChat.setVisible(false);
        labelMas.setVisible(false);
      
        FrameChat.setVisible(true);
    }//GEN-LAST:event_labelChatMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void labelMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMasMouseClicked
        labelMas.setVisible(false);
        labelChat.setVisible(false);
        FrameMas.setVisible(true);
     
    }//GEN-LAST:event_labelMasMouseClicked

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonSalirMouseClicked
        Vista.Login frame1 = new Vista.Login();
        frame1.setVisible(true);
        PantallaIncio.this.dispose();
    }//GEN-LAST:event_JButtonSalirMouseClicked

    private void LabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelHomeMouseClicked
        labelMas.setVisible(true);
        labelChat.setVisible(true);
        FrameMas.setVisible(false);
       
    }//GEN-LAST:event_LabelHomeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        labelMas.setVisible(true);
        labelChat.setVisible(true);
        FrameChat.setVisible(false);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        salas s = new salas();

        s.setTitle("Salas");
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

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
                if (!"Windows".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaIncio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarInfoSalas;
    private javax.swing.JInternalFrame FrameChat;
    private javax.swing.JInternalFrame FrameMas;
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JLabel IconoMinimizar;
    private javax.swing.JInternalFrame Informacion;
    private javax.swing.JButton JButtonMisReservas;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JLabel LabelHome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelChat;
    private javax.swing.JLabel labelMas;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
