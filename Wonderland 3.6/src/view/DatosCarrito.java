/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import controller.ControladorProductos;
import model.Usuario;
import controller.InventarioXML;
import controller.CarritoXML;
import javax.swing.DefaultListModel;
import model.Productos;
/**
 *
 * @author Jessica
 */
public class DatosCarrito extends javax.swing.JFrame {
Usuario usuario;
DefaultListModel modelo1 = new DefaultListModel();
InventarioXML producto = new InventarioXML();
CarritoXML car = new CarritoXML();
    /**
     * Creates new form DatosCarrito
     */
    public DatosCarrito() {
        initComponents();
    }
    public DatosCarrito(Usuario usu) {
        initComponents();
        usuario = usu;
        LabelUsuario.setText(usuario.getSeudonimo());
        ControladorProductos.llenaListaCarrito(car, producto, lista, modelo1, usu);
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
        productotxt = new javax.swing.JTextField();
        LabelBuscar = new javax.swing.JLabel();
        LabelVolver1 = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        LabelDetalles = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelEliminar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Wonderland");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 40));

        productotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productotxtActionPerformed(evt);
            }
        });
        jPanel4.add(productotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 350, 40));

        LabelBuscar.setForeground(new java.awt.Color(102, 102, 102));
        LabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/buscar.png"))); // NOI18N
        LabelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBuscarMouseClicked(evt);
            }
        });
        jPanel4.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 50, 40));

        LabelVolver1.setForeground(new java.awt.Color(102, 102, 102));
        LabelVolver1.setText("Volver");
        LabelVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelVolver1MouseClicked(evt);
            }
        });
        jPanel4.add(LabelVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 30));

        LabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        LabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/perfil.png"))); // NOI18N
        LabelUsuario.setText("Usuario");
        jPanel4.add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(lista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 113, 499, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Productos del Carrito:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 42, 270, 36));

        LabelDetalles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelDetalles.setText("Ver detalles del producto");
        LabelDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelDetallesMouseClicked(evt);
            }
        });
        jPanel1.add(LabelDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 204, 36));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("(Debe seleccionar el elemento de la lista que quiere eliminar)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 268, -1));

        LabelEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelEliminar.setText("Eliminar del Carrito");
        LabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(LabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 272, 152, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("(Debe seleccionar el elemento de la lista que quiere ver)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 268, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productotxtActionPerformed

    private void LabelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBuscarMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_LabelBuscarMouseClicked

    private void LabelVolver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelVolver1MouseClicked
        // TODO add your handling code here:
        PerfilUsuario control2 = new PerfilUsuario(usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelVolver1MouseClicked

       private void jList1ValueChanged(int index) {
        //int index = listaProductos.getSelectedIndex();
        Productos objProducto = (Productos) modelo1.getElementAt(index);
        DatosProducto control2 = new DatosProducto(objProducto, usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }
       
    private void LabelDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDetallesMouseClicked
        // TODO add your handling code here:
        jList1ValueChanged(lista.getSelectedIndex());
    }//GEN-LAST:event_LabelDetallesMouseClicked

    private void LabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEliminarMouseClicked
        // TODO add your handling code here:
        ControladorProductos.eliminaDelCarrito(modelo1, lista.getSelectedIndex(), car, usuario);
        modelo1.removeElementAt(lista.getSelectedIndex());
    }//GEN-LAST:event_LabelEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(DatosCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosCarrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelDetalles;
    private javax.swing.JLabel LabelEliminar;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel LabelVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    private javax.swing.JTextField productotxt;
    // End of variables declaration//GEN-END:variables
}