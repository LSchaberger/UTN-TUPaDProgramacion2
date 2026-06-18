
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
        
        int mayor, num1, num2, num3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<<MAYOR DE 3 NÚMEROS ENTEROS>>>");
        
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());
        
        mayor = num1;
        
        if (num2 > mayor){
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("\nLos tres son de valor: " + mayor);
        } else {
            System.out.println("\nEl mayor es: " + mayor);
        }
    }
    
}
