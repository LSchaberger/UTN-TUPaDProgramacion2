/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author leodeveloper
 */
public class Cliente {
    
    /*
    Clase utilizada en una asociación unidireccional.
    Reserva conoce a Cliente,
    pero Cliente no conoce a Reserva.
   */

   private String nombre;
   private String telefono;

   public Cliente(String nombre, String telefono) {
       this.nombre = nombre;
       this.telefono = telefono;
   }

   public String getNombre() {
       return nombre;
   }

   public String getTelefono() {
       return telefono;
   }

   public String toString() {
       return "Cliente{" +
               "nombre='" + nombre + '\'' +
               ", telefono='" + telefono + '\'' +
               '}';
   }
}
