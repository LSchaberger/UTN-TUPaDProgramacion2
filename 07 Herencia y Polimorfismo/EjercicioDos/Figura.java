/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDos;

/**
 *
 * @author leodeveloper
 */
public abstract class Figura {
    
    /*
    Clase abstracta.

    No puede instanciarse directamente.

    Representa el concepto general
    de una figura geométrica.
   */

   private String nombre;

   /*
    Constructor principal.
   */
   public Figura(String nombre) {

       this.nombre = nombre;
   }

   public String getNombre() {

       return nombre;
   }

   /*
    Método abstracto.

    Obliga a las subclases
    a implementar su propia lógica.
   */
   public abstract double calcularArea();
}
