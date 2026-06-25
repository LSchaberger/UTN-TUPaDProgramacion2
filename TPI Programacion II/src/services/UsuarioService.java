/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import java.util.ArrayList;

import entities.Usuario;

import exceptions.EntidadNoEncontradaException;

import exceptions.MailDuplicadoException;

/**
 *
 * @author leodeveloper
 */
public class UsuarioService {
    
    /*
    Service encargado de la
    lógica de Usuarios.
   */

   private ArrayList<Usuario> usuarios;

   /*
    Constructor.
   */
   public UsuarioService() {

       usuarios = new ArrayList<>();
   }

   /*
    Devuelve la colección.
   */
   public ArrayList<Usuario>
           getUsuarios() {

       return usuarios;
   }

   /*
    Alta.
   */
   public void agregarUsuario(
           Usuario usuario)

           throws MailDuplicadoException {
       
       /*
        Valida que el mail
        no esté vacío.
       */

       if (usuario.getMail()
               .trim()
               .isEmpty()) {

           throw new IllegalArgumentException(
                   "El mail no puede estar vacío."
           );
       }

       for (Usuario u
               : usuarios) {

           if (!u.isEliminado()

                   &&

                   u.getMail()
                   .equalsIgnoreCase(
                           usuario.getMail()
                   )) {

               throw new MailDuplicadoException(
                       "El mail ya existe."
               );
           }
       }

       usuarios.add(
               usuario
       );
   }

   /*
    Listado.
   */
   public void listarUsuarios() {

       boolean existe = false;

       for (Usuario usuario
               : usuarios) {

           if (!usuario
                   .isEliminado()) {

               System.out.println(
                       usuario
               );

               existe = true;
           }
       }

       if (!existe) {

           System.out.println(
                   "No hay usuarios cargados."
           );
       }
   }

   /*
    Búsqueda por id.
   */
   public Usuario buscarPorId(
           Long id)

           throws EntidadNoEncontradaException {

       for (Usuario usuario
               : usuarios) {

           if (usuario.getId()
                   .equals(id)

                   &&

                   !usuario.isEliminado()) {

               return usuario;
           }
       }

       throw new EntidadNoEncontradaException(
               "Usuario inexistente."
       );
   }

   /*
    Modificación.
   */
   public void editarUsuario(

           Long id,

           String nombre,

           String apellido,

           String mail,

           String celular)

           throws EntidadNoEncontradaException,

           MailDuplicadoException {

       Usuario usuario =
               buscarPorId(id);
       
       /*
        Valida que el mail
        no esté vacío.
       */

       if (mail
               .trim()
               .isEmpty()) {

           throw new IllegalArgumentException(
                   "El mail no puede estar vacío."
           );
       }

       for (Usuario u
               : usuarios) {

           if (!u.equals(usuario)

                   &&

                   !u.isEliminado()

                   &&

                   u.getMail()
                   .equalsIgnoreCase(mail)) {

               throw new MailDuplicadoException(
                       "El mail ya existe."
               );
           }
       }

       usuario.setNombre(
               nombre
       );

       usuario.setApellido(
               apellido
       );

       usuario.setMail(
               mail
       );

       usuario.setCelular(
               celular
       );
   }

   /*
    Baja lógica.
   */
   public void eliminarUsuario(
           Long id)

           throws EntidadNoEncontradaException {

       Usuario usuario =
               buscarPorId(id);

       usuario.setEliminado(
               true
       );
   }
    
}
