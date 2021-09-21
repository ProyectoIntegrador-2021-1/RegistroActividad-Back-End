package co.edu.udea.registrotareasbackend.dominio;

import co.edu.udea.registrotareasbackend.dominio.validadores.Validador;
import lombok.Getter;

@Getter
public class Grupo {
    private Integer id;
    private String nombres;

    public Grupo(Integer id, String nombres) {

        Validador.validarString(nombres, "");
        this.id = id;
        this.nombres = nombres;
    }
}
