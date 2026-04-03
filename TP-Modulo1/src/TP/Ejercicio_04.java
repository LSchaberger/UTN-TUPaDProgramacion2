package TP;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;
        
        System.out.println("\nSuma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        
    }
    
}
