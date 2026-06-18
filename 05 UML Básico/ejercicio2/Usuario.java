/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author leodeveloper
 */
public class Usuario {
    
    /*
    Asociación bidireccional:
    Usuario conoce a Celular
    y Celular conoce a Usuario.
   */

   private String nombre;
   private String dni;

   // Asociación bidireccional
   private Celular celular;

   public Usuario(String nombre, String dni) {
       this.nombre = nombre;
       this.dni = dni;
   }

   public void setCelular(Celular celular) {
       this.celular = celular;
   }

   public String getNombre() {
       return nombre;
   }

   public String getDni() {
       return dni;
   }

   public Celular getCelular() {
       return celular;
   }

   public String toString() {
       return "Usuario{" +
               "nombre='" + nombre + '\'' +
               ", dni='" + dni + '\'' +
               '}';
   }
}
