package co.edu.udea.registrotareasbackend.infraestructura.controlador;

import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.ComandoAdministrador;
import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.manejador.ManejadorActualizarAdministrador;
import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.manejador.ManejadorCrearAdministrador;
import co.edu.udea.registrotareasbackend.aplicacion.administrador.comando.manejador.ManejadorEliminarAdministrador;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrador")
public class ComandoAdministradorController {
    private final ManejadorCrearAdministrador manejadorCrearAdministrador;
    private final ManejadorEliminarAdministrador manejadorEliminarAdministrador;
    private final ManejadorActualizarAdministrador manejadorActualizarAdministrador;

    public ComandoAdministradorController(ManejadorCrearAdministrador manejadorCrearAdministrador,
                                          ManejadorEliminarAdministrador manejadorEliminarAdministrador,
                                          ManejadorActualizarAdministrador manejadorActualizarAdministrador) {
        this.manejadorCrearAdministrador = manejadorCrearAdministrador;
        this.manejadorEliminarAdministrador = manejadorEliminarAdministrador;
        this.manejadorActualizarAdministrador = manejadorActualizarAdministrador;
    }

    @PostMapping(value = "/")
    public void crear(@RequestBody ComandoAdministrador comandoAdministrador) {
         manejadorCrearAdministrador.ejecutar(comandoAdministrador);
    }
    @PutMapping(value = "/")
    public void actualizar(@RequestBody ComandoAdministrador comandoAdministrador){
        manejadorActualizarAdministrador.ejecutar(comandoAdministrador);
    }
    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Long id){
        manejadorEliminarAdministrador.ejecutar(id);
    }
}
