/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Mouse", 200);
        Producto p2 = new Producto("Teclado");

        // aplicar descuentos
        p1.aplicarDescuento(10);
        p2.aplicarDescuento(20, 90);

        // prueba inválida
        Producto p3 = new Producto("Monitor", -500);

        // mostrar productos
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("---------------------");

        // cambiar IVA global
        Producto.cambiarIVA(0.30);

        // recalcular con nuevo IVA
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
    
}
