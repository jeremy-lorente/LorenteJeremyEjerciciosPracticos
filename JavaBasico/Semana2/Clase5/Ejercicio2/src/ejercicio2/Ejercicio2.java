package ejercicio2;

import modelos.Camiseta;
import modelos.Pantalon;
import modelos.Sombrero;
import modelos.Vestimenta;
import modelos.Zapato;

public class Ejercicio2 {

    public static void main(String[] args) {

        Vestimenta arrayVestimenta[] = new Vestimenta[9];

        arrayVestimenta[0] = new Zapato("Cuero", "Cremallera", 0, "Zapato1", 23.5, "generico1", "45", "Negro");
        arrayVestimenta[1] = new Zapato("Tela", "Cuerda", 1, "Zapato2", 38.12, "generico2", "35", "Verde");
        arrayVestimenta[2] = new Zapato("Cuero", "Cremallera", 2, "Zapato3", 23.5, "generico1", "46", "Azul");

        arrayVestimenta[3] = new Pantalon("Cargo", "Tela", 3, "Pantalon1", 39.29, "generico2", "46", "Militar");
        arrayVestimenta[4] = new Pantalon("Chandal", "Tela", 4, "Pantalon2", 44.99, "generico1", "46", "Gris");
        arrayVestimenta[5] = new Pantalon("Cargo", "Tela", 5, "Pantalon3", 24.59, "generico2", "46", "Marron");

        arrayVestimenta[6] = new Camiseta("Corta", "Pico", 6, "Camiseta1", 39.29, "generico1", "L", "Negro");
        arrayVestimenta[7] = new Camiseta("Larca", "Recto", 7, "Camiseta2", 20.2, "generico1", "XXL", "Verde");

        arrayVestimenta[8] = new Sombrero("Copa", "Grande", 8, "Gorro1", 11d, "generico1", "Grande", "Negro");

        for (int i = 0; i < arrayVestimenta.length; i++) {
            arrayVestimenta[i].mostrarMarca();
        }
    }

}
