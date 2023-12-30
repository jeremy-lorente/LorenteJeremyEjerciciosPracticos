package com.mycompany.ejercicio1.modelos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Agente extends Thread {

    private String nombre;

    @Override
    public void run() {
        System.out.println(nombre + " atiende llamada");

        try {

            Thread.sleep(generaTiempo());
            System.out.println(nombre + " resuelve las consultas de la llamada");

            Thread.sleep(generaTiempo());
            System.out.println(nombre + " registra la informacion de la llamada");

            Thread.sleep(generaTiempo());
            System.out.println(nombre + " cuelga  la llamada");

        } catch (InterruptedException e) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    private int generaTiempo() {
        Random random = new Random();
        int duracion = random.nextInt(2000) + 1000;

        return duracion;
    }

}
