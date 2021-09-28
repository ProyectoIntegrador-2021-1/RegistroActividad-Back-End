package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.actividades.comando.ComandoActividades;
import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.ComandoCurso;
import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.manejadores.ManejadorActualizarCurso;
import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.manejadores.ManejadorCrearCurso;
import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.manejadores.ManejadorEliminarCurso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")
public class ComandoCursoController {
    private final ManejadorActualizarCurso manejadorActualizarCurso;
    private final ManejadorCrearCurso manejadorCrearCurso;
    private final ManejadorEliminarCurso manejadorEliminarCurso;

    public ComandoCursoController(ManejadorActualizarCurso manejadorActualizarCurso, ManejadorCrearCurso manejadorCrearCurso,
                                  ManejadorEliminarCurso manejadorEliminarCurso) {
        this.manejadorActualizarCurso = manejadorActualizarCurso;
        this.manejadorCrearCurso = manejadorCrearCurso;
        this.manejadorEliminarCurso = manejadorEliminarCurso;
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> crear(@RequestBody ComandoCurso comandoCurso) {

        try {
            Integer id = this.manejadorCrearCurso.ejecutar(comandoCurso);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/")
    public ResponseEntity<?> actualizar(@RequestBody ComandoCurso comandoCurso) {
        try {
            manejadorActualizarCurso.ejecutar(comandoCurso);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        try {
            manejadorEliminarCurso.ejecutar(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
