package co.edu.udea.registrotareasbackend.aplicacion.curso.comando;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ComandoCurso {
    private Integer id;
    private String codigo;
    private String nombre;
    private Integer numeroCredito;
    private Integer totalHoras;
    private Grupo grupo;
    private Boolean estado;
}
