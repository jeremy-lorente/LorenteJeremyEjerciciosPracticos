package com.mycompany.ejercicio1.servicios;

import com.mycompany.ejercicio1.modelos.Directorio;

public class ExploradorDirectorios {

    public static void explorarDirectorios(Directorio directorio, int indice) {
        String indentacion = "  ".repeat(indice);
        System.out.println(indentacion + "Directorio: " + directorio.getNombre() + "/");

        for (String archivo : directorio.getArchivos()) {
            System.out.println(indentacion + " Archivo: " + archivo);
        }

        for (Directorio subdirectorio : directorio.getSubDirectorios()) {
            explorarDirectorios(subdirectorio, indice + 1);
        }

    }
}
