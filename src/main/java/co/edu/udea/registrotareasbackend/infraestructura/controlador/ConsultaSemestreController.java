package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.semestre.consulta.ManejadorConsultarSemestrePorId;
import co.edu.udea.registrotareasbackend.aplicacion.semestre.consulta.ManejadorConsultarSemestres;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semestre")
public class ConsultaSemestreController {
    private final ManejadorConsultarSemestres manejadorConsultarSemestres;
    private final ManejadorConsultarSemestrePorId manejadorConsultarSemestrePorId;

    public ConsultaSemestreController(ManejadorConsultarSemestres manejadorConsultarSemestres,
                                      ManejadorConsultarSemestrePorId manejadorConsultarSemestrePorId) {
        this.manejadorConsultarSemestres = manejadorConsultarSemestres;
        this.manejadorConsultarSemestrePorId = manejadorConsultarSemestrePorId;
    }

    @GetMapping(value = "/")
    public ResponseEntity<?> consulta(){
        try {
            return new ResponseEntity<>(manejadorConsultarSemestres.listarSemestres(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> consultaPorId(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<>(manejadorConsultarSemestrePorId.obtenerSemestre(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
