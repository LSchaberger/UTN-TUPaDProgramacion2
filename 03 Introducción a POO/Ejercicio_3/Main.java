/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l = new Libro();

        // prueba inválida
        l.setAnioPublicacion(2999);

        System.out.println("---------------------");

        // datos válidos
        l.setTitulo("Harry Potter y la piedra filosofal");
        l.setAutor("J. K. Rowling");
        l.setAnioPublicacion(1997);

        l.mostrarInfo();
    }
    
}
