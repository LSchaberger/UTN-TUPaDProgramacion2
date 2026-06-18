/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author leodeveloper
 */
public class Calculadora {
    
    /*
    Dependencia de uso:
    Calculadora utiliza un Impuesto
    como parámetro de un método,
    pero no lo guarda como atributo.
   */

   public void calcular(Impuesto impuesto) {

       System.out.println("Calculando impuesto...");

       System.out.println(
               "Contribuyente: " +
               impuesto.getContribuyente().getNombre()
       );

       System.out.println(
               "Monto a pagar: $" +
               impuesto.getMonto()
       );
    }
}
