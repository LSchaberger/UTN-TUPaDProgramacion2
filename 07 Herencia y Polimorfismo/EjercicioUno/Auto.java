/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioUno;

/**
 *
 * @author leodeveloper
 */
public class Auto extends Vehiculo {
    
    /*
    Auto ES UN Vehiculo.

    Se utiliza extends para
    establecer la herencia.
   */

   private int cantidadPuertas;

   /*
    Constructor.

    super(...) inicializa
    los atributos heredados.
   */
   public Auto(String marca,
           String modelo,
           int cantidadPuertas) {

       super(marca, modelo);

       this.cantidadPuertas = cantidadPuertas;
   }

   public int getCantidadPuertas() {

       return cantidadPuertas;
   }

   /*
    Sobrescritura del método
    heredado de Vehiculo.
   */
   @Override
   public void mostrarInfo() {

       System.out.println(
               "Marca: " + getMarca()
               + " | Modelo: " + getModelo()
               + " | Puertas: "
               + cantidadPuertas
       );
   }
}
