/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author leodeveloper
 */
public class Empleado {
    
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // constructor principal
    public Empleado(int id, String nombre, String puesto, double salario) {

        if (nombre.isEmpty() || puesto.isEmpty() || salario < 0) {
            System.out.println("Error: datos inválidos");
        }

        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

        totalEmpleados++;
    }

    // constructor secundario (DRY + ID automático)
    public Empleado(String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, 1000);
    }

    // getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    // setter (solo salario)
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: salario inválido");
        }
    }

    // sobrecarga
    public void actualizarSalario(double porcentaje) {
        if (porcentaje >= 0) {
            salario += salario * porcentaje / 100;
        } else {
            System.out.println("Error: porcentaje inválido");
        }
    }

    public void actualizarSalario(int aumentoFijo) {
        if (aumentoFijo >= 0) {
            salario += aumentoFijo;
        } else {
            System.out.println("Error: aumento inválido");
        }
    }

    // método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // toString
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto + " | Salario: " + salario;
    }
}
