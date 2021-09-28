package co.edu.udea.registrotareasbackend.aplicacion.docente.comando;


import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.dominio.Persona;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComandoDocente {
    private Long id;
    private String especialidad;
    private String area;
    private Persona persona;
    private List<Grupo> Grupo;
}
