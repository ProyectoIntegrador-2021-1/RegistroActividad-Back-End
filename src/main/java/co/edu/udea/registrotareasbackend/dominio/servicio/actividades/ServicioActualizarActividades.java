package co.edu.udea.registrotareasbackend.dominio.servicio.actividades;

import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.ActividadesBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioActividades;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarActividades {
    private final RepositorioActividades repositorioActividades;

    public ServicioActualizarActividades(RepositorioActividades repositorioActividades) {
        this.repositorioActividades = repositorioActividades;
    }

    public void ejecutar(Actividades actividades) {
        repositorioActividades.save(ActividadesBuilder.convertirAEntity(actividades));
    }
}
