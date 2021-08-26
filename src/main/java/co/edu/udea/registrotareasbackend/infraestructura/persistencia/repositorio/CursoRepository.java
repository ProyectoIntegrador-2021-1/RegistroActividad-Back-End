package co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio;

import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
