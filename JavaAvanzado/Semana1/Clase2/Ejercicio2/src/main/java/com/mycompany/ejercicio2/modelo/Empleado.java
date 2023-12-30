package com.mycompany.ejercicio2.modelo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Empleado extends Thread {

    private String nombre;

    @Override
    public void run() {
        int contador = 0 ;
        while (contador < 15) {
            realizarTarea();
            try {
                Thread.sleep(generaTiempo());
            } catch (InterruptedException ex) {
                Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
            contador++;
        }
    }

    private void realizarTarea() {
        Random random = new Random();

        int aleatorio = random.nextInt(3);
        switch (aleatorio) {
            case 0:
                System.out.println(nombre + " esta ensamblando productos");
                break;
            case 1:
                System.out.println(nombre + " esta realizando controles de calidad");
                break;
            default:
                System.out.println(nombre + " esta embalando productos");
                break;
        }
    }

    private int generaTiempo() {
        Random random = new Random();
        int duracion = random.nextInt(2000) + 1000;

        return duracion;
    }
}
