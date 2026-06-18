/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

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
        y se establecen las relaciones.
       */

       // Usuario creado independientemente
       Usuario usuario = new Usuario(
               "Leandro",
               "leandro@gmail.com"
       );

       Documento documento = new Documento(
               "Contrato",
               "Contenido del documento",
               "HASH-ABC-123",
               "20/06/2026",
               usuario
       );

       // Mostrar información
       System.out.println(documento);
    }
    
}
