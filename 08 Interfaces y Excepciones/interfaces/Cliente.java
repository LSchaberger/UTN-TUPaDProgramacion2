/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author leodeveloper
 */
public class Cliente implements Notificable {
    
    /*
    Cliente que recibe
    notificaciones.
   */

   private String nombre;

   public Cliente(String nombre) {

       this.nombre = nombre;
   }

   @Override
   public void notificar(
           String mensaje) {

       System.out.println(
               nombre
               + " recibió: "
               + mensaje
       );
   }

   public String getNombre() {

       return nombre;
   }
    
}
