package co.edu.udea.registrotareasbackend.aplicacion.semestre.consulta;

import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.dominio.servicio.semestre.ServicioObtenerSemestre;

public class ManejadorConsultarPorId {
    private final ServicioObtenerSemestre servicioObtenerSemestre;

    public ManejadorConsultarPorId(ServicioObtenerSemestre servicioObtenerSemestre) {
        this.servicioObtenerSemestre = servicioObtenerSemestre;
    }

    public Semestre obtenerSemestre(Long id) {
        return servicioObtenerSemestre.obtenerSemestre(id);
    }
}
