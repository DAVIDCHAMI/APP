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
    #Entonces deberia de ver el mensaje de confirmación y la información de su pago
    #Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser | correoUsuario | tipoPrestamo | numeroPrestamo | tipoPago | valorPago | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/pagos/Creditos.xlsx@Datos@
   |1   |22493944   |1   |pruebasusuario11   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Crediagil   |29281005217   |Pago mínimo   |0   |Corriente   |406-106940-01|
   |2   |22493944   |1   |pruebasusuario11   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Crediagil   |29281005217   |Pago total   |50893   |Ahorros   |406-706940-12|
   |3   |22493944   |1   |pruebasusuario11   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Crediagil   |29281005217   |Otro valor   |40893   |Ahorros   |406-706940-13|
