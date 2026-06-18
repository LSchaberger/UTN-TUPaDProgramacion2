/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l1 = new Libro("Java", "Autor A");
        Libro l2 = new Libro("POO", "Autor B", "Planeta");

        // actualizar títulos
        l1.actualizarTitulo("Java Avanzado");
        l2.actualizarTitulo("Nuevo", "POO");

        // prueba inválida
        l1.actualizarTitulo("");

        // mostrar
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("---------------------");

        // cambiar editorial global
        Libro.cambiarEditorial("Sudamericana");

        // mostrar de nuevo (impacto static)
        System.out.println(l1);
        System.out.println(l2);
    }
    
}
