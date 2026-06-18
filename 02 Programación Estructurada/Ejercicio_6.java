
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int positivos = 0, negativos = 0, ceros = 0;

        System.out.println("<<<CONTADOR DE POSITIVOS, NEGATIVOS Y CEROS>>>");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("\nIngrese el número " + i + ": ");
            int num = Integer.parseInt(input.nextLine());

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
