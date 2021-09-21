package co.edu.udea.registrotareasbackend.aplicacion.semestre.consulta;

import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.dominio.servicio.semestre.ServicioConsultarSemestre;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorConsultarSemestres {
    private final ServicioConsultarSemestre servicioConsultarSemestre;

    public ManejadorConsultarSemestres(ServicioConsultarSemestre servicioConsultarSemestre) {
        this.servicioConsultarSemestre = servicioConsultarSemestre;
    }

    public List<Semestre> listarSemestres() {
        return servicioConsultarSemestre.listarSemestres();
    }
}
