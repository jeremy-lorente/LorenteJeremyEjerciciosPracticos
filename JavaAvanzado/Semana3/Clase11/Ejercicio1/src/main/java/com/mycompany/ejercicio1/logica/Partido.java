package com.mycompany.ejercicio1.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    private int puntuacionEquipoLocal;
    private int puntuacionEquipoVisitante;

    @ManyToOne
    @JoinColumn(name = "idEquipoLocal")
    private Equipo equipoLocal;
    @ManyToOne
    @JoinColumn(name = "idEquipoVisitante")
    private Equipo equipoVisitante;

    public Partido() {
    }

    public Partido(LocalDate fecha, int puntuacionEquipoLocal, int puntuacionEquipoVisitante, Equipo equipoLocal, Equipo equipoVisitante) {

        this.fecha = fecha;
        this.puntuacionEquipoLocal = puntuacionEquipoLocal;
        this.puntuacionEquipoVisitante = puntuacionEquipoVisitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacionEquipoLocal() {
        return puntuacionEquipoLocal;
    }

    public void setPuntuacionEquipoLocal(int puntuacionEquipoLocal) {
        this.puntuacionEquipoLocal = puntuacionEquipoLocal;
    }

    public int getPuntuacionEquipoVisitante() {
        return puntuacionEquipoVisitante;
    }

    public void setPuntuacionEquipoVisitante(int puntuacionEquipoVisitante) {
        this.puntuacionEquipoVisitante = puntuacionEquipoVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

}
