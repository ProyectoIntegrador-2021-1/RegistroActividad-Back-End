package co.edu.udea.registrotareasbackend.infraestructura.controlador;


import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.ComandoActividades;
import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.manejador.ManejadorActualizarActividad;
import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.manejador.ManejadorCrearActividad;
import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.manejador.ManejadorEliminarActividad;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actividades")
public class ComandoActividadesController {

    private final ManejadorCrearActividad manejadorCrearActividad;
    private final ManejadorActualizarActividad manejadorActualizarActividad;
    private final ManejadorEliminarActividad manejadorEliminarActividad;

    public ComandoActividadesController(ManejadorCrearActividad manejadorCrearActividad, ManejadorActualizarActividad
            manejadorActualizarActividad, ManejadorEliminarActividad manejadorEliminarActividad) {
        this.manejadorCrearActividad = manejadorCrearActividad;
        this.manejadorActualizarActividad = manejadorActualizarActividad;
        this.manejadorEliminarActividad = manejadorEliminarActividad;
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> crear(@RequestBody ComandoActividades comandoActividades) {

        try {
            Long id = manejadorCrearActividad.ejecutar(comandoActividades);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/")
    public ResponseEntity<?> actualizar(@RequestBody ComandoActividades comandoActividades) {
        try {
            manejadorActualizarActividad.ejecutar(comandoActividades);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        try {
            manejadorEliminarActividad.ejecutar(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
