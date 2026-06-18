/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTres;

/**
 *
 * @author leodeveloper
 */
public class EmpleadoTemporal extends Empleado {
    
    /*
    EmpleadoTemporal ES UN Empleado.
   */

   private int horasTrabajadas;

   private double valorHora;

   /*
    Constructor.
   */
   public EmpleadoTemporal(
           String nombre,
           int horasTrabajadas,
           double valorHora) {

       super(nombre);

       this.horasTrabajadas = horasTrabajadas;
       this.valorHora = valorHora;
   }

   public int getHorasTrabajadas() {

       return horasTrabajadas;
   }

   public double getValorHora() {

       return valorHora;
   }

   /*
    Sobrescritura.
   */
   @Override
   public double calcularSueldo() {

       return horasTrabajadas * valorHora;
   }
}
