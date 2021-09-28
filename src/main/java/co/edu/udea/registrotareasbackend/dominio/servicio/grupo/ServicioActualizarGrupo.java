package co.edu.udea.registrotareasbackend.dominio.servicio.grupo;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.GrupoBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.GrupoEntity;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioGrupo;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarGrupo {

    private final RepositorioGrupo repositorioGrupo;

    public ServicioActualizarGrupo(RepositorioGrupo repositorioGrupo) {
        this.repositorioGrupo = repositorioGrupo;
    }

    public void ejecutar(Grupo grupo) {
        repositorioGrupo.save(GrupoBuilder.convertirAEntity(grupo));
    }
}
