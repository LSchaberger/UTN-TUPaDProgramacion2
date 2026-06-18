/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author leodeveloper
 */
public class Motor {
    
    /*
    Clase utilizada en una relación de agregación.
    El Motor puede existir independientemente
    del Vehiculo.
   */

   private String tipo;
   private String numeroSerie;

   public Motor(String tipo, String numeroSerie) {
       this.tipo = tipo;
       this.numeroSerie = numeroSerie;
   }

   public String getTipo() {
       return tipo;
   }

   public String getNumeroSerie() {
       return numeroSerie;
   }

   public String toString() {
       return "Motor{" +
               "tipo='" + tipo + '\'' +
               ", numeroSerie='" + numeroSerie + '\'' +
               '}';
   }
}
