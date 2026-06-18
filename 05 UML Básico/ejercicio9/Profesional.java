/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author leodeveloper
 */
public class Profesional {
    
    /*
    Clase utilizada en una asociación unidireccional.
    CitaMedica conoce a Profesional,
    pero Profesional no conoce a CitaMedica.
   */

   private String nombre;
   private String especialidad;

   public Profesional(String nombre, String especialidad) {
       this.nombre = nombre;
       this.especialidad = especialidad;
   }

   public String getNombre() {
       return nombre;
   }

   public String getEspecialidad() {
       return especialidad;
   }

   public String toString() {
       return "Profesional{" +
               "nombre='" + nombre + '\'' +
               ", especialidad='" + especialidad + '\'' +
               '}';
   }
}
