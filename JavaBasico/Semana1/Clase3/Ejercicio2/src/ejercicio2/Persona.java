package ejercicio2;

public class Persona {

    int id;
    String nombre;
    int edad;
    String direccion;
    int numTelf;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String direccion, int numTelf) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numTelf = numTelf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumTelf() {
        return numTelf;
    }

    public void setNumTelf(int numTelf) {
        this.numTelf = numTelf;
    }

}
