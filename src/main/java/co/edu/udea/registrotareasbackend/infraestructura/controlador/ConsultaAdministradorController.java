package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.administrador.consulta.ManejadorConsularAdministradorPorIdentificacion;
import co.edu.udea.registrotareasbackend.dominio.Administrador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    private final ManejadorConsularAdministradorPorIdentificacion manejadorConsularAdministradorPorIdentificacion;

    public AdministradorController(ManejadorConsularAdministradorPorIdentificacion manejadorConsularAdministradorPorIdentificacion) {
        this.manejadorConsularAdministradorPorIdentificacion = manejadorConsularAdministradorPorIdentificacion;
    }

    @GetMapping(value = "/{identificacion}")
    public Administrador obtenerAdministrador(@PathVariable("identificacion") String identificacion){
        return manejadorConsularAdministradorPorIdentificacion.ejecutar(identificacion);
    }
}
