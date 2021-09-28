package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.actividades.consulta.ManejadorConsultarActividades;
import co.edu.udea.registrotareasbackend.aplicacion.actividades.consulta.ManejadorConsultarActividadesPorId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actividades")
public class ConsultaActividadesController {
    private final ManejadorConsultarActividades manejadorConsultarActividades;
    private final ManejadorConsultarActividadesPorId manejadorConsultarActividadesPorId;

    public ConsultaActividadesController(ManejadorConsultarActividades manejadorConsultarActividades,
                                         ManejadorConsultarActividadesPorId manejadorConsultarActividadesPorId) {
        this.manejadorConsultarActividades = manejadorConsultarActividades;
        this.manejadorConsultarActividadesPorId = manejadorConsultarActividadesPorId;
    }

    @GetMapping(value = "/")
    public ResponseEntity<?> consultar() {
        try {
            return new ResponseEntity<>(manejadorConsultarActividades.listarActividades(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> obteneractividadPorId(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<>(manejadorConsultarActividadesPorId.obtenerActividad(id), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
