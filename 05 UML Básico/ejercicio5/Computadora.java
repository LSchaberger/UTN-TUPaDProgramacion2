/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author leodeveloper
 */
public class Computadora {
    
    /*
    Composición:
    Computadora crea y contiene una PlacaMadre.
    La PlacaMadre depende del ciclo de vida
    de la Computadora.

    Asociación bidireccional:
    Computadora conoce a Propietario
    y Propietario conoce a Computadora.
   */

   private String marca;
   private String numeroSerie;

   // Asociación bidireccional
   private Propietario propietario;

   // Composición
   private PlacaMadre placaMadre;

   public Computadora(String marca,
                      String numeroSerie,
                      String modeloPlaca,
                      String chipset) {

       this.marca = marca;
       this.numeroSerie = numeroSerie;

       // La PlacaMadre se crea dentro
       // de Computadora
       this.placaMadre = new PlacaMadre(
               modeloPlaca,
               chipset
       );
   }

   public void setPropietario(Propietario propietario) {
       this.propietario = propietario;
   }

   public String getMarca() {
       return marca;
   }

   public String getNumeroSerie() {
       return numeroSerie;
   }

   public Propietario getPropietario() {
       return propietario;
   }

   public PlacaMadre getPlacaMadre() {
       return placaMadre;
   }

   public String toString() {
       return "Computadora{" +
               "marca='" + marca + '\'' +
               ", numeroSerie='" + numeroSerie + '\'' +
               ", placaMadre=" + placaMadre +
               ", propietario=" + propietario +
               '}';
   }
}
