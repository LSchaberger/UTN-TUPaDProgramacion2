/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;


import java.util.Scanner;

import entities.Categoria;

import entities.Producto;

import exceptions.DatoInvalidoException;

import exceptions.EntidadNoEncontradaException;

import services.CategoriaService;

import services.ProductoService;

/**
 *
 * @author leodeveloper
 */
public class MenuProductos {
    
    /*
    Menú encargado de la
    gestión de productos.
   */

   private ProductoService productoService;

   private CategoriaService categoriaService;

   private Scanner teclado;

   /*
    Constructor.
   */
   public MenuProductos(
           ProductoService productoService,

           CategoriaService categoriaService) {

       this.productoService =
               productoService;

       this.categoriaService =
               categoriaService;

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
                   "\n=== PRODUCTOS ==="
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

                       productoService
                               .listarProductos();

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
    Crear producto.
   */
   private void crear()

           throws DatoInvalidoException,

           EntidadNoEncontradaException {

       System.out.print(
               "\nNombre: "
       );

       String nombre =
               teclado.nextLine();

       System.out.print(
               "Precio: "
       );

       Double precio =
               teclado.nextDouble();

       System.out.print(
               "Stock: "
       );

       int stock =
               teclado.nextInt();

       System.out.print(
               "ID categoría: "
       );

       Long idCategoria =
               teclado.nextLong();

       teclado.nextLine();

       Categoria categoria =
               categoriaService
               .buscarPorId(
                       idCategoria
               );

       Producto producto =
               new Producto(
                       nombre,

                       precio,

                       "",

                       stock,

                       "",

                       true,

                       categoria
               );

       producto.setId(

               (long)

               (productoService
               .getProductos()
               .size()

               + 1)

       );

       productoService
               .agregarProducto(
                       producto
               );

       System.out.println(
               "\nProducto creado."
       );
   }

   /*
    Editar producto.
   */
   private void editar()

           throws Exception {

       System.out.print(
               "\nID producto: "
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
               "Nuevo precio: "
       );

       Double precio =
               teclado.nextDouble();

       System.out.print(
               "Nuevo stock: "
       );

       int stock =
               teclado.nextInt();

       System.out.print(
               "ID categoría: "
       );

       Long idCategoria =
               teclado.nextLong();

       teclado.nextLine();

       Categoria categoria =
               categoriaService
               .buscarPorId(
                       idCategoria
               );

       productoService
               .editarProducto(

                       id,

                       nombre,

                       precio,

                       stock,

                       categoria
               );

       System.out.println(
               "\nProducto modificado."
       );
   }

   /*
    Baja lógica.
   */
   private void eliminar()

           throws Exception {

       System.out.print(
               "\nID producto: "
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

       productoService
               .eliminarProducto(
                       id
               );

       System.out.println(
               "\nProducto eliminado."
       );
   }
    
}
