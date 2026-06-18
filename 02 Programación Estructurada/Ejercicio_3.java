
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_3 {
    
    public static void main(String[] args) {
        
        int edad;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<<CLASIFICACIÓN DE EDAD>>>");
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad <= 0) {
            System.out.println("\nError. Ingrese edad mayor a 0");
        }
        if (edad > 120) {
            System.out.println("\nError. Ingrese edad menor a 120");
        }
        if (edad < 12 && edad > 0) {
            System.out.println("\nEres un Niño");
        }
        if (edad >= 12 && edad <= 17) {
            System.out.println("\nEres un Adolescente");
        }   
        if (edad >= 18 && edad <= 59) {
            System.out.println("\nEres un Adulto");
        }   
        if (edad >= 60 && edad <= 120) {
            System.out.println("\nEres un Adulto Mayor");
        }
    }
}
