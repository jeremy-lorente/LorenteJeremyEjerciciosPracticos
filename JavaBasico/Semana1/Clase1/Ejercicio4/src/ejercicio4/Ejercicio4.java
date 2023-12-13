package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer entero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo entero");
        int num2 = sc.nextInt();

        System.out.println("La suma de los enteros es: " + (num1 + num2));
        System.out.println("La resta de los enteros es: " + (num1 - num2));
        System.out.println("La multiplicacion de los enteros es: " + (num1 * num2));
        if (num2 > 0) {
            System.out.println("La division de los enteros es: " + (num1 / num2));
        }else{
            System.out.println("No puedes realizar divisiones entre 0 ");}

        //Al intentar dividir entre 0 dara un error en tiempo de ejecucion 
    }

}
