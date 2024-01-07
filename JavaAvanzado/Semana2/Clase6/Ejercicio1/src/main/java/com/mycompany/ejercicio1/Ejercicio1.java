package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.modelos.Auto;
import com.mycompany.ejercicio1.servicios.InventarioAutos;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        InventarioAutos inventario = new InventarioAutos();
        
        inventario.agregarAuto(new Auto("Bmw", "320d", 2004, 2000.00));
        inventario.agregarAuto(new Auto("Bmw", "i4", 2023, 57.350));
        inventario.agregarAuto(new Auto("Porsche", "911", 2024, 141868.00));
        inventario.agregarAuto(new Auto("Opel", "Insignia", 2016, 16000.00));

        
        inventario.buscarAutoPorMarca("Bmw");
        
        inventario.calcularValorTotalInventario();
        
    }
}
