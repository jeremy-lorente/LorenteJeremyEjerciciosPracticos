package ejercicio1.modelos;

import ejercicio1.interfaces.Electrico;
import java.time.LocalDate;

public class Auto extends Vehiculo implements Electrico {

    private Double capacidadBateria;
    private Double autonomia;

    public Auto() {
    }

    public Auto(Double capacidadBateria, Double autonomia, int id, String placa, String marca, String modelo, int anio, Double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public Double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(Double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return super.toString() + "Auto{" + "capacidadBateria=" + capacidadBateria + ", autonomia=" + autonomia + '}';
    }
    

    @Override
    public int calcularAntiguedad() {
        int anio = getAnio();
        int anioActual = LocalDate.now().getYear();
        return (anioActual - anio);

    }

    @Override
    public void cargarEnergia() {
        System.out.println("Este vehiculo esta cargando con Electricidad");
    }

}
