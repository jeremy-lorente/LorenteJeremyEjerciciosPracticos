package com.mycompany.ejercicio2.servicios;

import com.mycompany.ejercicio2.modelos.Plato;
import com.mycompany.ejercicio2.persistencia.PlatoJpaController;
import com.mycompany.ejercicio2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlatoServicio {

    PlatoJpaController platoJPA = new PlatoJpaController();

    public void crearPlato(Plato plato) {
        platoJPA.create(plato);
    }

    public void borrarPlato(int id) {
        try {
            platoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PlatoServicio.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public List<Plato> traerPlatos() {
        return platoJPA.findPlatoEntities();
    }

    public void modificarPlato(Plato plato) {
        try {
            platoJPA.edit(plato);
        } catch (Exception ex) {
            Logger.getLogger(PlatoServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
