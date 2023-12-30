package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.excepciones.IngresoProductoException;
import com.mycompany.ejercicio2.modelos.Producto;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) throws IngresoProductoException {
        Scanner sc = new Scanner(System.in);
        Producto nuevoProducto = new Producto();
        while (true) {
            try {
                System.out.println("Ingrese el nombre del producto");
                nuevoProducto.setNombre(sc.nextLine());
                if (nuevoProducto.getNombre().trim().isEmpty()) {
                    throw new IngresoProductoException("Error al intentar ingresar el nombre del producto");
                }

                System.out.println("Ingrese el precio del producto");
                double precio = Double.parseDouble(sc.nextLine());
                if (precio <= 0 || Double.isNaN(precio)) {
                    throw new IngresoProductoException("Error al intentar ingresar el precio del producto");
                }
                nuevoProducto.setPrecio(precio);

                System.out.println("Ingrese la cantidad del producto");
                int cantidad = Integer.parseInt(sc.nextLine());
                if (cantidad <= 0) {
                    throw new IngresoProductoException("Error al intentar ingresar la cantidad del producto");
                }
                nuevoProducto.setCantidad(cantidad);

                break;

            } catch (IngresoProductoException i) {
                i.printStackTrace();
                System.out.println("Por favor, introduzca los datos nuevamente.");
            } catch (NumberFormatException n) {
                n.printStackTrace();
                System.out.println("Por favor introduzca los datos nuevametne");
            
            }
        }

    }

}
