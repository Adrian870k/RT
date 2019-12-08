/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import ListaSimple.lista;
import admin.sala;
import java.util.Arrays;
import admin.MiReserva;

/**
 *
 * @author yordan.quintero
 */
public class Chat extends javax.swing.JFrame {

    public String recuros[] = new String[5];
    public String info = "";

    public Chat() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonPregunta1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneCharla = new javax.swing.JTextPane();
        panelRecHor = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        Dias = new javax.swing.JComboBox<String>();
        hora = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        panelPresentacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        Reservar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        actividad = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jButtonPregunta1.setText("Deseo reservar una sala");
        jButtonPregunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPregunta1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPregunta1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 88, 250, 40));

        jScrollPane1.setViewportView(jTextPaneCharla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 454, 450));

        panelRecHor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRecHor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 130, 143));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Seleccione el dia");
        panelRecHor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        Dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));
        Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiasActionPerformed(evt);
            }
        });
        panelRecHor.add(Dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 98, -1));

        hora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "06:00-7:00", "07:00-8:00", "08:00-09:00", "09:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00", "13:00-14:00", "14:00-15:00", "15:00-16:00", "16:00-17:00", "17:00-18:00", "18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00" }));
        panelRecHor.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 98, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setText("Horario:");
        panelRecHor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jCheckBox17.setText("¿Necesita presentacion?");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        panelRecHor.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Recurso");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccione-", "Televisor", "Video Beam", "Parlantes" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPresentacionLayout = new javax.swing.GroupLayout(panelPresentacion);
        panelPresentacion.setLayout(panelPresentacionLayout);
        panelPresentacionLayout.setHorizontalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresentacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        panelPresentacionLayout.setVerticalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        panelRecHor.add(panelPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 40));

        Reservar.setText("Reservar");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });
        panelRecHor.add(Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setText("Actividad:");
        panelRecHor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 39, -1, -1));

        actividad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Desarrollo", "Redes", "Base de datos" }));
        panelRecHor.add(actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 98, -1));

        getContentPane().add(panelRecHor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 350, 290));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Escoge una pregunta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 184, 27));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPregunta1ActionPerformed

        jTextPaneCharla.setText(info += "Selecciona las opciones para reservar \n");
        panelRecHor.setVisible(true);

    }//GEN-LAST:event_jButtonPregunta1ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        panelPresentacion.setVisible(true);
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiasActionPerformed
        System.out.println(Dias.getSelectedItem());
    }//GEN-LAST:event_DiasActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed

        String act = actividad.getSelectedItem().toString();
        int hr = hora.getSelectedIndex();
        int di = Dias.getSelectedIndex();
        System.out.println("Hora  "+hr+ " "+hora.getSelectedItem()+" | "+di+" "+Dias.getSelectedItem());
        ListaSimple.lista l = new ListaSimple.lista();
        String nombreSala = mvc.mvc.p.reservar(act, hr, di);

        if (!nombreSala.equalsIgnoreCase("no")) {
            jTextPaneCharla.setText("Tu reserva quedo asignada asi:\nDía:" + Dias.getSelectedItem() + "\nHora:" + hora.getSelectedItem() + "\nActividad: " + actividad.getSelectedItem() + "\nSala:" + nombreSala);
            info += jTextPaneCharla.getText();
            MiReserva nuevaMiReserva = new admin.MiReserva((mvc.mvc.contador),nombreSala, Dias.getSelectedItem().toString(), hora.getSelectedItem().toString(),hr,di);
            mvc.mvc.contador++;
            mvc.mvc.listaReserva.add(nuevaMiReserva);
        } else {
            jTextPaneCharla.setText("No hay salas disponibles");
        }
    }//GEN-LAST:event_ReservarActionPerformed

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
    public javax.swing.JComboBox<String> Dias;
    private javax.swing.JButton Reservar;
    public javax.swing.JComboBox<String> actividad;
    public javax.swing.JComboBox<String> hora;
    public javax.swing.JButton jButtonPregunta1;
    private javax.swing.JCheckBox jCheckBox17;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextPane jTextPaneCharla;
    public javax.swing.JPanel panelPresentacion;
    public javax.swing.JPanel panelRecHor;
    // End of variables declaration//GEN-END:variables
}
