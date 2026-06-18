/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTres;

/**
 *
 * @author leodeveloper
 */
public abstract class Empleado {
    
    /*
    Clase abstracta.

    Representa un empleado genérico.
   */

   private String nombre;

   /*
    Constructor principal.
   */
   public Empleado(String nombre) {

       this.nombre = nombre;
   }

   public String getNombre() {

       return nombre;
   }

   /*
    Método abstracto.

    Cada tipo de empleado
    calcula su sueldo de forma distinta.
   */
   public abstract double calcularSueldo();
}
