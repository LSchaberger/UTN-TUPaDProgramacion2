/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author leodeveloper
 */
public class Proyecto {
    
    /*
    Clase utilizada en una asociación unidireccional.
    Render conoce a Proyecto,
    pero Proyecto no conoce a Render.
   */

   private String nombre;
   private int duracionMin;

   public Proyecto(String nombre, int duracionMin) {
       this.nombre = nombre;
       this.duracionMin = duracionMin;
   }

   public String getNombre() {
       return nombre;
   }

   public int getDuracionMin() {
       return duracionMin;
   }

   public String toString() {
       return "Proyecto{" +
               "nombre='" + nombre + '\'' +
               ", duracionMin=" + duracionMin +
               '}';
   }
}
