/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author leodeveloper
 */
public class TarjetaCredito implements Pago, PagoConDescuento {
    
    /*
    Pago con tarjeta.
   */

   @Override
   public void procesarPago(
           double monto) {

       System.out.println(
               "Pago con tarjeta: $"
               + monto
       );
   }

   @Override
   public double aplicarDescuento(
           double monto) {

       return monto * 0.90;
   }
    
}
