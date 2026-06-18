/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author leodeveloper
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    // constructor principal
    public Libro(String titulo, String autor) {

        if (titulo == null || titulo.isEmpty() || autor == null || autor.isEmpty()) {
            System.out.println("Error: datos inválidos");
        }

        this.titulo = titulo;
        this.autor = autor;
    }

    // constructor sobrecargado (DRY)
    public Libro(String titulo, String autor, String editorial) {
        this(titulo, autor);

        if (editorial != null && !editorial.isEmpty()) {
            Libro.editorial = editorial;
        }
    }

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static String getEditorial() {
        return editorial;
    }

    // setters
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: título inválido");
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Error: autor inválido");
        }
    }

    // sobrecarga
    public void actualizarTitulo(String nuevoTitulo) {
        if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
            this.titulo = nuevoTitulo;
        } else {
            System.out.println("Error: título inválido");
        }
    }

    public void actualizarTitulo(String prefijo, String nuevoTitulo) {
        if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
            this.titulo = prefijo + " " + nuevoTitulo;
        } else {
            System.out.println("Error: título inválido");
        }
    }

    // método estático
    public static void cambiarEditorial(String nueva) {
        if (nueva != null && !nueva.isEmpty()) {
            editorial = nueva;
        }
    }

    // toString
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | Editorial: " + editorial;
    }
}
