package co.edu.udea.registrotareasbackend.infraestructura.persistencia.repositorio;

import co.edu.udea.registrotareasbackend.dominio.Administrador;
import co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad.AdministradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAdministrador extends  JpaRepository<AdministradorEntity, Long> {
    @Query(value = "Select a from AdministradorEntity a where a.persona.identificacion = :documento ")
    AdministradorEntity buscarPorIdentificacion(@Param("documento") String documento);


}
