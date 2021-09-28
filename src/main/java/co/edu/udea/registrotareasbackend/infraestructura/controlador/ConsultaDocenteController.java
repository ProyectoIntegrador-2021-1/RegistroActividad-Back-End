package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.docente.consulta.ManejadorConsultarDocente;
import co.edu.udea.registrotareasbackend.aplicacion.docente.consulta.ManejadorConsultarDocentePorIdentificacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docente")
public class ConsultaDocenteController {
    private final ManejadorConsultarDocente manejadorConsultarDocente;
    private final ManejadorConsultarDocentePorIdentificacion manejadorConsultarDocentePorIdentificacion;

    public ConsultaDocenteController(ManejadorConsultarDocente manejadorConsultarDocente,
                                     ManejadorConsultarDocentePorIdentificacion manejadorConsultarDocentePorIdentificacion) {
        this.manejadorConsultarDocente = manejadorConsultarDocente;
        this.manejadorConsultarDocentePorIdentificacion = manejadorConsultarDocentePorIdentificacion;
    }
    @GetMapping(value = "/")
    public ResponseEntity<?> consulta(){
        try {
            return new ResponseEntity<>(manejadorConsultarDocente.ejecutar(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> consultaPorId(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<>(manejadorConsultarDocentePorIdentificacion.ejecutar(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
