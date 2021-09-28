package co.edu.udea.registrotareasbackend.dominio.servicio.grupo;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.GrupoBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioGrupo;
import org.springframework.stereotype.Service;

@Service
public class ServicioObtenerGrupo {

    private final RepositorioGrupo repositorioGrupo;

    public ServicioObtenerGrupo(RepositorioGrupo repositorioGrupo) {
        this.repositorioGrupo = repositorioGrupo;
    }

    public Grupo obtenerGrupo(Integer id) {
       return GrupoBuilder.convertirADominio(repositorioGrupo.findById(id).get());
    }
}
