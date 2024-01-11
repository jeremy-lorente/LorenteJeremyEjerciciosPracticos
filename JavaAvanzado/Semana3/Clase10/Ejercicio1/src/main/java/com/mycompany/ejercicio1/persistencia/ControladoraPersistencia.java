package com.mycompany.ejercicio1.persistencia;

import com.mycompany.ejercicio1.logica.Voto;
import com.mycompany.ejercicio1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    VotoJpaController votoJPA = new VotoJpaController();

    public void crearVoto(Voto voto) {
        votoJPA.create(voto);
    }

    public void eliminarVoto(int id) {
        try {
            votoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName());
        }
    }

    public List<Voto> traerVotos() {
        return votoJPA.findVotoEntities();
    }

}
