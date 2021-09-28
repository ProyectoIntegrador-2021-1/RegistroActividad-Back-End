package co.edu.udea.registrotareasbackend.dominio.servicio.curso;

import co.edu.udea.registrotareasbackend.dominio.Curso;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.CursoBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.CursoEntity;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioCurso;
import org.springframework.stereotype.Component;

@Component
public class ServicioCrearCurso {

    private final RepositorioCurso repositorioCurso;

    public ServicioCrearCurso(RepositorioCurso repositorioCurso) {
        this.repositorioCurso = repositorioCurso;
    }

    public Integer ejecutar(Curso curso) {
        return  repositorioCurso.save(CursoBuilder.convertirAEntity(curso)).getId();
    }
}
