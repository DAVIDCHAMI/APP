#language: es

Característica: Consulta de productos Cuentas Deposito de un cliente en app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis productos
  Desde la opción saldos y movimientos
  El deberia de ver los movimientos de su cuenta deposito

  Esquema del escenario: Consultar cuenta Corriente con movimientos en la app con cuentas depósito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiero revisar mis movimientos de cuenta deposito en la app con tipo de cuenta <tipoCuenta> y número cuenta <numeroCuenta>
    Entonces El deberia de ver los movimientos asociados a su cuenta
    Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta       | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/movimientos/ConsultaMovimientos.xlsx@Depositos@2
   |2   |1037655531   |1   |creadoosp11   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Corriente   |406-101530-07|

  @manual
  Esquema del escenario: Consultar cuenta Corriente con movimientos en la app con cuentas depósito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiere revisar sus movimientos con tipo de cuenta <tipoCuenta> y número cuenta <numeroCuenta>
    Entonces El deberia de ver el mensaje No has realizado ningún movimiento con la tarjeta.
    Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario     | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/movimientos/ConsultaMovimientos.xlsx@Depositos@2
   |2   |1037655531   |1   |creadoosp11   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Corriente   |406-101530-07|

