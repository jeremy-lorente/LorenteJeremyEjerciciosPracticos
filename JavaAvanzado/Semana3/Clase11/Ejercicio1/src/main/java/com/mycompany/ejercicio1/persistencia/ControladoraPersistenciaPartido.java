
package com.mycompany.ejercicio1.persistencia;

import com.mycompany.ejercicio1.logica.Partido;
import com.mycompany.ejercicio1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Logger;

public class ControladoraPersistenciaPartido {
        PartidoJpaController equipoJPA = new PartidoJpaController();

    public void crearPartido(Partido partido) {
        equipoJPA.create(partido);
    }

    public void eliminarPartido(int id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistenciaEquipo.class.getName());

        }
    }

    public void editarPartido(Partido partido){
        try {
            equipoJPA.edit(partido);
        } catch (Exception e) {
             Logger.getLogger(ControladoraPersistenciaEquipo.class.getName());
        }
    }
    
    public List<Partido> traerPartidos() {
        return equipoJPA.findPartidoEntities();
    }
}
