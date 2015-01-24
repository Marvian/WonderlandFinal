/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;
import model.Usuario;

/**
 *
 * @author Jessica
 */

public class ControladorRegistro {
    
    
    
         public String Fecha(String total){
         String day,month,year,total1;
         
         //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
          mes=mes+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        day = String.valueOf(dia);
        month = String.valueOf(mes);
        year = String.valueOf(año);
        
        total=day+"/"+month+"/"+year;
        
       
        /*System.out.println("Fecha Actual: "
                           + dia + "/" + (mes+1) + "/" + año);*/
        
        return total;
    }
     
        static public void obtenerDatos(String nombre, String apellido, String cedula, String correo, String Direccion, 
                                 String clave, String seudonimo, String fecreg, String fecnac,String rol){
    boolean resultado = true;
    UsuarioXML DatCli = new UsuarioXML();
    Usuario cli = new Usuario(nombre,apellido,cedula,correo,Direccion,clave,seudonimo,fecreg,fecnac,rol,"","","","");
    resultado = DatCli.agregarUsuario(cli);
}
        
}
