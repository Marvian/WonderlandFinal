/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Image;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import jsockets.util.UtilFunctions;
import model.Productos;
import view.AgregaProductos2;
import model.Usuario;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Jessica
 */
public class ControladorProductos {

    public static void guardaFoto(JLabel jFotito, JFileChooser jFileChooser2, FileNameExtensionFilter filtro, String code) {
        BasicConfigurator.configure();
        jFileChooser2 = new JFileChooser();
        jFileChooser2.setFileFilter(filtro);
        jFotito.setText("");
        int option = jFileChooser2.showOpenDialog(null);
        byte[] Producto;
        String RutaImagenes = "src\\ImagenesProductos";
        String ImagenProduc = code;

        if (option == JFileChooser.APPROVE_OPTION) {
            String file = jFileChooser2.getSelectedFile().getPath();
            String dir = jFileChooser2.getSelectedFile().toString();
            jFotito.setIcon(new ImageIcon(file));
            ImageIcon icon = new ImageIcon(file);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(227, 284, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);
            jFotito.setIcon(newIcon);
            jFotito.setSize(227, 284);

            Producto = UtilFunctions.fileToByteArray(file); //Convierto la imagen en byte array desde la ruta

            try {
                Logger log = Logger.getLogger("Informacion");
                log.info("Se Guardo");
                UtilFunctions.createFileFromByteArray(Producto, RutaImagenes, ImagenProduc, "jpg", true);
            } catch (Exception e) {
                System.out.println("Error, no se guardo");
            }

        }
    }

    public static String producirSerial() {
        int numero;
        Random numale = new Random();
        numale.setSeed(new Date().getTime());
        numero = numale.nextInt(2000);
        String st = Integer.toString(numero);
        return st;
    }

    public static void obtenerDatosPro(String Nombre, String Precio, String Cantidad, String Serial, Usuario usuario) {
        InventarioXML regPro = new InventarioXML();
        Productos productos = new Productos(Nombre, "", Precio, Cantidad, "", Serial);
        regPro.agregarProducto(productos);
        AgregaProductos2 control2 = new AgregaProductos2(usuario, productos);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
    }

    public static void mostrarImagenProducto(Productos pro, JLabel foto, String numero, int horizontal, int vertical ) {
        String code = pro.getSerial()+numero;
        foto.setText("");
        String RutaImagenes = "src\\imagenesProductos\\" + code + ".jpg";
        ImageIcon icon = new ImageIcon(RutaImagenes);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(horizontal, vertical, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon ImagenProducto = new ImageIcon(newImg);
        foto.setIcon(ImagenProducto);
    }
}
