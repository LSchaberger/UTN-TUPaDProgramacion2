/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author leodeveloper
 */
public class DetallePedido extends Base {
    
    /*
    DetallePedido hereda de Base.

    Representa una línea
    dentro de un pedido.
   */

   private int cantidad;

   private Double subtotal;

   private Producto producto;

   /*
    Constructor principal.
   */
   public DetallePedido(
           int cantidad,
           Producto producto) {

       /*
        Invoca Base.
       */
       super();

       this.cantidad = cantidad;

       this.producto = producto;

       /*
        Calcula el subtotal
        automáticamente.
       */
       subtotal = calcularSubtotal();
   }

   public int getCantidad() {

       return cantidad;
   }

   public void setCantidad(
           int cantidad) {

       this.cantidad = cantidad;

       /*
        Recalcular subtotal.
       */
       subtotal = calcularSubtotal();
   }

   public Double getSubtotal() {

       return subtotal;
   }

   public Producto getProducto() {

       return producto;
   }

   public void setProducto(
           Producto producto) {

       this.producto = producto;

       /*
        Recalcular subtotal.
       */
       subtotal = calcularSubtotal();
   }

   /*
    Calcula:

    cantidad x precio.
   */
   private Double calcularSubtotal() {

       if (producto == null) {

           return 0.0;
       }

       return cantidad
               * producto.getPrecio();
   }

   @Override
   public String toString() {

       return String.format(
               "DetallePedido [id=%d | %s x %d => Subtotal: $%.2f]",
               getId(),
               producto.getNombre(),
               cantidad,
               subtotal
       );
   }
    
}
