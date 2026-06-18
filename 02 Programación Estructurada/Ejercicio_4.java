
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("<<<CALCULADORA DESCUENTO SEGÚN CATEGORÍA>>>");
        
        System.out.print("\nIngrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine().replace(",", "."));

        System.out.print("\nIngrese la categoría (A, B o C): ");
        char categoria = input.nextLine().toUpperCase().charAt(0);

        double descuento = 0;

        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("\nCategoría inválida");
                return;
        }

        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("\nDescuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
