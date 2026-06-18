/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuatro;

/**
 *
 * @author leodeveloper
 */
public class Gato extends Animal {
    
    /*
    Gato ES UN Animal.
   */

   public Gato(String nombre) {

       super(nombre);
   }

   /*
    Sobrescritura.
   */
   @Override
   public void hacerSonido() {

       System.out.println(
               getNombre()
               + " dice: Miau"
       );
   }
}
