/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

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

       // Banco creado independientemente
       Banco banco = new Banco(
               "Banco Nación",
               "30-12345678-9"
       );

       TarjetaDeCredito tarjeta = new TarjetaDeCredito(
               "1234-5678-9999-0000",
               "12/30",
               banco
       );

       Cliente cliente = new Cliente(
               "Leandro",
               "12345678"
       );

       // Asociación bidireccional
       tarjeta.setCliente(cliente);
       cliente.setTarjeta(tarjeta);

       // Mostrar información
       System.out.println(tarjeta);

       System.out.println("----------------");

       System.out.println(cliente);
    }
    
}
