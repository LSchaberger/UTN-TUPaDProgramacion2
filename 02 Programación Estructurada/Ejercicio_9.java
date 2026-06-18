
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_9 {
    
public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        
        System.out.println("<<<COMPOSICIÓN DE FUNCIONES PARA COSTO DE ENVÍO Y TOTAL DE COMPRA>>>");
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nPrecio del producto: ");
        double precio = Double.parseDouble(input.nextLine().replace(",", "."));

        System.out.print("\nPeso del paquete: ");
        double peso = Double.parseDouble(input.nextLine().replace(",", "."));

        String zona;

        // Validación
        do {
            System.out.print("\nZona (Nacional/Internacional): ");
            zona = input.nextLine();

            if (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional")) {
                System.out.println("\nError. Debe ingresar 'Nacional' o 'Internacional'");
            }

        } while (!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional"));

        double envio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, envio);

        System.out.println("\nCosto de envío: " + envio);
        System.out.println("Total a pagar: " + total);
    }
}
