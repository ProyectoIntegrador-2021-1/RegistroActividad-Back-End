package co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.manejador;

import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.ComandoAdministrador;
import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.fabrica.FabricaAdministrador;
import co.edu.udea.registrotareasbackend.dominio.Administrador;
import co.edu.udea.registrotareasbackend.dominio.servicio.administrador.ServicioActualizarAdministrador;
import co.edu.udea.registrotareasbackend.dominio.servicio.administrador.ServicioCrearAdministrador;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarAdministrador {
    private final FabricaAdministrador fabricaAdministrador;
    private final ServicioActualizarAdministrador servicioActualizarAdministrador;

    public ManejadorActualizarAdministrador(FabricaAdministrador fabricaAdministrador, ServicioActualizarAdministrador servicioActualizarAdministrador) {
        this.fabricaAdministrador = fabricaAdministrador;
        this.servicioActualizarAdministrador = servicioActualizarAdministrador;
    }

    public void ejecutar(ComandoAdministrador comandoAdministrador){
        Administrador administrador = fabricaAdministrador.crear(comandoAdministrador);
        this.servicioActualizarAdministrador.ejecutar(administrador);
    }
}
