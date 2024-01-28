package com.hackaboss.ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    private static final String[] alfabeto = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
    };


    @GetMapping("/{palabra}")
    public String conversorMorse(@PathVariable String palabra) {
        StringBuilder builder = new StringBuilder();

        for (char letra : palabra.toUpperCase().toCharArray()) {
            if (Character.isAlphabetic(letra)) {
                int indice = letra - 'A';
                builder.append(alfabeto[indice]).append(" ");
            }
        }

        return builder.toString().trim();
    }
}
