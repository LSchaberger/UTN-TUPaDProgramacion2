/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno("Juan", 8);
        Alumno a2 = new Alumno("Ana");

        // actualizar con valor directo
        a2.actualizarPromedio(5);

        // actualizar con array
        double[] notas = {7, 6, 8};
        a2.actualizarPromedio(notas);

        // prueba inválida
        a1.actualizarPromedio(-3);

        // mostrar resultados
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("---------------------");

        // cambiar nota de aprobación global
        Alumno.cambiarNotaAprobacion(7);

        // impacto del static
        System.out.println(a1);
        System.out.println(a2);
    }
    
}
