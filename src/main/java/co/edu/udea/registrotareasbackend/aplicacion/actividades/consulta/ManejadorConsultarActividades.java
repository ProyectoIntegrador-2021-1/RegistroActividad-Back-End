package co.edu.udea.registrotareasbackend.aplicacion.actividades.consulta;

import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.dominio.servicio.actividades.ServicioConsultarActividades;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorConsultarActividades {
    private final ServicioConsultarActividades servicioConsultarActividades;

    public ManejadorConsultarActividades(ServicioConsultarActividades servicioConsultarActividades) {
        this.servicioConsultarActividades = servicioConsultarActividades;
    }

    public List<Actividades> listarActividades() {
        return this.servicioConsultarActividades.ejecutar();
    }
}
