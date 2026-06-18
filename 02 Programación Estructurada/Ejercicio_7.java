
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("<<<VALIDACIÓN DE NOTA ENTRE 0 y 10>>>");
        
        do {
            System.out.print("\nIngrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());

            if (nota < 0 || nota > 10) {
                System.out.println("\nError. Nota inválida.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("\nNota guardada correctamente.");
    }
}
