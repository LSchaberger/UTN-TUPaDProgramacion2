/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author leodeveloper
 */
public class Render {
    
    /*
    Asociación unidireccional:
    Render conoce a Proyecto,
    pero Proyecto no conoce a Render.
   */

   private String formato;

   // Asociación unidireccional
   private Proyecto proyecto;

   public Render(String formato,
                 Proyecto proyecto) {

       this.formato = formato;
       this.proyecto = proyecto;
   }

   public String getFormato() {
       return formato;
   }

   public Proyecto getProyecto() {
       return proyecto;
   }

   public String toString() {
       return "Render{" +
               "formato='" + formato + '\'' +
               ", proyecto=" + proyecto +
               '}';
   }
}
