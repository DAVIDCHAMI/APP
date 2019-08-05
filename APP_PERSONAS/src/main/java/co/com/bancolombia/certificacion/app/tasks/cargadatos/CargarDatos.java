package co.com.bancolombia.certificacion.app.tasks.cargadatos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

public class CargarDatos implements Task {
    private  List<String> datosTransaccion;
    private  List<String> datosUsuario;

    public CargarDatos(CargarDatosBuilder datosTransaccionBuilder) {
        this.datosTransaccion= datosTransaccionBuilder.getDatosTransaccion();
        this.datosUsuario = datosTransaccionBuilder.getDatosUsuario();
    }

    public static CargarDatosBuilder transaccionCon(List<String> data) {
        return new CargarDatosBuilder(data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}

