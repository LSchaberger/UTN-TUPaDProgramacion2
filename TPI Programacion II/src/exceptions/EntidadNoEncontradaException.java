/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author leodeveloper
 */
public class EntidadNoEncontradaException extends Exception {
    
    /*
    Excepción utilizada cuando
    no se encuentra una entidad
    dentro de una colección.
   */

   /*
    Constructor principal.
   */
   public EntidadNoEncontradaException(
           String mensaje) {

       super(mensaje);
   }
    
}
