package co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.manejador;

import co.edu.udea.registrotareasbackend.dominio.servicio.administrador.ServicioEliminarAdministrador;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarAdministrador {
    private final ServicioEliminarAdministrador servicioEliminarAdministrador;

    public ManejadorEliminarAdministrador(ServicioEliminarAdministrador servicioEliminarAdministrador) {
        this.servicioEliminarAdministrador = servicioEliminarAdministrador;
    }

    public void ejecutar(Long id){
        this.servicioEliminarAdministrador.ejecutar(id);
    }
}
