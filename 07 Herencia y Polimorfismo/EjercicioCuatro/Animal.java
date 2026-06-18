/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuatro;

/**
 *
 * @author leodeveloper
 */
public class Animal {
    
    /*
    Clase base de la jerarquía.

    Representa cualquier animal.
   */

   private String nombre;

   /*
    Constructor principal.
   */
   public Animal(String nombre) {

       this.nombre = nombre;
   }

   public String getNombre() {

       return nombre;
   }

   /*
    Método que será sobrescrito
    por las subclases.
   */
   public void hacerSonido() {

       System.out.println(
               "Sonido generico"
       );
   }

   /*
    Describe al animal.
   */
   public void describirAnimal() {

       System.out.println(
               "Animal: " + nombre
       );
   }
}
