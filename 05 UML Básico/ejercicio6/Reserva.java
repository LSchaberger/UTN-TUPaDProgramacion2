/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author leodeveloper
 */
public class Reserva {
    
    /*
    Asociación unidireccional:
    Reserva conoce a Cliente,
    pero Cliente no conoce a Reserva.

    Agregación:
    Reserva tiene una Mesa,
    pero Mesa puede existir separadamente.
   */

   private String fecha;
   private String hora;

   // Asociación unidireccional
   private Cliente cliente;

   // Agregación
   private Mesa mesa;

   public Reserva(String fecha,
                  String hora,
                  Cliente cliente,
                  Mesa mesa) {

       this.fecha = fecha;
       this.hora = hora;

       this.cliente = cliente;

       // La mesa llega creada
       // Esto representa agregación
       this.mesa = mesa;
   }

   public String getFecha() {
       return fecha;
   }

   public String getHora() {
       return hora;
   }

   public Cliente getCliente() {
       return cliente;
   }

   public Mesa getMesa() {
       return mesa;
   }

   public String toString() {
       return "Reserva{" +
               "fecha='" + fecha + '\'' +
               ", hora='" + hora + '\'' +
               ", cliente=" + cliente +
               ", mesa=" + mesa +
               '}';
   }
}
