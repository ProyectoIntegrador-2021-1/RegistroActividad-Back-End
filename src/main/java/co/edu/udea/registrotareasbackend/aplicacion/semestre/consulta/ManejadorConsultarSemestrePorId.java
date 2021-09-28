package co.edu.udea.registrotareasbackend.aplicacion.semestre.consulta;

import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.dominio.servicio.semestre.ServicioObtenerSemestre;
import org.springframework.stereotype.Component;

@Component
public class ManejadorConsultarSemestrePorId {
    private final ServicioObtenerSemestre servicioObtenerSemestre;

    public ManejadorConsultarSemestrePorId(ServicioObtenerSemestre servicioObtenerSemestre) {
        this.servicioObtenerSemestre = servicioObtenerSemestre;
    }

    public Semestre obtenerSemestre(Long id) {
        return servicioObtenerSemestre.obtenerSemestre(id);
    }
}
