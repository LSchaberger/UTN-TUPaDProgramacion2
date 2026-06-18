/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author leodeveloper
 */
public class Titular {
    
    /*
    Asociación bidireccional:
    Titular conoce a CuentaBancaria
    y CuentaBancaria conoce a Titular.
   */

   private String nombre;
   private String dni;

   // Asociación bidireccional
   private CuentaBancaria cuentaBancaria;

   public Titular(String nombre, String dni) {
       this.nombre = nombre;
       this.dni = dni;
   }

   public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
       this.cuentaBancaria = cuentaBancaria;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDni() {
       return dni;
   }

   public CuentaBancaria getCuentaBancaria() {
       return cuentaBancaria;
   }

   public String toString() {
       return "Titular{" +
               "nombre='" + nombre + '\'' +
               ", dni='" + dni + '\'' +
               '}';
   }
}
