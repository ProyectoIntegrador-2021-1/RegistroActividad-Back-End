package co.edu.udea.registrotareasbackend.aplicacion.docente.comando.fabrica;

import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.ComandoDocente;
import co.edu.udea.registrotareasbackend.dominio.Docente;
import org.springframework.stereotype.Component;

@Component
public class FabricaDocente {

    public Docente crear(ComandoDocente comandoDocente) {
        return new Docente(comandoDocente.getId(),comandoDocente.getEspecialidad(),
                comandoDocente.getArea(),
                comandoDocente.getPersona(),
                comandoDocente.getGrupo()
        );
    }
}
