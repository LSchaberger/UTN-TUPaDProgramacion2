/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDos;

/**
 *
 * @author leodeveloper
 */
public class Circulo extends Figura {
    
    /*
    Circulo ES UNA Figura.
   */

   private double radio;

   /*
    Constructor.
   */
   public Circulo(double radio) {

       super("Circulo");

       this.radio = radio;
   }

   public double getRadio() {

       return radio;
   }

   /*
    Implementación concreta
    del método abstracto.
   */
   @Override
   public double calcularArea() {

       return Math.PI * radio * radio;
   }
}
