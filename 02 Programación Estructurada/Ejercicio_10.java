
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_10 {
    
    public static int actualizarStock(int stockActual, int vendida, int recibida) {
        return stockActual - vendida + recibida;
    }

    public static void main(String[] args) {
        
        System.out.println("<<<ACTUALIZACIÓN DE STOCK>>>");
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nStock actual: ");
        int stock = Integer.parseInt(input.nextLine());

        System.out.print("\nCantidad vendida: ");
        int vendida = Integer.parseInt(input.nextLine());

        System.out.print("\nCantidad recibida: ");
        int recibida = Integer.parseInt(input.nextLine());

        int nuevoStock = actualizarStock(stock, vendida, recibida);

        System.out.println("\nNuevo stock: " + nuevoStock);
    }
}
