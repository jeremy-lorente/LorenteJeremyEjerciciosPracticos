package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        //A)
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Generico1", "asdas", 50.0, "Azul");
        Electrodomestico electrodomestico2 = new Electrodomestico(1, "Generico2", "zxczx", 540.0, "Verde");
        Electrodomestico electrodomestico3 = new Electrodomestico(1, "Generico1", "cvbvcb", 150.0, "Rosa");
        //B)
        Electrodomestico electrodomesticoVacio = new Electrodomestico();
        //C)
        System.out.println("Información de Electrodomestico 1\n");

        System.out.println("Marca: " + electrodomestico1.getMarca());
        System.out.println("Modelo: " + electrodomestico1.getModelo());
        System.out.println("Consumo: " + electrodomestico1.getConsumo());
        System.out.println("");

        System.out.println("Información de Electrodomestico 2\n");

        System.out.println("Marca: " + electrodomestico2.getMarca());
        System.out.println("Modelo: " + electrodomestico2.getModelo());
        System.out.println("Consumo: " + electrodomestico2.getConsumo());
        System.out.println("");

        System.out.println("Información de Electrodomestico 3\n");

        System.out.println("Marca: " + electrodomestico3.getMarca());
        System.out.println("Modelo: " + electrodomestico3.getModelo());
        System.out.println("Consumo: " + electrodomestico3.getConsumo());
        System.out.println("");

        //D)Devuelve null
        System.out.println("Información de Electrodomestico SIN parametros\n");
        System.out.println("Marca electrodomestico sin parametros: " + electrodomesticoVacio.getMarca());
        System.out.println("");
    }

}
