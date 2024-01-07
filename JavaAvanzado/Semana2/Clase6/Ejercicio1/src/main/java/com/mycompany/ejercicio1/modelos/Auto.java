package com.mycompany.ejercicio1.modelos;

import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auto {

    private String marca;
    private String modelo;
    private int año;
    private double precio;
}
