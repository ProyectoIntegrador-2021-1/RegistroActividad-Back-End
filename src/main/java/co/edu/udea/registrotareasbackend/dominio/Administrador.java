package co.edu.udea.registrotareasbackend.dominio;

import co.edu.udea.registrotareasbackend.dominio.validadores.Validador;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Administrador  {
    private String cargo;
    private Persona persona;

    public Administrador(String cargo, Persona persona) {
        //Validador.validarString(cargo,"");
       // Validador.validarObjecto(persona, "");
        this.cargo = cargo;
        this.persona = persona;
    }
}
