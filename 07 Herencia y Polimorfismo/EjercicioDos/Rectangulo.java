/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDos;

/**
 *
 * @author leodeveloper
 */
public class Rectangulo extends Figura {
    
    /*
    Rectangulo ES UNA Figura.
   */

   private double base;

   private double altura;

   /*
    Constructor.
   */
   public Rectangulo(double base,
           double altura) {

       super("Rectangulo");

       this.base = base;
       this.altura = altura;
   }

   public double getBase() {

       return base;
   }

   public double getAltura() {

       return altura;
   }

   /*
    Implementación concreta
    del método abstracto.
   */
   @Override
   public double calcularArea() {

       return base * altura;
   }
}
