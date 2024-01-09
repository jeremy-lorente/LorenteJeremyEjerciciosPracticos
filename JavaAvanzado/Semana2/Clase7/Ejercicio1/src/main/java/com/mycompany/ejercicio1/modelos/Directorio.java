package com.mycompany.ejercicio1.modelos;

import java.util.ArrayList;
import java.util.List;

public class Directorio {

    private String nombre;
    private List<Directorio> subDirectorios;
    private List<String> archivos;

    public Directorio() {
    }

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subDirectorios = new ArrayList<>();
        this.archivos =new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        this.subDirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        this.archivos.add(archivo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubDirectorios() {
        return subDirectorios;
    }

    public void setSubDirectorios(List<Directorio> subDirectorios) {
        this.subDirectorios = subDirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

}
