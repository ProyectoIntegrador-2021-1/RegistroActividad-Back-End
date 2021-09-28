package co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="persona")
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "genero")
    private String genero;
}
