/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author leodeveloper
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("\nError: nombre vacío");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (!apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("\nError: apellido vacío");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (!curso.isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("\nError: curso vacío");
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        } else {
            System.out.println("\nError: la calificación debe estar entre 0 y 10");
        }
    }

    public void subirCalificacion(double puntos) {
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
        } else {
            System.out.println("\nError: no puede superar 10");
        }
    }

    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
        } else {
            System.out.println("\nError: no puede ser menor a 0");
        }
    }

    public void mostrarInfo() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
}
