package com.mycompany.ejercicio2.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea {

    private String nombre;
    private List<Tarea> subtareas;

    public Tarea() {
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void agregarSubtarea() {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el nombre de la subtarea:");
        
        Tarea subtareas = new Tarea(sc.nextLine());
        this.subtareas.add(subtareas);
    }

    public void mostrarTarea(int indice) {
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < indice; i++) {
            espacio.append("  ");
        }
        if (indice > 0) {
            System.out.println(espacio.toString() + "|--" + this.nombre);
        } else {
            System.out.println(espacio.toString() + "" + this.nombre);
        }

        for (Tarea subtarea : subtareas) {
            subtarea.mostrarTarea(indice + 1);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

}
