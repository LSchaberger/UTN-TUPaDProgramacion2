/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;


import java.time.LocalDate;

import java.util.Scanner;

import entities.Pedido;

import entities.Producto;

import entities.Usuario;

import enums.Estado;

import enums.FormaPago;

import services.PedidoService;

import services.ProductoService;

import services.UsuarioService;

/**
 *
 * @author leodeveloper
 */
public class MenuPedidos {
    
    /*
    Menú encargado de la
    gestión de pedidos.
   */

   private PedidoService pedidoService;

   private ProductoService productoService;

   private UsuarioService usuarioService;

   private Scanner teclado;

   /*
    Constructor.
   */
   public MenuPedidos(

           PedidoService pedidoService,

           ProductoService productoService,

           UsuarioService usuarioService) {

       this.pedidoService =
               pedidoService;

       this.productoService =
               productoService;

       this.usuarioService =
               usuarioService;

       teclado = new Scanner(
               System.in
       );
   }

   /*
    Ejecuta el menú.
   */
   public void ejecutar() {

       int opcion;

       do {

           System.out.println(
                   "\n=== PEDIDOS ==="
           );

           System.out.println(
                   "1. Listar"
           );

           System.out.println(
                   "2. Crear"
           );

           System.out.println(
                   "3. Agregar producto"
           );

           System.out.println(
                   "4. Eliminar producto"
           );

           System.out.println(
                    "5. Actualizar pedido"
            );

            System.out.println(
                    "6. Eliminar pedido"
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

                       pedidoService
                               .listarPedidos();

                       break;

                   case 2:

                       crear();

                       break;

                   case 3:

                       agregarProducto();

                       break;

                   case 4:

                       eliminarProducto();

                       break;

                   case 5:

                        actualizar();

                        break;

                    case 6:

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
    Crear pedido.
   */
   private void crear()

           throws Exception {

       System.out.print(
               "\nID usuario: "
       );

       Long idUsuario =
               teclado.nextLong();

       teclado.nextLine();

       Usuario usuario =
               usuarioService
               .buscarPorId(
                       idUsuario
               );

       Pedido pedido =
               new Pedido(

                       LocalDate.now(),

                       Estado.PENDIENTE,

                       FormaPago.EFECTIVO,

                       usuario
               );

       pedido.setId(

               (long)

               (pedidoService
               .getPedidos()
               .size()

               + 1)

       );

       pedidoService
               .agregarPedido(
                       pedido
               );

       System.out.println(
               "\nPedido creado."
       );
   }

   /*
    Agrega un producto.
   */
   private void agregarProducto()

           throws Exception {

       System.out.print(
               "\nID pedido: "
       );

       Long idPedido =
               teclado.nextLong();

       System.out.print(
               "ID producto: "
       );

       Long idProducto =
               teclado.nextLong();

       System.out.print(
               "Cantidad: "
       );

       int cantidad =
               teclado.nextInt();

       teclado.nextLine();

       Producto producto =
               productoService
               .buscarPorId(
                       idProducto
               );

       pedidoService
               .agregarProducto(

                       idPedido,

                       cantidad,

                       producto
               );

       System.out.println(
               "\nProducto agregado."
       );
   }

   /*
    Elimina un producto.
   */
   private void eliminarProducto()

           throws Exception {

       System.out.print(
               "\nID pedido: "
       );

       Long idPedido =
               teclado.nextLong();

       System.out.print(
               "ID producto: "
       );

       Long idProducto =
               teclado.nextLong();

       teclado.nextLine();

       Producto producto =
               productoService
               .buscarPorId(
                       idProducto
               );

       pedidoService
               .eliminarProducto(

                       idPedido,

                       producto
               );

       System.out.println(
               "\nProducto eliminado."
       );
   }
   
   /*
    Actualiza el estado y
    la forma de pago
    de un pedido.
   */
   private void actualizar()

           throws Exception {

       System.out.print(
               "\nID pedido: "
       );

       Long id =
               teclado.nextLong();

       teclado.nextLine();

       System.out.println(
               "\nEstados:"
       );

       System.out.println(
               "1. PENDIENTE"
       );

       System.out.println(
               "2. CONFIRMADO"
       );

       System.out.println(
               "3. TERMINADO"
       );

       System.out.println(
               "4. CANCELADO"
       );

       System.out.print(
               "\nSeleccione estado: "
       );

       int opcionEstado =
               teclado.nextInt();

       teclado.nextLine();

       Estado estado;

       switch (opcionEstado) {

           case 1:

               estado =
                       Estado.PENDIENTE;

               break;

           case 2:

               estado =
                       Estado.CONFIRMADO;

               break;

           case 3:

               estado =
                       Estado.TERMINADO;

               break;

           case 4:

               estado =
                       Estado.CANCELADO;

               break;

           default:

               System.out.println(
                       "\nEstado inválido."
               );

               return;
       }

       System.out.println(
               "\nFormas de pago:"
       );

       System.out.println(
               "1. EFECTIVO"
       );

       System.out.println(
               "2. TARJETA"
       );

       System.out.println(
               "3. TRANSFERENCIA"
       );

       System.out.print(
               "\nSeleccione forma de pago: "
       );

       int opcionPago =
               teclado.nextInt();

       teclado.nextLine();

       FormaPago formaPago;

       switch (opcionPago) {

           case 1:

               formaPago =
                       FormaPago.EFECTIVO;

               break;

           case 2:

               formaPago =
                       FormaPago.TARJETA;

               break;

           case 3:

               formaPago =
                       FormaPago.TRANSFERENCIA;

               break;

           default:

               System.out.println(
                       "\nForma de pago inválida."
               );

               return;
       }

       pedidoService
               .actualizarPedido(

                       id,

                       estado,

                       formaPago
               );

       System.out.println(
               "\nPedido actualizado."
       );
   }

   /*
    Baja lógica.
   */
   private void eliminar()

           throws Exception {

       System.out.print(
               "\nID pedido: "
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

       pedidoService
               .eliminarPedido(
                       id
               );

       System.out.println(
               "\nPedido eliminado."
       );
   }
    
}
