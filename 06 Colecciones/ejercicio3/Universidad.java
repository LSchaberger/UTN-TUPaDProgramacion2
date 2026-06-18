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
public class Universidad {

        /*
         Universidad administra
         profesores y cursos.
        */
        private String nombre;

        private ArrayList<Profesor> profesores;

        private ArrayList<Curso> cursos;

        /*
         Constructor principal.
        */
        public Universidad(String nombre) {

            this.nombre = nombre;

            /*
             Inicialización obligatoria
             de las colecciones.
            */
            profesores = new ArrayList<>();

            cursos = new ArrayList<>();
        }

        /*
         Agrega profesor.
        */
        public void agregarProfesor(Profesor p) {

            profesores.add(p);
        }

        /*
         Agrega curso.
        */
        public void agregarCurso(Curso c) {

            cursos.add(c);
        }

        /*
         Asigna profesor a curso.

         La sincronización se realiza
         dentro de setProfesor().
        */
        public void asignarProfesorACurso(
                String codigoCurso,
                String idProfesor) {

            Curso curso
                    = buscarCursoPorCodigo(
                            codigoCurso
                    );

            Profesor profesor
                    = buscarProfesorPorId(
                            idProfesor
                    );

            /*
             Validación para evitar null.
            */
            if (curso != null
                    && profesor != null) {

                curso.setProfesor(profesor);

                System.out.println(
                        "Profesor asignado."
                );
            } else {

                System.out.println(
                        "Curso o profesor inexistente."
                );
            }
        }

        /*
         Lista profesores.
        */
        public void listarProfesores() {

            for (Profesor p : profesores) {

                p.mostrarInfo();
            }
        }

        /*
         Lista cursos.
        */
        public void listarCursos() {

            for (Curso c : cursos) {

                c.mostrarInfo();
            }
        }

        /*
         Búsqueda lineal por ID.
        */
        public Profesor buscarProfesorPorId(
                String id) {

            for (Profesor p : profesores) {

                /*
                 equals() para comparar Strings.
                */
                if (p.getId().equals(id)) {

                    return p;
                }
            }

            return null;
        }

        /*
         Búsqueda lineal por código.
        */
        public Curso buscarCursoPorCodigo(
                String codigo) {

            for (Curso c : cursos) {

                if (c.getCodigo().equals(codigo)) {

                    return c;
                }
            }

            return null;
        }

        /*
         Elimina curso y rompe
         la relación bidireccional.
        */
        public void eliminarCurso(String codigo) {

            Curso eliminar
                    = buscarCursoPorCodigo(
                            codigo
                    );

            if (eliminar != null) {

                /*
                 Romper relación.
                */
                eliminar.setProfesor(null);

                cursos.remove(eliminar);

                System.out.println(
                        "Curso eliminado."
                );
            } else {

                System.out.println(
                        "Curso no encontrado."
                );
            }
        }

        /*
         Elimina profesor y deja
         profesor = null en sus cursos.
        */
        public void eliminarProfesor(String id) {

            Profesor eliminar
                    = buscarProfesorPorId(id);

            if (eliminar != null) {

                /*
                 Copia auxiliar para evitar
                 ConcurrentModificationException.
                */
                ArrayList<Curso> copia
                        = new ArrayList<>(
                                eliminar.getCursos()
                        );

                /*
                 Romper relación bidireccional.
                */
                for (Curso c : copia) {

                    c.setProfesor(null);
                }

                profesores.remove(eliminar);

                System.out.println(
                        "Profesor eliminado."
                );
            } else {

                System.out.println(
                        "Profesor no encontrado."
                );
            }
        }

        /*
         Devuelve la lista de profesores.
        */
        public ArrayList<Profesor> getProfesores() {

            return profesores;
        }
}
