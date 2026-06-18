/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author leodeveloper
 */
public class PayPal implements Pago, PagoConDescuento {
    
    /*
    Pago mediante PayPal.
   */

   @Override
   public void procesarPago(
           double monto) {

       System.out.println(
               "Pago con PayPal: $"
               + monto
       );
   }

   @Override
   public double aplicarDescuento(
           double monto) {

       return monto * 0.95;
   }
    
}
