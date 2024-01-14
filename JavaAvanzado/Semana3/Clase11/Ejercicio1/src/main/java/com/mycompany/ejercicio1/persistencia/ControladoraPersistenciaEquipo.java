package com.mycompany.ejercicio1.persistencia;

import com.mycompany.ejercicio1.logica.Equipo;
import com.mycompany.ejercicio1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Logger;

public class ControladoraPersistenciaEquipo {

    EquipoJpaController equipoJPA = new EquipoJpaController();

    public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }

    public void eliminarEquipo(int id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistenciaEquipo.class.getName());

        }
    }

    public void editarEquipo(Equipo equipo) {
        try {
            equipoJPA.edit(equipo);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistenciaEquipo.class.getName());
        }
    }

    public List<Equipo> traerEquipos() {
        return equipoJPA.findEquipoEntities();
    }

    public Equipo traerEquipoPorId(int id) {
        return equipoJPA.findEquipo(id);
    }

}
