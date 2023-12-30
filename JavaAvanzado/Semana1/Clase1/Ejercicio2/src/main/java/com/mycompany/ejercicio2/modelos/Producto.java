package com.mycompany.ejercicio2.modelos;

import com.mycompany.ejercicio2.excepciones.IngresoProductoException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    private String nombre;
    private Double precio;
    private int cantidad;

    public void ingresarProducto(String nombre, Double precio, int cantidad) throws IngresoProductoException {
        if (nombre == null || nombre.trim().isBlank()) {
            throw new IngresoProductoException("Falta el nombre del producto");
        }
        if (precio == null || precio <= 0) {
            throw new IngresoProductoException("Falta el precio del producto");
        }
        if (cantidad <= 0) {
            throw new IngresoProductoException("Falta el precio del producto");
        }
    }
}
