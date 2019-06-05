package co.com.bancolombia.certificacion.app.tasks.cargadatos;

import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Collections;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * The type Transaction transaccionCon task.
 */
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

    public static CargarDatos enApp(List<String> datos) {
        return instrumented(CargarDatos.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //EntidadConfiguracionTransaccionActual.setConfiguracionTransaccion(datosTransaccion);
        //EntidadUsuarioActual.setUsuario(datosUsuario);

    }
}

