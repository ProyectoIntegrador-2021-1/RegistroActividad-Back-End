package co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder;

import co.edu.udea.registrotareasbackend.dominio.Persona;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.PersonaEntity;

public class PersonaBuilder {
    public static Persona convertirEntityADominio(PersonaEntity persona){
        Persona personaBuild = new Persona(persona.getId(), persona.getIdentificacion(), persona.getNombres(), persona.getApellidos(), persona.getCorreo(), persona.getTelefono(), persona.getGenero());
    return personaBuild;
    }

    public static PersonaEntity convertirDominioAEntity(Persona persona) {
        PersonaEntity personaEntity = new PersonaEntity(persona.getId(), persona.getNombres(), persona.getApellidos(),
                persona.getIdentificacion(),persona.getCorreo(), persona.getTelefono(), persona.getGenero());
        return personaEntity;
    }
}
