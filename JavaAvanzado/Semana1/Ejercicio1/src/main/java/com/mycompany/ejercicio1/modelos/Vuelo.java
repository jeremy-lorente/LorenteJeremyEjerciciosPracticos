package com.mycompany.ejercicio1.modelos;

import com.mycompany.ejercicio1.excepciones.ReservaInvalidaException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vuelo {

    int id;
    String destino;
    LocalDate fechaViaje;
    int asientosDisponibles;

    public void reservarAsientos(String nombre, String destino, LocalDate fechaViaje, int asientosDesados) throws ReservaInvalidaException {

        if (nombre == null || nombre.trim().isBlank()) {
            throw new ReservaInvalidaException("Falta informacion del nombre a quien reservar");
        }

        if (asientosDesados > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles");
        }
        if (fechaViaje.isBefore(LocalDate.now())) {
            throw new ReservaInvalidaException("No puedes reservar asientos para un vuelo ya pasado");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaViaje.format(formatter);

        System.out.println("Reserva exitosa para: " + nombre + " con destino a " + destino + " el " + fechaFormateada + " para " + asientosDesados + " asientos.");
        asientosDisponibles -= asientosDesados;
    }

}
