package co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.fabrica;

import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.ComandoActividades;
import co.edu.udea.registrotareasbackend.dominio.Actividades;
import org.springframework.stereotype.Component;

@Component
public class FabricaActividad {

    public Actividades crear(ComandoActividades comandoActividades){
        return new Actividades(comandoActividades.getId(),comandoActividades.getTitulo(),comandoActividades.getDescripcion()
        ,comandoActividades.getFechaInicio(),comandoActividades.getFechaFin(),comandoActividades.getCurso());
    }
}
