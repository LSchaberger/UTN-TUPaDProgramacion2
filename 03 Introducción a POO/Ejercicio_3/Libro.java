/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author leodeveloper
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: título vacío");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (!autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Error: autor vacío");
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = 2026;

        if (anioPublicacion > 0 && anioPublicacion <= anioActual) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: año inválido");
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anioPublicacion);
    }
}