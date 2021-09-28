package co.edu.udea.registrotareasbackend.aplicacion.curso.comando.manejadores;

import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.ComandoCurso;
import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.fabrica.FabricaCurso;
import co.edu.udea.registrotareasbackend.dominio.servicio.curso.ServicioActualizarCurso;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarCurso {
    private final FabricaCurso fabricaCurso;
    private final ServicioActualizarCurso servicioActualizarCurso;

    public ManejadorActualizarCurso(FabricaCurso fabricaCurso, ServicioActualizarCurso servicioActualizarCurso) {
        this.fabricaCurso = fabricaCurso;
        this.servicioActualizarCurso = servicioActualizarCurso;
    }

    public void ejecutar(ComandoCurso comandoCurso){
        servicioActualizarCurso.ejecutar(fabricaCurso.crear(comandoCurso));
    }
}
