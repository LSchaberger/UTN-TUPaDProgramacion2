/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author leodeveloper
 */
public class DatoInvalidoException extends Exception {
    
    /*
    Excepción utilizada cuando
    un dato ingresado es inválido.
   */

   /*
    Constructor principal.
   */
   public DatoInvalidoException(
           String mensaje) {

       super(mensaje);
   }
    
}
