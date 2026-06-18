/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author leodeveloper
 */
public class Curso {
    
    /*
    Relación bidireccional.

    Un Curso conoce a su Profesor.
   */

   private String codigo;
   private String nombre;
   private Profesor profesor;

   /*
    Constructor principal.
   */
   public Curso(String codigo,
           String nombre) {

       this.codigo = codigo;
       this.nombre = nombre;
   }

   public String getCodigo() {

       return codigo;
   }

   public String getNombre() {

       return nombre;
   }

   public Profesor getProfesor() {

       return profesor;
   }

   /*
    Asigna o cambia profesor
    sincronizando ambos lados.
   */
   public void setProfesor(Profesor p) {

       /*
        Si ya tiene el mismo profesor,
        no hacer nada.
       */
       if (this.profesor == p) {

           return;
       }

       /*
        Guardar profesor anterior.
       */
       Profesor anterior = this.profesor;

       /*
        Actualizar profesor actual.
       */
       this.profesor = p;

       /*
        Eliminar del profesor anterior.
       */
       if (anterior != null) {

           anterior.getCursos().remove(this);
       }

       /*
        Agregar al nuevo profesor.
       */
       if (p != null
               && !p.getCursos().contains(this)) {

           p.getCursos().add(this);
       }
   }

   /*
    Muestra información del curso.
   */
   public void mostrarInfo() {

       System.out.println(toString());
   }

   @Override
   public String toString() {

       /*
        Validación para evitar null.
       */
       String nombreProfesor
               = "Sin profesor";

       if (profesor != null) {

           nombreProfesor
                   = profesor.getNombre();
       }

       return "Codigo: " + codigo
               + " | Nombre: " + nombre
               + " | Profesor: "
               + nombreProfesor;
    }
}
