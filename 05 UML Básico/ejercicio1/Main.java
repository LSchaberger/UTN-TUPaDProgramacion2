/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

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
        Aquí se crean los objetos y se establecen
        las relaciones entre ellos.
       */

       Pasaporte pasaporte = new Pasaporte(
               "AA123456",
               "10/05/2026",
               "foto.png",
               "PNG"
       );

       Titular titular = new Titular(
               "Leandro",
               "12345678"
       );

       // Asociación bidireccional
       pasaporte.setTitular(titular);
       titular.setPasaporte(pasaporte);

       // Mostrar información
       System.out.println(pasaporte);

       System.out.println("----------------");

       System.out.println(titular);
    }
    
}
