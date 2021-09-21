package co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder;

import co.edu.udea.registrotareasbackend.dominio.Actividades;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.ActividadEntity;

import java.util.ArrayList;
import java.util.List;

public class ActividadesBuilder {
    public static ActividadEntity convertirAEntity(Actividades actividades) {
        ActividadEntity entity = new ActividadEntity();

        entity.setCurso(CursoBuilder.convertirAEntity(actividades.getCurso()));
        return entity;
    }

    public static List<Actividades> convertirAListaDeDominio(List<ActividadEntity> lista) {
        List<Actividades> listarActividades = new ArrayList<Actividades>();
        lista.stream().forEach(actividad -> {
            listarActividades.add(convertirADominio(actividad));
        });
        return listarActividades;
    }

    public static Actividades convertirADominio(ActividadEntity actividad) {
        Actividades actividades = new Actividades(actividad.getId(), actividad.getTitulo(),
                actividad.getDescripcion(), actividad.getFechaInicio(), actividad.getFechaFin(),
                CursoBuilder.convertirADominio(actividad.getCurso()));
        return actividades;
    }
}
