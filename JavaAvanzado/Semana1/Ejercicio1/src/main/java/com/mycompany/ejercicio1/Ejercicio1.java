package com.mycompany.ejercicio1;

import com.mycompany.ejercicio1.excepciones.ReservaInvalidaException;
import com.mycompany.ejercicio1.modelos.Vuelo;
import java.time.LocalDate;

public class Ejercicio1 {

    public static void main(String[] args) {

        Vuelo madrid = new Vuelo(0, "Santo Domingo", LocalDate.of(2024, 5, 11), 10);

        System.out.println("Primer error forzado: ");
        try {
            madrid.reservarAsientos("Jeremy", "Santo Domingo", LocalDate.now(), 20);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage()+ "\n");
        }
        System.out.println("Segundo error forzado: ");
        try {
            madrid.reservarAsientos("", "Santo Domingo", LocalDate.now(), 20);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage()+ "\n");
        }
        System.out.println("Tercer error forzado: ");
        try {
            madrid.reservarAsientos("Jeremy", "Santo Domingo", LocalDate.of(1998, 11, 11), 20);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage() + "\n");
        }
       System.out.println("Reserva exitosa: ");
        try {
            madrid.reservarAsientos("Jeremy", "Santo Domingo", LocalDate.now(), 1);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage());
        }
    }

}
