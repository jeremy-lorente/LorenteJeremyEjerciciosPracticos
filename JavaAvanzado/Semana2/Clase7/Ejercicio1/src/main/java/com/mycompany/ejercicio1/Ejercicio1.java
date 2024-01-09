package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.modelos.Directorio;
import com.mycompany.ejercicio1.servicios.ExploradorDirectorios;

public class Ejercicio1 {

    public static void main(String[] args) {
     
        
        Directorio raiz = new Directorio("BootCamp");
        Directorio javaBasico = new Directorio("JavaBasico");
        Directorio javaAvanzado = new Directorio("JavaAvanzado");
        Directorio semana1 = new Directorio("Semana1");
        Directorio semana2 = new Directorio("Semana2");

        raiz.agregarSubdirectorio(javaBasico);
        raiz.agregarSubdirectorio(javaAvanzado);
        javaBasico.agregarSubdirectorio(semana1);
        javaBasico.agregarSubdirectorio(semana2);
        
        
        semana1.agregarArchivo("Ejercicio1.java");
        semana1.agregarArchivo("Ejercicio2.java");
        ExploradorDirectorios.explorarDirectorios(raiz, 0);
       

    }
}
