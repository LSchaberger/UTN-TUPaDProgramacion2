/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioUno;

/**
 *
 * @author leodeveloper
 */
public class Vehiculo {
    
    /*
    Clase base de la jerarquía.

    Contiene los atributos y comportamientos
    comunes a todos los vehículos.

    Aplicamos el principio DRY:
    evitamos duplicar código en las subclases.
   */

   private String marca;

   private String modelo;

   /*
    Constructor principal.

    Inicializa los atributos comunes
    a todos los vehículos.
   */
   public Vehiculo(String marca,
           String modelo) {

       this.marca = marca;
       this.modelo = modelo;
   }

   public String getMarca() {

       return marca;
   }

   public String getModelo() {

       return modelo;
   }

   /*
    Muestra información básica
    del vehículo.
   */
   public void mostrarInfo() {

       System.out.println(
               "Marca: " + marca
               + " | Modelo: " + modelo
       );
   }
}
