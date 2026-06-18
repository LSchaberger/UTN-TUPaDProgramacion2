/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota m = new Mascota();

        // Prueba inválida
        m.setEdad(-3);

        System.out.println("---------------------");

        // Datos válidos
        m.setNombre("Firulais");
        m.setEspecie("Perro");
        m.setEdad(2);

        m.mostrarInfo();

        System.out.println("---------------------");

        // Simular paso del tiempo
        m.cumplirAnios();
        m.cumplirAnios();

        System.out.println("---------------------");

        m.mostrarInfo();
    }
}