/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author leodeveloper
 */
public class TarjetaDeCredito {
    
    /*
    Asociación bidireccional:
    TarjetaDeCredito conoce a Cliente
    y Cliente conoce a TarjetaDeCredito.

    Agregación:
    TarjetaDeCredito tiene un Banco,
    pero el Banco puede existir separadamente.
   */

   private String numero;
   private String fechaVencimiento;

   // Asociación bidireccional
   private Cliente cliente;

   // Agregación
   private Banco banco;

   public TarjetaDeCredito(String numero,
                            String fechaVencimiento,
                            Banco banco) {

       this.numero = numero;
       this.fechaVencimiento = fechaVencimiento;

       // El banco llega creado
       // Esto representa agregación
       this.banco = banco;
   }

   public void setCliente(Cliente cliente) {
       this.cliente = cliente;
   }

   public String getNumero() {
       return numero;
   }

   public String getFechaVencimiento() {
       return fechaVencimiento;
   }

   public Cliente getCliente() {
       return cliente;
   }

   public Banco getBanco() {
       return banco;
   }

   public String toString() {
       return "TarjetaDeCredito{" +
               "numero='" + numero + '\'' +
               ", fechaVencimiento='" + fechaVencimiento + '\'' +
               ", cliente=" + cliente +
               ", banco=" + banco +
               '}';
   }
}
