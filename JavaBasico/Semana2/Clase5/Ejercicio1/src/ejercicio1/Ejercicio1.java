package ejercicio1;

import modelos.Mamifero;
import modelos.Animal;
import modelos.Ave;
import modelos.Reptil;

public class Ejercicio1 {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Reptil reptil = new Reptil();

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        Animal animal = new Animal();

        //D) 
        // No se puede convertir un animal en un mamifero 
        // mamifero = animal;
        
        //E) 
        // Si modifico el nivel de acceso, no puedo llamar desde esta
        // clase a los metodos de las demas clases
    }

}
