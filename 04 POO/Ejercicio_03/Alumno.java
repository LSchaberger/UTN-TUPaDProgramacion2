/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author leodeveloper
 */
public class Alumno {
    
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6;

    // constructor principal
    public Alumno(String nombre, double promedio) {

        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: nombre inválido");
        }

        this.nombre = nombre;

        // programación defensiva
        if (promedio < 0) {
            this.promedio = 0;
        } else if (promedio > 10) {
            this.promedio = 10;
        } else {
            this.promedio = promedio;
        }
    }

    // constructor sobrecargado (DRY)
    public Alumno(String nombre) {
        this(nombre, 0);
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public static double getNotaAprobacion() {
        return notaAprobacion;
    }

    // setter promedio (defensivo)
    public void setPromedio(double promedio) {
        if (promedio < 0) {
            this.promedio = 0;
        } else if (promedio > 10) {
            this.promedio = 10;
        } else {
            this.promedio = promedio;
        }
    }

    // sobrecarga
    public void actualizarPromedio(double nuevoPromedio) {
        setPromedio(nuevoPromedio);
    }

    public void actualizarPromedio(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("Error: notas inválidas");
            return;
        }

        double suma = 0;

        for (double n : notas) {
            suma += n;
        }

        double promedioCalculado = suma / notas.length;
        setPromedio(promedioCalculado);
    }

    // lógica de negocio
    public boolean aprobo() {
        return promedio >= notaAprobacion;
    }

    // método estático
    public static void cambiarNotaAprobacion(double nueva) {
        if (nueva >= 0 && nueva <= 10) {
            notaAprobacion = nueva;
        }
    }

    // toString
    public String toString() {
        return "Nombre: " + nombre +
               " | Promedio: " + promedio +
               " | Aprueba: " + (aprobo() ? "Sí" : "No");
    }
}
