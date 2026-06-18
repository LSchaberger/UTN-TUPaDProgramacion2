/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author leodeveloper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Main actúa como orquestador del sistema.

        Aquí se crean los objetos
        y se prueban las funcionalidades
        del inventario.
       */

       // Crear inventario
       Inventario inventario = new Inventario();

       /*
        Se crean productos de distintas categorías
        para probar filtros y búsquedas.
       */

       Producto p1 = new Producto(
               "P001",
               "Arroz",
               1500,
               20,
               CategoriaProducto.ALIMENTOS
       );

       Producto p2 = new Producto(
               "P002",
               "Notebook",
               250000,
               5,
               CategoriaProducto.ELECTRONICA
       );

       Producto p3 = new Producto(
               "P003",
               "Remera",
               12000,
               15,
               CategoriaProducto.ROPA
       );

       Producto p4 = new Producto(
               "P004",
               "Silla",
               30000,
               10,
               CategoriaProducto.HOGAR
       );

       Producto p5 = new Producto(
               "P005",
               "Televisor",
               450000,
               3,
               CategoriaProducto.ELECTRONICA
       );

       /*
        Agregación de productos
        al inventario.
       */

       inventario.agregarProducto(p1);
       inventario.agregarProducto(p2);
       inventario.agregarProducto(p3);
       inventario.agregarProducto(p4);
       inventario.agregarProducto(p5);

       System.out.println(
               "=== LISTA PRODUCTOS ==="
       );

       inventario.listarProductos();

       System.out.println(
               "\n=== BUSCAR PRODUCTO ==="
       );

       /*
        Búsqueda lineal por ID.
       */
       Producto buscado
               = inventario.buscarProductoPorId(
                       "P003"
               );

       /*
        Validación para evitar
        NullPointerException.
       */
       if (buscado != null) {

           buscado.mostrarInfo();
       }

       System.out.println(
               "\n=== FILTRAR ELECTRONICA ==="
       );

       inventario.filtrarPorCategoria(
               CategoriaProducto.ELECTRONICA
       );

       System.out.println(
               "\n=== ELIMINAR PRODUCTO ==="
       );

       inventario.eliminarProducto("P004");

       inventario.listarProductos();

       System.out.println(
               "\n=== ACTUALIZAR STOCK ==="
       );

       inventario.actualizarStock(
               "P001",
               50
       );

       inventario.listarProductos();

       System.out.println(
               "\n=== STOCK TOTAL ==="
       );

       System.out.println(
               inventario.obtenerTotalStock()
       );

       System.out.println(
               "\n=== MAYOR STOCK ==="
       );

       Producto mayor
               = inventario.obtenerProductoConMayorStock();

       if (mayor != null) {

           mayor.mostrarInfo();
       }

       System.out.println(
               "\n=== PRODUCTOS ENTRE 1000 Y 3000 ==="
       );

       inventario.filtrarProductosPorPrecio(
               1000,
               3000
       );

       System.out.println(
               "\n=== CATEGORIAS DISPONIBLES ==="
       );

       inventario.mostrarCategoriasDisponibles();
    }
    
}
