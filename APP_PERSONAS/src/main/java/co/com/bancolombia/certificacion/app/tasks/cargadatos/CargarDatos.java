package co.com.bancolombia.certificacion.app.tasks.cargadatos;

import co.com.bancolombia.certificacion.app.models.entitidades.EntidadConfiguracionTransaccionActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

public class CargarDatos implements Task {
    private  List<String> datosTransaccion;
    private  List<String> datosUsuario;
    private List<String> datoPago;

    public CargarDatos(CargarDatosBuilder datosTransaccionBuilder) {
        this.datosTransaccion= datosTransaccionBuilder.getDatosTransaccion();
        this.datosUsuario = datosTransaccionBuilder.getDatosUsuario();
        this.datoPago = datosTransaccionBuilder.getDatoPago();
    }

    public static CargarDatosBuilder transaccionCon(List<String> data) {
        return new CargarDatosBuilder(data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        EntidadConfiguracionTransaccionActual.setConfiguracionTransaccion(datosTransaccion);
        EntidadUsuarioActual.setUsuario(datosUsuario);
    }
}

