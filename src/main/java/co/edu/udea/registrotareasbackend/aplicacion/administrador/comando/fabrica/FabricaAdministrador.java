package co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.fabrica;

import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.ComandoAdministrador;
import co.edu.udea.registrotareasbackend.dominio.Administrador;
import org.springframework.stereotype.Component;

@Component
public class FabricaAdministrador {
    public Administrador crear(ComandoAdministrador comandoAdministrador){
        return new Administrador(comandoAdministrador.getCargo(),
                comandoAdministrador.getPersona());
    }
}
