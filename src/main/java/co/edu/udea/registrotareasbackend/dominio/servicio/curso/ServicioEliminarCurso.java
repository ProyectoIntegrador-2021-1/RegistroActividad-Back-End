package co.edu.udea.registrotareasbackend.dominio.servicio.curso;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioCurso;
import org.springframework.stereotype.Component;

@Component
public class ServicioEliminarCurso {
    private final RepositorioCurso repositorioCurso;

    public ServicioEliminarCurso(RepositorioCurso repositorioCurso) {
        this.repositorioCurso = repositorioCurso;
    }
    public void ejecutar(Integer id) {
        repositorioCurso.deleteById(id);
    }
}
