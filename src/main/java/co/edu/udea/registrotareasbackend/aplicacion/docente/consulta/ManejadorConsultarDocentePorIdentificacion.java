package co.edu.udea.registrotareasbackend.aplicacion.docente.consulta;

import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.dominio.repositorio.RepositorioDocente;

public class ManejadorBuscarDocentePorIdentificacion {
    private final RepositorioDocente repositorioDocente;

    public ManejadorBuscarDocentePorIdentificacion(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }

    public Docente ejecutar(Long id) {
       return this.repositorioDocente.buscarPorId(id);
    }
}
