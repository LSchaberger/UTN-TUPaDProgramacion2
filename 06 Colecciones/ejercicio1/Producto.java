/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author leodeveloper
 */
public class Producto {
    
    /*
    Clase que representa un producto
    dentro del inventario.
   */

   private String id;
   private String nombre;
   private double precio;
   private int cantidad;
   private CategoriaProducto categoria;

   /*
    Constructor principal.
   */
   public Producto(String id,
           String nombre,
           double precio,
           int cantidad,
           CategoriaProducto categoria) {

       this.id = id;
       this.nombre = nombre;
       this.precio = precio;
       this.cantidad = cantidad;
       this.categoria = categoria;
   }

   public String getId() {

       return id;
   }

   public String getNombre() {

       return nombre;
   }

   public double getPrecio() {

       return precio;
   }

   public int getCantidad() {

       return cantidad;
   }

   public CategoriaProducto getCategoria() {

       return categoria;
   }

   /*
    Permite actualizar el stock.
   */
   public void setCantidad(int cantidad) {

       this.cantidad = cantidad;
   }

   /*
    Muestra la información del producto.
   */
   public void mostrarInfo() {

       System.out.println(toString());
   }

   /*
    Representación textual del objeto.
   */
   @Override
   public String toString() {

       return "ID: " + id
               + " | Nombre: " + nombre
               + " | Precio: $" + precio
               + " | Cantidad: " + cantidad
               + " | Categoria: " + categoria
               + " | Descripcion: "
               + categoria.getDescripcion();
   }
}
