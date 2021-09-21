package co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.manejadores;

import co.edu.udea.registrotareasbackend.dominio.servicio.grupo.ServicioEliminarGrupo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarGrupo {
    private final ServicioEliminarGrupo servicioEliminarGrupo;

    public ManejadorEliminarGrupo(ServicioEliminarGrupo servicioEliminarGrupo) {
        this.servicioEliminarGrupo = servicioEliminarGrupo;
    }

    public void ejecutar(Integer id){
        this.servicioEliminarGrupo.ejecutar(id);
    }
}
