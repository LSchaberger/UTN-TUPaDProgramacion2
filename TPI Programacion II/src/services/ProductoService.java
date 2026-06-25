/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import java.util.ArrayList;

import entities.Categoria;

import entities.Producto;

import exceptions.DatoInvalidoException;

import exceptions.EntidadNoEncontradaException;

/**
 *
 * @author leodeveloper
 */
public class ProductoService {
    
    /*
    Service encargado de la
    lógica de Productos.
   */

   private ArrayList<Producto> productos;

   /*
    Constructor.
   */
   public ProductoService() {

       productos = new ArrayList<>();
   }

   /*
    Devuelve la colección.
   */
   public ArrayList<Producto>
           getProductos() {

       return productos;
   }

   /*
    Alta.
   */
   public void agregarProducto(
           Producto producto)

           throws DatoInvalidoException {

       if (producto.getPrecio() < 0) {

           throw new DatoInvalidoException(
                   "Precio inválido."
           );
       }

       if (producto.getStock() < 0) {

           throw new DatoInvalidoException(
                   "Stock inválido."
           );
       }

       if (producto.getCategoria()
               == null) {

           throw new DatoInvalidoException(
                   "Categoría inexistente."
           );
       }

       productos.add(
               producto
       );
   }

   /*
    Listado.
   */
   public void listarProductos() {

       boolean existe = false;

       for (Producto producto
               : productos) {

           if (!producto
                   .isEliminado()) {

               System.out.println(
                       producto
               );

               existe = true;
           }
       }

       if (!existe) {

           System.out.println(
                   "No hay productos cargados."
           );
       }
   }

   /*
    Búsqueda por id.
   */
   public Producto buscarPorId(
           Long id)

           throws EntidadNoEncontradaException {

       for (Producto producto
               : productos) {

           if (producto.getId()
                   .equals(id)

                   &&

                   !producto.isEliminado()) {

               return producto;
           }
       }

       throw new EntidadNoEncontradaException(
               "Producto inexistente."
       );
   }

   /*
    Modificación.
   */
   public void editarProducto(

           Long id,

           String nombre,

           Double precio,

           int stock,

           Categoria categoria)

           throws EntidadNoEncontradaException,

           DatoInvalidoException {

       Producto producto =
               buscarPorId(id);

       if (precio < 0) {

           throw new DatoInvalidoException(
                   "Precio inválido."
           );
       }

       if (stock < 0) {

           throw new DatoInvalidoException(
                   "Stock inválido."
           );
       }
       
       if (categoria == null) {

            throw new DatoInvalidoException(
                    "Categoría inexistente."
            );
        }

       producto.setNombre(
               nombre
       );

       producto.setPrecio(
               precio
       );

       producto.setStock(
               stock
       );

       producto.setCategoria(
               categoria
       );
   }

   /*
    Baja lógica.
   */
   public void eliminarProducto(
           Long id)

           throws EntidadNoEncontradaException {

       Producto producto =
               buscarPorId(id);

       producto.setEliminado(
               true
       );
   }
    
}
