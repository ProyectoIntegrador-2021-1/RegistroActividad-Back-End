package co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.manejadores;

import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.ComandoSemestre;
import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.fabrica.FabricaSemestre;
import co.edu.udea.registrotareasbackend.dominio.servicio.semestre.ServicioActualizarSemestre;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarSemestre {
    private final FabricaSemestre fabricaSemestre;
    private final ServicioActualizarSemestre servicioActualizarSemestre;

    public ManejadorActualizarSemestre(FabricaSemestre fabricaSemestre, ServicioActualizarSemestre servicioActualizarSemestre) {
        this.fabricaSemestre = fabricaSemestre;
        this.servicioActualizarSemestre = servicioActualizarSemestre;
    }

    public void ejecutar(ComandoSemestre comandoSemestre) {
        this.servicioActualizarSemestre.ejecutar(fabricaSemestre.crear(comandoSemestre));
    }
}
