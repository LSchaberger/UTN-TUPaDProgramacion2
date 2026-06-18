/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author leodeveloper
 */
public class Foto {
    
    /*
    Clase utilizada en una relación de composición.
    Foto pertenece exclusivamente a Pasaporte.
   */

   private String imagen;
   private String formato;

   public Foto(String imagen, String formato) {
       this.imagen = imagen;
       this.formato = formato;
   }

   public String getImagen() {
       return imagen;
   }

   public String getFormato() {
       return formato;
   }

   public String toString() {
       return "Foto{" +
               "imagen='" + imagen + '\'' +
               ", formato='" + formato + '\'' +
               '}';
   }
}
