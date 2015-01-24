/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControladorRegistro;
import controller.ControladorUsuarios;
import model.Usuario;
import controller.UsuarioXML;

/**
 *
 * @author Jessica
 */
public class DatosPersonales extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioXML RegUsu = new UsuarioXML();

    /**
     * Creates new form DatosPersonales
     */
    public DatosPersonales() {
        initComponents();
    }

    public DatosPersonales(Usuario usu) {
        initComponents();
        usuario = usu;
        cedulaCombo.setVisible(false);
        cedula.setVisible(false);
        ComboBoxCorreo.setVisible(false);
        correo.setVisible(false);
        ControladorUsuarios.muestraDatosPersonales(nombretxt, apellidotxt, documentotxt, correotxt, direcciontxt, fecnactxt, usuario);
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
        LabelIngresa = new javax.swing.JLabel();
        LabelVolver = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        apellidotxt = new javax.swing.JTextField();
        documentotxt = new javax.swing.JTextField();
        fecnactxt = new javax.swing.JTextField();
        correotxt = new javax.swing.JTextField();
        direcciontxt = new javax.swing.JTextField();
        LabelModLastName = new javax.swing.JLabel();
        LabelModName = new javax.swing.JLabel();
        LabelModDocument = new javax.swing.JLabel();
        LabelModFecNac = new javax.swing.JLabel();
        LbelModCorreo = new javax.swing.JLabel();
        LabelModDireccion = new javax.swing.JLabel();
        cedulaCombo = new javax.swing.JComboBox();
        cedula = new javax.swing.JTextField();
        ComboBoxCorreo = new javax.swing.JComboBox();
        correo = new javax.swing.JTextField();
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

        LabelIngresa.setForeground(new java.awt.Color(102, 102, 102));
        LabelIngresa.setText("Ingresa");
        jPanel4.add(LabelIngresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 25, -1, 30));

        LabelVolver.setForeground(new java.awt.Color(102, 102, 102));
        LabelVolver.setText("Volver");
        LabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelVolverMouseClicked(evt);
            }
        });
        jPanel4.add(LabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/buscar.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Datos Personales ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, -1, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nombre:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Documento:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Apellido:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Correo:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 244, -1, -1));

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Fech. Nacimiento:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Direccion:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 284, -1, -1));
        jPanel3.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 360, -1));
        jPanel3.add(apellidotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 360, -1));

        documentotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentotxtActionPerformed(evt);
            }
        });
        jPanel3.add(documentotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 360, -1));
        jPanel3.add(fecnactxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 360, -1));

        correotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correotxtActionPerformed(evt);
            }
        });
        jPanel3.add(correotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 360, -1));

        direcciontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcciontxtActionPerformed(evt);
            }
        });
        jPanel3.add(direcciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 360, -1));

        LabelModLastName.setForeground(new java.awt.Color(0, 102, 204));
        LabelModLastName.setText("Modificar");
        LabelModLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelModLastNameMouseClicked(evt);
            }
        });
        jPanel3.add(LabelModLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        LabelModName.setForeground(new java.awt.Color(0, 102, 204));
        LabelModName.setText("Modificar");
        LabelModName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelModNameMouseClicked(evt);
            }
        });
        jPanel3.add(LabelModName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        LabelModDocument.setForeground(new java.awt.Color(0, 102, 204));
        LabelModDocument.setText("Modificar");
        LabelModDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelModDocumentMouseClicked(evt);
            }
        });
        jPanel3.add(LabelModDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        LabelModFecNac.setForeground(new java.awt.Color(0, 102, 204));
        LabelModFecNac.setText("Modificar");
        jPanel3.add(LabelModFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        LbelModCorreo.setForeground(new java.awt.Color(0, 102, 204));
        LbelModCorreo.setText("Modificar");
        LbelModCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbelModCorreoMouseClicked(evt);
            }
        });
        jPanel3.add(LbelModCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        LabelModDireccion.setForeground(new java.awt.Color(0, 102, 204));
        LabelModDireccion.setText("Modificar");
        LabelModDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelModDireccionMouseClicked(evt);
            }
        });
        jPanel3.add(LabelModDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        cedulaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "V-", "E-" }));
        jPanel3.add(cedulaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 40, -1));

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        jPanel3.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 310, -1));

        ComboBoxCorreo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "@gmail.com", "@hotmail.com", "@yahoo.com" }));
        jPanel3.add(ComboBoxCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 175, -1));
        jPanel3.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, -1));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
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

    private void direcciontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcciontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcciontxtActionPerformed

    private void LabelModNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelModNameMouseClicked
        // TODO add your handling code here:
        nombretxt.setEnabled(true);
        LabelModName.setEnabled(false);
    }//GEN-LAST:event_LabelModNameMouseClicked

    private void LabelModLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelModLastNameMouseClicked
        // TODO add your handling code here:
        apellidotxt.setEnabled(true);
        LabelModLastName.setEnabled(false);
    }//GEN-LAST:event_LabelModLastNameMouseClicked

    private void LabelModDocumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelModDocumentMouseClicked
        // TODO add your handling code here:
        documentotxt.setVisible(false);
        cedulaCombo.setVisible(true);
        cedula.setVisible(true);
        LabelModDocument.setEnabled(false);
    }//GEN-LAST:event_LabelModDocumentMouseClicked

    private void LbelModCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbelModCorreoMouseClicked
        // TODO add your handling code here:
        correotxt.setVisible(false);
        LbelModCorreo.setEnabled(false);
        ComboBoxCorreo.setVisible(true);
        correo.setVisible(true);
    }//GEN-LAST:event_LbelModCorreoMouseClicked

    private void LabelModDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelModDireccionMouseClicked
        // TODO add your handling code here:
        direcciontxt.setEnabled(true);
        LabelModDireccion.setEnabled(false);
    }//GEN-LAST:event_LabelModDireccionMouseClicked

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code here:
        String email, document;
        email = ControladorRegistro.convierteCorreo(correo, ComboBoxCorreo);
        document = ControladorRegistro.convierteCedula(cedula, cedulaCombo);
        if (ControladorUsuarios.camposVaciosDatPersonales(nombretxt, apellidotxt, document, email, direcciontxt) == 1) {
            usuario.setNombre(nombretxt.getText());
            usuario.setApellido(apellidotxt.getText());
            usuario.setCedula(document);
            usuario.setCorreo(email);
            usuario.setDireccion(direcciontxt.getText());
            RegUsu.actualizarUsuario(usuario);
            documentotxt.setVisible(true);
            correotxt.setVisible(true);
            documentotxt.setEnabled(false);
            correotxt.setEnabled(false);
            correo.setVisible(false);
            cedula.setVisible(false);
            cedulaCombo.setVisible(false);
            ComboBoxCorreo.setVisible(false);
            LabelModDireccion.setEnabled(true);
            LbelModCorreo.setEnabled(true);
            LabelModDocument.setEnabled(true);
            LabelModLastName.setEnabled(true);
            LabelModName.setEnabled(true);
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void correotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correotxtActionPerformed

    private void documentotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentotxtActionPerformed

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
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPersonales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JComboBox ComboBoxCorreo;
    private javax.swing.JLabel LabelIngresa;
    private javax.swing.JLabel LabelModDireccion;
    private javax.swing.JLabel LabelModDocument;
    private javax.swing.JLabel LabelModFecNac;
    private javax.swing.JLabel LabelModLastName;
    private javax.swing.JLabel LabelModName;
    private javax.swing.JLabel LabelVolver;
    private javax.swing.JLabel LbelModCorreo;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox cedulaCombo;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JTextField documentotxt;
    private javax.swing.JTextField fecnactxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}