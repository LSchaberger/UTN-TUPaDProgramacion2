package TP;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author leodeveloper
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 5;
        int b = 2;
        int resultado = a / b;
        
        
        /*
         *La variable resultado devuelve el valor 2 sin decimales
         *porque en los lenguajes derivados de C y C++, en este caso
         *Java es uno de ellos devuelve un entero, a no ser que hagamos
         *un Casteo Implícito: double resultadoDouble = (double) a / b;
         *y ahora sí da correctamente en decimal 2.5
         */
        
        System.out.println("Resultado: " + resultado);
    }
    
}
