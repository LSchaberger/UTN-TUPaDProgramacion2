/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

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
        Main actúa como orquestador.

        Aquí se crean autores,
        biblioteca y libros.
       */

       // Crear biblioteca
       Biblioteca biblioteca
               = new Biblioteca(
                       "Biblioteca Central"
               );

       /*
        Crear autores independientes.
       */

       Autor a1 = new Autor(
               "A001",
               "Gabriel Garcia Marquez",
               "Colombia"
       );

       Autor a2 = new Autor(
               "A002",
               "Julio Cortazar",
               "Argentina"
       );

       Autor a3 = new Autor(
               "A003",
               "Mario Vargas Llosa",
               "Peru"
       );

       /*
        La Biblioteca crea internamente
        los Libros mediante composición.
       */

       biblioteca.agregarLibro(
               "ISBN001",
               "Cien Años de Soledad",
               1967,
               a1
       );

       biblioteca.agregarLibro(
               "ISBN002",
               "Rayuela",
               1963,
               a2
       );

       biblioteca.agregarLibro(
               "ISBN003",
               "La Ciudad y los Perros",
               1963,
               a3
       );

       biblioteca.agregarLibro(
               "ISBN004",
               "Cronopios y Famas",
               1962,
               a2
       );

       biblioteca.agregarLibro(
               "ISBN005",
               "El Otoño del Patriarca",
               1975,
               a1
       );

       System.out.println(
               "=== LISTA LIBROS ==="
       );

       biblioteca.listarLibros();

       System.out.println(
               "\n=== BUSCAR LIBRO ==="
       );

       /*
        Búsqueda lineal por ISBN.
       */
       Libro buscado
               = biblioteca.buscarLibroPorIsbn(
                       "ISBN002"
               );

       /*
        Validación de null
        para evitar errores.
       */
       if (buscado != null) {

           buscado.mostrarInfo();
       }

       System.out.println(
               "\n=== FILTRAR AÑO 1963 ==="
       );

       biblioteca.filtrarLibrosPorAnio(1963);

       System.out.println(
               "\n=== ELIMINAR LIBRO ==="
       );

       biblioteca.eliminarLibro("ISBN004");

       biblioteca.listarLibros();

       System.out.println(
               "\n=== TOTAL LIBROS ==="
       );

       System.out.println(
               biblioteca.obtenerCantidadLibros()
       );

       System.out.println(
               "\n=== AUTORES DISPONIBLES ==="
       );

       biblioteca.mostrarAutoresDisponibles();
    }
    
}
