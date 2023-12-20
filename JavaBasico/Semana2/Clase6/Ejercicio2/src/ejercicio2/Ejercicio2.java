package ejercicio2;

import ejercicio2.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        Producto producto1 = new Producto(0, "Batidora", "generico", "Cocina", 99.0, 143.2, 3);
        Producto producto2 = new Producto(1, "Telefono", "generico2", "Tecnologico", 123.0, 400.89, 2);
        Producto producto3 = new Producto(2, "Laptop", "generico2", "Tecnologico", 213.0, 700.1, 5);
        Producto producto4 = new Producto(3, "Auriculares", "generico", "Tecnologico", 19.0, 53.5, 1);
        Producto producto5 = new Producto(4, "Cargador", "generico2", "Tecnologico", 99.0, 143.2, 8);
        Producto producto6 = new Producto(5, "Bicicleta", "generico2", "Deporte", 99.0, 143.2, 9);
        Producto producto7 = new Producto(6, "Tablet", "generico", "Tecnologico", 99.0, 143.2, 1);
        Producto producto8 = new Producto(7, "Telefono2", "generico", "Tecnologico", 999.0, 1999.2, 3);
        Producto producto9 = new Producto(8, "Tablet2", "generico2", "Tecnologico", 939.0, 1433.2, 15);
        Producto producto10 = new Producto(9, "Batidora2", "generico2", "Cocina", 123.0, 233.2, 6);

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);
        listaProductos.add(producto6);
        listaProductos.add(producto7);
        listaProductos.add(producto8);
        listaProductos.add(producto9);
        listaProductos.add(producto10);

        Producto mayorPrecioVenta = listaProductos.get(0);
        Producto menorPrecioVenta = listaProductos.get(0);
        Producto mayorStock = listaProductos.get(0);
        for (Producto producto : listaProductos) {
            if (producto.getPrecioVenta() > mayorPrecioVenta.getPrecioVenta()) {
                mayorPrecioVenta = producto;
            }
            if (producto.getPrecioCosto() < menorPrecioVenta.getPrecioCosto()) {
                menorPrecioVenta = producto;
            }
            if (producto.getCantidadStock() > mayorStock.getCantidadStock()) {
                mayorStock = producto;
            }

        }

        System.out.println("El producto con el mayor precio de venta es: " + mayorPrecioVenta.toString() );
        System.out.println("El producto con el menor precio de costo es: " + menorPrecioVenta.toString() + "\n");
        System.out.println("El producto que vamos a borrar es el de la posicion 5: " + listaProductos.get(5));
        listaProductos.remove(5);
        System.out.println("El producto actual en la posicion 5 es: " + listaProductos.get(5) + "\n");
        System.out.println("El producto con mayor numero de stock es: " + mayorStock);
        mayorStock.setCantidadStock(mayorStock.getCantidadStock()-3);
        listaProductos.set(listaProductos.indexOf(mayorStock),mayorStock);
        System.out.println("El producto con el stock actualizado queda asi: " + mayorStock );
        
        System.out.println("\n"); 
        
        
        System.out.println("Vuelvo a mostrar todos los objetos para que se vean las modificaciones \n");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
        
        
        
    }

}
