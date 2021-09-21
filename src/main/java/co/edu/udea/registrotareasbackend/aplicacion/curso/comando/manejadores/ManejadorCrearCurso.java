package co.edu.udea.registrotareasbackend.aplicacion.curso.comando.manejadores;

import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.ComandoCurso;
import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.fabrica.FabricaCurso;
import co.edu.udea.registrotareasbackend.dominio.servicio.curso.ServicioCrearCurso;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCurso {
    private final FabricaCurso fabricaCurso;
    private final ServicioCrearCurso servicioCrearCurso;

    public ManejadorCrearCurso(FabricaCurso fabricaCurso, ServicioCrearCurso servicioCurso) {
        this.fabricaCurso = fabricaCurso;
        this.servicioCrearCurso = servicioCurso;
    }

    public Integer ejecutar(ComandoCurso comandoCurso){
        return servicioCrearCurso.ejecutar(fabricaCurso.crear(comandoCurso));
    }
}
