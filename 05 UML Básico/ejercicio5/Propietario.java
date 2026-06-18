/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author leodeveloper
 */
public class Propietario {
    
    /*
    Asociación bidireccional:
    Propietario conoce a Computadora
    y Computadora conoce a Propietario.
   */

   private String nombre;
   private String dni;

   // Asociación bidireccional
   private Computadora computadora;

   public Propietario(String nombre, String dni) {
       this.nombre = nombre;
       this.dni = dni;
   }

   public void setComputadora(Computadora computadora) {
       this.computadora = computadora;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDni() {
       return dni;
   }

   public Computadora getComputadora() {
       return computadora;
   }

   public String toString() {
       return "Propietario{" +
               "nombre='" + nombre + '\'' +
               ", dni='" + dni + '\'' +
               '}';
   }
}
