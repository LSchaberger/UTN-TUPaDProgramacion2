/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author leodeveloper
 */
public class Editorial {
    
    /*
    Clase utilizada en una relación de agregación.
    La Editorial puede existir independientemente del Libro.
   */

   private String nombre;
   private String direccion;

   public Editorial(String nombre, String direccion) {
       this.nombre = nombre;
       this.direccion = direccion;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDireccion() {
       return direccion;
   }

   public String toString() {
       return "Editorial{" +
               "nombre='" + nombre + '\'' +
               ", direccion='" + direccion + '\'' +
               '}';
   }
}
