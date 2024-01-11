package com.mycompany.ejercicio1.logica;

import com.mycompany.ejercicio1.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearVoto(Voto voto) {
        controlPersis.crearVoto(voto);
    }
    public void eliminarVoto (int id){
    controlPersis.eliminarVoto(id);
    }
    public List<Voto> traerVotos(){
    return controlPersis.traerVotos();
    }
}
