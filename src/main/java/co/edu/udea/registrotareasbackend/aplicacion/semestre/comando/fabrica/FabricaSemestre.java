package co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.fabrica;

import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.ComandoSemestre;
import co.edu.udea.registrotareasbackend.dominio.Semestre;
import org.springframework.stereotype.Component;

@Component
public class FabricaSemestre {

    public Semestre crear(ComandoSemestre comandoSemestre) {
        return new Semestre(comandoSemestre.getId(),comandoSemestre.getFechaInicio(),comandoSemestre.getFechaFin());
    }

}
