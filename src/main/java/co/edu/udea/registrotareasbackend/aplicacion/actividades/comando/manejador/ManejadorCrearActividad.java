package co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.manejador;

import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.ComandoActividades;
import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.fabrica.FabricaActividad;
import co.edu.udea.registrotareasbackend.dominio.servicio.actividades.ServicioCrearActividades;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearActividad {
    private final FabricaActividad fabricaActividad;
    private final ServicioCrearActividades servicioCrearActividades;

    public ManejadorCrearActividad(FabricaActividad fabricaActividad, ServicioCrearActividades servicioActualizarActividades) {
        this.fabricaActividad = fabricaActividad;
        this.servicioCrearActividades = servicioActualizarActividades;
    }

    public Long ejecutar(ComandoActividades comandoActividades){
        Long id = servicioCrearActividades.ejecutar(fabricaActividad.crear(comandoActividades));
        return id;
    }
}
