/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author leodeveloper
 */
public class Pasaporte {
    
    /*
    Composición:
    Pasaporte crea y contiene una Foto.
    La Foto depende del ciclo de vida del Pasaporte.
   */

   private String numero;
   private String fechaEmision;

   // Asociación bidireccional con Titular
   private Titular titular;

   // Composición con Foto
   private Foto foto;

   public Pasaporte(String numero, String fechaEmision,
                     String imagen, String formato) {

       this.numero = numero;
       this.fechaEmision = fechaEmision;

       // La Foto se crea dentro del Pasaporte
       // Esto representa composición
       this.foto = new Foto(imagen, formato);
   }

   public void setTitular(Titular titular) {
       this.titular = titular;
   }

   public String getNumero() {
       return numero;
   }

   public String getFechaEmision() {
       return fechaEmision;
   }

   public Foto getFoto() {
       return foto;
   }

   public Titular getTitular() {
       return titular;
   }

   public String toString() {
       return "Pasaporte{" +
               "numero='" + numero + '\'' +
               ", fechaEmision='" + fechaEmision + '\'' +
               ", foto=" + foto +
               ", titular=" + titular +
               '}';
   }
}
