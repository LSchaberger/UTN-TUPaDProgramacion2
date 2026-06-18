/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

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

       // Motor creado independientemente
       Motor motor = new Motor(
               "Nafta",
               "MTR-987654"
       );

       Vehiculo vehiculo = new Vehiculo(
               "AB123CD",
               "Toyota Corolla",
               motor
       );

       Conductor conductor = new Conductor(
               "Leandro",
               "LIC-456789"
       );

       // Asociación bidireccional
       vehiculo.setConductor(conductor);
       conductor.setVehiculo(vehiculo);

       // Mostrar información
       System.out.println(vehiculo);

       System.out.println("----------------");

       System.out.println(conductor);
    }
    
}
