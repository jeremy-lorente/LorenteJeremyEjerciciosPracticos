package com.hackaboss.ejercicio1.controller;


import com.hackaboss.ejercicio1.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class EventoController {

    List<Evento> eventos = new ArrayList<>();


    @PostMapping("/evento")
    public Evento agregarEvento(@RequestBody Evento nuevoEvento) {
        Evento eventoConId = new Evento(
                nuevoEvento.getTitulo(),
                nuevoEvento.getDescripcion(),
                nuevoEvento.getFecha(),
                nuevoEvento.getHora(),
                nuevoEvento.getLugar(),
                nuevoEvento.getPonente()
        );


        eventos.add(eventoConId);
        return eventoConId;
    }

    @PostMapping("/eventos")
    public List<Evento> agregarEventos(@RequestBody List<Evento> nuevosEventos) {
        for (Evento evento : nuevosEventos) {
            eventos.add(new Evento(
                    evento.getTitulo(),
                    evento.getDescripcion(),
                    evento.getFecha(),
                    evento.getHora(),
                    evento.getLugar(),
                    evento.getPonente()
            ));
        }
        return nuevosEventos;
    }

    @GetMapping("/eventos")
    public List<Evento> buscarEventos() {
        return eventos;
    }

    @GetMapping("evento/{id}")
    public Evento buscarEventoId(@PathVariable int id) {
        return eventos.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst()
                .get();
    }

}
