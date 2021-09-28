package co.edu.udea.registrotareasbackend.dominio.servicio.grupo;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.GrupoBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioGrupo;
import org.springframework.stereotype.Service;

@Service
public class ServicioCrearGrupo {
    private final RepositorioGrupo repositorioGrupo;

    public ServicioCrearGrupo(RepositorioGrupo repositorioGrupo) {
        this.repositorioGrupo = repositorioGrupo;
    }


    public Integer ejecutar(Grupo grupo) {
       return repositorioGrupo.save(GrupoBuilder.convertirAEntity(grupo)).getId();
    }
}
