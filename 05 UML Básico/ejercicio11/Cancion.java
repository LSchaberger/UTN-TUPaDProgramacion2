/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author leodeveloper
 */
public class Cancion {
    
    /*
    Asociación unidireccional:
    Cancion conoce a Artista,
    pero Artista no conoce a Cancion.
   */

   private String titulo;

   // Asociación unidireccional
   private Artista artista;

   public Cancion(String titulo, Artista artista) {
       this.titulo = titulo;
       this.artista = artista;
   }

   public String getTitulo() {
       return titulo;
   }

   public Artista getArtista() {
       return artista;
   }

   public String toString() {
       return "Cancion{" +
               "titulo='" + titulo + '\'' +
               ", artista=" + artista +
               '}';
   }
}
