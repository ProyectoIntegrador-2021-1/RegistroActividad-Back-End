package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.ComandoCurso;
import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.ComandoDocente;
import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.manejador.ManejadorActualizarDocente;
import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.manejador.ManejadorCrearDocente;
import co.edu.udea.registrotareasbackend.aplicacion.docente.comando.manejador.ManejadorEliminarDocente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docente")
public class ComandoDocenteController {

    private final ManejadorCrearDocente manejadorCrearDocente;
    private final ManejadorActualizarDocente manejadorActualizarDocente;
    private final ManejadorEliminarDocente manejadorEliminarDocente;

    public ComandoDocenteController(ManejadorCrearDocente manejadorCrearDocente, ManejadorActualizarDocente manejadorActualizarDocente,
                                    ManejadorEliminarDocente manejadorEliminarDocente) {
        this.manejadorCrearDocente = manejadorCrearDocente;
        this.manejadorActualizarDocente = manejadorActualizarDocente;
        this.manejadorEliminarDocente = manejadorEliminarDocente;
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> crear(@RequestBody ComandoDocente comandoDocente) {

        try {
            Long id = this.manejadorCrearDocente.ejecutar(comandoDocente);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/")
    public ResponseEntity<?> actualizar(@RequestBody ComandoDocente comandoCurso) {
        try {
            manejadorActualizarDocente.ejecutar(comandoCurso);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        try {
            manejadorEliminarDocente.ejecutar(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
