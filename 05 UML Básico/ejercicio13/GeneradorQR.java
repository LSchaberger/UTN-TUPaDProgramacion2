/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author leodeveloper
 */
public class GeneradorQR {
    
    /*
    Dependencia de creación:
    GeneradorQR crea un CodigoQR
    dentro del método generar(),
    pero no lo guarda como atributo.
   */

   public void generar(String valor,
                       Usuario usuario) {

       // Creación del objeto dentro del método
       CodigoQR codigoQR = new CodigoQR(
               valor,
               usuario
       );

       System.out.println("Código QR generado:");
       System.out.println(codigoQR);
    }
}
