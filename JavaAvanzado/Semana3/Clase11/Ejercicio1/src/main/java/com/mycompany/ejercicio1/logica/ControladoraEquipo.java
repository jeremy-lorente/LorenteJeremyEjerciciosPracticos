package com.mycompany.ejercicio1.logica;

import com.mycompany.ejercicio1.persistencia.ControladoraPersistenciaEquipo;
import java.util.List;

public class ControladoraEquipo {

    ControladoraPersistenciaEquipo controlPersis = new ControladoraPersistenciaEquipo();

    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    public void eliminarEquipo(int id) {
        controlPersis.eliminarEquipo(id);
    }

    public void editarEquipo(Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }

    public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();
    }

    public Equipo traerEquipoPorId(int idEquipoLocal) {
       return controlPersis.traerEquipoPorId(idEquipoLocal);
    }

}
