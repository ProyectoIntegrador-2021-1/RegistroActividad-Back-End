package co.edu.udea.registrotareasbackend.dominio.servicio.administrador;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioAdministrador;
import org.springframework.stereotype.Component;

@Component
public class ServicioEliminarAdministrador {
    private final RepositorioAdministrador repositorioAdministrador;

    public ServicioEliminarAdministrador(RepositorioAdministrador repositorioAdministrador) {
        this.repositorioAdministrador = repositorioAdministrador;
    }

    public void ejecutar(Long id) {
         this.repositorioAdministrador.deleteById(id);
    }
}
