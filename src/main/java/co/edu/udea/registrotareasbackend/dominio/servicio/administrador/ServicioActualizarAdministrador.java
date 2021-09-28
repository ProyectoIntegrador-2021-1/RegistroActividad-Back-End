package co.edu.udea.registrotareasbackend.dominio.servicio.administrador;

import co.edu.udea.registrotareasbackend.dominio.Administrador;
;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.AdministradorBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioAdministrador;
import org.springframework.stereotype.Component;

@Component
public class ServicioActualizarAdministrador {
    private final RepositorioAdministrador repositorioAdministrador;

    public ServicioActualizarAdministrador(RepositorioAdministrador repositorioAdministrador) {
        this.repositorioAdministrador = repositorioAdministrador;
    }
    public void ejecutar(Administrador administrador){
        this.repositorioAdministrador.save(AdministradorBuilder.convertirAEntity(administrador));
    }
}
