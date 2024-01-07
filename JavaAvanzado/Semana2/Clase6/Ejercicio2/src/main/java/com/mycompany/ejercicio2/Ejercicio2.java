package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.modelos.Mascota;
import com.mycompany.ejercicio2.servicios.RegistroMascotas;

public class Ejercicio2 {

    public static void main(String[] args) {
        RegistroMascotas registro = new RegistroMascotas();

        registro.agregarMascota(new Mascota("Fenrir", 8, "perro"));
        registro.agregarMascota(new Mascota("Tobi", 2, "perro"));
        registro.agregarMascota(new Mascota("Paco", 2, registro.generarEspecieAleatoria()));
        registro.agregarMascota(new Mascota("Bombon", 3, registro.generarEspecieAleatoria()));
        registro.agregarMascota(new Mascota("Pelusa", 4, registro.generarEspecieAleatoria()));
        registro.agregarMascota(new Mascota("Laica", 1, registro.generarEspecieAleatoria()));
        registro.agregarMascota(new Mascota("Bicho", 5, registro.generarEspecieAleatoria()));

        System.out.println("\nLa mascota buscada es: ");
        registro.buscarMascotaPorNombre("Fenrir");


        registro.contarMascotas();

    }
}
