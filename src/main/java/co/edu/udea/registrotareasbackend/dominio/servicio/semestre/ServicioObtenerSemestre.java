package co.edu.udea.registrotareasbackend.dominio.servicio.semestre;

import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.SemestreBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioSemestre;
import org.springframework.stereotype.Service;

@Service
public class ServicioObtenerSemestre {
    private final RepositorioSemestre repositorioSemestre;

    public ServicioObtenerSemestre(RepositorioSemestre repositorioSemestre) {
        this.repositorioSemestre = repositorioSemestre;
    }

    public Semestre obtenerSemestre(Long id) {
        return SemestreBuilder.convertirADominio(repositorioSemestre.findById(id).get());
    }
}
