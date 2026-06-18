/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

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
        Aquí se crean los objetos
        y se establecen las relaciones.
       */

       Computadora computadora = new Computadora(
               "Lenovo",
               "SN-123456",
               "ASUS Prime",
               "Intel Z790"
       );

       Propietario propietario = new Propietario(
               "Leandro",
               "12345678"
       );

       // Asociación bidireccional
       computadora.setPropietario(propietario);
       propietario.setComputadora(computadora);

       // Mostrar información
       System.out.println(computadora);

       System.out.println("----------------");

       System.out.println(propietario);
    }
    
}
