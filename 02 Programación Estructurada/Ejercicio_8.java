
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_8 {
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }

    public static void main(String[] args) {
        
        System.out.println("<<<CÁLCULO DEL PRECIO FINAL CON IMPUESTO Y DESCUENTO>>>");
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nPrecio base: ");
        double precio = Double.parseDouble(input.nextLine());

        System.out.print("\nImpuesto (%): ");
        double impuesto = Double.parseDouble(input.nextLine());

        System.out.print("\nDescuento (%): ");
        double descuento = Double.parseDouble(input.nextLine());

        double resultado = calcularPrecioFinal(precio, impuesto, descuento);

        System.out.println("\nPrecio final: " + resultado);
    }
}
