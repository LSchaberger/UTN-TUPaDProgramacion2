/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author leodeveloper
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        if (idGallina >= 0) {
            this.idGallina = idGallina;
        } else {
            System.out.println("Error: id inválido");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: la edad no puede ser negativa");
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("Error: cantidad inválida");
        }
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " - Edad: " + edad + " - Huevos: " + huevosPuestos);
    }
}
