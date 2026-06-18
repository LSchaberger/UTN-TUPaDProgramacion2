/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuatro;

/**
 *
 * @author leodeveloper
 */
public class Vaca extends Animal {
    
    /*
    Vaca ES UN Animal.
   */

   public Vaca(String nombre) {

       super(nombre);
   }

   /*
    Sobrescritura.
   */
   @Override
   public void hacerSonido() {

       System.out.println(
               getNombre()
               + " dice: Muuu"
       );
   }
}
