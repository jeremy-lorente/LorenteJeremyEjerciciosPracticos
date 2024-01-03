package com.mycompany.ejercicio2.modelos;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    private String nombre;
    private LocalDate fecha;
    private String categoria;

}
