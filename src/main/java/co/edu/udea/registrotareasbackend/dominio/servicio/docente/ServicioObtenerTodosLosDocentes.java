package co.edu.udea.registrotareasbackend.dominio.servicio.docente;

import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.DocenteBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioDocente;


import java.util.List;

public class ServicioObtenerTodosLosDocentes {
    private final RepositorioDocente repositorioDocente;

    public ServicioObtenerTodosLosDocentes(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }

    public List<Docente> ejecutar() {
        return DocenteBuilder.convertirAListaDeDominio( this.repositorioDocente.findAll());
    }
}
