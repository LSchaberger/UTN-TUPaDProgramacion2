/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDateTime;

/**
 *
 * @author leodeveloper
 */
public abstract class Base {
    
    /*
    Clase abstracta padre.

    Todas las entidades
    heredan de Base.

    Centralizamos atributos
    comunes para evitar
    duplicar código.
   */

   private Long id;

   private boolean eliminado;

   private LocalDateTime createdAt;

   /*
    Constructor por defecto.
   */
   public Base() {

       eliminado = false;

       createdAt = LocalDateTime.now();
   }

   public Long getId() {

       return id;
   }

   public void setId(Long id) {

       this.id = id;
   }

   public boolean isEliminado() {

       return eliminado;
   }

   public void setEliminado(
           boolean eliminado) {

       this.eliminado = eliminado;
   }

   public LocalDateTime getCreatedAt() {

       return createdAt;
   }

   public void setCreatedAt(
           LocalDateTime createdAt) {

       this.createdAt = createdAt;
   }

   /*
    Obligamos a las subclases
    a implementar toString().
   */
   @Override
   public abstract String toString();
    
}
