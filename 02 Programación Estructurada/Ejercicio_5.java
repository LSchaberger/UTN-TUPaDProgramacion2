
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("<<<SUMA DE NÚMEROS PARES>>>");
        
        System.out.print("\nIngrese un número (0 para terminar): ");
        numero = Integer.parseInt(input.nextLine());

        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }

            System.out.print("\nIngrese un número (0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());
        }

        System.out.println("\nLa suma de los números pares es: " + suma);
    }
}
