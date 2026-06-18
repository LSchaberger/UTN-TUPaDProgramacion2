
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_1 {
    
    // El main es la puerta de entrada para que el programa se ejecute.
    public static void main(String[] args) {
        
        // Con este Scanner llamado "input" vamos a escanear lo que el usuario ingrese por teclado.
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<<CALCULADORA DE AÑO BISIESTO>>>");
        System.out.print("Ingrese un año: ");
        
        // Año ingresa como String y es convertido a int, para evitar salto de línea en buffer.
        int anio = Integer.parseInt(input.nextLine());
        
        if (anio > 0){
            
            if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
            
                System.out.println("\nEl año " + anio + " es bisiesto.");
                
            } else{
                System.out.println("\nEl año " + anio + " no es bisiesto.");
            }
                
        } else{
            System.out.println("\nError. Ingrese año mayor a 0");
        }
        
    }
    
}
