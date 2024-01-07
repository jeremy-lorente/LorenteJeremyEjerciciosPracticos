package com.mycompany.ejercicio1.servicios;

import com.mycompany.ejercicio1.modelos.Auto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventarioAutos<A extends Auto> {
    
    private List<A> listaAutos = new ArrayList<>();
    
    public void agregarAuto(A auto) {
        listaAutos.add(auto);
        System.out.println("Auto agregado al inventario: " + auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño() + " " + auto.getPrecio());
    }
    
    public void buscarAutoPorMarca(String marca) {
        List<A> autosEncontrados = listaAutos.stream()
                .filter(auto -> auto.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());
        
        autosEncontrados.forEach(System.out::println);
    }
    
    public void calcularValorTotalInventario() {
        double valorInventario = listaAutos.stream().mapToDouble(A::getPrecio).sum();
        
        System.out.println("VAlor total del inventario: " + valorInventario);
    }
    
}
