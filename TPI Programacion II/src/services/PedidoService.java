/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import java.util.ArrayList;

import entities.Pedido;

import entities.Producto;

import enums.Estado;

import enums.FormaPago;

import exceptions.DatoInvalidoException;

import exceptions.EntidadNoEncontradaException;

/**
 *
 * @author leodeveloper
 */
public class PedidoService {
    
    /*
    Service encargado de la
    lógica de Pedidos.
   */

   private ArrayList<Pedido> pedidos;

   /*
    Constructor.
   */
   public PedidoService() {

       pedidos = new ArrayList<>();
   }

   /*
    Devuelve la colección.
   */
   public ArrayList<Pedido>
           getPedidos() {

       return pedidos;
   }

   /*
    Alta.
   */
   public void agregarPedido(
           Pedido pedido)

           throws DatoInvalidoException {
           
       if (pedido.getUsuario()
               == null || pedido.getUsuario() .isEliminado()) {

           throw new DatoInvalidoException(
                   "Usuario inválido."
           );
       }

       pedidos.add(
               pedido
       );
   }

   /*
    Listado.
   */
   public void listarPedidos() {

       boolean existe = false;

       for (Pedido pedido
               : pedidos) {

           if (!pedido
                   .isEliminado()) {

               System.out.println(
                       pedido
               );

               existe = true;
           }
       }

       if (!existe) {

           System.out.println(
                   "No hay pedidos cargados."
           );
       }
   }

   /*
    Búsqueda por id.
   */
   public Pedido buscarPorId(
           Long id)

           throws EntidadNoEncontradaException {

       for (Pedido pedido
               : pedidos) {

           if (pedido.getId()
                   .equals(id)

                   &&

                   !pedido.isEliminado()) {

               return pedido;
           }
       }

       throw new EntidadNoEncontradaException(
               "Pedido inexistente."
       );
   }

   /*
    Agrega un producto.
   */
   public void agregarProducto(

           Long idPedido,

           int cantidad,

           Producto producto)

           throws EntidadNoEncontradaException, DatoInvalidoException {
       
       if (cantidad <= 0) {

            throw new DatoInvalidoException(
                    "La cantidad debe ser mayor a cero."
            );
        }
       
       if (producto.isEliminado()) {

            throw new DatoInvalidoException(
                    "El producto fue eliminado."
            );
        }

        if (producto.getCategoria().isEliminado()) {

            throw new DatoInvalidoException(
                    "La categoría del producto fue eliminada."
            );
        }

       Pedido pedido =
               buscarPorId(
                       idPedido
               );

       pedido.addDetallePedido(
               cantidad,

               producto
       );
   }

   /*
    Elimina un producto.
   */
   public void eliminarProducto(

           Long idPedido,

           Producto producto)

           throws EntidadNoEncontradaException {

       Pedido pedido =
               buscarPorId(
                       idPedido
               );

       pedido.deleteDetallePedidoByProducto(
               producto
       );
   }
   
   /*
    Actualiza el estado y
    la forma de pago
    de un pedido.
   */
   public void actualizarPedido(

           Long id,

           Estado estado,

           FormaPago formaPago)

           throws EntidadNoEncontradaException {

       Pedido pedido =

               buscarPorId(
                       id
               );

       pedido.setEstado(
               estado
       );

       pedido.setFormaPago(
               formaPago
       );
   }

   /*
    Baja lógica.
   */
   public void eliminarPedido(
           Long id)

           throws EntidadNoEncontradaException {

       Pedido pedido =
               buscarPorId(
                       id
               );

       pedido.setEliminado(
               true
       );
   }
    
}
