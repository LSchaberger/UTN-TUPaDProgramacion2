/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author leodeveloper
 */
public class Impuesto {
    
    /*
    Asociación unidireccional:
    Impuesto conoce a Contribuyente,
    pero Contribuyente no conoce a Impuesto.
   */

   private double monto;

   // Asociación unidireccional
   private Contribuyente contribuyente;

   public Impuesto(double monto,
                   Contribuyente contribuyente) {

       this.monto = monto;
       this.contribuyente = contribuyente;
   }

   public double getMonto() {
       return monto;
   }

   public Contribuyente getContribuyente() {
       return contribuyente;
   }

   public String toString() {
       return "Impuesto{" +
               "monto=" + monto +
               ", contribuyente=" + contribuyente +
               '}';
   }
}
