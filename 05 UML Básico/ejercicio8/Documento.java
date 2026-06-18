/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author leodeveloper
 */
public class Documento {
    
    /*
    Composición:
    Documento crea y contiene una FirmaDigital.
    La FirmaDigital depende del ciclo de vida
    del Documento.
   */

   private String titulo;
   private String contenido;

   // Composición
   private FirmaDigital firmaDigital;

   public Documento(String titulo,
                    String contenido,
                    String codigoHash,
                    String fecha,
                    Usuario usuario) {

       this.titulo = titulo;
       this.contenido = contenido;

       // La FirmaDigital se crea dentro
       // de Documento
       this.firmaDigital = new FirmaDigital(
               codigoHash,
               fecha,
               usuario
       );
   }

   public String getTitulo() {
       return titulo;
   }

   public String getContenido() {
       return contenido;
   }

   public FirmaDigital getFirmaDigital() {
       return firmaDigital;
   }

   public String toString() {
       return "Documento{" +
               "titulo='" + titulo + '\'' +
               ", contenido='" + contenido + '\'' +
               ", firmaDigital=" + firmaDigital +
               '}';
   }
}
