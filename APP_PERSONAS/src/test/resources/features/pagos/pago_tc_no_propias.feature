#language: es

Característica: Pago de tarjetas de credito no propias
  Yo como usuario de Bancolombia
  Quiero realizar el pago de una tarjeta de credito no propia
  Para saldar las deudas externas

  @RutaCritica
  Esquema del escenario: Pago de tarjetas de credito no propias
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_TARJETAS_DE_CREDITO_NO_PROPIAS
    Y quiere pagar la tarjeta de credito no propia
      | numeroTarjeta   | tipoPago   | valorPago   | moneda   | tipoCuenta   | numeroCuenta   |
      | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia de ver el mensaje de confirmacion y la informacion de su pago
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser        | correoUsuario | numeroTarjeta | tipoPago | valorPago | moneda        | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/pagos/TarjetaCreditoNoPropia.xlsx@Datos@1
      |1|22493944|1|invictus10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|4513070436920974|Otro valor|1000|Pesos|Corriente|406-158990-01|

  Esquema del escenario: Pago de tarjetas de credito no propias desde una cuenta sin saldo
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_TARJETAS_DE_CREDITO_NO_PROPIAS
    Y quiere pagar la tarjeta de credito no propia
      | numeroTarjeta   | tipoPago   | valorPago   | moneda   | tipoCuenta   | numeroCuenta   |
      | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia ver el mensaje de error: cuenta origen sin saldo
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser        | correoUsuario        | numeroTarjeta | tipoPago | valorPago | moneda        | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/pagos/TarjetaCreditoNoPropia.xlsx@Datos@5
      |5|22493944|1|autotest10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|5303710095505365|Pago mínimo en pesos|0,00|Pesos|Ahorros|406-125170-00|

  Esquema del escenario: Pago de tarjetas de credito no propias con otro valor en dolares
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_TARJETAS_DE_CREDITO_NO_PROPIAS
    Y quiere pagar la tarjeta de credito no propia
      | numeroTarjeta   | tipoPago   | valorPago   | moneda   | tipoCuenta   | numeroCuenta   |
      | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia de ver el mensaje de confirmacion y la informacion de su pago
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser       | correoUsuario | numeroTarjeta | tipoPago | valorPago | moneda        | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/pagos/TarjetaCreditoNoPropia.xlsx@Datos@2
      |2|22493944|1|invictus10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|345555555558888|Otro valor|1200|Dólares|Corriente|406-125210-00|
