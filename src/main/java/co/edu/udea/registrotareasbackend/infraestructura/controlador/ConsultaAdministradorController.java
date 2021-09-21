package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.administrador.consulta.ManejadorConsularAdministradorPorIdentificacion;
import co.edu.udea.registrotareasbackend.dominio.Administrador;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/administrador")
public class ConsultaAdministradorController {

    private final ManejadorConsularAdministradorPorIdentificacion manejadorConsularAdministradorPorIdentificacion;

    public ConsultaAdministradorController(ManejadorConsularAdministradorPorIdentificacion manejadorConsularAdministradorPorIdentificacion) {
        this.manejadorConsularAdministradorPorIdentificacion = manejadorConsularAdministradorPorIdentificacion;
    }

    @GetMapping(value = "/{identificacion}")
    public ResponseEntity<?> obtenerAdministrador(@PathVariable("identificacion") String identificacion){
        try {

        return new ResponseEntity<>(manejadorConsularAdministradorPorIdentificacion.ejecutar(identificacion), HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
