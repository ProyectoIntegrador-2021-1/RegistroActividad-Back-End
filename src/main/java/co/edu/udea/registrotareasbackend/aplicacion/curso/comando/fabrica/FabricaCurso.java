package co.edu.udea.registrotareasbackend.aplicacion.curso.comando.fabrica;

import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.ComandoCurso;
import co.edu.udea.registrotareasbackend.dominio.Curso;
import org.springframework.stereotype.Component;

@Component
public class FabricaCurso {

    public Curso crear(ComandoCurso curso) {
        return new Curso(curso.getId(),curso.getCodigo(),curso.getNombre(),curso.getNumeroCredito(),curso.getTotalHoras()
        ,curso.getGrupo(),curso.getEstado());
    }
}
