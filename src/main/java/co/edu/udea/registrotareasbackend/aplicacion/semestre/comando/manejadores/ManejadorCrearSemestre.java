package co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.manejadores;

import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.ComandoSemestre;
import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.fabrica.FabricaSemestre;
import co.edu.udea.registrotareasbackend.dominio.servicio.semestre.ServicioCrearSemestre;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearSemestre {
    private final FabricaSemestre fabricaSemestre;
    private final ServicioCrearSemestre servicioCrearSemestre;

    public ManejadorCrearSemestre(FabricaSemestre fabricaSemestre, ServicioCrearSemestre servicioCrearSemestre) {
        this.fabricaSemestre = fabricaSemestre;
        this.servicioCrearSemestre = servicioCrearSemestre;
    }

    public Integer ejecutar(ComandoSemestre comandoSemestre){
        return servicioCrearSemestre.ejecutar(fabricaSemestre.crear(comandoSemestre));
    }
}
