/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import admin.sala;
import admin.salas;
import admin.user;
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
        File IconoSalir = new File("src\\images\\logout.png");
        File IconoUser = new File("src\\images\\avatar.png");
        File IconoSala = new File("src\\images\\edit.png");

        rsscalelabel.RSScaleLabel.setScaleLabel(LabelCerrar, IconoCancel.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(IconoMinimizar, IconMinimizar.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelSalir, IconoSalir.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelUsuarios, IconoUser.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelSalas, IconoSala.getAbsolutePath());

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
        LabelCerrar = new javax.swing.JLabel();
        IconoMinimizar = new javax.swing.JLabel();
        IconCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSalas = new javax.swing.JLabel();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelprincipal.setBackground(new java.awt.Color(204, 204, 255));
        panelprincipal.setMinimumSize(new java.awt.Dimension(46, 25));
        panelprincipal.setPreferredSize(new java.awt.Dimension(1000, 550));
        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCerrarMouseClicked(evt);
            }
        });
        panelprincipal.add(LabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, 30));

        IconoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconoMinimizarMouseClicked(evt);
            }
        });
        panelprincipal.add(IconoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 30, 30));

        IconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrarMouseClicked(evt);
            }
        });
        panelprincipal.add(IconCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("Inicio-Administrador");
        panelprincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 230, 30));

        jLabelSalas.setText("Salas");
        jLabelSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalasMouseClicked(evt);
            }
        });
        panelprincipal.add(jLabelSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 150, 150));

        jLabelUsuarios.setText("Usuarios");
        jLabelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseClicked(evt);
            }
        });
        panelprincipal.add(jLabelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 150, 150));

        jLabelSalir.setText("Salir");
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });
        panelprincipal.add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 60, 40));

        jLabel2.setText("Usuarios");
        panelprincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jLabel3.setText("Salas");
        panelprincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        getContentPane().add(panelprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 400));

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

    private void jLabelSalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalasMouseClicked

        salas s = new salas();

        s.setTitle("Salas");
        s.setLocationRelativeTo(null);
        s.mostrar();
        s.setVisible(true);
    }//GEN-LAST:event_jLabelSalasMouseClicked

    private void jLabelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseClicked
        admin.user frame = new user();
        frame.setLocationRelativeTo(null);
        frame.mostrar();
        frame.setVisible(true);

    }//GEN-LAST:event_jLabelUsuariosMouseClicked

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        Vista.Login frame1 = new Vista.Login();
        frame1.setVisible(true);
        PantallaIncio j = new PantallaIncio();


    }//GEN-LAST:event_jLabelSalirMouseClicked

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
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JLabel IconoMinimizar;
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSalas;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
