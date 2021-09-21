package co.edu.udea.registrotareasbackend.dominio.servicio.semestre;

import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.SemestreBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioSemestre;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioConsultarSemestre {
    private final RepositorioSemestre repositorioSemestre;

    public ServicioConsultarSemestre(RepositorioSemestre repositorioSemestre) {
        this.repositorioSemestre = repositorioSemestre;
    }

    public List<Semestre> listarSemestres() {
       return SemestreBuilder.convertirAListaDominio(repositorioSemestre.findAll());
    }
}
