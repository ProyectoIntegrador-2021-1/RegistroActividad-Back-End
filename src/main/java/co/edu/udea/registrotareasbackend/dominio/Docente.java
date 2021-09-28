package co.edu.udea.registrotareasbackend.dominio;


import co.edu.udea.registrotareasbackend.dominio.validadores.Validador;
import lombok.Getter;

import java.util.List;

@Getter
public class Docente {
    private Long id;
    private String especialidad;
    private String area;
    private Persona persona;
    private List<Grupo> Grupo;

    public Docente(Long id,String especialidad, String area, Persona persona, List<Grupo> grupo) {
        Validador.validarObjecto(area, "");
        Validador.validarObjecto(persona,"");
        Validador.validarObjecto(grupo,"");
        Validador.validarString(especialidad, "");
        this.id = id;
        this.especialidad = especialidad;
        this.area = area;
        this.persona = persona;
        Grupo = grupo;
    }
}
