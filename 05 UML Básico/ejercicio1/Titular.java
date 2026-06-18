/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author leodeveloper
 */
public class Titular {
    
    /*
    Asociación bidireccional:
    Titular conoce a Pasaporte
    y Pasaporte conoce a Titular.
   */

   private String nombre;
   private String dni;

   // Asociación bidireccional
   private Pasaporte pasaporte;

   public Titular(String nombre, String dni) {
       this.nombre = nombre;
       this.dni = dni;
   }

   public void setPasaporte(Pasaporte pasaporte) {
       this.pasaporte = pasaporte;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDni() {
       return dni;
   }

   public Pasaporte getPasaporte() {
       return pasaporte;
   }

   public String toString() {
       return "Titular{" +
               "nombre='" + nombre + '\'' +
               ", dni='" + dni + '\'' +
               '}';
   }
}
