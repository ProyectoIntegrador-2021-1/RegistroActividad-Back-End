package co.edu.udea.registrotareasbackend.dominio.validadores;

import co.edu.udea.registrotareasbackend.dominio.excepcion.ExcepcionPersonalida;

public class Validador {

    public static void validarObjecto(Object o, String mensaje) {
        if (o == null) {
            throw new ExcepcionPersonalida(mensaje);
        }
    }

    public static void validarString(String valor, String mensaje) {
        if (valor == null) {
            throw new ExcepcionPersonalida(mensaje);
        } else {
            if (valor.isEmpty()) {
                throw new ExcepcionPersonalida(mensaje);
            }
        }
    }
}
