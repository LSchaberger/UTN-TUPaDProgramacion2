/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author leodeveloper
 */
public class MailDuplicadoException extends Exception {
    
    /*
    Excepción utilizada cuando
    un mail ya existe.
   */

   /*
    Constructor principal.
   */
   public MailDuplicadoException(
           String mensaje) {

       super(mensaje);
   }
    
}
