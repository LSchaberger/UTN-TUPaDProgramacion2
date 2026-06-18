/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

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
        Main actúa como orquestador.
        Aquí se crean los objetos
        y se establecen las relaciones.
       */

       // Objetos creados independientemente
       Autor autor = new Autor(
               "Gabriel García Márquez",
               "Colombiano"
       );

       Editorial editorial = new Editorial(
               "Sudamericana",
               "Buenos Aires"
       );

       // Libro conoce a Autor y Editorial
       Libro libro = new Libro(
               "Cien años de soledad",
               "978-84-376-0494-7",
               autor,
               editorial
       );

       // Mostrar información
       System.out.println(libro);
    }
    
}
