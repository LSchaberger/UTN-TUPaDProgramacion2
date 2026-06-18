/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author leodeveloper
 */
public class ClaveSeguridad {
    
    /*
    Clase utilizada en una relación de composición.
    La ClaveSeguridad depende del ciclo de vida
    de la CuentaBancaria.
   */

   private String codigo;
   private String ultimaModificacion;

   public ClaveSeguridad(String codigo,
                         String ultimaModificacion) {

       this.codigo = codigo;
       this.ultimaModificacion = ultimaModificacion;
   }

   public String getCodigo() {
       return codigo;
   }

   public String getUltimaModificacion() {
       return ultimaModificacion;
   }

   public String toString() {
       return "ClaveSeguridad{" +
               "codigo='" + codigo + '\'' +
               ", ultimaModificacion='" + ultimaModificacion + '\'' +
               '}';
   }
}
