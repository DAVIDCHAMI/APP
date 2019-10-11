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
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | tipoTarjeta               | numeroTarjeta | tipoPago   | valorPago | moneda | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/pagos/TarjetaCreditoPropia.xlsx@Datos@3
   |3   |22493944   |1   |pagotdc1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Personal American Express   |*0702   |Otro valor   |1000   |Pesos   |Ahorros   |406-738430-25|

  Esquema del escenario: Pago de tarjetas de crédito propias mayor a la deuda
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_TARJETAS_DE_CREDITO_PROPIAS
    Y quiere pagar la tarjeta de crédito propia mayor a la deuda
      | tipoTarjeta   | numeroTarjeta   | tipoPago   | valorPago   | moneda   | tipoCuenta   | numeroCuenta   |
      | <tipoTarjeta> | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia de ver el mensaje de valor supera el total de la deuda
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | tipoTarjeta               | numeroTarjeta | tipoPago   | valorPago | moneda | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/pagos/TarjetaCreditoPropia.xlsx@Datos@4
   |4   |22493944   |1   |invictus10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Personal American Express   |*7806   |Otro valor   |1000   |Pesos   |   ||

  Esquema del escenario: Pago de tarjetas de crédito propias desde cuenta sin saldo
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_TARJETAS_DE_CREDITO_PROPIAS
    Y quiere pagar la tarjeta de crédito propia
      | tipoTarjeta   | numeroTarjeta   | tipoPago   | valorPago   | moneda   | tipoCuenta   | numeroCuenta   |
      | <tipoTarjeta> | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia ver el mensaje de error: cuenta origen sin saldo
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | tipoTarjeta               | numeroTarjeta | tipoPago   | valorPago | moneda | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/pagos/TarjetaCreditoPropia.xlsx@Datos@5
      |3   |22493944   |1   |pagotdc1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Personal American Express   |*0702   |Otro valor   |1000   |Pesos   |Ahorros   |406-738430-25|