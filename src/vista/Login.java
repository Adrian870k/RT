package Vista;
import java.io.File;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private String NombreUsuario;
    private String PasswordUsuario;

    public Login() {

        initComponents();
        this.setLocationRelativeTo(null);

        File IconoUser = new File("src\\images\\avatar.png");
        File IconoCancel = new File("src\\images\\cerrar.png");
        File IconNext = new File("src\\images\\next.png");
        File IconMinimizar = new File("src\\images\\minimizar.png");
        //File IconMinimizar = new File("src\\images\\minimizar.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(IconoUsuario, IconoUser.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(IconCerrar, IconoCancel.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(IconEntrar, IconNext.getAbsolutePath());
        rsscalelabel.RSScaleLabel.setScaleLabel(IconoMinimizar, IconMinimizar.getAbsolutePath());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        IconoUsuario = new javax.swing.JLabel();
        JtextUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IconoMinimizar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelEntrar = new javax.swing.JLabel();
        IconEntrar = new javax.swing.JLabel();
        JtextPassword = new javax.swing.JPasswordField();
        IconCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1050, 580));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoUsuario.setPreferredSize(new java.awt.Dimension(20, 512));
        jPanel2.add(IconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 130, 130));

        JtextUsername.setBackground(new java.awt.Color(204, 204, 255));
        JtextUsername.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        JtextUsername.setBorder(null);
        JtextUsername.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                JtextUsernameInputMethodTextChanged(evt);
            }
        });
        JtextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(JtextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 170, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        IconoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconoMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(IconoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 30, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 170, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 170, 20));

        labelEntrar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        labelEntrar.setText("Entrar");
        labelEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEntrarMouseClicked(evt);
            }
        });
        labelEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelEntrarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                labelEntrarKeyTyped(evt);
            }
        });
        jPanel2.add(labelEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        IconEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconEntrarMouseClicked(evt);
            }
        });
        jPanel2.add(IconEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 30, 30));

        JtextPassword.setBackground(new java.awt.Color(204, 204, 255));
        JtextPassword.setBorder(null);
        JtextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextPasswordActionPerformed(evt);
            }
        });
        JtextPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JtextPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(JtextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 170, 20));

        IconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(IconCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 575));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextUsernameActionPerformed


    }//GEN-LAST:event_JtextUsernameActionPerformed

    private void IconoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_IconoMinimizarMouseClicked

    private void labelEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEntrarMouseClicked
        NombreUsuario = JtextUsername.getText();
        PasswordUsuario = JtextPassword.getText();

        boolean quest = mvc.Main.p.entrar(NombreUsuario, PasswordUsuario);

        if (quest) {
            PantallaIncioMaestro frame = new PantallaIncioMaestro();
            frame.setVisible(true);
            Login.this.dispose();
        } else if ("yordan".equals(NombreUsuario) && "pass".equals(PasswordUsuario)) {
            vista.PantallaIncio frame1 = new vista.PantallaIncio();
//            admin.salas frame2 = new salas();
            frame1.setVisible(true);
            Login.this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
        }
    }//GEN-LAST:event_labelEntrarMouseClicked

    private void JtextUsernameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JtextUsernameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextUsernameInputMethodTextChanged

    private void IconCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_IconCerrarMouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered

    }//GEN-LAST:event_jPanel2MouseEntered

    private void labelEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelEntrarKeyPressed

    }//GEN-LAST:event_labelEntrarKeyPressed

    private void IconEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconEntrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IconEntrarMouseClicked

    private void labelEntrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelEntrarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_labelEntrarKeyTyped

    private void JtextPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtextPasswordKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {

            NombreUsuario = JtextUsername.getText();
            PasswordUsuario = JtextPassword.getText();

            boolean quest = mvc.Main.p.entrar(NombreUsuario, PasswordUsuario);

            if (quest) {
                PantallaIncioMaestro frame = new PantallaIncioMaestro();
                frame.setVisible(true);
                Login.this.dispose();
            } else if ("yordan".equals(NombreUsuario) && "pass".equals(PasswordUsuario)) {
                vista.PantallaIncio frame1 = new vista.PantallaIncio();
                frame1.setVisible(true);
                Login.this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            }

        }

    }//GEN-LAST:event_JtextPasswordKeyPressed

    private void JtextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextPasswordActionPerformed

    }//GEN-LAST:event_JtextPasswordActionPerformed

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } else {
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JLabel IconEntrar;
    private javax.swing.JLabel IconoMinimizar;
    private javax.swing.JLabel IconoUsuario;
    private javax.swing.JPasswordField JtextPassword;
    private javax.swing.JTextField JtextUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelEntrar;
    // End of variables declaration//GEN-END:variables
}
