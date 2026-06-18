/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author leodeveloper
 */
public class Celular {
    
    /*
    Agregación:
    Celular tiene una Batería,
    pero la Batería puede existir por separado.

    Asociación bidireccional:
    Celular conoce a Usuario
    y Usuario conoce a Celular.
   */

   private String imei;
   private String marca;
   private String modelo;

   // Agregación
   private Bateria bateria;

   // Asociación bidireccional
   private Usuario usuario;

   public Celular(String imei, String marca,
                   String modelo, Bateria bateria) {

       this.imei = imei;
       this.marca = marca;
       this.modelo = modelo;

       // La batería llega ya creada
       // Esto representa agregación
       this.bateria = bateria;
   }

   public void setUsuario(Usuario usuario) {
       this.usuario = usuario;
   }

   public String getImei() {
       return imei;
   }

   public String getMarca() {
       return marca;
   }

   public String getModelo() {
       return modelo;
   }

   public Bateria getBateria() {
       return bateria;
   }

   public Usuario getUsuario() {
       return usuario;
   }

   public String toString() {
       return "Celular{" +
               "imei='" + imei + '\'' +
               ", marca='" + marca + '\'' +
               ", modelo='" + modelo + '\'' +
               ", bateria=" + bateria +
               ", usuario=" + usuario +
               '}';
   }
}
