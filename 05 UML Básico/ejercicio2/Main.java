/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /*
        Main actúa como orquestador del sistema.
        Se crean los objetos y luego
        se establecen las relaciones.
       */

       // La batería se crea aparte
       // porque puede existir independientemente
       Bateria bateria = new Bateria(
               "BAT-500",
               5000
       );

       Celular celular = new Celular(
               "123456789",
               "Samsung",
               "S24",
               bateria
       );

       Usuario usuario = new Usuario(
               "Leandro",
               "12345678"
       );

       // Asociación bidireccional
       celular.setUsuario(usuario);
       usuario.setCelular(celular);

       // Mostrar información
       System.out.println(celular);

       System.out.println("----------------");

       System.out.println(usuario);
    }
    
}
