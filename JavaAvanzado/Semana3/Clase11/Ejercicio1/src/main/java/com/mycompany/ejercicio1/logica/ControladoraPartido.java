package com.mycompany.ejercicio1.logica;

import com.mycompany.ejercicio1.persistencia.ControladoraPersistenciaPartido;
import java.util.List;

public class ControladoraPartido {

    ControladoraPersistenciaPartido controlPersis = new ControladoraPersistenciaPartido();
    
    public void crearPartido(Partido partido){
    controlPersis.crearPartido(partido);
    }
    public void eliminarPartido(int id){
    controlPersis.eliminarPartido(id);
    }
    public void editarPartido(Partido partido){
        controlPersis.editarPartido(partido);
    
    }
    

    public List<Partido> traerPartidos(){
    
        return controlPersis.traerPartidos();
    }

}

