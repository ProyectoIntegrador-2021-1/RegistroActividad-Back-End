package co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "actividad")
@Entity
public class ActividadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private CursoEntity curso;

    @Column(name = "estado")
    private Boolean estado;
}
