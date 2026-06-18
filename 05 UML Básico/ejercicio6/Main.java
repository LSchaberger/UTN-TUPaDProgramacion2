/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

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

       // Objetos creados independientemente
       Cliente cliente = new Cliente(
               "Leandro",
               "3492-123456"
       );

       Mesa mesa = new Mesa(
               10,
               4
       );

       // Reserva conoce a Cliente y Mesa
       Reserva reserva = new Reserva(
               "15/06/2026",
               "21:00",
               cliente,
               mesa
       );

       // Mostrar información
       System.out.println(reserva);
    }
    
}
