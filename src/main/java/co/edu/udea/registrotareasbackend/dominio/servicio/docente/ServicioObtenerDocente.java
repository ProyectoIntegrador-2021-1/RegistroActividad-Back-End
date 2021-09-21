package co.edu.udea.registrotareasbackend.dominio.servicio.docente;


import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder.DocenteBuilder;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio.RepositorioDocente;


public class ServicioObtenerDocente {

    private final RepositorioDocente repositorioDocente;

    public ServicioObtenerDocente(RepositorioDocente repositorioDocente) {
        this.repositorioDocente = repositorioDocente;
    }

    public Docente ejecutar(Long id) {
      return DocenteBuilder.convertirADominio(this.repositorioDocente.findById(id).get());
    }
}
