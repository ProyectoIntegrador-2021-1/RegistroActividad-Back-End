package co.edu.udea.registrotareasbackend.dominio;

import co.edu.udea.registrotareasbackend.dominio.validadores.Validador;
import lombok.Getter;

@Getter
public class Persona {

    private Integer id;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String genero;

    public Persona(Integer id, String identificacion,String nombres, String apellidos, String correo, String telefono, String genero) {

        Validador.validarString(nombres, "");
        Validador.validarString(apellidos, "");
        Validador.validarString(correo, "");
        Validador.validarString(telefono, "");
        Validador.validarString(genero, "");
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
    }
}
