/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author leodeveloper
 */
public class CuentaBancaria {
    
    /*
    Composición:
    CuentaBancaria crea y contiene
    una ClaveSeguridad.
    La ClaveSeguridad depende del ciclo
    de vida de la CuentaBancaria.

    Asociación bidireccional:
    CuentaBancaria conoce a Titular
    y Titular conoce a CuentaBancaria.
   */

   private String cbu;
   private double saldo;

   // Asociación bidireccional
   private Titular titular;

   // Composición
   private ClaveSeguridad claveSeguridad;

   public CuentaBancaria(String cbu,
                         double saldo,
                         String codigo,
                         String ultimaModificacion) {

       this.cbu = cbu;
       this.saldo = saldo;

       // La ClaveSeguridad se crea dentro
       // de CuentaBancaria
       this.claveSeguridad = new ClaveSeguridad(
               codigo,
               ultimaModificacion
       );
   }

   public void setTitular(Titular titular) {
       this.titular = titular;
   }

   public String getCbu() {
       return cbu;
   }

   public double getSaldo() {
       return saldo;
   }

   public Titular getTitular() {
       return titular;
   }

   public ClaveSeguridad getClaveSeguridad() {
       return claveSeguridad;
   }

   public String toString() {
       return "CuentaBancaria{" +
               "cbu='" + cbu + '\'' +
               ", saldo=" + saldo +
               ", claveSeguridad=" + claveSeguridad +
               ", titular=" + titular +
               '}';
   }
}
