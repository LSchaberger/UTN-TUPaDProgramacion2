/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author leodeveloper
 */
public class Reproductor {
    
    /*
    Dependencia de uso:
    Reproductor utiliza una Cancion
    como parámetro de un método,
    pero no la guarda como atributo.
   */

   public void reproducir(Cancion cancion) {

       System.out.println("Reproduciendo canción...");
       System.out.println("Título: " + cancion.getTitulo());

       System.out.println(
               "Artista: " +
               cancion.getArtista().getNombre()
       );
   }
}
