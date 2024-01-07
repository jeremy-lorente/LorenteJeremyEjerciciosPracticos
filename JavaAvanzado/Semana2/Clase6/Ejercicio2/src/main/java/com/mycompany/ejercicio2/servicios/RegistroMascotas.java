package com.mycompany.ejercicio2.servicios;

import com.mycompany.ejercicio2.modelos.Mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Random;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroMascotas<M extends Mascota> {

    private List<M> listaMascotas = new ArrayList<>();
    private Random random = new Random();

    public void agregarMascota(M mascota) {
        listaMascotas.add(mascota);
        System.out.println("Mascota agregada al registro: " + mascota.toString());
    }

    public void buscarMascotaPorNombre(String nombre) {
        List<M> mascotasEncontradas = listaMascotas.stream()
                .filter(mascota -> mascota.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
        mascotasEncontradas.forEach(System.out::println);
    }

    public void contarMascotas() {
        System.out.println("El numero de mascotas registradas es de: " + listaMascotas.size());
    }

    public String generarEspecieAleatoria() {

        String[] especie = {"Perro", "Gato", "Reptil", "Ave"};
        int indice = random.nextInt(especie.length);
        return especie[indice];
    }

}
