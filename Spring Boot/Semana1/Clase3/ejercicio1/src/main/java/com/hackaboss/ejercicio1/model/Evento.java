package com.hackaboss.ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    private static int contadorId = 1;

    private int id;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String hora;
    private String lugar;
    private String ponente;

    public Evento(String titulo, String descripcion, String fecha, String hora, String lugar, String ponente) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ponente = ponente;
    }

}
