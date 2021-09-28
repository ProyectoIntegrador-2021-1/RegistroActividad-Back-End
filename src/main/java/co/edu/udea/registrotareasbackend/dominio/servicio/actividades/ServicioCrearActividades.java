package co.edu.udea.registrotareasbackend.dominio.servicio.actividades;

import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.ActividadesBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioActividades;
import org.springframework.stereotype.Component;

@Component
public class ServicioCrearActividades {
    private  final RepositorioActividades repositorioActividades;

    public ServicioCrearActividades(RepositorioActividades repositorioActividades) {
        this.repositorioActividades = repositorioActividades;
    }

    public Long ejecutar(Actividades crear) {
        Long id = repositorioActividades.save(ActividadesBuilder.convertirAEntity(crear)).getId();
        return id;
    }
}
