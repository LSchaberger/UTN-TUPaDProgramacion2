/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Main actúa como orquestador del sistema.
        Aquí se crean los objetos
        y se utilizan las dependencias.
       */

       // Proyecto creado independientemente
       Proyecto proyecto = new Proyecto(
               "Video Promocional",
               15
       );

       EditorVideo editor = new EditorVideo();

       // Dependencia de creación:
       // EditorVideo crea el Render
       // dentro del método exportar()
       editor.exportar(
               "MP4",
               proyecto
       );
    }
    
}
