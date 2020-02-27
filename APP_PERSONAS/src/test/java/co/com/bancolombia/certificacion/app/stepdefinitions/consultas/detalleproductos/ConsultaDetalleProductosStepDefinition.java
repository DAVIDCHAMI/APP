package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.detalleproductos;

import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ConsultaCrediagilNoEsCorrectaException.CONSULTA_CREDIAGIL_NO_ES_CORRECTA;
import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.DetalleProductoNoEsCorrectoException.MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ConsultaCrediagilNoEsCorrectaException;
import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.DetalleProductoNoEsCorrectoException;
import co.com.bancolombia.certificacion.app.questions.consultas.VerificarDetalle;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.*;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.ConsultarDetalle;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductosVistaCarrusel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class ConsultaDetalleProductosStepDefinition {

  @Y("^consulto en (.*) el detalle de mi Cuenta (.*) numero (.*)$")
  public void consultoElSaldoDeMisCuentasDeposito(
      String opcionCategoria, String tipoCuenta, String numeroCuenta) {
    theActorInTheSpotlight()
        .attemptsTo(ConsultarDetalle.deProductoCuentas(opcionCategoria, tipoCuenta, numeroCuenta));
  }

  @Y("^consulto en (.*) el detalle de mi tarjeta (.*) numero (.*)$")
  public void consultoDetalleEprepago(
      String opcionCategoria, String tipoCuenta, String numeroCuenta) {
    theActorInTheSpotlight()
        .attemptsTo(ConsultarDetalle.deEprepago(opcionCategoria, tipoCuenta, numeroCuenta));
  }

  @Cuando("^consulto el detalle de tarjeta de credito (.*) numero (.*)$")
  public void consultoDetalleDeTarjetaCredito(String tipoCuenta, String numeroCuenta) {
    theActorInTheSpotlight()
        .attemptsTo(ConsultarDetalle.deProductoTarjetas(tipoCuenta, numeroCuenta));
  }

  @Cuando("^consulto el detalle de tarjeta ecard con (.*) y numero (.*)$")
  public void consultoeldetalledetarjetaecardcon(String tipoTarjeta, String numeroTarjeta) {
    theActorInTheSpotlight().attemptsTo(ConsultarDetalle.deEcard(tipoTarjeta, numeroTarjeta));
  }

  @Cuando("^consulto desde la vista carrusel el detalle de tarjeta ecard$")
  public void consultoDesdeLaVistaCarruselElDetalleDeTarjetaEcard() {
    theActorInTheSpotlight().attemptsTo(RevisarProductosVistaCarrusel.DeEcard());
  }

  @Cuando("^consulto el detalle de inversion con (.*) y con numero (.*)$")
  public void consultoDetalleDeInversion(String tipoCuenta, String numeroCuenta) {
    theActorInTheSpotlight().attemptsTo(ConsultarDetalle.deInversion(tipoCuenta, numeroCuenta));
  }

  @Cuando("^consulto en el detalle de (.*)$")
  public void consultoDetalleCrediagil(String opcionCategoria) {
    theActorInTheSpotlight().attemptsTo(ConsultarDetalle.deCrediagil(opcionCategoria));
  }

  @Entonces("^deberia de ver el detalle de mi cuenta de ahorro$")
  public void verificoElResultadoDeLaConsultaDelSaldo() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarDetalleProductoDeposito.esExitoso())
                .orComplainWith(
                    DetalleProductoNoEsCorrectoException.class,
                    MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO));
  }

  @Entonces("^deberia de ver el detalle de mi tarjeta eprepago$")
  public void verificoElResultadoDeLaConsultaDeEprepago() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarDetalleEprepago.esExitoso())
                .orComplainWith(
                    DetalleProductoNoEsCorrectoException.class,
                    MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO));
  }

  @Entonces("^deberia de ver el detalle de mi tarjeta de credito$")
  public void verificoElResultadoDeLaConsultaDeTarjetaCredito() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarDetalleProductoTarjetas.esExitoso())
                .orComplainWith(
                    DetalleProductoNoEsCorrectoException.class,
                    MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO));
  }

  @Entonces("^deberia de ver el detalle de mi ecard$")
  public void deberiaDeVerElDetalleDeMiEcard() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarDetalle.deEcard())
                .orComplainWith(
                    DetalleProductoNoEsCorrectoException.class,
                    MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO));
  }

  @Entonces("^deberia de ver el detalle de mi inversion$")
  public void verificoElResultadoDeLaConsultaDeInversion() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarDetalleInversiones.esExitoso())
                .orComplainWith(
                    DetalleProductoNoEsCorrectoException.class,
                    MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO));
  }

  @Y("^consulto en (.*) el detalle de mi credito de consumo con (.*) numero (.*)$")
  public void consultoElDetalleDelCreditoDeConsumo(
      String opcionCategoria, String tipoCredito, String numeroCredito) {
    theActorInTheSpotlight()
        .attemptsTo(
            ConsultarDetalle.deCreditosConsumo(opcionCategoria, tipoCredito, numeroCredito));
  }

  @Y("^deberia de ver el detalle de mi credito de consumo$")
  public void deberiaDeVerElDetalleDeMiCreditoDeConsumo() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarDetalleProductoCreditos.esExitoso())
                .orComplainWith(
                    DetalleProductoNoEsCorrectoException.class,
                    MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO));
  }

  @Y("^deberia de ver el detalle del crediagil$")
  public void deberiaDeVerElDetalleDeMiCrediagil() {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarDetalleCrediagil.exitoso())
                .orComplainWith(
                    ConsultaCrediagilNoEsCorrectaException.class,
                    CONSULTA_CREDIAGIL_NO_ES_CORRECTA));
  }
}
