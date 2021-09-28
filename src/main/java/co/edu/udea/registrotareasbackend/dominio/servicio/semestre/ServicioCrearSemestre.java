package co.edu.udea.registrotareasbackend.dominio.servicio.semestre;

import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.ComandoSemestre;
import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.SemestreBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioSemestre;
import org.springframework.stereotype.Service;

@Service
public class ServicioCrearSemestre {
    private final RepositorioSemestre repositorioSemestre;

    public ServicioCrearSemestre(RepositorioSemestre repositorioSemestre) {
        this.repositorioSemestre = repositorioSemestre;
    }

    public Integer ejecutar(Semestre semestre){
        return repositorioSemestre.save(SemestreBuilder.convertirAEntity(semestre)).getId();
    }
}
