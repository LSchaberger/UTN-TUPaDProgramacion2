/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author leodeveloper
 */
public class FirmaDigital {
    
    /*
    Agregación:
    FirmaDigital tiene un Usuario,
    pero el Usuario puede existir separadamente.
   */

   private String codigoHash;
   private String fecha;

   // Agregación
   private Usuario usuario;

   public FirmaDigital(String codigoHash,
                       String fecha,
                       Usuario usuario) {

       this.codigoHash = codigoHash;
       this.fecha = fecha;

       // El usuario llega creado
       // Esto representa agregación
       this.usuario = usuario;
   }

   public String getCodigoHash() {
       return codigoHash;
   }

   public String getFecha() {
       return fecha;
   }

   public Usuario getUsuario() {
       return usuario;
   }

   public String toString() {
       return "FirmaDigital{" +
               "codigoHash='" + codigoHash + '\'' +
               ", fecha='" + fecha + '\'' +
               ", usuario=" + usuario +
               '}';
   }
}
