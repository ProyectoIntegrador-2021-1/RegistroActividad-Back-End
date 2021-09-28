package co.edu.udea.registrotareasbackend.dominio.servicio.docente;

import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.DocenteBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioDocente;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarDocente {
    private final RepositorioDocente repositorioDocente;

    public ServicioActualizarDocente(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }

    public void ejecutar(Docente docente){
        this.repositorioDocente.save(DocenteBuilder.convertirAEntity(docente));
    }
}
