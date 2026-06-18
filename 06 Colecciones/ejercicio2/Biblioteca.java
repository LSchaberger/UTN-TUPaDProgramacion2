/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
/**
 *
 * @author leodeveloper
 */
public class Biblioteca {

    /*
     Composición 1:N

     Una Biblioteca contiene muchos Libros.

     Si la Biblioteca desaparece,
     sus Libros también.
    */

    private String nombre;
    private ArrayList<Libro> libros;

    /*
     Constructor principal.
    */
    public Biblioteca(String nombre) {

        this.nombre = nombre;

        /*
         Inicialización obligatoria
         del ArrayList.
        */
        libros = new ArrayList<>();
    }

    /*
     La Biblioteca crea y administra
     internamente los Libros.
    */
    public void agregarLibro(String isbn,
            String titulo,
            int anioPublicacion,
            Autor autor) {

        libros.add(
                new Libro(
                        isbn,
                        titulo,
                        anioPublicacion,
                        autor
                )
        );
    }

    /*
     Recorre y muestra todos los libros.
    */
    public void listarLibros() {

        for (Libro l : libros) {

            l.mostrarInfo();
        }
    }

    /*
     Búsqueda lineal por ISBN.
    */
    public Libro buscarLibroPorIsbn(String isbn) {

        for (Libro l : libros) {

            if (l.getIsbn().equals(isbn)) {

                return l;
            }
        }

        return null;
    }

    /*
     Elimina un libro por ISBN.
    */
    public void eliminarLibro(String isbn) {

        Libro eliminar
                = buscarLibroPorIsbn(isbn);

        if (eliminar != null) {

            libros.remove(eliminar);

            System.out.println(
                    "Libro eliminado."
            );
        } else {

            System.out.println(
                    "Libro no encontrado."
            );
        }
    }

    /*
     Obtiene la cantidad total de libros.
    */
    public int obtenerCantidadLibros() {

        return libros.size();
    }

    /*
     Filtra libros por año.
    */
    public void filtrarLibrosPorAnio(int anio) {

        for (Libro l : libros) {

            if (l.getAnioPublicacion() == anio) {

                l.mostrarInfo();
            }
        }
    }

    /*
     Muestra autores disponibles.
    */
    public void mostrarAutoresDisponibles() {

        for (Libro l : libros) {

            System.out.println(
                    l.getAutor().getNombre()
                    + " | "
                    + l.getAutor().getNacionalidad()
            );
        }
    }
}
