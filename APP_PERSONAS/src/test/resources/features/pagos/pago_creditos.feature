#language: es

Característica: Pago de créditos

  Esquema del escenario: Pago de créditos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_CREDITOS
    Y quiere pagar el credito
      | tipoPrestamo   | numeroPrestamo   | tipoPago   | valorPago   | tipoCuenta   | numeroCuenta   |
      | <tipoPrestamo> | <numeroPrestamo> | <tipoPago> | <valorPago> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia de ver el mensaje de confirmación y la información del pago de su credito
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | tipoPrestamo      | numeroPrestamo | tipoPago   | valorPago | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/pagos/Creditos.xlsx@Datos@3
   |3   |22493944   |1   |pruebauser01   |6789   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Prestamo personal   |29281023961   |Otro valor   |1000   |Corriente   |406-182800-03|

  Esquema del escenario: Pago de créditos desde una cuenta sin saldo
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_CREDITOS
    Y quiere pagar el credito
      | tipoPrestamo   | numeroPrestamo   | tipoPago   | valorPago   | tipoCuenta   | numeroCuenta   |
      | <tipoPrestamo> | <numeroPrestamo> | <tipoPago> | <valorPago> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia ver el mensaje de error: cuenta origen sin saldo
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | tipoPrestamo      | numeroPrestamo | tipoPago   | valorPago | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/pagos/Creditos.xlsx@Datos@4
   |4   |22493944   |1   |pruebauser01   |6789   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Prestamo personal   |29281023961   |Otro valor   |1000   |Corriente   |406-182800-03|
