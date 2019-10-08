#language: es

Característica: Descarga monto tarjeta virtual ePrepago
  Yo como usuario de la app Personas Bancolombia quiero descargar mi tarjeta virtual ePrepago para tener mas saldo

  Esquema del escenario: Descarga exitosa a tarjeta ePrepago activa
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere DESCARGAR_EPREPAGO
    Y quiere descargar una tarjeta virtual ePrepago activa
      | valorDescarga   | opcionSubmenu   |
      | <valorDescarga> | <opcionSubmenu> |
    Entonces el deberia de ver un mensaje descarga ePrepago exitosa
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorDescarga | opcionSubmenu |
    ##@externaldata@./src/test/resources/datadriven/e-prepago/descargar_tarjeta_virtual_eprepago.xlsx@Datos@1