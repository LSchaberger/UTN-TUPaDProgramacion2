/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author leodeveloper
 */
public class Paciente {
    
    /*
    Clase utilizada en una asociación unidireccional.
    CitaMedica conoce a Paciente,
    pero Paciente no conoce a CitaMedica.
   */

   private String nombre;
   private String obraSocial;

   public Paciente(String nombre, String obraSocial) {
       this.nombre = nombre;
       this.obraSocial = obraSocial;
   }

   public String getNombre() {
       return nombre;
   }

   public String getObraSocial() {
       return obraSocial;
   }

   public String toString() {
       return "Paciente{" +
               "nombre='" + nombre + '\'' +
               ", obraSocial='" + obraSocial + '\'' +
               '}';
   }
}
