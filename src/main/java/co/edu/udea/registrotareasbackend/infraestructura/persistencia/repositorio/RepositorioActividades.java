package co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.ActividadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioActividades extends JpaRepository<ActividadEntity,Long> {
}
