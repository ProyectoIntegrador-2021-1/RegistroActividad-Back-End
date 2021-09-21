package co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.fabrica;

import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.ComandoGrupo;
import co.edu.udea.registrotareasbackend.dominio.Grupo;
import org.springframework.stereotype.Component;

@Component
public class FabricaGrupo {
    public Grupo crear(ComandoGrupo comandoGrupo){
        return new Grupo(comandoGrupo.getId(),comandoGrupo.getNombres());
    }
}
