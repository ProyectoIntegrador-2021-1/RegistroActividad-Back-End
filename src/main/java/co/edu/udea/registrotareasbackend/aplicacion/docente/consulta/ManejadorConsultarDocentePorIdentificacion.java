package co.edu.udea.registrotareasbackend.aplicacion.docente.consulta;

import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.DocenteBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioDocente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorConsultarDocentePorIdentificacion {
    private final RepositorioDocente repositorioDocente;

    public ManejadorConsultarDocentePorIdentificacion(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }

    public Docente ejecutar(Long id) {
        return DocenteBuilder.convertirADominio(this.repositorioDocente.findById(id).get());
    }
}
