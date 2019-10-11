#language: es

Característica: Descarga monto tarjeta virtual ePrepago
  Yo como usuario de la app Personas Bancolombia quiero descargar mi tarjeta virtual ePrepago para tener mas saldo

  Esquema del escenario: Descarga exitosa a tarjeta ePrepago activa
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiere descargar el valor total de una tarjeta virtual e-Prepago activa
      | tipoCuenta   | numeroCuenta   |
      | <tipoCuenta> | <numeroCuenta> |
    Entonces el deberia de ver un mensaje descarga ePrepago exitosa
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorDescarga | tipoCuenta | numeroCuenta  |
    ##@externaldata@./src/test/resources/datadriven/e-prepago/descargar_tarjeta_virtual_eprepago.xlsx@Datos@1
   |1   |333333304   |1   |autotest32   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |10.000   |Ahorros   |406-733040-20|
