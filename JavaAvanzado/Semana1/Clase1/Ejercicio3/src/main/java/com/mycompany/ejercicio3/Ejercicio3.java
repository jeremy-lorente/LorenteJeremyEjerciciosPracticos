package com.mycompany.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    private static final String[] VECTOR = new String[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Introducir dato");
            System.out.println("2. Buscar dato");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opción: ");

            try {

                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca el indice: ");
                        int indiceCrear = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Introduzca  el dato: ");
                        String datoCrear = sc.nextLine();
                        try {
                            guardarDato(indiceCrear, datoCrear);
                        } catch (IndexOutOfBoundsException e) {
                            e.printStackTrace();
                            System.out.println("Error: Posicion fuera de rango del Vector ");
                        }

                        break;
                    case 2:

                        System.out.println("Introduzca el indice para buscar: ");
                        int indiceBuscar = sc.nextInt();
                        sc.nextLine();
                        try {
                            accederDato(indiceBuscar);
                        } catch (IndexOutOfBoundsException e) {
                            e.printStackTrace();
                            System.out.println("Error: Posicion fuera de rango del Vector ");
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion no valida. Intentelo de nuevo");
                        break;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Error: Ingrese un numero por favor");
                sc.nextLine(); 
            }
        }

    }

    public static void guardarDato(int indice, String dato) {

        if (indice >= 0 && indice < VECTOR.length) {
            VECTOR[indice] = dato;
            System.out.println(dato + " almacenado en :" + indice + " \n");
        } else {
            throw new IndexOutOfBoundsException("Error: Posicion fuera de rango del Vector");
        }

    }

    public static void accederDato(int indice) {
        try {
            String string = VECTOR[indice];
            if (indice > VECTOR.length) {
                throw new IndexOutOfBoundsException("Error: Posicion fuera de rango del Vector");
            }
            System.out.println("En la posicion " + indice + " esta : " + string + " \n");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Error: Posicion fuera de rango del Vector");
        }

    }
}
