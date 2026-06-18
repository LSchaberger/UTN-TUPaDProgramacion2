/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
/**
 *
 * @author leodeveloper
 */
public class Profesor {

    /*
     Relación bidireccional 1:N

     Un Profesor dicta muchos Cursos.

     Cada Curso conoce a su Profesor.
    */

    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    /*
     Constructor principal.
    */
    public Profesor(String id,
            String nombre,
            String especialidad) {

        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;

        /*
         Inicialización obligatoria
         de la colección.
        */
        cursos = new ArrayList<>();
    }

    public String getId() {

        return id;
    }

    public String getNombre() {

        return nombre;
    }

    public String getEspecialidad() {

        return especialidad;
    }

    public ArrayList<Curso> getCursos() {

        return cursos;
    }

    /*
     Agrega un curso y sincroniza
     ambos lados de la relación.
    */
    public void agregarCurso(Curso c) {

        if (c != null
                && !cursos.contains(c)) {

            cursos.add(c);

            /*
             Si el curso no tiene
             este profesor asignado,
             se sincroniza.
            */
            if (c.getProfesor() != this) {

                c.setProfesor(this);
            }
        }
    }

    /*
     Elimina un curso y sincroniza
     ambos lados.
    */
    public void eliminarCurso(Curso c) {

        if (c != null
                && cursos.contains(c)) {

            cursos.remove(c);

            /*
             Se rompe la relación
             desde el curso.
            */
            if (c.getProfesor() == this) {

                c.setProfesor(null);
            }
        }
    }

    /*
     Lista los cursos del profesor.
    */
    public void listarCursos() {

        for (Curso c : cursos) {

            System.out.println(
                    c.getCodigo()
                    + " | "
                    + c.getNombre()
            );
        }
    }

    /*
     Muestra información del profesor.
    */
    public void mostrarInfo() {

        System.out.println(toString());
    }

    @Override
    public String toString() {

        return "ID: " + id
                + " | Nombre: " + nombre
                + " | Especialidad: "
                + especialidad
                + " | Cantidad Cursos: "
                + cursos.size();
    }
}
