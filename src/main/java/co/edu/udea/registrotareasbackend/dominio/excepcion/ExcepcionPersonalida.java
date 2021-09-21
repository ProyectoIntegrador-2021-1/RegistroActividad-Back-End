package co.edu.udea.registrotareasbackend.dominio.excepcion;

public class ExcepcionPersonalida extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionPersonalida(String message) {
        super(message);
    }
}
