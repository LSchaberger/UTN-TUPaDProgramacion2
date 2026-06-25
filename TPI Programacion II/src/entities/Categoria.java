/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author leodeveloper
 */
public class Categoria extends Base {
    
    /*
    Categoria hereda de Base.

    Una categoria puede
    contener muchos productos.
   */

   private String nombre;

   private String descripcion;

   private ArrayList<Producto> productos;

   /*
    Constructor principal.
   */
   public Categoria(
           String nombre,
           String descripcion) {

       /*
        Invoca Base.
       */
       super();

       this.nombre = nombre;

       this.descripcion = descripcion;

       productos = new ArrayList<>();
   }

   public String getNombre() {

       return nombre;
   }

   public void setNombre(
           String nombre) {

       this.nombre = nombre;
   }

   public String getDescripcion() {

       return descripcion;
   }

   public void setDescripcion(
           String descripcion) {

       this.descripcion = descripcion;
   }

   public ArrayList<Producto> getProductos() {

       return productos;
   }

   /*
    Agrega un producto
    a la categoría.
   */
   public void agregarProducto(
           Producto producto) {

       if (producto != null
               && !productos.contains(producto)) {

           productos.add(producto);
       }
   }

   @Override
   public String toString() {

       return String.format(
               "Categoria [id=%d | nombre=%s | descripcion=%s]",
               getId(),
               nombre,
               descripcion
        );
    }
    
}
