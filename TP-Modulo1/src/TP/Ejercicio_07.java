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
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cambié nombre de variable "scanner" por input, evita confusión
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        
        // nextInt() es para enteros, nextLine() para String
        String nombre = input.nextLine(); // ERROR CORREGIDO
        
        System.out.println("Hola, " + nombre);
    }
    
}
