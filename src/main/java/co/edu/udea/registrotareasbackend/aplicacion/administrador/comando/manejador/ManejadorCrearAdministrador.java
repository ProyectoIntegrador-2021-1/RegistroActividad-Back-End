package co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.manejador;

import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.ComandoAdministrador;
import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.fabrica.FabricaAdministrador;
import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.fabrica.FabricaDocente;
import co.edu.udea.registrotareasbackend.dominio.Administrador;
import co.edu.udea.registrotareasbackend.dominio.servicio.administrador.ServicioCrearAdministrador;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearAdministrador {
    private final FabricaAdministrador fabricaAdministrador;
    private final ServicioCrearAdministrador servicioCrearAdministrador;

    public ManejadorCrearAdministrador(FabricaAdministrador fabricaAdministrador, ServicioCrearAdministrador servicioCrearAdministrador) {
        this.fabricaAdministrador = fabricaAdministrador;
        this.servicioCrearAdministrador = servicioCrearAdministrador;
    }

    public void ejecutar(ComandoAdministrador comandoAdministrador){
        Administrador administrador = fabricaAdministrador.crear(comandoAdministrador);
         this.servicioCrearAdministrador.ejecutar(administrador);
    }
}
