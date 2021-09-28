package co.edu.udea.registrotareasbackend.aplicacion.grupo.consulta;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.dominio.servicio.grupo.ServicioConsultarGrupo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorConsultarGrupos {
    private final ServicioConsultarGrupo servicioConsultarGrupo;

    public ManejadorConsultarGrupos(ServicioConsultarGrupo servicioConsultarGrupo) {
        this.servicioConsultarGrupo = servicioConsultarGrupo;
    }

    public List<Grupo> listarGrupos(){
        return servicioConsultarGrupo.listarGrupos();
    }
}
