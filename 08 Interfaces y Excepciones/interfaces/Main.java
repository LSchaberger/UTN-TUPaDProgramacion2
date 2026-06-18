/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

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
        Main actúa como
        orquestador del sistema.
       */

       Cliente cliente =
               new Cliente(
                       "Leandro"
               );

       Pedido pedido =
               new Pedido(
                       cliente
               );

       Producto p1 =
               new Producto(
                       "Teclado",
                       15000
               );

       Producto p2 =
               new Producto(
                       "Mouse",
                       8000
               );

       pedido.agregarProducto(p1);

       pedido.agregarProducto(p2);

       pedido.mostrarPedido();

       pedido.cambiarEstado(
               "Enviado"
       );

       TarjetaCredito tarjeta =
               new TarjetaCredito();

       double total =
               pedido.calcularTotal();

       double totalConDescuento =
               tarjeta.aplicarDescuento(
                       total
               );

       tarjeta.procesarPago(
               totalConDescuento
       );
        
    }
    
}
