package com.hackaboss.ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {


    @GetMapping("/{cm}")
    public String convertirAMetro(@PathVariable double cm) {

        double aux = 0;

        if (cm <= 0) {
            return "El numero introducido es menor o igual a  0";
        } else {
            aux = cm / 100;
            return cm + " centimetros son  " + aux + " metros";
        }
    }
}
