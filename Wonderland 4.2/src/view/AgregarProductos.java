/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControladorProductos;
import model.Usuario;
import controller.InventarioXML;
import controller.Validar;

/**
 *
 * @author Jessica
 */
public class AgregarProductos extends javax.swing.JFrame {
    
    Usuario usuario;
    int instruccion;
    InventarioXML DatPro = new InventarioXML();

    /**
     * Creates new form AgregarProductos
     */
    public AgregarProductos() {
        initComponents();
        
    }
    
    public AgregarProductos(Usuario usu) {
        initComponents();
        usuario = usu;
        PanelProducto.setVisible(false);
        check1.setVisible(false);
        check2.setVisible(false);
        check3.setVisible(false);
    }
    
    public int validarCamposVacios() {
        String prc = preciotxt.getText();
        String cant = cantidadtxt.getText();
        if (Validar.validarVacio(nombretxt, "Debe indicar nombre del producto") == 1
                && Validar.validarVacio(preciotxt, "Debe indicar precio") == 1
                && Validar.validarEntero(prc, "El Precio debe estar escrito en Numeros") == 1
                && Validar.validarVacio(cantidadtxt, "Debe indicar la cantidad del producto") == 1
                && Validar.validarEntero(cant, "La cantidad debe estar escrita en numeros") == 1
                && Validar.cantidadMinima(cantidadtxt, "La cantidad tieneque ser mayor a 15", instruccion)== 1) {
                return 0;
            }
         else {
            return 1;
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

        jPanel4 = new javax.swing.JPanel();
        LabelVolver = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PanelProducto = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        LabelCant = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        preciotxt = new javax.swing.JTextField();
        BotonContinuar = new javax.swing.JButton();
        cantidadtxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        check1 = new javax.swing.JLabel();
        LabelAuto = new javax.swing.JLabel();
        check2 = new javax.swing.JLabel();
        LabelInmueble = new javax.swing.JLabel();
        check3 = new javax.swing.JLabel();
        LabelProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelVolver.setForeground(new java.awt.Color(102, 102, 102));
        LabelVolver.setText("Volver");
        LabelVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelVolverMouseClicked(evt);
            }
        });
        jPanel4.add(LabelVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 30));

        LabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        LabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/perfil.png"))); // NOI18N
        LabelUsuario.setText("Usuario");
        jPanel4.add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Wonderland");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        PanelProducto.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        LabelNome.setText("Nombre de publicacion:");

        LabelPrecio.setText("Precio (Bsf): ");

        LabelCant.setText("Cantidad:");

        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        preciotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciotxtActionPerformed(evt);
            }
        });

        BotonContinuar.setBackground(new java.awt.Color(0, 0, 102));
        BotonContinuar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        BotonContinuar.setText("Continuar");
        BotonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonContinuarActionPerformed(evt);
            }
        });

        cantidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(PanelProducto);
        PanelProducto.setLayout(PanelProductoLayout);
        PanelProductoLayout.setHorizontalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNome)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPrecio)
                    .addComponent(preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cantidadtxt)
                    .addComponent(LabelCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(BotonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        PanelProductoLayout.setVerticalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(LabelPrecio)
                    .addComponent(LabelCant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cantidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(PanelProducto);
        PanelProducto.setBounds(115, 360, 742, 107);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elige el tipo de producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        check1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/check2.png"))); // NOI18N
        jPanel2.add(check1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, 40));

        LabelAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/vehiculos.png"))); // NOI18N
        LabelAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAutoMouseClicked(evt);
            }
        });
        jPanel2.add(LabelAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 33, -1, 248));

        check2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/check2.png"))); // NOI18N
        jPanel2.add(check2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 40, 40));

        LabelInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/inmuebles.png"))); // NOI18N
        LabelInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelInmuebleMouseClicked(evt);
            }
        });
        jPanel2.add(LabelInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 33, -1, 248));

        check3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/check2.png"))); // NOI18N
        jPanel2.add(check3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 40, 40));

        LabelProducto.setBackground(new java.awt.Color(255, 255, 255));
        LabelProducto.setForeground(new java.awt.Color(0, 0, 153));
        LabelProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/pro y otros.png"))); // NOI18N
        LabelProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelProductoMouseClicked(evt);
            }
        });
        LabelProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LabelProductoKeyReleased(evt);
            }
        });
        jPanel2.add(LabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 33, -1, 248));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(115, 31, 730, 281);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelVolverMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_LabelVolverMouseClicked

    private void LabelProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LabelProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelProductoKeyReleased

    private void preciotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciotxtActionPerformed

    private void BotonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonContinuarActionPerformed
        // TODO add your handling code here:
        if (validarCamposVacios() != 1) {
            Categoria control2 = new Categoria(usuario, ControladorProductos.obtenerDatosPro(nombretxt.getText(), preciotxt.getText(), cantidadtxt.getText(), ControladorProductos.producirSerial(), usuario), instruccion);
            control2.setLocationRelativeTo(null);
            control2.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BotonContinuarActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void LabelProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelProductoMouseClicked
        // TODO add your handling code here:
        PanelProducto.setVisible(true);
        instruccion = 3;
        check1.setVisible(false);
        check2.setVisible(false);
        check3.setVisible(true);
    }//GEN-LAST:event_LabelProductoMouseClicked

    private void cantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadtxtActionPerformed

    private void LabelInmuebleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelInmuebleMouseClicked
        // TODO add your handling code here:
        PanelProducto.setVisible(true);
        instruccion = 2;
        check1.setVisible(false);
        check2.setVisible(true);
        check3.setVisible(false);
    }//GEN-LAST:event_LabelInmuebleMouseClicked

    private void LabelAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAutoMouseClicked
        // TODO add your handling code here:
        PanelProducto.setVisible(true);
        instruccion = 1;
        check1.setVisible(true);
        check2.setVisible(false);
        check3.setVisible(false);
    }//GEN-LAST:event_LabelAutoMouseClicked

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
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonContinuar;
    private javax.swing.JLabel LabelAuto;
    private javax.swing.JLabel LabelCant;
    private javax.swing.JLabel LabelInmueble;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel LabelVolver;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JTextField cantidadtxt;
    private javax.swing.JLabel check1;
    private javax.swing.JLabel check2;
    private javax.swing.JLabel check3;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField preciotxt;
    // End of variables declaration//GEN-END:variables
}
