/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author leodeveloper
 */
public class Artista {
    
    /*
    Clase utilizada en una asociación unidireccional.
    Cancion conoce a Artista,
    pero Artista no conoce a Cancion.
   */

   private String nombre;
   private String genero;

   public Artista(String nombre, String genero) {
       this.nombre = nombre;
       this.genero = genero;
   }

   public String getNombre() {
       return nombre;
   }

   public String getGenero() {
       return genero;
   }

   public String toString() {
       return "Artista{" +
               "nombre='" + nombre + '\'' +
               ", genero='" + genero + '\'' +
               '}';
   }
}
