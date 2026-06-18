/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author leodeveloper
 */
public class Contribuyente {
    
    /*
    Clase utilizada en una asociación unidireccional.
    Impuesto conoce a Contribuyente,
    pero Contribuyente no conoce a Impuesto.
   */

   private String nombre;
   private String cuil;

   public Contribuyente(String nombre, String cuil) {
       this.nombre = nombre;
       this.cuil = cuil;
   }

   public String getNombre() {
       return nombre;
   }

   public String getCuil() {
       return cuil;
   }

   public String toString() {
       return "Contribuyente{" +
               "nombre='" + nombre + '\'' +
               ", cuil='" + cuil + '\'' +
               '}';
   }
}
