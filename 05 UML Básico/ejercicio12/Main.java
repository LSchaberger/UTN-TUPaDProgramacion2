/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

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
        y se utilizan las dependencias.
       */

       // Objetos creados independientemente
       Contribuyente contribuyente = new Contribuyente(
               "Leandro",
               "20-12345678-9"
       );

       // Impuesto conoce a Contribuyente
       Impuesto impuesto = new Impuesto(
               25000.75,
               contribuyente
       );

       Calculadora calculadora = new Calculadora();

       // Dependencia de uso:
       // el impuesto se usa como parámetro
       // y no se guarda como atributo
       calculadora.calcular(impuesto);
    }
    
}
