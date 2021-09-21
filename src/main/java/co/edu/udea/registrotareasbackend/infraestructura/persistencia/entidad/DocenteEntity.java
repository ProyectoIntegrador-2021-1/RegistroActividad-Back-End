package co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "docente")
public class DocenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "especialidad")
    private String especialidad;
    @Column(name = "area")
    private String area;
    @OneToOne
    private PersonaEntity persona;
    @OneToMany
    private List<GrupoEntity> grupo;
}
