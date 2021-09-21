package co.edu.udea.registrotareasbackend.aplicacion.docente.comando.manejador;


import co.edu.udea.registrotareasbackend.dominio.servicio.docente.ServicioEliminarDocente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarDocente {
    private final ServicioEliminarDocente servicioEliminarDocente;


    public ManejadorEliminarDocente(ServicioEliminarDocente servicioEliminarDocente) {
        this.servicioEliminarDocente = servicioEliminarDocente;
    }

    public void ejecutar(Long id) {
        this.servicioEliminarDocente.ejecutar(id);
    }
}
