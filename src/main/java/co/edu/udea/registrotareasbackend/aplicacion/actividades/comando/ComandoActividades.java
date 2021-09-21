package co.edu.udea.registrotareasbackend.aplicacion.actividades.comando;

import co.edu.udea.registrotareasbackend.dominio.Curso;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComandoActividades {
    private Long id;
    private String titulo;
    private String codigo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Curso curso;
}
