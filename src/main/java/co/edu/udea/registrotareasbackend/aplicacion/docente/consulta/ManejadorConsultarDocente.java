package co.edu.udea.registrotareasbackend.aplicacion.docente.consulta;

import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.DocenteBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioDocente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorConsultarDocente {
    private final RepositorioDocente repositorioDocente;

    public ManejadorConsultarDocente(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }
    public List<Docente> ejecutar(){
     return DocenteBuilder.convertirAListaDeDominio(this.repositorioDocente.findAll());
    }
}
