package co.edu.udea.registrotareasbackend.dominio.servicio.actividades;

import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.ActividadesBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioActividades;
import org.springframework.stereotype.Service;

@Service
public class ServicioObtenerActividad {
    private final RepositorioActividades repositorioActividades;

    public ServicioObtenerActividad(RepositorioActividades repositorioActividades) {
        this.repositorioActividades = repositorioActividades;
    }

    public Actividades obtener(Long id) {
        return ActividadesBuilder.convertirADominio(repositorioActividades.findById(id).get());
    }
}
