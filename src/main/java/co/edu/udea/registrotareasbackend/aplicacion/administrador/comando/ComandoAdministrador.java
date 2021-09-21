package co.edu.udea.registrotareasbackend.aplicacion.administrador.comando;

import co.edu.udea.registrotareasbackend.dominio.Persona;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComandoAdministrador {
    private String cargo;
    private Persona persona;
}
