/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_5;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NaveEspacial n = new NaveEspacial();

        // estado inicial
        n.setNombre("Apollo");
        n.setCombustible(50);

        // intento inválido (no alcanza combustible)
        n.avanzar(30);

        System.out.println("---------------------");

        // intento de recarga inválida
        n.recargarCombustible(100);

        // recarga válida
        n.recargarCombustible(30);

        // avanzar correctamente
        n.avanzar(10);

        System.out.println("---------------------");

        n.mostrarEstado();
    }
    
}
