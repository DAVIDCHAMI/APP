package co.com.bancolombia.certificacion.app.models.entitidades;

import co.com.bancolombia.certificacion.app.models.terminosycondiciones.TerminosYCondiciones;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

public class EntidadTerminosYCondicionesActual {

    private static TerminosYCondiciones terminosYCondiciones = new TerminosYCondiciones();

    private EntidadTerminosYCondicionesActual() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }


    public static TerminosYCondiciones getTerminosYCondiciones() {
        return terminosYCondiciones;
    }

    public static void setTerminosYCondiciones(List<String> data) {
        terminosYCondiciones.setTyc(data.get(0));
    }
}
