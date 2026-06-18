/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        // prueba inválida
        g1.setEdad(-3);

        System.out.println("---------------------");

        // datos válidos
        g1.setIdGallina(1);
        g1.setEdad(2);

        g2.setIdGallina(2);
        g2.setEdad(1);

        // acciones independientes
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();

        System.out.println("---------------------");

        // estados finales
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
