/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioDos;

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
        Polimorfismo.

        Un array de Figura puede
        almacenar objetos de cualquier
        subclase de Figura.
       */

       Figura[] figuras = {
           new Circulo(5),
           new Rectangulo(10, 4),
           new Circulo(3),
           new Rectangulo(7, 2)
       };

       System.out.println(
               "=== AREAS DE LAS FIGURAS ==="
       );

       /*
        Llamada polimórfica.

        Java decide en tiempo de ejecución
        qué versión de calcularArea()
        debe ejecutar.
       */
       for (Figura figura : figuras) {

           System.out.println(
                   figura.getNombre()
                   + " -> Area: "
                   + figura.calcularArea()
           );
       }
    }
    
}
