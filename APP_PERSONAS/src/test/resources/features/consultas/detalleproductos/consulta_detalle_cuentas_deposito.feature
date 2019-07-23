#language: es

Característica: Consulta de detalle cuentas deposito ahorro y corriente
  Como usuario de Bancolombia
  Quiero consultar el detalle de mis cuentas depositos
  Para visualizar el detalle de mis cuentas

  Esquema del escenario: Consulta de detalle de cuenta deposito - Ahorro
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>|
    Cuando consulto el detalle de mi Cuenta de Ahorro <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi cuenta de ahorro
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta       | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleCuentaDeposito.xlsx@Depositos@1
   |1   |1037655531   |1   |userqa10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Cuenta de Ahorro   |406-740100-05|
