/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTres;

/**
 *
 * @author leodeveloper
 */
public class EmpleadoPlanta extends Empleado {
    
    /*
    EmpleadoPlanta ES UN Empleado.
   */

   private double sueldoFijo;

   /*
    Constructor.
   */
   public EmpleadoPlanta(
           String nombre,
           double sueldoFijo) {

       super(nombre);

       this.sueldoFijo = sueldoFijo;
   }

   public double getSueldoFijo() {

       return sueldoFijo;
   }

   /*
    Sobrescritura.
   */
   @Override
   public double calcularSueldo() {

       return sueldoFijo;
   }
}
