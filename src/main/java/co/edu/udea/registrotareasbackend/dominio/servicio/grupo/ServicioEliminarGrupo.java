package co.edu.udea.registrotareasbackend.dominio.servicio.grupo;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioGrupo;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarGrupo {

    private final RepositorioGrupo repositorioGrupo;

    public ServicioEliminarGrupo(RepositorioGrupo repositorioGrupo) {
        this.repositorioGrupo = repositorioGrupo;
    }

    public void ejecutar(Integer id) {
        repositorioGrupo.deleteById(id);
    }
}
