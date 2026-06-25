/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;


import java.util.Scanner;

import entities.Categoria;

import exceptions.EntidadNoEncontradaException;

import services.CategoriaService;

/**
 *
 * @author leodeveloper
 */
public class MenuCategorias {
    
    /*
    Menú encargado de la
    gestión de categorías.
   */

   private CategoriaService service;

   private Scanner teclado;

   /*
    Constructor.
   */
   public MenuCategorias(
           CategoriaService service) {

       this.service = service;

       teclado = new Scanner(
               System.in
       );
   }

   /*
    Ejecuta el submenú.
   */
   public void ejecutar() {

       int opcion;

       do {

           System.out.println(
                   "\n=== CATEGORIAS ==="
           );

           System.out.println(
                   "1. Listar"
           );

           System.out.println(
                   "2. Crear"
           );

           System.out.println(
                   "3. Editar"
           );

           System.out.println(
                   "4. Eliminar"
           );

           System.out.println(
                   "0. Volver"
           );

           System.out.print(
                    "Seleccione: "
            );

            if (teclado.hasNextInt()) {

                opcion =
                        teclado.nextInt();

                teclado.nextLine();

            } else {

                System.out.println(
                        "\nError: Debe ingresar un número.\n"
                );

                teclado.nextLine();

                opcion = -1;
            }

           try {

               switch (opcion) {

                   case 1:

                       service
                               .listarCategorias();

                       break;

                   case 2:

                       crear();

                       break;

                   case 3:

                       editar();

                       break;

                   case 4:

                       eliminar();

                       break;

                   case 0:

                       break;

                   default:

                       System.out.println(
                               "\nOpción inválida."
                       );
               }

           } catch (Exception e) {

               System.out.println(
                       e.getMessage()
               );
           }

       } while (opcion != 0);
   }

   /*
    Crear categoría.
   */
   private void crear()

        throws Exception {

       System.out.print(
               "\nNombre: "
       );

       String nombre =
               teclado.nextLine();

       System.out.print(
               "Descripción: "
       );

       String descripcion =
               teclado.nextLine();

       Categoria categoria =
               new Categoria(
                       nombre,
                       descripcion
               );

       categoria.setId(
               (long)

               (service
               .getCategorias()
               .size()

               + 1)
       );

       service.agregarCategoria(
               categoria
       );

       System.out.println(
               "\nCategoría creada."
       );
   }

   /*
    Editar categoría.
   */
   private void editar()

        throws Exception {

       System.out.print(
               "\nID: "
       );

       Long id =
               teclado.nextLong();

       teclado.nextLine();

       System.out.print(
               "Nuevo nombre: "
       );

       String nombre =
               teclado.nextLine();

       System.out.print(
               "Nueva descripción: "
       );

       String descripcion =
               teclado.nextLine();

       service.editarCategoria(
               id,

               nombre,

               descripcion
       );

       System.out.println(
               "\nCategoría modificada."
       );
   }

   /*
    Baja lógica.
   */
   private void eliminar()

           throws EntidadNoEncontradaException {

       System.out.print(
               "\nID: "
       );

       Long id =
               teclado.nextLong();

       teclado.nextLine();
       
       /*
        Solicita confirmación
        antes de eliminar.
       */

       System.out.print(
               "¿Confirma la eliminación? (S/N): "
       );

       String respuesta =
               teclado.nextLine();

       if (!respuesta
               .equalsIgnoreCase("S")) {

           System.out.println(
                   "\nOperación cancelada."
           );

           return;
       }

       service.eliminarCategoria(
               id
       );

       System.out.println(
               "\nCategoría eliminada."
       );
   }
    
}
