/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author leodeveloper
 */
public class CodigoQR {
    
    /*
    Asociación unidireccional:
    CodigoQR conoce a Usuario,
    pero Usuario no conoce a CodigoQR.
   */

   private String valor;

   // Asociación unidireccional
   private Usuario usuario;

   public CodigoQR(String valor, Usuario usuario) {
       this.valor = valor;
       this.usuario = usuario;
   }

   public String getValor() {
       return valor;
   }

   public Usuario getUsuario() {
       return usuario;
   }

   public String toString() {
       return "CodigoQR{" +
               "valor='" + valor + '\'' +
               ", usuario=" + usuario +
               '}';
   }
}
