package co.edu.udea.registrotareasbackend.dominio.servicio.semestre;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioSemestre;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarSemestre {
    private final RepositorioSemestre repositorioSemestre;

    public ServicioEliminarSemestre(RepositorioSemestre repositorioSemestre) {
        this.repositorioSemestre = repositorioSemestre;
    }

    public void ejecutar(Integer id) {
        this.repositorioSemestre.deleteById(id.longValue());
    }
}
