/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author leodeveloper
 */
public class Cuenta {
    
    private final int numero;
    private String titular;
    private double saldo;

    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    // constructor principal
    public Cuenta(String titular, double saldoInicial) {

        if (titular == null || titular.isEmpty()) {
            System.out.println("Error: titular inválido");
        }

        if (saldoInicial < 0) {
            System.out.println("Error: saldo inicial inválido");
            saldoInicial = 0;
        }

        this.numero = ++ultimoNumero;
        this.titular = titular;
        this.saldo = saldoInicial;

        totalCuentas++;
    }

    // constructor sobrecargado (DRY)
    public Cuenta(String titular) {
        this(titular, 0);
    }

    // getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // operaciones
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Error: monto inválido");
        }
    }

    public void extraer(double monto) {
        if (monto <= 0) {
            System.out.println("Error: monto inválido");
        } else if (saldo - monto < 0) {
            System.out.println("Error: saldo insuficiente");
        } else {
            saldo -= monto;
        }
    }

    // sobrecarga
    public double consultarSaldo() {
        return saldo;
    }

    public double consultarSaldo(double cotizacionDolar) {
        if (cotizacionDolar > 0) {
            return saldo / cotizacionDolar;
        } else {
            System.out.println("Error: cotización inválida");
            return 0;
        }
    }

    // método estático
    public static int mostrarTotalCuentas() {
        return totalCuentas;
    }

    // toString
    public String toString() {
        return "Cuenta N°: " + numero +
               " | Titular: " + titular +
               " | Saldo: " + String.format("%.2f", saldo);
    }
}
