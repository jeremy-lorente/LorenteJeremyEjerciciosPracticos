package com.mycompany.ejercicio1.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    
    private String nombre;
    private Double salario;
    private String categoria;

}
