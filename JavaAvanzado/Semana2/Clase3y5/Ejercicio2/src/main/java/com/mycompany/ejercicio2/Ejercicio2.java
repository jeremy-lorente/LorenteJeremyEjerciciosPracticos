package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.modelos.Evento;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {

        Evento evento1 = new Evento("Fierta fin de año", LocalDate.of(2023, 12, 31), "Fiesta");
        Evento evento2 = new Evento("Fierta navidad", LocalDate.of(2023, 12, 25), "Fiesta");
        Evento evento3 = new Evento("Reunion", LocalDate.of(2024, 1, 8), "Reunion");
        Evento evento4 = new Evento("Taller Metodologias Agile ", LocalDate.of(2023, 1, 8), "Taller");

        List<Evento> listaEventos = new ArrayList<Evento>();
        listaEventos.add(evento1);
        listaEventos.add(evento2);
        listaEventos.add(evento3);
        listaEventos.add(evento4);

        LocalDate fechaABuscar = LocalDate.of(2023, 12, 31);
        List<Evento> eventosFechaX = listaEventos.stream()
                .filter(e -> e.getFecha().equals(fechaABuscar)).collect(Collectors.toList());

        System.out.println("Los eventos que coinciden con la fecha:  " + fechaABuscar);
        eventosFechaX.forEach(System.out::println);

        Map<String, Long> numeroEventosPorCategoria = listaEventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        numeroEventosPorCategoria.forEach((categoria, cantidad) -> {
            System.out.println(categoria + " : " + cantidad);
        });
        
        
        Optional<Evento> eventoMasProximo = listaEventos.stream()
                .filter(e -> e.getFecha().isAfter(LocalDate.now()))
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));

        eventoMasProximo.ifPresent(e -> System.out.println("Evento mas proximo: "
                + e.getNombre() + " fecha: " + e.getFecha()));

    }
}
