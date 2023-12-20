package ejercicio1.modelos;

import ejercicio1.interfaces.Combustion;
import java.time.LocalDate;

public class Camioneta extends Vehiculo implements Combustion {

    private Double capacidadTanque;
    private Double consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(Double capacidadTanque, Double consumoCombustible, int id, String placa, String marca, String modelo, int anio, Double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public Double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(Double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public Double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(Double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String toString() {
        return super.toString() + "Camioneta{" + "capacidadTanque=" + capacidadTanque + ", consumoCombustible=" + consumoCombustible + '}';
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
