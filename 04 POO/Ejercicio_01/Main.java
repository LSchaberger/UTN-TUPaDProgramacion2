/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado(1, "Juan", "Dev", 1000);
        Empleado e2 = new Empleado("Ana", "QA");

        // pruebas válidas
        e1.actualizarSalario(10.0);
        e2.actualizarSalario(500);

        // pruebas inválidas
        e1.actualizarSalario(-5);
        e2.actualizarSalario(-100);

        // mostrar info
        System.out.println(e1);
        System.out.println(e2);

        // total
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
