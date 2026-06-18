/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author leodeveloper
 */
public enum CategoriaProducto {
    
    /*
    Enum que representa las categorías
    posibles para los productos.

    Los enums permiten evitar Strings mágicos
    y mejoran la seguridad de tipos.
    */

    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    /*
     Descripción asociada
     a cada categoría.
    */
    private final String descripcion;

    /*
     Constructor privado del enum.
    */
    CategoriaProducto(String descripcion) {

        this.descripcion = descripcion;
    }

    public String getDescripcion() {

        return descripcion;
    }
}
