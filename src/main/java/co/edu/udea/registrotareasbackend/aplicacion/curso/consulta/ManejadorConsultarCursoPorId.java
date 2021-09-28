package co.edu.udea.registrotareasbackend.aplicacion.curso.consulta;

import co.edu.udea.registrotareasbackend.dominio.Curso;
import co.edu.udea.registrotareasbackend.dominio.servicio.curso.ServicioConsultarCurso;
import org.springframework.stereotype.Component;

@Component
public class ManejadorConsultarCursoPorId {
    private final ServicioConsultarCurso servicioConsultarCurso;

    public ManejadorConsultarCursoPorId(ServicioConsultarCurso servicioConsultarCurso) {
        this.servicioConsultarCurso = servicioConsultarCurso;
    }

    public Curso listarCursosPorId(Integer id) {
        return servicioConsultarCurso.listarCursosPorId(id);
    }
}
