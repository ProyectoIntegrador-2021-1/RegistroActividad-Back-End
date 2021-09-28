package co.edu.udea.registrotareasbackend.dominio.servicio.curso;

import co.edu.udea.registrotareasbackend.dominio.Curso;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.CursoBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioCurso;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarCurso {
   private final RepositorioCurso repositorioCurso;

    public ServicioActualizarCurso(RepositorioCurso repositorioCurso) {
        this.repositorioCurso = repositorioCurso;
    }

    public void ejecutar(Curso curso) {
        repositorioCurso.save(CursoBuilder.convertirAEntity(curso));
    }
}
