package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.curso.comando.ComandoCurso;
import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.ComandoGrupo;
import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.manejadores.ManejadorActualizarGrupo;
import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.manejadores.ManejadorCrearGrupo;
import co.edu.udea.registrotareasbackend.aplicacion.grupo.comando.manejadores.ManejadorEliminarGrupo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grupo")
public class ComandoGrupoController {

    private final ManejadorCrearGrupo manejadorCrearGrupo;
    private final ManejadorActualizarGrupo manejadorActualizarGrupo;
    private final ManejadorEliminarGrupo manejadorEliminarGrupo;

    public ComandoGrupoController(ManejadorCrearGrupo manejadorCrearGrupo, ManejadorActualizarGrupo manejadorActualizarGrupo,
                                  ManejadorEliminarGrupo manejadorEliminarGrupo) {
        this.manejadorCrearGrupo = manejadorCrearGrupo;
        this.manejadorActualizarGrupo = manejadorActualizarGrupo;
        this.manejadorEliminarGrupo = manejadorEliminarGrupo;
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> crear(@RequestBody ComandoGrupo comandoGrupo) {

        try {
            Integer id = this.manejadorCrearGrupo.ejecutar(comandoGrupo);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/")
    public ResponseEntity<?> actualizar(@RequestBody ComandoGrupo comandoGrupo) {
        try {
            manejadorActualizarGrupo.ejecutar(comandoGrupo);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        try {
            manejadorEliminarGrupo.ejecutar(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
