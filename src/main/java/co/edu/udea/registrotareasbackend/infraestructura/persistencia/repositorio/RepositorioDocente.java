package co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDocente extends JpaRepository<DocenteEntity, Long> {
}
