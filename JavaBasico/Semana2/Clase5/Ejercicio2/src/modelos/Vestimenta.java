package modelos;

public class Vestimenta {

    int codigo;
    String nombre;
    Double precio;
    String marca;
    String talla; //Opto por String por que depende de el pais la talla va por numero o por letra
    String color;

    public Vestimenta() {
    }

    public Vestimenta(int codigo, String nombre, Double precio, String marga, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marga;
        this.talla = talla;
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarMarca(){
        System.out.println("Esta vestimenta es de marca: ");
    }
    
}
