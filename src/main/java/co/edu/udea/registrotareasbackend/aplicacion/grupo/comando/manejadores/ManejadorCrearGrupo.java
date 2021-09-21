package co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.manejadores;

import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.ComandoGrupo;
import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.fabrica.FabricaGrupo;
import co.edu.udea.registrotareasbackend.dominio.servicio.grupo.ServicioCrearGrupo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearGrupo   {
    private final FabricaGrupo fabricaGrupo;
    private final ServicioCrearGrupo servicioCrearGrupo;

    public ManejadorCrearGrupo(FabricaGrupo fabricaGrupo, ServicioCrearGrupo servicioCrearGrupo) {
        this.fabricaGrupo = fabricaGrupo;
        this.servicioCrearGrupo = servicioCrearGrupo;
    }

    public Integer ejecutar(ComandoGrupo comandoGrupo){
        return servicioCrearGrupo.ejecutar(fabricaGrupo.crear(comandoGrupo));
    }
}
