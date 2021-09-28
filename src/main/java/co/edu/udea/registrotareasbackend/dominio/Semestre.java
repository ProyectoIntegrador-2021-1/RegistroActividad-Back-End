package co.edu.udea.registrotareasbackend.dominio;

import lombok.Getter;

import java.util.Date;

@Getter
public class Semestre {
    private Integer id;
    private Date fechaInicio;
    private Date fechaFin;

    public Semestre(Integer id, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
