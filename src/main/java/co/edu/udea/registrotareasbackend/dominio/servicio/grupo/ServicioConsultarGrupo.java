package co.edu.udea.registrotareasbackend.dominio.servicio.grupo;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.GrupoBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioGrupo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioConsultarGrupo {

    private final RepositorioGrupo repositorioGrupo;

    public ServicioConsultarGrupo(RepositorioGrupo repositorioGrupo) {
        this.repositorioGrupo = repositorioGrupo;
    }

    public List<Grupo> listarGrupos() {
        return GrupoBuilder.convertirAListaDominio(repositorioGrupo.findAll());
    }
}
