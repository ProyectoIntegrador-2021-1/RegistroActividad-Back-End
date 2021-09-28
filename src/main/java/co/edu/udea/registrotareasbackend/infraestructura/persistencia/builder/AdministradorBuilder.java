package co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder;


import co.edu.udea.registrotareasbackend.dominio.Administrador;
import co.edu.udea.registrotareasbackend.dominio.Persona;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.AdministradorEntity;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.PersonaEntity;

public class AdministradorBuilder {

    public static AdministradorEntity convertirAEntity(Administrador administrador) {
        AdministradorEntity administradorEntity = new AdministradorEntity();
        administradorEntity.setCargo(administrador.getCargo());
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setApellidos(administrador.getPersona().getApellidos());

        administradorEntity.setPersona(personaEntity);
        return administradorEntity;
    }

    public static Administrador convertirADominio(AdministradorEntity administradorEntity) {
      Administrador administrador = new Administrador(administradorEntity.getCargo(),
              PersonaBuilder.convertirEntityADominio(administradorEntity.getPersona()));

        return administrador;
    }
}
