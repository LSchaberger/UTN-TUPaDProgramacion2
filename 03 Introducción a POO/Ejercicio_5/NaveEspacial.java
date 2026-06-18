/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author leodeveloper
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private static final double CAPACIDAD_MAXIMA = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: Nombre vacío");
        }
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= CAPACIDAD_MAXIMA) {
            this.combustible = combustible;
        } else {
            System.out.println("Error: Combustible inválido");
        }
    }

    public void despegar() {
        if (combustible >= 5) {
            combustible -= 5;
            System.out.println("Despegue exitoso");
        } else {
            System.out.println("Error: Combustible insuficiente para despegar");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia * 2;

        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("Avanzó " + distancia + " km");
        } else {
            System.out.println("Error: Combustible insuficiente para avanzar");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= CAPACIDAD_MAXIMA) {
            combustible += cantidad;
        } else {
            System.out.println("Error: Supera la capacidad máxima");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " - Combustible: " + combustible);
    }
}
