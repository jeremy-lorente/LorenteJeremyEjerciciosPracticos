package com.hackaboss.ejercicio2y3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    private static final String[] alfabeto = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
    };


    @GetMapping("/{palabra}")
    public String conversorPalabraMorse(@PathVariable String palabra) {
        StringBuilder builder = new StringBuilder();

        for (char letra : palabra.toUpperCase().toCharArray()) {
            if (Character.isAlphabetic(letra)) {
                int indice = letra - 'A';
                builder.append(alfabeto[indice]).append(" ");
            }
        }

        return builder.toString().trim();
    }

    @GetMapping
    public String conversorFraseMorse(@RequestParam String frase){
        String [] palabras = frase.toUpperCase().split("\\s+");
        StringBuilder builder = new StringBuilder();

        for(String palabra : palabras){
            builder.append(conversorPalabraMorse(palabra)).append("   ");
        }
        return builder.toString().trim();
    }

}
