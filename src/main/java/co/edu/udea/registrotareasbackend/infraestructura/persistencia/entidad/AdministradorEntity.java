package co.edu.udea.registrotareasbackend.infraestructura.persistencia.entidad;

import co.edu.udea.registrotareasbackend.dominio.Persona;

import javax.persistence.*;

public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cargo")
    private String cargo;
    @OneToOne
    private Persona persona;
}
