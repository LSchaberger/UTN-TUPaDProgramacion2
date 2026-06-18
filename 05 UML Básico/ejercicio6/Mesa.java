/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author leodeveloper
 */
public class Mesa {
    
    /*
    Clase utilizada en una relación de agregación.
    La Mesa puede existir independientemente
    de la Reserva.
   */

   private int numero;
   private int capacidad;

   public Mesa(int numero, int capacidad) {
       this.numero = numero;
       this.capacidad = capacidad;
   }

   public int getNumero() {
       return numero;
   }

   public int getCapacidad() {
       return capacidad;
   }

   public String toString() {
       return "Mesa{" +
               "numero=" + numero +
               ", capacidad=" + capacidad +
               '}';
   }
}
