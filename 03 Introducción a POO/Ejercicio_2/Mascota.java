/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author leodeveloper
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("\nError: nombre vacío");
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (!especie.isEmpty()) {
            this.especie = especie;
        } else {
            System.out.println("\nError: especie vacía");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("\nError: la edad no puede ser negativa");
        }
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años");
    }

    public void mostrarInfo() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
}
