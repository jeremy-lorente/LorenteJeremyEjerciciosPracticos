package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.modelos.Plato;
import com.mycompany.ejercicio2.servicios.PlatoServicio;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        PlatoServicio platoServicio = new PlatoServicio();

        Plato plato1 = new Plato("Paella", "arroz con cosas", 17.0);
        Plato plato2 = new Plato("Sepia", "animal marino a la plancha", 12.0);
        Plato plato3 = new Plato("Bocadillo de tortilla", "pan con huevo batido", 9);

        //Crear platos
        platoServicio.crearPlato(plato1);
        platoServicio.crearPlato(plato2);
        platoServicio.crearPlato(plato3);
        System.out.println("Se han creado los platos \n");

        //Lista para ver que los platos se han creado
        List<Plato> listaPlatos = platoServicio.traerPlatos();
        for (Plato plato : listaPlatos) {
            System.out.println(plato.toString());
        }

        System.out.println();
        //Borrar plato por id
        int idPlato1 = plato1.getId();
        platoServicio.borrarPlato(idPlato1);
        System.out.println("Se ha borrado el plato que tenia la id: " + idPlato1);

        //Modificado plato
        int idPlato3 = plato3.getId();
        plato3.setNombre("Bocata de tortilla y jamon");
        plato3.setReceta("pan con huevo batido y jamon");
        plato3.setPrecio(10.25);

        platoServicio.modificarPlato(plato3);
        System.out.println("Se ha modificado el plato con id: " + idPlato3);

        //Misma lista para ver que se han borrado y modificado los que se han pedido
        listaPlatos = platoServicio.traerPlatos();
        for (Plato plato : listaPlatos) {
            System.out.println(plato.toString());
        }

    }
}
