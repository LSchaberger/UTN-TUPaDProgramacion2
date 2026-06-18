/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
/**
 *
 * @author leodeveloper
 */
public class Inventario {
    

    /*
     Relación 1:N

     Un Inventario contiene muchos Productos.

     Se utiliza ArrayList porque la cantidad
     de productos es dinámica.
    */

    private ArrayList<Producto> productos;

    /*
     Constructor.

     Inicializa obligatoriamente
     la colección.
    */
    public Inventario() {

        productos = new ArrayList<>();
    }

    /*
     Agrega un producto al inventario.
    */
    public void agregarProducto(Producto p) {

        productos.add(p);
    }

    /*
     Recorre y muestra todos los productos.

     Se utiliza for-each para evitar
     errores de índices.
    */
    public void listarProductos() {

        for (Producto p : productos) {

            p.mostrarInfo();
        }
    }

    /*
     Búsqueda lineal por ID.

     Se utiliza equals() para comparar Strings.
    */
    public Producto buscarProductoPorId(String id) {

        for (Producto p : productos) {

            if (p.getId().equals(id)) {

                return p;
            }
        }

        /*
         Si no encuentra el producto,
         retorna null.
        */
        return null;
    }

    /*
     Elimina un producto por ID.
    */
    public void eliminarProducto(String id) {

        Producto eliminar
                = buscarProductoPorId(id);

        if (eliminar != null) {

            productos.remove(eliminar);

            System.out.println(
                    "Producto eliminado."
            );
        } else {

            System.out.println(
                    "Producto no encontrado."
            );
        }
    }

    /*
     Actualiza el stock de un producto.
    */
    public void actualizarStock(String id,
            int nuevaCantidad) {

        Producto producto
                = buscarProductoPorId(id);

        if (producto != null) {

            producto.setCantidad(nuevaCantidad);

            System.out.println(
                    "Stock actualizado."
            );
        } else {

            System.out.println(
                    "Producto no encontrado."
            );
        }
    }

    /*
     Filtra productos por categoría.
    */
    public void filtrarPorCategoria(
            CategoriaProducto categoria) {

        for (Producto p : productos) {

            /*
             Los enums se comparan con ==
            */
            if (p.getCategoria() == categoria) {

                p.mostrarInfo();
            }
        }
    }

    /*
     Patrón de acumulación.

     Calcula el stock total.
    */
    public int obtenerTotalStock() {

        int total = 0;

        for (Producto p : productos) {

            total += p.getCantidad();
        }

        return total;
    }

    /*
     Obtiene el producto con mayor stock.
    */
    public Producto obtenerProductoConMayorStock() {

        /*
         Validación importante
         para listas vacías.
        */
        if (productos.isEmpty()) {

            return null;
        }

        /*
         Se toma el primer producto
         como referencia inicial.
        */
        Producto mayor = productos.get(0);

        for (Producto p : productos) {

            if (p.getCantidad()
                    > mayor.getCantidad()) {

                mayor = p;
            }
        }

        return mayor;
    }

    /*
     Filtra productos por rango de precios.
    */
    public void filtrarProductosPorPrecio(
            double min,
            double max) {

        for (Producto p : productos) {

            if (p.getPrecio() >= min
                    && p.getPrecio() <= max) {

                p.mostrarInfo();
            }
        }
    }

    /*
     Muestra todas las categorías
     disponibles del enum.
    */
    public void mostrarCategoriasDisponibles() {

        for (CategoriaProducto c
                : CategoriaProducto.values()) {

            System.out.println(
                    c + " -> "
                    + c.getDescripcion()
            );
        }
    }
}
