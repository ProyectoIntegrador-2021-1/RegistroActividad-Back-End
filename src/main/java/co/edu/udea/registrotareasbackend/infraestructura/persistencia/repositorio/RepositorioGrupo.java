package co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.GrupoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioGrupo extends JpaRepository<GrupoEntity, Integer> {
}
