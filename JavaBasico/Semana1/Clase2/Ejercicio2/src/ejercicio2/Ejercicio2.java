package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Introduce el precio del producto a sumar (Numerico, 0 para salir del programa)");
            if (sc.hasNextDouble()) {
                double precio = sc.nextDouble();
                if (precio <= 0) {
                    bandera = false;
                }
                total += precio;

                System.out.println("Total acumulado hasta el momento: " + total);
            } else {
                System.out.println("Introduce un valor valido");
                sc.next();
            }
        }
        System.out.println("El total de su compra es: " + total);
    }

}
