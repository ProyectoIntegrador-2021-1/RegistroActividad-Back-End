package co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad;

import co.edu.udea.registrotareasbackend.dominio.Persona;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "administrativo")
public class AdministradorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cargo")
    private String cargo;
    @OneToOne
    private PersonaEntity persona;
}
