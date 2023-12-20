package ejercicio1.modelos;

import ejercicio1.interfaces.Combustion;
import java.time.LocalDate;

public class Moto extends Vehiculo implements Combustion {

    private Double cilindrada;
    private String tipoMotor;

    public Moto() {
    }

    public Moto(Double cilindrada, String tipoMotor, int id, String placa, String marca, String modelo, int anio, Double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "cilindrada=" + cilindrada + ", tipoMotor=" + tipoMotor + '}';
    }

    @Override
    public int calcularAntiguedad() {
        int anio = getAnio();
        int anioActual = LocalDate.now().getYear();
        return (anioActual - anio);
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Este vehiculo esta cargando con Combustible");
    }

}
