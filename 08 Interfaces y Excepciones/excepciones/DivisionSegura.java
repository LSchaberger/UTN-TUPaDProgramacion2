/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author leodeveloper
 */
public class DivisionSegura {
    
    /*
    Realiza una división
    controlando división por cero.
   */
   public void ejecutar() {

       Scanner teclado =
               new Scanner(System.in);

       try {

           System.out.print(
                   "Ingrese el dividendo: "
           );

           int dividendo =
                   teclado.nextInt();

           System.out.print(
                   "Ingrese el divisor: "
           );

           int divisor =
                   teclado.nextInt();

           int resultado =
                   dividendo / divisor;

           System.out.println(
                   "Resultado: "
                   + resultado
           );

       } catch (
               ArithmeticException e) {

           System.out.println(
                   "Error: no se puede dividir por cero."
           );

       } finally {

           System.out.println(
                   "Operación finalizada."
           );
       }
   }
    
}
