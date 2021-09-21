package co.edu.udea.registrotareasbackend.infraestructura.controlador;


import co.edu.udea.registrotareasbackend.aplicacion.grupo.consulta.ManejadorConsultarGrupoPorId;
import co.edu.udea.registrotareasbackend.aplicacion.grupo.consulta.ManejadorConsultarGrupos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConsultaGrupoController {
    private final ManejadorConsultarGrupos manejadorConsultarGrupos;
    private final ManejadorConsultarGrupoPorId manejadorConsultarGrupoPorId;

    public ConsultaGrupoController(ManejadorConsultarGrupos manejadorConsultarGrupos, ManejadorConsultarGrupoPorId manejadorConsultarGrupoPorId) {
        this.manejadorConsultarGrupos = manejadorConsultarGrupos;
        this.manejadorConsultarGrupoPorId = manejadorConsultarGrupoPorId;
    }

    @GetMapping(value = "/")
    public ResponseEntity<?> consulta(){
        try {
            return new ResponseEntity<>(manejadorConsultarGrupos.listarGrupos(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> consultaPorId(@PathVariable("id") Integer id){
        try {
            return new ResponseEntity<>(manejadorConsultarGrupoPorId.obtenerGrupo(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
