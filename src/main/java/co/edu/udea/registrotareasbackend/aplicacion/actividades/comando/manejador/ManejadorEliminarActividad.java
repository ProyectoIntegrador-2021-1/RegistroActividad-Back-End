package co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.manejador;


import co.edu.udea.registrotareasbackend.dominio.servicio.actividades.ServicioEliminarActividades;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarActividad {

    private final ServicioEliminarActividades servicioEliminarActividades;

    public ManejadorEliminarActividad( ServicioEliminarActividades servicioEliminarActividades) {
        this.servicioEliminarActividades = servicioEliminarActividades;
    }

    public void ejecutar(Long id) {
        servicioEliminarActividades.ejecutar(id);
    }
}
