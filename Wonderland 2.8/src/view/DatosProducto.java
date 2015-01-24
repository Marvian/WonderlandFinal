/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import controller.ControladorProductos;
import controller.CarritoXML;
import javax.swing.JOptionPane;
import model.Productos;
import model.Usuario;
import org.apache.log4j.Logger;
/**
 *
 * @author Jessica
 */
public class DatosProducto extends javax.swing.JFrame {
CarritoXML regPro = new CarritoXML();
Productos producto;
Usuario usuario;
    /**
     * Creates new form DatosProducto
     */
    public DatosProducto() {
        initComponents();
    }
    public DatosProducto(Productos pro, Usuario usu) {
        initComponents();
        producto = pro;
        usuario = usu;
         if (usuario != null) {
            LabelIngresa.setVisible(false);
            LabelUsuario.setText(usuario.getSeudonimo());
        } else {
            LabelIngresa.setVisible(true);
            LabelUsuario.setVisible(false);
        }
        LabelName.setText(pro.getNombre());
        LabelPrecio.setText(pro.getMonto());
        LabelCantidad.setText(pro.getCantidad());
        TextAreaDescripcion.setEditable(false);
        TextAreaDescripcion.setText(pro.getDescripcion());
        LabelProveedor.setText(pro.getProveedor());
        ControladorProductos.mostrarImagenProducto(pro, LabelFotoActual,"1",227, 284);
        ControladorProductos.mostrarImagenProducto(pro, LabelFoto1,"1",101, 83);
        ControladorProductos.mostrarImagenProducto(pro, LabelFoto2,"2",101, 83);
        ControladorProductos.mostrarImagenProducto(pro, LabelFoto3,"3",101, 83);
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
        LabelVolver = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelIngresa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelFotoActual = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LabelFoto3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        LabelFoto2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        LabelCarrito = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        LabelFoto1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelCategorias = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        LabelPrecio1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelProveedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Wonderland");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 40));

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
        jPanel4.add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        LabelIngresa.setForeground(new java.awt.Color(102, 102, 102));
        LabelIngresa.setText("Ingresa");
        LabelIngresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelIngresaMouseClicked(evt);
            }
        });
        jPanel4.add(LabelIngresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 25, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LabelName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelName.setText("Nombre del Producto");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        LabelFotoActual.setText("                   Foto Actual");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFotoActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFotoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        LabelFoto3.setText("Foto 3");
        LabelFoto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelFoto3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFoto3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFoto3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 157, 45));

        jLabel9.setText("Cantidad:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        LabelFoto2.setText("Foto 2 ");
        LabelFoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelFoto2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFoto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFoto2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("BsF");

        LabelPrecio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelPrecio.setForeground(new java.awt.Color(204, 0, 0));
        LabelPrecio.setText("00");

        TextAreaDescripcion.setColumns(20);
        TextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(TextAreaDescripcion);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Descripcion:");

        LabelCarrito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/compra.png"))); // NOI18N
        LabelCarrito.setText("Agregar al Carrito");
        LabelCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCarritoMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        LabelFoto1.setText("Foto 1");
        LabelFoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelFoto1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFoto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelFoto1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/check.png"))); // NOI18N
        jLabel7.setText("Categorias:");

        LabelCategorias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCategorias.setForeground(new java.awt.Color(204, 0, 0));
        LabelCategorias.setText("n-categorias");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/check.png"))); // NOI18N
        jLabel10.setText("Hay ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("articulos en existencia");

        LabelCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(204, 0, 0));
        LabelCantidad.setText("0");

        LabelPrecio1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelPrecio1.setForeground(new java.awt.Color(204, 0, 0));
        LabelPrecio1.setText("00");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/check.png"))); // NOI18N
        jLabel12.setText("Proveedor");

        LabelProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelProveedor.setForeground(new java.awt.Color(204, 0, 0));
        LabelProveedor.setText("nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(42, 42, 42)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(7, 7, 7)
                                    .addComponent(LabelPrecio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LabelPrecio1))
                                .addComponent(LabelCarrito)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LabelCantidad)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(14, 14, 14)
                                            .addComponent(LabelCategorias))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(LabelProveedor)))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(LabelName)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(LabelName)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(LabelPrecio)
                                    .addComponent(LabelPrecio1))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(LabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(LabelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(LabelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(LabelCarrito)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
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

    private void LabelVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelVolverMouseClicked
        // TODO add your handling code here:
        Principal control2 = new Principal(usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelVolverMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LabelFoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelFoto2MouseClicked
        // TODO add your handling code here:
        ControladorProductos.mostrarImagenProducto(producto, LabelFotoActual,"2",227, 284);
        
    }//GEN-LAST:event_LabelFoto2MouseClicked

    private void LabelFoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelFoto1MouseClicked
        // TODO add your handling code here:
        ControladorProductos.mostrarImagenProducto(producto, LabelFotoActual,"1",227, 284);
    }//GEN-LAST:event_LabelFoto1MouseClicked

    private void LabelFoto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelFoto3MouseClicked
        // TODO add your handling code here:
        ControladorProductos.mostrarImagenProducto(producto, LabelFotoActual,"3",227, 284);
    }//GEN-LAST:event_LabelFoto3MouseClicked

    private void LabelCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCarritoMouseClicked
        // TODO add your handling code here:
             if (usuario != null){
            Logger log = Logger.getLogger("Agrego");
            Productos produc = new Productos("", "","", "", usuario.getSeudonimo(), producto.getSerial(),"");// ESE NOMBRE NO ES NOMBRE DEL PRODUCTO ES EL SEUDONIMO DEL USUARIO
            regPro.agregarCarrito(produc);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "Debe Registrarse ", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_LabelCarritoMouseClicked

    private void LabelIngresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelIngresaMouseClicked
        // TODO add your handling code here:
        IniciaSesion control2 = new IniciaSesion(usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelIngresaMouseClicked

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
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCarrito;
    private javax.swing.JLabel LabelCategorias;
    private javax.swing.JLabel LabelFoto1;
    private javax.swing.JLabel LabelFoto2;
    private javax.swing.JLabel LabelFoto3;
    private javax.swing.JLabel LabelFotoActual;
    private javax.swing.JLabel LabelIngresa;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelPrecio1;
    private javax.swing.JLabel LabelProveedor;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel LabelVolver;
    private javax.swing.JTextArea TextAreaDescripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
