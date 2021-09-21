package co.edu.udea.registrotareasbackend.aplicacion.docente.comando.manejador;

import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.ComandoDocente;
import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.fabrica.FabricaDocente;
import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.dominio.servicio.docente.ServicioActualizarDocente;
import co.edu.udea.registrotareasbackend.dominio.servicio.docente.ServicioCrearDocente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarDocente {
    private final ServicioActualizarDocente servicioActualizarDocente;
    private final FabricaDocente fabricaDocente;

    public ManejadorActualizarDocente(ServicioActualizarDocente servicioActualizarDocente, FabricaDocente fabricaDocente) {
        this.servicioActualizarDocente = servicioActualizarDocente;
        this.fabricaDocente = fabricaDocente;
    }
    public void  ejecutar(ComandoDocente comandoDocente){
        Docente docente = fabricaDocente.crear(comandoDocente);
        this.servicioActualizarDocente.ejecutar(docente);
    }

}
