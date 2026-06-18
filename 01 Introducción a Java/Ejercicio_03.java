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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ahora su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("\nSu nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        
    }
    
}
