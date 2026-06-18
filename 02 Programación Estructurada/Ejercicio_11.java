
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_11 {
    
    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuento = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuento;

        System.out.println("\nDescuento aplicado: " + descuento);
        System.out.println("Precio final: " + precioFinal);
    }

    public static void main(String[] args) {
        
        System.out.println("<<<CÁLCULO DE DESCUENTO ESPECIAL UTILIZANDO VARIABLE GLOBAL>>>");
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nPrecio: ");
        double precio = Double.parseDouble(input.nextLine().replace(",", "."));

        calcularDescuentoEspecial(precio);
    }
}
