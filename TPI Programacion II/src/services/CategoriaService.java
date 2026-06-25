/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import java.util.ArrayList;

import entities.Categoria;

import exceptions.DatoInvalidoException;

import exceptions.EntidadNoEncontradaException;

/**
 *
 * @author leodeveloper
 */
public class CategoriaService {
    
    /*
    Service encargado de la
    lógica de Categorías.
   */

   private ArrayList<Categoria> categorias;

   /*
    Constructor.
   */
   public CategoriaService() {

       categorias = new ArrayList<>();
   }

   /*
    Devuelve la colección.
   */
   public ArrayList<Categoria>
           getCategorias() {

       return categorias;
   }

   /*
    Alta.
   */
   public void agregarCategoria(
           Categoria categoria)

           throws DatoInvalidoException {

       if (categoria.getNombre()
               .trim()
               .isEmpty()) {

           throw new DatoInvalidoException(
                   "El nombre no puede estar vacío."
           );
       }

       for (Categoria c
               : categorias) {

           if (!c.isEliminado()

                   &&

                   c.getNombre()
                   .equalsIgnoreCase(
                           categoria.getNombre()
                   )) {

               throw new DatoInvalidoException(
                       "La categoría ya existe."
               );
           }
       }

       categorias.add(
               categoria
       );
   }

   /*
    Listado.
   */
   public void listarCategorias() {

       boolean existe = false;

       for (Categoria categoria
               : categorias) {

           if (!categoria
                   .isEliminado()) {

               System.out.println(
                       categoria
               );

               existe = true;
           }
       }

       if (!existe) {

           System.out.println(
                   "No hay categorías cargadas."
           );
       }
   }

   /*
    Búsqueda por id.
   */
   public Categoria buscarPorId(
           Long id)

           throws EntidadNoEncontradaException {

       for (Categoria categoria
               : categorias) {

           if (categoria.getId()
                   .equals(id)

                   &&

                   !categoria.isEliminado()) {

               return categoria;
           }
       }

       throw new EntidadNoEncontradaException(
               "Categoría inexistente."
       );
   }

   /*
    Modificación.
   */
   public void editarCategoria(

           Long id,

           String nombre,

           String descripcion)

           throws EntidadNoEncontradaException,

           DatoInvalidoException {

       Categoria categoria =
               buscarPorId(id);

       if (nombre
               .trim()
               .isEmpty()) {

           throw new DatoInvalidoException(
                   "El nombre no puede estar vacío."
           );
       }

       for (Categoria c
               : categorias) {

           if (!c.equals(categoria)

                   &&

                   !c.isEliminado()

                   &&

                   c.getNombre()
                   .equalsIgnoreCase(
                           nombre
                   )) {

               throw new DatoInvalidoException(
                       "La categoría ya existe."
               );
           }
       }

       categoria.setNombre(
               nombre
       );

       categoria.setDescripcion(
               descripcion
       );
   }

   /*
    Baja lógica.
   */
   public void eliminarCategoria(
           Long id)

           throws EntidadNoEncontradaException {

       Categoria categoria =
               buscarPorId(id);

       categoria.setEliminado(
               true
       );
   }
    
}
