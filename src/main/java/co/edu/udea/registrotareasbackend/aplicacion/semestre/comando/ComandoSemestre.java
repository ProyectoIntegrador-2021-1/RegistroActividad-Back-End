package co.edu.udea.registrotareasbackend.aplicacion.semestre.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComandoSemestre {
    private Integer id;
    private Date fechaInicio;
    private Date fechaFin;
}
