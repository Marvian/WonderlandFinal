/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import model.Usuario;
/**
 *
 * @author Jessica
 */
public class PerfilAdmProductos extends javax.swing.JFrame {
Usuario  usuario;
    /**
     * Creates new form PerfilAdmProductos
     */
    public PerfilAdmProductos() {
        initComponents();
    }
    public PerfilAdmProductos(Usuario usu) {
        initComponents();
        usuario = usu;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelAgrega = new javax.swing.JLabel();
        LabelCuenta = new javax.swing.JLabel();
        LabelDatos = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        carritotxt = new javax.swing.JTextField();
        carritotxt1 = new javax.swing.JTextField();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Administrador de Productos:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 40, 300, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Solicitudes");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 330, 83, 22);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(180, 40, 0, 0);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(190, 200, 30, 0);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Pedir Solicitud de Cambio de rol");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(260, 370, 190, 20);

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Productos Faltantes");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(260, 160, 120, 16);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Configuracion");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(550, 120, 110, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Operaciones");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(200, 120, 96, 22);

        LabelAgrega.setForeground(new java.awt.Color(51, 51, 51));
        LabelAgrega.setText("Agregar Productos");
        LabelAgrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAgregaMouseClicked(evt);
            }
        });
        jPanel2.add(LabelAgrega);
        LabelAgrega.setBounds(260, 240, 110, 20);

        LabelCuenta.setForeground(new java.awt.Color(51, 51, 51));
        LabelCuenta.setText("Datos de Cuenta");
        LabelCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCuentaMouseClicked(evt);
            }
        });
        jPanel2.add(LabelCuenta);
        LabelCuenta.setBounds(590, 200, 110, 20);

        LabelDatos.setForeground(new java.awt.Color(51, 51, 51));
        LabelDatos.setText("Datos personales ");
        LabelDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelDatosMouseClicked(evt);
            }
        });
        jPanel2.add(LabelDatos);
        LabelDatos.setBounds(590, 160, 110, 20);

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Inventario");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(260, 200, 60, 20);

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Ver Facturas");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(260, 280, 73, 16);

        carritotxt.setBackground(new java.awt.Color(153, 153, 153));
        carritotxt.setForeground(new java.awt.Color(255, 255, 255));
        carritotxt.setText("0");
        carritotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritotxtActionPerformed(evt);
            }
        });
        jPanel2.add(carritotxt);
        carritotxt.setBounds(220, 200, 30, 22);

        carritotxt1.setBackground(new java.awt.Color(153, 153, 153));
        carritotxt1.setForeground(new java.awt.Color(255, 255, 255));
        carritotxt1.setText("0");
        carritotxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritotxt1ActionPerformed(evt);
            }
        });
        jPanel2.add(carritotxt1);
        carritotxt1.setBounds(220, 160, 30, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void LabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelVolverMouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_LabelVolverMouseClicked

    private void carritotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carritotxtActionPerformed

    private void carritotxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritotxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carritotxt1ActionPerformed

    private void LabelCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCuentaMouseClicked
        // TODO add your handling code here:
        DatosCuenta control2 = new DatosCuenta(usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_LabelCuentaMouseClicked

    private void LabelDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDatosMouseClicked
        // TODO add your handling code here:
        DatosPersonales control2 = new DatosPersonales(usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelDatosMouseClicked

    private void LabelAgregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAgregaMouseClicked
        // TODO add your handling code here:
        AgregarProductos control2 = new AgregarProductos(usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelAgregaMouseClicked

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
            java.util.logging.Logger.getLogger(PerfilAdmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilAdmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilAdmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilAdmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilAdmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAgrega;
    private javax.swing.JLabel LabelCuenta;
    private javax.swing.JLabel LabelDatos;
    private javax.swing.JLabel LabelIngresa;
    private javax.swing.JLabel LabelVolver;
    private javax.swing.JTextField carritotxt;
    private javax.swing.JTextField carritotxt1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
