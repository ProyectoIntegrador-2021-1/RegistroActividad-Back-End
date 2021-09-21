package co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.manejadores;

import co.edu.udea.registrotareasbackend.dominio.servicio.semestre.ServicioEliminarSemestre;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarSemestre {
    private final ServicioEliminarSemestre servicioEliminarSemestre;

    public ManejadorEliminarSemestre(ServicioEliminarSemestre servicioEliminarSemestre) {
        this.servicioEliminarSemestre = servicioEliminarSemestre;
    }

    public void ejecutar(Integer id){
        servicioEliminarSemestre.ejecutar(id);
    }
}
