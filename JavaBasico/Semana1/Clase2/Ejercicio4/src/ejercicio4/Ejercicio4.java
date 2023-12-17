package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char mapaAsientos[][] = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapaAsientos[i][j] = 'O';
            }
        }

        dibujarMapa(mapaAsientos);
        while (true) {
            int fila;
            while (true) {
                System.out.println("Ingrese el numero de fila (1-5):");
                if (sc.hasNextInt()) {
                    fila = sc.nextInt();
                    if (fila >= 1 && fila <= 5) {
                        break;
                    } else {
                        System.out.println("El numero introducido esta fuera de rango");
                    }
                } else {
                    System.out.println("Tipo de dato incorrecto, introduzca un valor valido");
                }
            }

            int asiento;
            while (true) {
                System.out.println("Ingrese el numero de asiento (1-5):");
                if (sc.hasNextInt()) {
                    asiento = sc.nextInt();
                    if (asiento >= 1 && asiento <= 5) {
                        break;
                    } else {
                        System.out.println("El numero introducido esta fuera de rango");
                        sc.next();
                    }
                } else {
                    System.out.println("Tipo de dato incorrecto, introduzca un valor valido");
                    sc.next();
                }
            }
            fila--;
            asiento--;

            if (mapaAsientos[fila][asiento] == 'O') {
                mapaAsientos[fila][asiento] = 'X';
                System.out.println("Reserva registrada");
                dibujarMapa(mapaAsientos);
            } else {
                System.out.println("El asiento esta ocupado, solicite otro");
            }

            System.out.println("¿Desea realizar otra reserva? (Si/No): ");
            sc.nextLine();
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.contains("no")) {
                System.out.println("Proceso de reserva finalizado");
                break;
            }

        }
        sc.close();
    }

    static void dibujarMapa(char[][] mapa) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
