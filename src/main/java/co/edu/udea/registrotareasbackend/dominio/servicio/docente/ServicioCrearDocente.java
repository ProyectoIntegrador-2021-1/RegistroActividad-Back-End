package co.edu.udea.registrotareasbackend.dominio.servicio.docente;

import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.DocenteBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioDocente;
import org.springframework.stereotype.Component;

@Component
public class ServicioCrearDocente {
    private final RepositorioDocente repositorioDocente;

    public ServicioCrearDocente(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }

    public Long ejecutar(Docente docente) {
     return    this.repositorioDocente.save(DocenteBuilder.convertirAEntity(docente)).getId();
    }
}
