package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AutenticarseBuilder {

    private String usuario;
    private String clave;

    public AutenticarseBuilder(String usuario) {
        this.usuario = usuario;
    }

    public Autenticarse yClave(String clave) {
        this.clave = clave;
        return instrumented(Autenticarse.class, this);

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
