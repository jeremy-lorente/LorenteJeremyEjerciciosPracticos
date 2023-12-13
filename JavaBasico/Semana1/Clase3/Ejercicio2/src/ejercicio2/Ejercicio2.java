package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //A)
        Persona[] vectorPersona = new Persona[5];

        Persona persona1 = new Persona(1, "Jere", 25, "tamo en japon", 699999999);
        Persona persona2 = new Persona(2, "Pepito", 11, "casa Pepito", 699999999);
        Persona persona3 = new Persona(3, "Ana", 32, "casa Ana", 699999999);
        Persona persona4 = new Persona(4, "Maria", 42, "casa Maria", 699999999);
        Persona persona5 = new Persona(5, "Mario", 30, "casa Mario", 699999999);

        vectorPersona[0] = persona1;
        vectorPersona[1] = persona2;
        vectorPersona[2] = persona3;
        vectorPersona[3] = persona4;
        vectorPersona[4] = persona5;

        //B)
        for (int i = 0; i < vectorPersona.length; i++) {
            System.out.println("El nombre de la persona " + i + " es: " + vectorPersona[i].getNombre());
            System.out.println("La edad de la persona " + i + " es: " + vectorPersona[i].getEdad());
        }
        System.out.println("");
        
        //C)
        System.out.println("La persona 1 se llama:" + persona1.getNombre());
        System.out.println("La persona 2 se llama:" + persona2.getNombre());

        persona1.setNombre("Jose");
        persona2.setNombre("NotPepito");

        System.out.println("La persona 1 ahora se llama:" + persona1.getNombre());
        System.out.println("La persona 2 ahora se llama:" + persona2.getNombre());

        System.out.println("");
        
        //D)
        for (int i = 0; i < vectorPersona.length; i++) {
            if (vectorPersona[i].getEdad() > 30) {
                System.out.println(vectorPersona[i].getNombre());
            }
        }
        System.out.println("");
    }
}
