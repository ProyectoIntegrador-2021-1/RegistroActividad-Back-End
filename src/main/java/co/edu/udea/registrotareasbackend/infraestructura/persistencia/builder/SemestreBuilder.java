package co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder;

import co.edu.udea.registrotareasbackend.dominio.Semestre;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.SemestreEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SemestreBuilder {
    public static SemestreEntity convertirAEntity(Semestre semestre) {
        SemestreEntity entity = new SemestreEntity();
        entity.setId(semestre.getId());
        entity.setFechaInicio(semestre.getFechaInicio());
        entity.setFechaFin(semestre.getFechaFin());
        return  entity;
    }

    public static Semestre convertirADominio(SemestreEntity semestre) {
        Semestre semestreDomain = new Semestre(semestre.getId(),semestre.getFechaInicio(),semestre.getFechaFin());
        return  semestreDomain;
    }

    public static List<Semestre> convertirAListaDominio(List<SemestreEntity> semestres) {
        List<Semestre> listarSemestres = new ArrayList<Semestre>();
        semestres.stream().forEach(semestre->{
            listarSemestres.add(convertirADominio(semestre));
        });

        return listarSemestres;
    }
}
