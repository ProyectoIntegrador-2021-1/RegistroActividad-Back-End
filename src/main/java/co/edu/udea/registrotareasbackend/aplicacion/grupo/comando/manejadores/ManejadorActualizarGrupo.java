package co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.manejadores;

import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.ComandoGrupo;
import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.fabrica.FabricaGrupo;
import co.edu.udea.registrotareasbackend.dominio.servicio.grupo.ServicioActualizarGrupo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarGrupo {
    private final FabricaGrupo fabricaGrupo;
    private final ServicioActualizarGrupo servicioActualizarGrupo;

    public ManejadorActualizarGrupo(FabricaGrupo fabricaGrupo, ServicioActualizarGrupo servicioActualizarGrupo) {
        this.fabricaGrupo = fabricaGrupo;
        this.servicioActualizarGrupo = servicioActualizarGrupo;
    }

    public void ejecutar(ComandoGrupo comandoGrupo){
        servicioActualizarGrupo.ejecutar(fabricaGrupo.crear(comandoGrupo));
    }
}
