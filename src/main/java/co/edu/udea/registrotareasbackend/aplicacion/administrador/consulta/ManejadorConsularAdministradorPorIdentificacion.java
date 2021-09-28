package co.edu.udea.registrotareasbackend.aplicacion.administrador.consulta;

import co.edu.udea.registrotareasbackend.dominio.Administrador;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.AdministradorBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioAdministrador;
import org.springframework.stereotype.Component;

@Component
public class ManejadorConsularAdministradorPorIdentificacion {
    private  final RepositorioAdministrador repositorioAdministrador;

    public ManejadorConsularAdministradorPorIdentificacion(RepositorioAdministrador repositorioAdministrador) {
        this.repositorioAdministrador = repositorioAdministrador;
    }

    public Administrador ejecutar(String identificacion){
        return AdministradorBuilder.convertirADominio( this.repositorioAdministrador.buscarPorIdentificacion(identificacion));
    }
}
