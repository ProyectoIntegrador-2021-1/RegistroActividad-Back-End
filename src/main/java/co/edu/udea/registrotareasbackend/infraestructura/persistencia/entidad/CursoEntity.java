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
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "numero_creditos")
    private Integer numeroCreditos;

    @Column(name = "total_horas")
    private Integer totalHoras;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private GrupoEntity grupo;

    @Column(name = "estado")
    private Boolean estado;
}
