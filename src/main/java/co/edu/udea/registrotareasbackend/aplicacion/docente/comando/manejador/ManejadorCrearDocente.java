package co.edu.udea.registrotareasbackend.aplicacion.docente.comando.manejador;

import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.ComandoDocente;
import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.fabrica.FabricaDocente;
import co.edu.udea.registrotareasbackend.dominio.Docente;
import co.edu.udea.registrotareasbackend.dominio.servicio.docente.ServicioCrearDocente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearDocente {
    private final ServicioCrearDocente servicioCrearDocente;
    private final FabricaDocente fabricaDocente;

    public ManejadorCrearDocente(ServicioCrearDocente servicioCrearDocente, FabricaDocente fabricaDocente) {
        this.servicioCrearDocente = servicioCrearDocente;
        this.fabricaDocente = fabricaDocente;
    }
    public Long ejecutar(ComandoDocente comandoDocente){
        Docente docente = this.fabricaDocente.crear(comandoDocente);
        return this.servicioCrearDocente.ejecutar(docente);
    }
}
