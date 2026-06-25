/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


/**
 *
 * @author leodeveloper
 */
public class Producto extends Base {
    
    /*
    Producto hereda de Base.

    Cada producto pertenece
    a una única categoría.
   */

   private String nombre;

   private Double precio;

   private String descripcion;

   private int stock;

   private String imagen;

   private boolean disponible;

   private Categoria categoria;

   /*
    Constructor principal.
   */
   public Producto(
           String nombre,
           Double precio,
           String descripcion,
           int stock,
           String imagen,
           boolean disponible,
           Categoria categoria) {

       /*
        Invoca Base.
       */
       super();

       this.nombre = nombre;

       this.precio = precio;

       this.descripcion = descripcion;

       this.stock = stock;

       this.imagen = imagen;

       this.disponible = disponible;

       this.categoria = categoria;

       /*
        Relación bidireccional.
       */
       if (categoria != null) {

           categoria.agregarProducto(
                   this
           );
       }
   }

   public String getNombre() {

       return nombre;
   }

   public void setNombre(
           String nombre) {

       this.nombre = nombre;
   }

   public Double getPrecio() {

       return precio;
   }

   public void setPrecio(
           Double precio) {

       this.precio = precio;
   }

   public String getDescripcion() {

       return descripcion;
   }

   public void setDescripcion(
           String descripcion) {

       this.descripcion = descripcion;
   }

   public int getStock() {

       return stock;
   }

   public void setStock(
           int stock) {

       this.stock = stock;
   }

   public String getImagen() {

       return imagen;
   }

   public void setImagen(
           String imagen) {

       this.imagen = imagen;
   }

   public boolean isDisponible() {

       return disponible;
   }

   public void setDisponible(
           boolean disponible) {

       this.disponible = disponible;
   }

   public Categoria getCategoria() {

       return categoria;
   }

   public void setCategoria(
           Categoria categoria) {

       this.categoria = categoria;
   }

   @Override
   public String toString() {

       return String.format(
               "Producto [id=%d | nombre=%s | precio=$%.2f | stock=%d | categoria=%s]",
               getId(),
               nombre,
               precio,
               stock,
               categoria.getNombre()
       );
   }
    
}
