package co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder;


import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.DocenteEntity;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.GrupoEntity;

import java.util.List;

public class DocenteBuilder {
    public static DocenteEntity convertirAEntity(Docente docente) {
        DocenteEntity docenteEntity = new DocenteEntity();
        docenteEntity.setId(docente.getId());
        docenteEntity.setArea(docenteEntity.getArea());
        docenteEntity.setEspecialidad(docente.getEspecialidad());
        docenteEntity.setGrupo(GrupoBuilder.convertirAListaEntity(docente.getGrupo()));
        docenteEntity.setPersona(PersonaBuilder.convertirDominioAEntity(docente.getPersona()));
        return docenteEntity;
    }

    public static Docente convertirADominio(DocenteEntity docenteEntity) {
        Docente docente = new Docente(docenteEntity.getId(), docenteEntity.getEspecialidad(), docenteEntity.getArea(),
                PersonaBuilder.convertirEntityADominio(docenteEntity.getPersona()),
                GrupoBuilder.convertirAListaDominio(docenteEntity.getGrupo()));
        return null;
    }


    public static List<Docente> convertirAListaDeDominio(List<DocenteEntity> all) {
        return null;
    }
}
