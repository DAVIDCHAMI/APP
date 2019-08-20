#language: es

Característica: Consulta de productos Tarjeta de crédito de un cliente en app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis productos
  Desde la opción saldos y movimientos
  El deberia de ver los movimientos de su tarjeta de crédito


  Esquema del escenario: Consultar cuenta Corriente con movimientos en la app con tarjetas de crédito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiero revisar mis movimientos de tarjeta de crédito en la app con tipo de cuenta <tipoCuenta> y número cuenta <numeroCuenta>
    Entonces El deberia de ver los movimientos asociados a su cuenta
    Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/consultas/movimientos/ConsultaMovimientos.xlsx@TarjetasCredito@1
   |1   |1037655531   |1   |autouser21   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Tarjeta de credito   |*6926|



  #Esquema del escenario: Consultar Cuenta corriente sin movimientos tajeta de crédtio
  #  Dado que el Actor se autentica en la app
    #  | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
   #   | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    #Cuando el actor quiere CONSULTAR_PRODUCTO
   # Y quiero revisar mis movimientos con tipo de cuenta <tipoCuenta> y número cuenta <numeroCuenta>
   # Entonces El deberia de ver el mensaje No has realizado ningún movimiento con la tarjeta.
   # Y cierra sesión en la app
   # Ejemplos:
    #  | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   
    # | 1  | 1037655531      | 1             | userqa10 | 1234  | 4321         | Acierto     | 000         | 0369              | NO ERROR          | bolp            | ACTIVO       | Corriente  | 406-140100-01 |
