#language: es

Característica: Pago de tarjetas de crédito propias

  Esquema del escenario: Pago de tarjetas de crédito propias
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_TARJETAS_DE_CREDITO_PROPIAS
    Y quiere pagar la tarjeta de crédito propia
      | tipoTarjeta   | numeroTarjeta   | tipoPago   | valorPago   | moneda   | tipoCuenta   | numeroCuenta   |
      | <tipoTarjeta> | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia de ver el mensaje de confirmación y la información de su pago
    #Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | tipoTarjeta   | numeroTarjeta | tipoPago            | valorPago | moneda | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/tarjetacredito/TarjetaCreditoPropia.xlsx@Datos@3
   |3   |22493944   |1   |userrobot1   |6789   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Personal Visa   |*5880   |Otro valor   |480369   |Pesos   |Ahorros   |406-739440-03|
