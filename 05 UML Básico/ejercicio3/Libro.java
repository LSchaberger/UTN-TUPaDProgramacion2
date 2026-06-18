/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author leodeveloper
 */
public class Libro {
    
    /*
    Asociación unidireccional:
    Libro conoce a Autor,
    pero Autor no conoce a Libro.

    Agregación:
    Libro tiene una Editorial,
    pero Editorial puede existir separadamente.
   */

   private String titulo;
   private String isbn;

   // Asociación unidireccional
   private Autor autor;

   // Agregación
   private Editorial editorial;

   public Libro(String titulo, String isbn,
                Autor autor, Editorial editorial) {

       this.titulo = titulo;
       this.isbn = isbn;

       this.autor = autor;

       // La editorial llega creada
       // Esto representa agregación
       this.editorial = editorial;
   }

   public String getTitulo() {
       return titulo;
   }

   public String getIsbn() {
       return isbn;
   }

   public Autor getAutor() {
       return autor;
   }

   public Editorial getEditorial() {
       return editorial;
   }

   public String toString() {
       return "Libro{" +
               "titulo='" + titulo + '\'' +
               ", isbn='" + isbn + '\'' +
               ", autor=" + autor +
               ", editorial=" + editorial +
               '}';
   }
}
