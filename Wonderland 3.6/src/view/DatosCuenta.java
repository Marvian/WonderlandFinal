/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Usuario;
import controller.ControladorUsuarios;
import controller.UsuarioXML;
import javax.swing.JOptionPane;

/**
 *
 * @author Jessica
 */
public class DatosCuenta extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioXML RegUsuario = new UsuarioXML();

    /**
     * Creates new form DatosCuenta
     */
    public DatosCuenta() {
        initComponents();
    }

    public DatosCuenta(Usuario usu) {
        initComponents();
        usuario = usu;
        LabelUsuario.setText(usuario.getSeudonimo());
        ControladorUsuarios.muestraDatosCuenta(seudonimotxt, clavetxt, fecregtxt, roltxt, usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        LabelVolver = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clavetxt = new javax.swing.JTextField();
        seudonimotxt = new javax.swing.JTextField();
        LabelModClave = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        roltxt = new javax.swing.JTextField();
        fecregtxt = new javax.swing.JTextField();
        BotonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Wonderland");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 40));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 350, 40));

        LabelVolver.setForeground(new java.awt.Color(102, 102, 102));
        LabelVolver.setText("Volver");
        LabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelVolverMouseClicked(evt);
            }
        });
        jPanel4.add(LabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/buscar.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        LabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        LabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/perfil.png"))); // NOI18N
        LabelUsuario.setText("Usuario");
        jPanel4.add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Datos de Cuenta ");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Seudonimo:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Rol:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Clave:");

        clavetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavetxtActionPerformed(evt);
            }
        });

        LabelModClave.setForeground(new java.awt.Color(0, 102, 204));
        LabelModClave.setText("Modificar");
        LabelModClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelModClaveMouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Fecha de Registro:");

        fecregtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecregtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seudonimotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(clavetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelModClave))
                            .addComponent(fecregtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(seudonimotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clavetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(LabelModClave))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fecregtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(69, 69, 69))
        );

        BotonActualizar.setBackground(new java.awt.Color(0, 0, 102));
        BotonActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setText("Guardar Cambios");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void LabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelVolverMouseClicked
        // TODO add your handling code here:
        ControladorUsuarios.volverPerfil(usuario);
        this.dispose();
    }//GEN-LAST:event_LabelVolverMouseClicked

    private void clavetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavetxtActionPerformed

    private void fecregtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecregtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecregtxtActionPerformed

    private void LabelModClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelModClaveMouseClicked
        // TODO add your handling code here:
        clavetxt.setEnabled(true);
        LabelModClave.setEnabled(false);
    }//GEN-LAST:event_LabelModClaveMouseClicked

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code here:
        if (!("".equals(clavetxt.getText()))) {
            usuario.setClave(clavetxt.getText());
            RegUsuario.actualizarUsuario(usuario);
            clavetxt.setEnabled(false);
            LabelModClave.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Modificaciones guardadas", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "DEBE INDICAR UNA CONTRASEÑA", "Error:", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_BotonActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(DatosCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JLabel LabelModClave;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel LabelVolver;
    private javax.swing.JTextField clavetxt;
    private javax.swing.JTextField fecregtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField roltxt;
    private javax.swing.JTextField seudonimotxt;
    // End of variables declaration//GEN-END:variables
}
