/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

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

       // Usuario creado independientemente
       Usuario usuario = new Usuario(
               "Leandro",
               "leandro@gmail.com"
       );

       GeneradorQR generador = new GeneradorQR();

       // Dependencia de creación:
       // GeneradorQR crea el CodigoQR
       // dentro del método generar()
       generador.generar(
               "QR-ABC-123",
               usuario
       );
    }
    
}
