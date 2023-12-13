package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        while (true) {
            System.out.println("¿Cual es tu edad?");
            if (sc.hasNextInt()) {
                edad = sc.nextInt();
                if (edad < 18) {
                    System.out.println("Lo sentimos, tu edad es menor a 18, " + edad);
                    System.out.println("No tienes permitida la entrada al evento");
                } else {
                    System.out.println("Tu edad es mayor a 18, " + edad);
                    System.out.println("Tienes permitido acceder al evento");
                }
                break;
            } else {
                System.out.println("Error: Introduce un numero");
                sc.next();
            }
        }
    }

}
