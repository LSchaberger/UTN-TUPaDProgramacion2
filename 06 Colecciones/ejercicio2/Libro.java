/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author leodeveloper
 */
public class Libro {
    
    /*
    Asociación unidireccional.

    Un Libro conoce a su Autor.
   */

   private String isbn;
   private String titulo;
   private int anioPublicacion;
   private Autor autor;

   /*
    Constructor principal.
   */
   public Libro(String isbn,
           String titulo,
           int anioPublicacion,
           Autor autor) {

       this.isbn = isbn;
       this.titulo = titulo;
       this.anioPublicacion = anioPublicacion;
       this.autor = autor;
   }

   public String getIsbn() {

       return isbn;
   }

   public String getTitulo() {

       return titulo;
   }

   public int getAnioPublicacion() {

       return anioPublicacion;
   }

   public Autor getAutor() {

       return autor;
   }

   /*
    Muestra información del libro.
   */
   public void mostrarInfo() {

       System.out.println(toString());
   }

   @Override
   public String toString() {

       return "ISBN: " + isbn
               + " | Titulo: " + titulo
               + " | Año: " + anioPublicacion
               + " | Autor: "
               + autor.getNombre();
   }
}
