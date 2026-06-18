/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author leodeveloper
 */
public class Cliente {
    
    /*
    Asociación bidireccional:
    Cliente conoce a TarjetaDeCredito
    y TarjetaDeCredito conoce a Cliente.
   */

   private String nombre;
   private String dni;

   // Asociación bidireccional
   private TarjetaDeCredito tarjeta;

   public Cliente(String nombre, String dni) {
       this.nombre = nombre;
       this.dni = dni;
   }

   public void setTarjeta(TarjetaDeCredito tarjeta) {
       this.tarjeta = tarjeta;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDni() {
       return dni;
   }

   public TarjetaDeCredito getTarjeta() {
       return tarjeta;
   }

   public String toString() {
       return "Cliente{" +
               "nombre='" + nombre + '\'' +
               ", dni='" + dni + '\'' +
               '}';
   }
}
