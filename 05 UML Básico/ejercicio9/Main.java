/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Main actúa como orquestador del sistema.
        Aquí se crean los objetos
        y se establecen las relaciones.
       */

       // Objetos creados independientemente
       Paciente paciente = new Paciente(
               "Leandro",
               "OSDE"
       );

       Profesional profesional = new Profesional(
               "Dr. Pérez",
               "Cardiología"
       );

       // CitaMedica conoce a Paciente y Profesional
       CitaMedica cita = new CitaMedica(
               "25/06/2026",
               "10:30",
               paciente,
               profesional
       );

       // Mostrar información
       System.out.println(cita);
    }
    
}
