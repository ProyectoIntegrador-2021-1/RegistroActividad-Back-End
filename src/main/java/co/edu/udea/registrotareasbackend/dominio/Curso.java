package co.edu.udea.registrotareasbackend.dominio;

import lombok.Getter;

@Getter
public class Curso {
    private Integer id;
    private String codigo;
    private String nombre;
    private Integer numeroCredito;
    private Integer totalHoras;
    private Grupo grupo;
    private Boolean estado;

    public Curso(Integer id, String codigo, String nombre, Integer numeroCredito, Integer totalHoras, Grupo grupo, Boolean estado) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCredito = numeroCredito;
        this.totalHoras = totalHoras;
        this.grupo = grupo;
        this.estado = estado;
    }
}
