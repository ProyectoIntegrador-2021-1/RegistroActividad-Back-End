package co.edu.udea.registrotareasbackend.aplicacion.curso.comando.manejadores;

import co.edu.udea.registrotareasbackend.dominio.servicio.curso.ServicioEliminarCurso;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarCurso {
    private final ServicioEliminarCurso servicioEliminarCurso;

    public ManejadorEliminarCurso(ServicioEliminarCurso servicioEliminarCurso) {
        this.servicioEliminarCurso = servicioEliminarCurso;
    }

    public void ejecutar(Integer id ){
        this.servicioEliminarCurso.ejecutar(id);
    }
}
