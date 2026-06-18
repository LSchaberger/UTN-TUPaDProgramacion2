/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_13 {
    
    public static void mostrarArray(double[] arr, int i) {
        if (i >= arr.length) return;

        System.out.println("Precio: $" + arr[i]);
        mostrarArray(arr, i + 1);
    }

    public static void main(String[] args) {

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("IMPRESIÓN RECURSIVA DE ARRAYS");

        System.out.println("\nPrecios originales:");
        mostrarArray(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarArray(precios, 0);
    }
}
