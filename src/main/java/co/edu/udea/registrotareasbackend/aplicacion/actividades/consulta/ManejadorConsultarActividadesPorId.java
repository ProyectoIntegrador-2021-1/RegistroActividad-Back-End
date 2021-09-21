package co.edu.udea.registrotareasbackend.aplicacion.actividades.consulta;

import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.dominio.servicio.actividades.ServicioObtenerActividad;
import org.springframework.stereotype.Component;

@Component
public class ManejadorConsultarActividadesPorId {
    private final ServicioObtenerActividad servicioObtenerActividad;

    public ManejadorConsultarActividadesPorId(ServicioObtenerActividad servicioObtenerActividad) {
        this.servicioObtenerActividad = servicioObtenerActividad;
    }

    public Actividades obtenerActividad(Long id){
      return  servicioObtenerActividad.obtener(id);
    }
}
