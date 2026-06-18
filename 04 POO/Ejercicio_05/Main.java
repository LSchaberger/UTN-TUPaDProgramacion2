/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta("Juan", 2000);
        Cuenta c2 = new Cuenta("Ana");

        // autoincremento
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("---------------------");

        // prueba extracción inválida
        c1.extraer(3000);

        // operaciones válidas
        c1.depositar(500);
        c1.extraer(1000);

        // saldo en pesos y dólares
        System.out.println("Saldo en pesos: " + c1.consultarSaldo());
        System.out.println("Saldo en dólares: " + c1.consultarSaldo(1360));

        System.out.println("---------------------");

        // total cuentas
        System.out.println("Total cuentas: " + Cuenta.mostrarTotalCuentas());
    }
    
}
