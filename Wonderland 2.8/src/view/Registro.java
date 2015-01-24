/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControladorRegistro;
import controller.Validar;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import model.Usuario;
/**
 *
 * @author Jessica
 */
public class Registro extends javax.swing.JFrame {
    Usuario usuario;
    DateFormat df = DateFormat.getDateInstance();

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }
      public Registro(Usuario usu) {
        initComponents();
        usuario = usu;
    }

    public void limpia() {
        nombretxt.setText("");
        apellidotxt.setText("");
        cedulatxt.setText("");
        jPassword.setText("");
        emailtxt.setText("");
        direcciontxt.setText("");
        seudonimotxt.setText("");
        ComboBoxCorreo.setSelectedIndex(0);
        cedulaCombo.setSelectedIndex(0);
    }

    public int validacionCampos() {
        int retorno = 0;
        if (Validar.validarVacio(nombretxt, "Debe indicar nombre") == 1 && Validar.validarVacio(apellidotxt, "Debe indicar Apellido") == 1 && Validar.validarVacio(cedulatxt, "Debe indicar Documento") == 1 && Validar.validarVacio(emailtxt, "Debe indicar Correo") == 1
                && Validar.validarVacio(direcciontxt, "Debe indicar direccion") == 1 && Validar.validarVacio(seudonimotxt, "Debe indicar Seudonimo") == 1 && Validar.validarVacio(jPassword, "Debe indicar Contraseña") == 1 
                && Validar.validarComboBox(ComboBoxCorreo, "Debe indicar tipo de Correo") == 1 && Validar.validarComboBox(cedulaCombo, "Debe indicar tipo de Documento") == 1) {
            retorno = 1;
            return retorno;
        } else {
            return retorno;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        apellidotxt = new javax.swing.JTextField();
        cedulatxt = new javax.swing.JTextField();
        seudonimotxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        direcciontxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        cedulaCombo = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        ComboBoxCorreo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        LabelVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Incríbete");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 18, -1, -1));

        jLabel6.setText("Nombre:*");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 115, -1, -1));

        jLabel7.setText("Apellido:*");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 155, -1, -1));

        jLabel8.setText("Documento:*");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 198, -1, -1));

        jLabel9.setText("Seudonimo:*");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 242, -1, -1));

        jLabel10.setText("Fecha de nacimiento:*");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 286, -1, -1));

        jLabel11.setText("Email:*");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 329, -1, -1));

        jLabel12.setText("Direccion Fisica:*");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 417, -1, -1));

        jLabel13.setText("Crear Clave:*");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 371, -1, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Campos obligatorios *");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 54, -1, -1));

        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        jPanel6.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 112, 309, -1));

        apellidotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidotxtActionPerformed(evt);
            }
        });
        jPanel6.add(apellidotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 152, 309, -1));

        cedulatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulatxtActionPerformed(evt);
            }
        });
        jPanel6.add(cedulatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 195, 257, -1));

        seudonimotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seudonimotxtActionPerformed(evt);
            }
        });
        jPanel6.add(seudonimotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 239, 309, -1));

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        jPanel6.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 326, 127, -1));

        direcciontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcciontxtActionPerformed(evt);
            }
        });
        jPanel6.add(direcciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 414, 309, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Usa entre 6 a 20 caracteres");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 371, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(0, 0, 102));
        botonRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setText("Incribirme");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        jPanel6.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 124, -1));

        cedulaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "V-", "E-" }));
        jPanel6.add(cedulaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 195, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Al inscribirme acepto los ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("de compar y venta de Wonderland");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel6.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 368, 311, -1));

        ComboBoxCorreo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "@gmail.com", "@hotmail.com", "@yahoo.com" }));
        jPanel6.add(ComboBoxCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 326, 175, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 204));
        jLabel18.setText("terminos y condiciones");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        fecha.setMaxSelectableDate(new java.util.Date(1546320715000L));
        fecha.setMinSelectableDate(new java.util.Date(-946751285000L));
        jPanel6.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 310, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("Wonderland");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 40));

        LabelVolver.setForeground(new java.awt.Color(102, 102, 102));
        LabelVolver.setText("Volver");
        LabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelVolverMouseClicked(evt);
            }
        });
        jPanel4.add(LabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void apellidotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidotxtActionPerformed

    private void cedulatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulatxtActionPerformed

    private void seudonimotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seudonimotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seudonimotxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void direcciontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcciontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcciontxtActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        String fechanac = df.format(fecha.getDate());
        if (validacionCampos() == 1) {
            String password = new String(jPassword.getPassword());
            ControladorRegistro.obtenerDatos(nombretxt.getText(), apellidotxt.getText(), ControladorRegistro.convierteCedula(cedulatxt, cedulaCombo),
                    ControladorRegistro.convierteCorreo(emailtxt, ComboBoxCorreo), direcciontxt.getText(), password, seudonimotxt.getText(), ControladorRegistro.Fecha(),fechanac , "Usuario");
            Principal control2 = new Principal(usuario);
            control2.setLocationRelativeTo(null);
            control2.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "LISTO "+ seudonimotxt.getText()+" \n Su Cuenta a sido agregada Exitosamente", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void LabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelVolverMouseClicked
        // TODO add your handling code here:
        Principal control2 = new Principal(usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelVolverMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxCorreo;
    private javax.swing.JLabel LabelVolver;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JComboBox cedulaCombo;
    private javax.swing.JTextField cedulatxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JTextField emailtxt;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField seudonimotxt;
    // End of variables declaration//GEN-END:variables

}
