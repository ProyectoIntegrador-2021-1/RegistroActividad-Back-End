package co.edu.udea.registrotareasbackend.dominio.servicio.administrador;

import co.edu.udea.registrotareasbackend.dominio.Administrador;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.AdministradorBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioAdministrador;
import org.springframework.stereotype.Component;

@Component
public class ServicioObtenerAdministrador {
    private final RepositorioAdministrador repositorioAdministrador;

    public ServicioObtenerAdministrador(RepositorioAdministrador repositorioAdministrador) {
        this.repositorioAdministrador = repositorioAdministrador;
    }

    public Administrador ejecutar(String documento) {
      return AdministradorBuilder.convertirADominio(this.repositorioAdministrador.buscarPorIdentificacion(documento));
    }
}
