package modelos;

public class Camiseta extends Vestimenta {

    String manga;
    String cuello;

    public Camiseta() {
    }

    public Camiseta(String manga, String cuello) {
        this.manga = manga;
        this.cuello = cuello;
    }

    public Camiseta(String manga, String cuello, int codigo, String nombre, Double precio, String marga, String talla, String color) {
        super(codigo, nombre, precio, marga, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
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

    @Override
    public void mostrarMarca() {
        System.out.println("Este camiseta es de marca: " + getMarca());
    }

}
