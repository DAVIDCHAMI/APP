#language: es

Característica: Consulta de detalle cuentas deposito ahorro y corriente
  Como usuario de Bancolombia
  Quiero consultar el detalle de mis cuentas depositos
  Para visualizar el detalle de mis cuentas

  @PRUEBA
  Esquema del escenario: Consulta de detalle de cuenta deposito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   | tipoCuenta   | numeroCuenta   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> | <tipoCuenta> | <numeroCuenta> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto en Cuentas el detalle de mi Cuenta <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi cuenta de ahorro
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle- SCIFFSALDOS_DETALLE |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductosDepositos.xlsx@Depositos@1
   |1   |43024987   |1   |automata87   |1234   |4321   |Acierto   |000   |0360   |NO ERROR   |bolp   |ACTIVO   |Corriente   |406-149870-06|

  @PRUEBA1
  Esquema del escenario: Consulta de detalle de cuenta deposito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   | tipoCuenta   | numeroCuenta   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> | <tipoCuenta> | <numeroCuenta> |
    Cuando consulto en Cuentas el detalle de mi Cuenta <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi cuenta de ahorro
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle- SCIFFSALDOS_DETALLE |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductosDepositos.xlsx@Depositos@1
   |1   |43024987   |1   |automata87   |1234   |4321   |Acierto   |000   |0360   |NO ERROR   |bolp   |ACTIVO   |Corriente   |406-149870-06|
