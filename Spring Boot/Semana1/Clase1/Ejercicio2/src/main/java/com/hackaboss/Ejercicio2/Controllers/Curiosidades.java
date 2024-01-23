package com.hackaboss.Ejercicio2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Curiosidades {

    private final List<String> curiosidades = Arrays.asList(
            "Las abejas pueden reconocer rostros humanos.",
            "En promedio, tardamos 6 minutos en dormirnos.",
            "Los flamencos rosados no nacen con ese color; su dieta los vuelve rosados.",
            "El aguacate es una fruta y el tomate es una fruta, pero el ketchup es una salsa.",
            "Un grupo de cuervos se llama 'murder'.",
            "Los pulpos tienen tres corazones.",
            "Los pingüinos pueden reconocerse a través de un sonido único.",
            "La miel nunca se echa a perder; se han encontrado tarros de miel en tumbas egipcias aún comestibles.",
            "Los delfines tienen nombres propios para identificarse.",
            "El ajedrez originalmente se jugaba con dados en la India."
    );

    @GetMapping()
    public String mostrarCuriosidad(){
        return generarCuriosidad();

    }

    private String generarCuriosidad() {
        Random random = new Random();
        return curiosidades.get(random.nextInt(curiosidades.size()));
    }


}
