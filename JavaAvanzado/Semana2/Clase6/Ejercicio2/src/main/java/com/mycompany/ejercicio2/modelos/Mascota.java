package com.mycompany.ejercicio2.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mascota<M> {

    private static int contadorId = 0;
    private int id;
    private String nombre;
    private int edad;
    private M especie;

    public Mascota(String nombre, int edad, M especie) {
        
        this.id = contadorId++;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    
}
