/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class PantallaIncioMaestro extends javax.swing.JFrame {
    
    public PantallaIncioMaestro() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        File IconoChat = new File("src\\images\\chat.png");
        File IconoSalir = new File("src\\images\\logout.png");
        File IconoMas = new File("src\\images\\anadir.png");
        File IconoMas2 = new File("src\\images\\next.png");
        File IconoCancel = new File("src\\images\\cerrar.png");
        File IconMinimizar = new File("src\\images\\minimizar.png");
        File IconHome = new File("src\\images\\home.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(labelChat, IconoChat.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(labelMas, IconoMas.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(labelMas2, IconoMas2.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(LabelCerrar, IconoCancel.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(IconoMinimizar, IconMinimizar.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(labelSalir, IconoSalir.getAbsolutePath());

        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
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
        labelMas2 = new javax.swing.JLabel();
        labelSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelprincipal.setBackground(new java.awt.Color(204, 204, 255));
        panelprincipal.setMinimumSize(new java.awt.Dimension(46, 25));
        panelprincipal.setPreferredSize(new java.awt.Dimension(1000, 550));
        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        labelMas.setText("op3");
        labelMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMasMouseClicked(evt);
            }
        });
        panelprincipal.add(labelMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 150, 150));

        labelChat.setText("op1");
        labelChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelChatMouseClicked(evt);
            }
        });
        panelprincipal.add(labelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 150));

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
        jLabel1.setText("Inicio");
        panelprincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 60, 30));

        labelMas2.setText("op2");
        labelMas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMas2MouseClicked(evt);
            }
        });
        panelprincipal.add(labelMas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 150, 150));

        labelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked(evt);
            }
        });
        panelprincipal.add(labelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 70, 70));

        getContentPane().add(panelprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1050, 580));

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
        
        vista.Chat c = new vista.Chat();
        c.setLocationRelativeTo(null);
        c.panelPresentacion.setVisible(false);
        c.panelRecHor.setVisible(false);
        
        c.setVisible(true);
        

    }//GEN-LAST:event_labelChatMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void labelMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMasMouseClicked
        
        vista.misReservas frame = new vista.misReservas();
        frame.setLocationRelativeTo(null);
        frame.setTitle("Mis reservas");
        frame.mostrarHorarios();
        frame.setVisible(true);
        
        
        
        
        
        

    }//GEN-LAST:event_labelMasMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void labelMas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMas2MouseClicked
        vista.Horarios hor = new vista.Horarios();
        
        hor.setTitle("Horarios");
        hor.setLocationRelativeTo(null);
        hor.setVisible(true);
        
    }//GEN-LAST:event_labelMas2MouseClicked

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSalirMouseClicked

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
            new PantallaIncioMaestro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarInfoSalas;
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JLabel IconoMinimizar;
    private javax.swing.JInternalFrame Informacion;
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelChat;
    private javax.swing.JLabel labelMas;
    private javax.swing.JLabel labelMas2;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
