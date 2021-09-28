package co.edu.udea.registrotareasbackend.dominio;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.CursoEntity;
import lombok.Getter;

import java.util.Date;

@Getter
public class Actividades {
    private Long id;
    private String titulo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Curso curso;
    private Boolean estado;

    public Actividades(Long id, String titulo, String descripcion, Date fechaInicio, Date fechaFin, Curso curso) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.curso = curso;
    }

}
