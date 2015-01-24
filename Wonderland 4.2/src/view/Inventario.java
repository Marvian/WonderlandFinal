/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Usuario;
import model.Productos;
import javax.swing.table.DefaultTableModel;
import controller.ControladorProductos;
import controller.InventarioXML;
import java.awt.event.KeyEvent;
import java.util.regex.PatternSyntaxException;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jessica
 */
public class Inventario extends javax.swing.JFrame {

    String[] columna = {"Nombre", "Categoria", "Monto", "Proveedor", "Cantidad", "Serial"};
    DefaultTableModel dtm = new DefaultTableModel(null, columna);
    Usuario usuario;
    InventarioXML DatIn = new InventarioXML();
    TableRowSorter filtrado;

    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
    }

    public Inventario(Usuario usu) {
        initComponents();
        usuario = usu;
        ControladorProductos.llenaTablaInventario(tablaInventario, DatIn, dtm);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LabelDetalles = new javax.swing.JLabel();
        LabelEliminar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inventariotxt = new javax.swing.JTextField();

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
        jPanel4.add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Wonderland");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaInventario);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Iventario");

        LabelDetalles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelDetalles.setForeground(new java.awt.Color(102, 102, 102));
        LabelDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/agregaricon.png"))); // NOI18N
        LabelDetalles.setText("Ver detalles");
        LabelDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelDetallesMouseClicked(evt);
            }
        });

        LabelEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEliminar.setForeground(new java.awt.Color(102, 102, 102));
        LabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/eliminarIcon.png"))); // NOI18N
        LabelEliminar.setText("Eliminar producto");
        LabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelEliminarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Buscar:");

        inventariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inventariotxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(inventariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(LabelDetalles)
                        .addGap(144, 144, 144)
                        .addComponent(LabelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inventariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEliminar)
                    .addComponent(LabelDetalles)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void LabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEliminarMouseClicked
        // TODO add your handling code here:
        int row = tablaInventario.getSelectedRow();
        String id = tablaInventario.getValueAt(row, 5).toString();
        DatIn.borrarProducto(id);
        JOptionPane.showMessageDialog(null, "Usuario Eliminado", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
        dtm.removeRow(tablaInventario.getSelectedRow());
    }//GEN-LAST:event_LabelEliminarMouseClicked

    private void LabelDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDetallesMouseClicked
        // TODO add your handling code here:
        int row = tablaInventario.getSelectedRow();
        String id = tablaInventario.getValueAt(row, 5).toString();
        Productos objProducto = DatIn.buscarProductoSerial(id);
        DatosProducto control2 = new DatosProducto(objProducto, usuario);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelDetallesMouseClicked

///////////////////////////////////////////////////////////////////////////////////////////////
    
     public void keyTyped(final KeyEvent e) {
               final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tablaInventario.getModel());
                  tablaInventario.setRowSorter(sorter);
                  ;
               String nombre = inventariotxt.getText();
               if (nombre.length() == 0) {
                       sorter.setRowFilter(null);
                  }else {
                       try {
                         sorter.setRowFilter(
                             RowFilter.regexFilter(nombre));
                       } catch (PatternSyntaxException pse) {
                         System.err.println("Bad regex pattern");
                       }
                  }
     }
    
    private void inventariotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventariotxtKeyTyped
        // TODO add your handling code here:
      keyTyped(evt);    
    }//GEN-LAST:event_inventariotxtKeyTyped

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
            java.util.logging.Logger.getLogger(Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDetalles;
    private javax.swing.JLabel LabelEliminar;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel LabelVolver;
    private javax.swing.JTextField inventariotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInventario;
    // End of variables declaration//GEN-END:variables
}
