package co.edu.udea.registrotareasbackend.infraestructura.persistencia.builder;

import co.edu.udea.registrotareasbackend.dominio.Curso;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.CursoEntity;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.GrupoEntity;

import java.util.ArrayList;
import java.util.List;

public class CursoBuilder {
    public static CursoEntity convertirAEntity(Curso curso) {
        CursoEntity cursoEntity = new CursoEntity();
        cursoEntity.setGrupo(GrupoBuilder.convertirAEntity(curso.getGrupo()));
        cursoEntity.setNombre(curso.getNombre());
        cursoEntity.setCodigo(curso.getCodigo());
        cursoEntity.setEstado(curso.getEstado());
        cursoEntity.setNumeroCreditos(curso.getNumeroCredito());
        cursoEntity.setTotalHoras(curso.getTotalHoras());
        return  cursoEntity;
    }

    public static Curso convertirADominio(CursoEntity curso) {
        Curso cursoDominio = new Curso(curso.getId(),curso.getCodigo(),curso.getNombre(),curso.getNumeroCreditos()
        ,curso.getTotalHoras(), GrupoBuilder.convertirADominio(curso.getGrupo()),curso.getEstado());
        return cursoDominio;
    }

    public static List<Curso> convertirAlistaDominio(List<CursoEntity> cursos) {
        List<Curso> lista = new ArrayList<Curso>();
        cursos.stream().forEach(curso ->{
            lista.add(convertirADominio(curso));
        });
        return lista;
    }
}
