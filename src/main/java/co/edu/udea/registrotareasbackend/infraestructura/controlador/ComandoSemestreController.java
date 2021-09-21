package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.ComandoCurso;
import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.ComandoSemestre;
import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.manejadores.ManejadorActualizarSemestre;
import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.manejadores.ManejadorCrearSemestre;
import co.edu.udea.registrotareasbackend.aplicacion.semestre.comando.manejadores.ManejadorEliminarSemestre;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/semestre")
public class ComandoSemestreController {
    private final ManejadorCrearSemestre manejadorCrearSemestre;
    private final ManejadorActualizarSemestre manejadorActualizarSemestre;
    private final ManejadorEliminarSemestre manejadorEliminarSemestre;

    public ComandoSemestreController(ManejadorCrearSemestre manejadorCrearSemestre, ManejadorActualizarSemestre manejadorActualizarSemestre,
                                     ManejadorEliminarSemestre manejadorEliminarSemestre) {
        this.manejadorCrearSemestre = manejadorCrearSemestre;
        this.manejadorActualizarSemestre = manejadorActualizarSemestre;
        this.manejadorEliminarSemestre = manejadorEliminarSemestre;
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> crear(@RequestBody ComandoSemestre comandoSemestre) {

        try {
            Integer id = this.manejadorCrearSemestre.ejecutar(comandoSemestre);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/")
    public ResponseEntity<?> actualizar(@RequestBody ComandoSemestre comandoSemestre) {
        try {
            manejadorActualizarSemestre.ejecutar(comandoSemestre);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        try {
            manejadorEliminarSemestre.ejecutar(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
