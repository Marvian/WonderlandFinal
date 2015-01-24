/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import java.util.Random;
import javax.swing.JLabel;
import model.Productos;
import view.AgregaProductos2;
import model.Usuario;

/**
 *
 * @author Jessica
 */
public class ControladorProductos {

    public static void guardaFoto(JLabel jFotito) {
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
        AgregaProductos2 control2 = new AgregaProductos2(usuario,productos);
        control2.setLocationRelativeTo(null);
        control2.setVisible(true);
    }
}
