package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasSemana = 2;
        double[] temperaturasMaximas = new double[diasSemana];

        for (int i = 0; i < diasSemana; i++) {
            while (true) {
                System.out.println("Ingresa la temperatura maxima del dia " + (i + 1));
                if (sc.hasNextDouble()) {
                    double temperaturaMaxima = sc.nextDouble();
                    temperaturasMaximas[i] = temperaturaMaxima;
                    break;
                } else {
                    System.out.println("Introduce un valor valido");
                    sc.next();
                }

            }
        }
        double sumaTemperatura = 0;
        for (int i = 0; i < diasSemana; i++) {
            sumaTemperatura += temperaturasMaximas[i];
        }
        double temperaturaMedia = sumaTemperatura / diasSemana;
        System.out.println("La temperatura media es de: " + temperaturaMedia);
    }

}
