/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioCuatro;

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
        Upcasting.

        Todos los animales se almacenan
        como Animal.
       */

       Animal[] animales = {
           new Perro("Firulais"),
           new Gato("Mishi"),
           new Vaca("Lola"),
           new Perro("Rocky"),
           new Gato("Garfield")
       };

       System.out.println(
               "=== LISTA DE ANIMALES ==="
       );

       /*
        Polimorfismo.

        Java decide qué versión de
        hacerSonido() ejecutar según
        el objeto real en memoria.
       */
       for (Animal animal : animales) {

           animal.describirAnimal();

           animal.hacerSonido();

           System.out.println();
       }
    }
    
}
