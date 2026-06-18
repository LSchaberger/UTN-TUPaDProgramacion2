/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author leodeveloper
 */
public class Pedido implements Pagable {
    
    /*
    Pedido compuesto
    por productos.
   */

   private ArrayList<Producto> productos;

   private Cliente cliente;

   private String estado;

   /*
    Constructor.
   */
   public Pedido(
           Cliente cliente) {

       this.cliente = cliente;

       productos = new ArrayList<>();

       estado = "Pendiente";
   }

   public void agregarProducto(
           Producto producto) {

       productos.add(producto);
   }

   @Override
   public double calcularTotal() {

       double total = 0;

       for (Producto p : productos) {

           total += p.calcularTotal();
       }

       return total;
   }

   /*
    Notifica cambios
    de estado.
   */
   public void cambiarEstado(
           String nuevoEstado) {

       estado = nuevoEstado;

       cliente.notificar(
               "Estado actualizado a: "
               + estado
       );
   }

   public void mostrarPedido() {

       System.out.println(
               "Total: $"
               + calcularTotal()
       );

       System.out.println(
               "Estado: "
               + estado
       );
   }
    
}
