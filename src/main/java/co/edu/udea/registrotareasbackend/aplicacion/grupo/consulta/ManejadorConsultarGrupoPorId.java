package co.edu.udea.registrotareasbackend.aplicacion.grupo.consulta;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.dominio.servicio.grupo.ServicioObtenerGrupo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorConsultarGrupoPorId {
    private final ServicioObtenerGrupo servicioObtenerGrupo;

    public ManejadorConsultarGrupoPorId(ServicioObtenerGrupo servicioObtenerGrupo) {
        this.servicioObtenerGrupo = servicioObtenerGrupo;
    }


    public Grupo obtenerGrupo(Integer id) {
      return  servicioObtenerGrupo.obtenerGrupo(id);
    }
}
