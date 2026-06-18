/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author leodeveloper
 */
public class Autor {
    
    /*
    Clase que representa un autor.
   */

   private String id;
   private String nombre;
   private String nacionalidad;

   /*
    Constructor principal.
   */
   public Autor(String id,
           String nombre,
           String nacionalidad) {

       this.id = id;
       this.nombre = nombre;
       this.nacionalidad = nacionalidad;
   }

   public String getId() {

       return id;
   }

   public String getNombre() {

       return nombre;
   }

   public String getNacionalidad() {

       return nacionalidad;
   }

   /*
    Muestra información del autor.
   */
   public void mostrarInfo() {

       System.out.println(toString());
   }

   /*
    Representación textual del objeto.
   */
   @Override
   public String toString() {

       return "ID: " + id
               + " | Nombre: " + nombre
               + " | Nacionalidad: "
               + nacionalidad;
   }
}
