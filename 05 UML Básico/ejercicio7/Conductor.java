/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author leodeveloper
 */
public class Conductor {
 
    /*
    Asociación bidireccional:
    Conductor conoce a Vehiculo
    y Vehiculo conoce a Conductor.
   */

   private String nombre;
   private String licencia;

   // Asociación bidireccional
   private Vehiculo vehiculo;

   public Conductor(String nombre, String licencia) {
       this.nombre = nombre;
       this.licencia = licencia;
   }

   public void setVehiculo(Vehiculo vehiculo) {
       this.vehiculo = vehiculo;
   }

   public String getNombre() {
       return nombre;
   }

   public String getLicencia() {
       return licencia;
   }

   public Vehiculo getVehiculo() {
       return vehiculo;
   }

   public String toString() {
       return "Conductor{" +
               "nombre='" + nombre + '\'' +
               ", licencia='" + licencia + '\'' +
               '}';
   }
}
