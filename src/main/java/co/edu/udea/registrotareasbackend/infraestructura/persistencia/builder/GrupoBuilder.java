package co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder;

import co.edu.udea.registrotareasbackend.dominio.Grupo;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.GrupoEntity;

import java.util.ArrayList;
import java.util.List;

public class GrupoBuilder {


    public static List<GrupoEntity> convertirAListaEntity(List<Grupo> grupo) {
      List<GrupoEntity> listaGrupo = new ArrayList<GrupoEntity>();
      grupo.stream().forEach(grupo1 -> {
          listaGrupo.add(GrupoBuilder.convertirAEntity(grupo1));
      });
        return listaGrupo;
    }



    public static List<Grupo> convertirAListaDominio(List<GrupoEntity> grupo) {
        return null;
    }

    public static GrupoEntity convertirAEntity(Grupo grupo) {
        GrupoEntity grupoEntity = new GrupoEntity();
        grupoEntity.setId(grupo.getId());
        grupoEntity.setNombre(grupoEntity.getNombre());
        return grupoEntity;
    }

    public static Grupo convertirADominio(GrupoEntity grupo) {
        Grupo grupoDominio = new Grupo(grupo.getId(), grupo.getNombre());
        return grupoDominio;
    }
}
