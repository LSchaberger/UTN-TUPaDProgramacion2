/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

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

       CuentaBancaria cuenta = new CuentaBancaria(
               "1234567890123456789012",
               150000.50,
               "ABC123",
               "30/06/2026"
       );

       Titular titular = new Titular(
               "Leandro",
               "12345678"
       );

       // Asociación bidireccional
       cuenta.setTitular(titular);
       titular.setCuentaBancaria(cuenta);

       // Mostrar información
       System.out.println(cuenta);

       System.out.println("----------------");

       System.out.println(titular);
    }
    
}
