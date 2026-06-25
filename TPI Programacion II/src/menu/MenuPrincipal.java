/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;


import java.util.Scanner;

import services.CategoriaService;

import services.ProductoService;

import services.UsuarioService;

import services.PedidoService;

/**
 *
 * @author leodeveloper
 */
public class MenuPrincipal {
    
    /*
    Menú principal del sistema.
   */

   private CategoriaService categoriaService;

   private ProductoService productoService;

   private UsuarioService usuarioService;

   private PedidoService pedidoService;

   private Scanner teclado;

   /*
    Constructor.
   */
   public MenuPrincipal() {

       categoriaService =
               new CategoriaService();

       productoService =
               new ProductoService();

       usuarioService =
               new UsuarioService();

       pedidoService =
               new PedidoService();

       teclado =
               new Scanner(
                       System.in
               );
   }

   /*
    Ejecuta la aplicación.
   */
   public void ejecutar() {

       int opcion;

       do {

           System.out.println(
                   "\n=== MENU PRINCIPAL ==="
           );

           System.out.println(
                   "1. Categorías"
           );

           System.out.println(
                   "2. Productos"
           );

           System.out.println(
                   "3. Usuarios"
           );

           System.out.println(
                   "4. Pedidos"
           );

           System.out.println(
                   "0. Salir"
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
                        "\nDebe ingresar un número."
                );

                teclado.nextLine();

                opcion = -1;
            }

           switch (opcion) {

               case 1:

                   new MenuCategorias(
                           categoriaService
                   ).ejecutar();

                   break;

               case 2:

                   new MenuProductos(

                           productoService,

                           categoriaService

                   ).ejecutar();

                   break;

               case 3:

                   new MenuUsuarios(

                           usuarioService

                   ).ejecutar();

                   break;

               case 4:

                   new MenuPedidos(

                           pedidoService,

                           productoService,

                           usuarioService

                   ).ejecutar();

                   break;

               case 0:

                   System.out.println(
                           "\nFin del programa."
                   );

                   break;

               default:

                   System.out.println(
                           "\nOpción inválida."
                   );
           }

       } while (opcion != 0);
   }
    
}
