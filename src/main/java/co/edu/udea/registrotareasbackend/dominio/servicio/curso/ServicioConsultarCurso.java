package co.edu.udea.registrotareasbackend.dominio.servicio.curso;



import co.edu.udea.registrotareasbackend.dominio.Curso;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.CursoBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioCurso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioConsultarCurso {
    private final RepositorioCurso repositorioCurso;

    public ServicioConsultarCurso(RepositorioCurso repositorioCurso) {
        this.repositorioCurso = repositorioCurso;
    }

    public List<Curso> consultar() {
        return CursoBuilder.convertirAlistaDominio(repositorioCurso.findAll());
    }

    public Curso listarCursosPorId(Integer id) {
        return CursoBuilder.convertirADominio(repositorioCurso.findById(id).get());
    }
}
