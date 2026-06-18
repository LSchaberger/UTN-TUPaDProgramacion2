/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

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
        Main actúa como orquestador
        del sistema académico.
       */

       // Crear universidad
       Universidad universidad
               = new Universidad(
                       "UTN"
               );

       /*
        Crear profesores.
       */
       Profesor p1 = new Profesor(
               "P001",
               "Juan Perez",
               "Programacion"
       );

       Profesor p2 = new Profesor(
               "P002",
               "Maria Lopez",
               "Base de Datos"
       );

       Profesor p3 = new Profesor(
               "P003",
               "Carlos Gomez",
               "Redes"
       );

       /*
        Crear cursos.
       */
       Curso c1 = new Curso(
               "C001",
               "Programacion II"
       );

       Curso c2 = new Curso(
               "C002",
               "Laboratorio II"
       );

       Curso c3 = new Curso(
               "C003",
               "Base de Datos"
       );

       Curso c4 = new Curso(
               "C004",
               "Redes"
       );

       Curso c5 = new Curso(
               "C005",
               "Arquitectura"
       );

       /*
        Agregar profesores
        a la universidad.
       */
       universidad.agregarProfesor(p1);
       universidad.agregarProfesor(p2);
       universidad.agregarProfesor(p3);

       /*
        Agregar cursos
        a la universidad.
       */
       universidad.agregarCurso(c1);
       universidad.agregarCurso(c2);
       universidad.agregarCurso(c3);
       universidad.agregarCurso(c4);
       universidad.agregarCurso(c5);

       /*
        Asignación bidireccional.
       */
       universidad.asignarProfesorACurso(
               "C001",
               "P001"
       );

       universidad.asignarProfesorACurso(
               "C002",
               "P001"
       );

       universidad.asignarProfesorACurso(
               "C003",
               "P002"
       );

       universidad.asignarProfesorACurso(
               "C004",
               "P003"
       );

       System.out.println(
               "=== LISTA CURSOS ==="
       );

       universidad.listarCursos();

       System.out.println(
               "\n=== LISTA PROFESORES ==="
       );

       universidad.listarProfesores();

       System.out.println(
               "\n=== CURSOS DE JUAN ==="
       );

       p1.listarCursos();

       System.out.println(
               "\n=== CAMBIAR PROFESOR ==="
       );

       /*
        Reasignación automática.
       */
       universidad.asignarProfesorACurso(
               "C002",
               "P002"
       );

       universidad.listarCursos();

       System.out.println(
               "\n=== CURSOS DE MARIA ==="
       );

       p2.listarCursos();

       System.out.println(
               "\n=== ELIMINAR CURSO ==="
       );

       universidad.eliminarCurso("C004");

       universidad.listarCursos();

       System.out.println(
               "\n=== ELIMINAR PROFESOR ==="
       );

       universidad.eliminarProfesor("P001");

       universidad.listarCursos();

       System.out.println(
               "\n=== REPORTE ==="
       );

       /*
        Cantidad de cursos por profesor.
       */
       for (Profesor p
               : universidad.getProfesores()) {

           System.out.println(
                   p.getNombre()
                   + " -> "
                   + p.getCursos().size()
                   + " cursos"
           );
        }
    }
    
}
