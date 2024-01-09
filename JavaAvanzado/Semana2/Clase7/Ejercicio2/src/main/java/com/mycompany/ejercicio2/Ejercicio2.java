package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.modelos.Tarea;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la tarea principal");
        String nombreTareaRaiz = sc.nextLine();
        Tarea tareaRaiz = new Tarea(nombreTareaRaiz);

        do {
            tareaRaiz.agregarSubtarea();
            System.out.println("¿Quieres seguir introduciendo subtareas? (Introduzca 0 para salir, cualquier otro entero para continuar)");
            if (sc.nextInt() == 0) {
                break;
            }
            sc.nextLine();
        } while (true);
        
        tareaRaiz.mostrarTarea(0);
    }

}
