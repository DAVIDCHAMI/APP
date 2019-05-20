package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Autenticarse implements Task {

        private String usuario;
        private String clave;

        public Autenticarse(AutenticarseBuilder datosAutenticacion) {

            this.usuario = datosAutenticacion.getUsuario();
            this.clave = datosAutenticacion.getClave();
        }

        public static AutenticarseBuilder conUsuario(String usuario) {

           return new AutenticarseBuilder(usuario);

        }

         @Override
        public <T extends Actor> void performAs(T actor) {

            EntidadUsuarioActual.setUsuarioYClave(usuario,clave);

        }
}

