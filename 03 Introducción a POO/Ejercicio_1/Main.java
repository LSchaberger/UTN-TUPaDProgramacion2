/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Estudiante e = new Estudiante();

        // Pruebas inválidas
        e.setNombre("");
        e.setApellido("");
        e.setCurso("");
        e.setCalificacion(12);

        System.out.println("---------------------");

        // Datos válidos
        e.setNombre("Juan");
        e.setApellido("Perez");
        e.setCurso("Programación II");
        e.setCalificacion(8);

        e.mostrarInfo();

        System.out.println("---------------------");

        // Subir y bajar nota
        e.subirCalificacion(2); // subió a 10
        e.bajarCalificacion(20); // inválido
        e.bajarCalificacion(1.5); // bajó a 8.5

        e.mostrarInfo();
    }
}
