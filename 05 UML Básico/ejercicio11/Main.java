/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Main actúa como orquestador del sistema.
        Aquí se crean los objetos
        y se utilizan las dependencias.
       */

       // Objetos creados independientemente
       Artista artista = new Artista(
               "Imagine Dragons",
               "Rock"
       );

       // Cancion conoce a Artista
       Cancion cancion = new Cancion(
               "Believer",
               artista
       );

       Reproductor reproductor = new Reproductor();

       // Dependencia de uso:
       // la canción se usa como parámetro
       // y no se guarda como atributo
       reproductor.reproducir(cancion);
    }
    
}
