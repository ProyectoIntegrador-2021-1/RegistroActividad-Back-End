package co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.manejador;

import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.ComandoActividades;
import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.fabrica.FabricaActividad;
import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.dominio.servicio.actividades.ServicioActualizarActividades;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarActividad {
    private final FabricaActividad fabricaActividad;
    private final ServicioActualizarActividades servicioActualizarActividades;

    public ManejadorActualizarActividad(FabricaActividad fabricaActividad, ServicioActualizarActividades servicioActualizarActividades) {
        this.fabricaActividad = fabricaActividad;
        this.servicioActualizarActividades = servicioActualizarActividades;
    }

    public void ejecutar(ComandoActividades comandoActividades){
        Actividades actividades = fabricaActividad.crear(comandoActividades);
        servicioActualizarActividades.ejecutar(actividades);
    }
}
