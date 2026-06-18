/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author leodeveloper
 */
public class EditorVideo {
    
    /*
    Dependencia de creación:
    EditorVideo crea un Render
    dentro del método exportar(),
    pero no lo guarda como atributo.
   */

   public void exportar(String formato,
                        Proyecto proyecto) {

       // Creación del objeto dentro del método
       Render render = new Render(
               formato,
               proyecto
       );

       System.out.println("Render exportado:");
       System.out.println(render);
    }
}
