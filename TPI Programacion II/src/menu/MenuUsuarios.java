/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;


import java.util.Scanner;

import entities.Usuario;

import enums.Rol;

import services.UsuarioService;

/**
 *
 * @author leodeveloper
 */
public class MenuUsuarios {
    
    /*
    Menú encargado de la
    gestión de usuarios.
   */

   private UsuarioService usuarioService;

   private Scanner teclado;

   /*
    Constructor.
   */
   public MenuUsuarios(
           UsuarioService usuarioService) {

       this.usuarioService =
               usuarioService;

       teclado = new Scanner(
               System.in
       );
   }

   /*
    Ejecuta el submenú.
   */
   public void ejecutar() {

       int opcion;

       do {

           System.out.println(
                   "\n=== USUARIOS ==="
           );

           System.out.println(
                   "1. Listar"
           );

           System.out.println(
                   "2. Crear"
           );

           System.out.println(
                   "3. Editar"
           );

           System.out.println(
                   "4. Eliminar"
           );

           System.out.println(
                   "0. Volver"
           );

           System.out.print(
                    "Seleccione: "
            );

            if (teclado.hasNextInt()) {

                opcion =
                        teclado.nextInt();

                teclado.nextLine();

            } else {

                System.out.println(
                        "\nError: Debe ingresar un número.\n"
                );

                teclado.nextLine();

                opcion = -1;
            }

           try {

               switch (opcion) {

                   case 1:

                       usuarioService
                               .listarUsuarios();

                       break;

                   case 2:

                       crear();

                       break;

                   case 3:

                       editar();

                       break;

                   case 4:

                       eliminar();

                       break;

                   case 0:

                       break;

                   default:

                       System.out.println(
                               "\nOpción inválida."
                       );
               }

           } catch (Exception e) {

               System.out.println(
                       e.getMessage()
               );
           }

       } while (opcion != 0);
   }

   /*
    Crear usuario.
   */
   private void crear()

           throws Exception {

       System.out.print(
               "\nNombre: "
       );

       String nombre =
               teclado.nextLine();

       System.out.print(
               "Apellido: "
       );

       String apellido =
               teclado.nextLine();

       System.out.print(
               "Mail: "
       );

       String mail =
               teclado.nextLine();

       System.out.print(
               "Celular: "
       );

       String celular =
               teclado.nextLine();

       System.out.print(
               "Contraseña: "
       );

       String contrasenia =
               teclado.nextLine();

       Usuario usuario =
               new Usuario(

                       nombre,

                       apellido,

                       mail,

                       celular,

                       contrasenia,

                       Rol.USUARIO
               );

       usuario.setId(

               (long)

               (usuarioService
               .getUsuarios()
               .size()

               + 1)

       );

       usuarioService
               .agregarUsuario(
                       usuario
               );

       System.out.println(
               "\nUsuario creado."
       );
   }

   /*
    Editar usuario.
   */
   private void editar()

           throws Exception {

       System.out.print(
               "\nID usuario: "
       );

       Long id =
               teclado.nextLong();

       teclado.nextLine();

       System.out.print(
               "Nombre: "
       );

       String nombre =
               teclado.nextLine();

       System.out.print(
               "Apellido: "
       );

       String apellido =
               teclado.nextLine();

       System.out.print(
               "Mail: "
       );

       String mail =
               teclado.nextLine();

       System.out.print(
               "Celular: "
       );

       String celular =
               teclado.nextLine();

       usuarioService
               .editarUsuario(

                       id,

                       nombre,

                       apellido,

                       mail,

                       celular
               );

       System.out.println(
               "\nUsuario modificado."
       );
   }

   /*
    Baja lógica.
   */
   private void eliminar()

           throws Exception {

       System.out.print(
               "\nID usuario: "
       );

       Long id =
               teclado.nextLong();

       teclado.nextLine();
       
       /*
        Solicita confirmación
        antes de eliminar.
       */

       System.out.print(
               "¿Confirma la eliminación? (S/N): "
       );

       String respuesta =
               teclado.nextLine();

       if (!respuesta
               .equalsIgnoreCase("S")) {

           System.out.println(
                   "\nOperación cancelada."
           );

           return;
       }

       usuarioService
               .eliminarUsuario(
                       id
               );

       System.out.println(
               "\nUsuario eliminado."
       );
   }
    
}
