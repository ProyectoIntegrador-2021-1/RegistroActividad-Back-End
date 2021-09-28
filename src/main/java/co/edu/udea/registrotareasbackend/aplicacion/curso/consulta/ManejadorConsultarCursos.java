package co.edu.udea.registrotareasbackend.aplicacion.curso.consulta;

import co.edu.udea.registrotareasbackend.dominio.Curso;
import co.edu.udea.registrotareasbackend.dominio.servicio.curso.ServicioConsultarCurso;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorConsultarCursos {
    private final ServicioConsultarCurso servicioConsultarCurso;

    public ManejadorConsultarCursos(ServicioConsultarCurso servicioConsultarCurso) {
        this.servicioConsultarCurso = servicioConsultarCurso;
    }

    public List<Curso> listarCursos() {
        return servicioConsultarCurso.consultar();
    }
}
