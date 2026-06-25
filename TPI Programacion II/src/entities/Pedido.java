/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDate;

import java.util.ArrayList;

import enums.Estado;

import enums.FormaPago;

import interfaces.Calculable;

/**
 *
 * @author leodeveloper
 */
public class Pedido extends Base implements Calculable {
    
    /*
    Pedido hereda de Base
    e implementa Calculable.

    Un pedido pertenece
    a un usuario y posee
    muchos detalles.
   */

   private LocalDate fecha;

   private Estado estado;

   private Double total;

   private FormaPago formaPago;

   private ArrayList<DetallePedido> detalles;

   private Usuario usuario;

   /*
    Constructor principal.
   */
   public Pedido(
           LocalDate fecha,
           Estado estado,
           FormaPago formaPago,
           Usuario usuario) {

       /*
        Invoca Base.
       */
       super();

       this.fecha = fecha;

       this.estado = estado;

       this.formaPago = formaPago;

       this.usuario = usuario;

       total = 0.0;

       detalles = new ArrayList<>();

       /*
        Relación bidireccional.
       */
       if (usuario != null) {

           usuario.agregarPedido(this);
       }
   }

   public LocalDate getFecha() {

       return fecha;
   }

   public void setFecha(
           LocalDate fecha) {

       this.fecha = fecha;
   }

   public Estado getEstado() {

       return estado;
   }

   public void setEstado(
           Estado estado) {

       this.estado = estado;
   }

   public Double getTotal() {

       return total;
   }

   public FormaPago getFormaPago() {

       return formaPago;
   }

   public void setFormaPago(
           FormaPago formaPago) {

       this.formaPago = formaPago;
   }

   public ArrayList<DetallePedido> getDetalles() {

       return detalles;
   }

   public Usuario getUsuario() {

       return usuario;
   }

   public void setUsuario(
           Usuario usuario) {

       this.usuario = usuario;
   }

   /*
    Agrega un detalle
    al pedido.
   */
   public void addDetallePedido(
           int cantidad,
           Producto producto) {

       DetallePedido detalle =
               new DetallePedido(
                       cantidad,
                       producto
               );

       detalles.add(detalle);

       calcularTotal();
   }

   /*
    Busca un detalle
    según el producto.
   */
   public DetallePedido
           findDetallePedidoByProducto(
                   Producto producto) {

       for (DetallePedido detalle
               : detalles) {

           if (detalle.getProducto()
                   .getId()
                   .equals(
                           producto.getId()
                   )) {

               return detalle;
           }
       }

       return null;
   }

   /*
    Elimina un detalle
    y recalcula.
   */
   public void
           deleteDetallePedidoByProducto(
                   Producto producto) {

       DetallePedido detalle =
               findDetallePedidoByProducto(
                       producto
               );

       if (detalle != null) {

           detalles.remove(
                   detalle
           );

           calcularTotal();
       }
   }

   /*
    Implementación
    de Calculable.
   */
   @Override
   public void calcularTotal() {

       total = 0.0;

       for (DetallePedido detalle
               : detalles) {

           total +=
                   detalle.getSubtotal();
       }
   }

   @Override
   public String toString() {

       return String.format(
               "Pedido [id=%d | fecha=%s | estado=%s | formaPago=%s | total=$%.2f]",
               getId(),
               fecha,
               estado,
               formaPago,
               total
       );
   }
    
}
