/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioUno;

/**
 *
 * @author leodeveloper
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Demo actúa como cliente
        del sistema.
       */

       /*
        Instanciar un Auto.

        Cuando se crea un Auto,
        también se ejecuta el
        constructor de Vehiculo
        mediante super(...).
       */
       Auto auto = new Auto(
               "Toyota",
               "Corolla",
               4
       );

       System.out.println(
               "=== INFORMACION DEL AUTO ==="
       );

       /*
        Invocación del método
        sobrescrito.
       */
       auto.mostrarInfo();
    }
    
}
