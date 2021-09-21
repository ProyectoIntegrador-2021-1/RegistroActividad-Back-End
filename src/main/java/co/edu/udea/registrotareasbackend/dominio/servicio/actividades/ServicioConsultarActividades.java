package co.edu.udea.registrotareasbackend.dominio.servicio.actividades;

import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.ActividadesBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioActividades;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioConsultarActividades {
    private final RepositorioActividades repositorioActividades;

    public ServicioConsultarActividades(RepositorioActividades repositorioActividades) {
        this.repositorioActividades = repositorioActividades;
    }

    public List<Actividades> ejecutar() {
        return ActividadesBuilder.convertirAListaDeDominio(repositorioActividades.findAll());
    }
}
