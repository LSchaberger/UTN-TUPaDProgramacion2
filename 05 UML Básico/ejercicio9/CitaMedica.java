/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author leodeveloper
 */
public class CitaMedica {
    
    /*
    Asociación unidireccional:
    CitaMedica conoce a Paciente,
    pero Paciente no conoce a CitaMedica.

    Asociación unidireccional:
    CitaMedica conoce a Profesional,
    pero Profesional no conoce a CitaMedica.
   */

   private String fecha;
   private String hora;

   // Asociación unidireccional
   private Paciente paciente;

   // Asociación unidireccional
   private Profesional profesional;

   public CitaMedica(String fecha,
                     String hora,
                     Paciente paciente,
                     Profesional profesional) {

       this.fecha = fecha;
       this.hora = hora;

       this.paciente = paciente;
       this.profesional = profesional;
   }

   public String getFecha() {
       return fecha;
   }

   public String getHora() {
       return hora;
   }

   public Paciente getPaciente() {
       return paciente;
   }

   public Profesional getProfesional() {
       return profesional;
   }

   public String toString() {
       return "CitaMedica{" +
               "fecha='" + fecha + '\'' +
               ", hora='" + hora + '\'' +
               ", paciente=" + paciente +
               ", profesional=" + profesional +
               '}';
   }
}
