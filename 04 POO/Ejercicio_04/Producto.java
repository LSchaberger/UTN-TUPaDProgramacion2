/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author leodeveloper
 */
public class Producto {
    
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;

    // constructor principal
    public Producto(String nombre, double precioBase) {

        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: nombre inválido");
        }

        if (precioBase < 0) {
            System.out.println("Error: precio inválido");
            precioBase = 0;
        }

        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // constructor sobrecargado (DRY)
    public Producto(String nombre) {
        this(nombre, 100);
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // setter (defensivo)
    public void setPrecioBase(double precioBase) {
        if (precioBase >= 0) {
            this.precioBase = precioBase;
        } else {
            System.out.println("Error: precio inválido");
        }
    }

    // sobrecarga
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0) {
            precioBase -= precioBase * porcentaje / 100;
        } else {
            System.out.println("Error: descuento inválido");
        }
    }

    public void aplicarDescuento(double porcentaje, double precioMinimo) {
        if (porcentaje < 0) {
            System.out.println("Error: descuento inválido");
            return;
        }

        double nuevoPrecio = precioBase - precioBase * porcentaje / 100;

        if (nuevoPrecio >= precioMinimo) {
            precioBase = nuevoPrecio;
        } else {
            precioBase = precioMinimo;
        }
    }

    // cálculo fiscal
    public double calcularPrecioFinal() {
        return precioBase + precioBase * IVA;
    }

    // método estático
    public static void cambiarIVA(double nuevo) {
        if (nuevo >= 0) {
            IVA = nuevo;
        }
    }

    // toString
    public String toString() {
        return "Producto: " + nombre +
               " | Precio Base: " + precioBase +
               " | Precio Final: " + calcularPrecioFinal();
    }
}
