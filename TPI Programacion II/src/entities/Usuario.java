/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

import enums.Rol;

/**
 *
 * @author leodeveloper
 */
public class Usuario extends Base {
    
    /*
    Usuario hereda de Base.

    Un usuario puede
    tener muchos pedidos.
   */

   private String nombre;

   private String apellido;

   private String mail;

   private String celular;

   private String contrasenia;

   private Rol rol;

   private ArrayList<Pedido> pedidos;

   /*
    Constructor principal.
   */
   public Usuario(
           String nombre,
           String apellido,
           String mail,
           String celular,
           String contrasenia,
           Rol rol) {

       /*
        Invoca Base.
       */
       super();

       this.nombre = nombre;

       this.apellido = apellido;

       this.mail = mail;

       this.celular = celular;

       this.contrasenia = contrasenia;

       this.rol = rol;

       pedidos = new ArrayList<>();
   }

   public String getNombre() {

       return nombre;
   }

   public void setNombre(
           String nombre) {

       this.nombre = nombre;
   }

   public String getApellido() {

       return apellido;
   }

   public void setApellido(
           String apellido) {

       this.apellido = apellido;
   }

   public String getMail() {

       return mail;
   }

   public void setMail(
           String mail) {

       this.mail = mail;
   }

   public String getCelular() {

       return celular;
   }

   public void setCelular(
           String celular) {

       this.celular = celular;
   }

   public String getContrasenia() {

       return contrasenia;
   }

   public void setContrasenia(
           String contrasenia) {

       this.contrasenia = contrasenia;
   }

   public Rol getRol() {

       return rol;
   }

   public void setRol(
           Rol rol) {

       this.rol = rol;
   }

   public ArrayList<Pedido> getPedidos() {

       return pedidos;
   }

   /*
    Agrega un pedido.

    Relación bidireccional.
   */
   public void agregarPedido(
           Pedido pedido) {

       if (pedido != null
               && !pedidos.contains(pedido)) {

           pedidos.add(pedido);
       }
   }

   @Override
   public String toString() {

       return String.format(
               "Usuario [id=%d | %s %s | mail=%s | rol=%s]",
               getId(),
               nombre,
               apellido,
               mail,
               rol
       );
   }
    
}
