package co.edu.udea.registrotareasbackend.dominio.servicio.docente;


import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioDocente;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarDocente {
    private final RepositorioDocente repositorioDocente;

    public ServicioEliminarDocente(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }

    public void ejecutar(Long id) {
        this.repositorioDocente.deleteById(id);
    }
}
