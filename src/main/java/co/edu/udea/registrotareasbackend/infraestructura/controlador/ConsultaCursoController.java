package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.curso.consulta.ManejadorConsultarCursoPorId;
import co.edu.udea.registrotareasbackend.aplicacion.curso.consulta.ManejadorConsultarCursos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class ConsultaCursoController {
    private final ManejadorConsultarCursos manejadorConsultarCursos;
    private final ManejadorConsultarCursoPorId manejadorConsultarCursoPorId;

    public ConsultaCursoController(ManejadorConsultarCursos manejadorConsultarCursos,
                                   ManejadorConsultarCursoPorId manejadorConsultarCursoPorId) {
        this.manejadorConsultarCursos = manejadorConsultarCursos;
        this.manejadorConsultarCursoPorId = manejadorConsultarCursoPorId;
    }

    @GetMapping(value = "/")
    public ResponseEntity<?> consulta(){
        try {
            return new ResponseEntity<>(manejadorConsultarCursos.listarCursos(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> consultaPorId(@PathVariable("id") Integer id){
        try {
            return new ResponseEntity<>(manejadorConsultarCursoPorId.listarCursosPorId(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
