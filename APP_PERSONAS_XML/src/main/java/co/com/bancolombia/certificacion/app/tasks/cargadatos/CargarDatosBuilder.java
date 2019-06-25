package co.com.bancolombia.certificacion.app.tasks.cargadatos;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CargarDatosBuilder {

    private List<String> datosTransaccion;
    private List<String> datosUsuario;


    CargarDatosBuilder(List<String> datosTransaccion) {
        this.datosTransaccion = datosTransaccion;
    }


    public CargarDatos datosDelUsuarioCon(List<String> datosUsuario) {
        this.datosUsuario = datosUsuario;
        return instrumented(CargarDatos.class, this);
    }

    public List<String> getDatosTransaccion() {
        return datosTransaccion;
    }

    public void setDatosTransaccion(List<String> datosTransaccion) {
        this.datosTransaccion = datosTransaccion;
    }

    public List<String> getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(List<String> datosUsuario) {
        this.datosUsuario = datosUsuario;
    }
}