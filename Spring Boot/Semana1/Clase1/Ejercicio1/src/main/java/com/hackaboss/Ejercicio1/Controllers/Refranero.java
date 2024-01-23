package com.hackaboss.Ejercicio1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Refranero {
    private final List<String> refranes = Arrays.asList(
            "No hay mal que por bien no venga",
            "Al que madruga Dios lo ayuda",
            "Más vale tarde que nunca",
            "En boca cerrada no entran moscas"
    );


    @GetMapping()
    public String mostrarRefran(){

        return generarRefranes();
    }


    public String generarRefranes(){
        Random random = new Random();
        return refranes.get(random.nextInt(refranes.size()));
    }
}
