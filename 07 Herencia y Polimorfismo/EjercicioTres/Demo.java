/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioTres;

/**
 *
 * @author leodeveloper
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Upcasting.

        Todos los objetos son almacenados
        como Empleado.
       */

       Empleado[] empleados = {
           new EmpleadoPlanta(
                   "Juan Perez",
                   850000
           ),
           new EmpleadoTemporal(
                   "Ana Gomez",
                   120,
                   4500
           ),
           new EmpleadoPlanta(
                   "Carlos Ruiz",
                   920000
           ),
           new EmpleadoTemporal(
                   "Maria Lopez",
                   80,
                   5000
           )
       };

       System.out.println(
               "=== LISTA EMPLEADOS ==="
       );

       /*
        Polimorfismo.

        Java ejecuta la versión correcta
        de calcularSueldo().
       */
       for (Empleado empleado : empleados) {

           System.out.println(
                   empleado.getNombre()
                   + " -> $"
                   + empleado.calcularSueldo()
           );
       }

       System.out.println(
               "\n=== CLASIFICACION ==="
       );

       /*
        Uso de instanceof.

        Permite conocer el tipo real
        del objeto en memoria.
       */
       for (Empleado empleado : empleados) {

           if (empleado instanceof EmpleadoPlanta) {

               System.out.println(
                       empleado.getNombre()
                       + " es Empleado de Planta"
               );

           } else if (empleado instanceof EmpleadoTemporal) {

               System.out.println(
                       empleado.getNombre()
                       + " es Empleado Temporal"
               );
           }
       }
    }
    
}
