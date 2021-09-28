package co.edu.udea.registrotareasbackend.dominio.servicio.actividades;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioActividades;
import org.springframework.stereotype.Component;

@Component
public class ServicioEliminarActividades {
    private final RepositorioActividades repositorioActividades;

    public ServicioEliminarActividades(RepositorioActividades repositorioActividades) {
        this.repositorioActividades = repositorioActividades;
    }

    public void ejecutar(Long id) {
        repositorioActividades.deleteById(id);
    }
}
