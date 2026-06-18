/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author leodeveloper
 */
public class Vehiculo {
    
    /*
    Agregación:
    Vehiculo tiene un Motor,
    pero el Motor puede existir separadamente.

    Asociación bidireccional:
    Vehiculo conoce a Conductor
    y Conductor conoce a Vehiculo.
   */

   private String patente;
   private String modelo;

   // Agregación
   private Motor motor;

   // Asociación bidireccional
   private Conductor conductor;

   public Vehiculo(String patente,
                   String modelo,
                   Motor motor) {

       this.patente = patente;
       this.modelo = modelo;

       // El motor llega creado
       // Esto representa agregación
       this.motor = motor;
   }

   public void setConductor(Conductor conductor) {
       this.conductor = conductor;
   }

   public String getPatente() {
       return patente;
   }

   public String getModelo() {
       return modelo;
   }

   public Motor getMotor() {
       return motor;
   }

   public Conductor getConductor() {
       return conductor;
   }

   public String toString() {
       return "Vehiculo{" +
               "patente='" + patente + '\'' +
               ", modelo='" + modelo + '\'' +
               ", motor=" + motor +
               ", conductor=" + conductor +
               '}';
   }
}
