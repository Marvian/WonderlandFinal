/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;
import view.*;
import controller.UsuarioXML;
import model.Usuario;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
/**
 *
 * @author Jessica
 */
public class ControladorUsuarios {

UsuarioXML DatUsuario = new UsuarioXML();

    public static void buscaUsuario(JTextField seudonimotxt, JPasswordField password) {
        UsuarioXML DatUsuario = new UsuarioXML();

        Usuario usuario = DatUsuario.buscarPersona(seudonimotxt.getText());
        if (usuario != null) {
            String contraseña = new String (password.getPassword());
            
            if (usuario.getClave().equals(contraseña)) {
                if ("Usuario".equals(usuario.getRol())) {
                    PerfilUsuario control2 = new PerfilUsuario(usuario);
                    control2.setLocationRelativeTo(null);
                    control2.setVisible(true);
                }
                if ("Administrador de Productos".equals(usuario.getRol())) {
                    PerfilAdmProductos control2 = new PerfilAdmProductos(usuario);
                    control2.setLocationRelativeTo(null);
                    control2.setVisible(true);
                }
                if ("Administrador de Usuarios".equals(usuario.getRol())) {
                    PerfilAdmUsuarios control2 = new PerfilAdmUsuarios(usuario);
                    control2.setLocationRelativeTo(null);
                    control2.setVisible(true);
                }
            }
        }
    }
    
        public static void volverPerfil(Usuario usuario) {
                if ("Usuario".equals(usuario.getRol())) {
                    PerfilUsuario control2 = new PerfilUsuario(usuario);
                    control2.setLocationRelativeTo(null);
                    control2.setVisible(true);
                }
                if ("Administrador de Productos".equals(usuario.getRol())) {
                    PerfilAdmProductos control2 = new PerfilAdmProductos(usuario);
                    control2.setLocationRelativeTo(null);
                    control2.setVisible(true);
                }
                if ("Administrador de Usuarios".equals(usuario.getRol())) {
                    PerfilAdmUsuarios control2 = new PerfilAdmUsuarios(usuario);
                    control2.setLocationRelativeTo(null);
                    control2.setVisible(true);
                }
            }

}
