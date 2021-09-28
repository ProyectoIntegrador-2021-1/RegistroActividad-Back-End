package co.edu.udea.registrotareasbackend.dominio.servicio.semestre;

import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.SemestreBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioSemestre;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarSemestre {
    private final RepositorioSemestre repositorioSemestre;

    public ServicioActualizarSemestre(RepositorioSemestre repositorioSemestre) {
        this.repositorioSemestre = repositorioSemestre;
    }

    public void ejecutar(Semestre crear) {
        repositorioSemestre.save(SemestreBuilder.convertirAEntity(crear));
    }
}
