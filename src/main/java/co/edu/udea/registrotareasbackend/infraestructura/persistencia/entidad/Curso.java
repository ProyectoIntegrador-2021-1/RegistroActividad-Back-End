package co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "curso")
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private Boolean estado;
}
