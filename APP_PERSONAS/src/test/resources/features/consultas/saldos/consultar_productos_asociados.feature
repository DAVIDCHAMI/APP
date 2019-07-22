#language: es

Característica: Consulta de productos asociados a un cliente en app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis productos
  Desde la opción saldos y movimientos
  
  Esquema del escenario: Consulta de productos cuentas deposito desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces El deberia de ver unicamente cuentas deposito
    #Y Verifico el resultado de los siguientes archivos de iSeries
    #| Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaProductosAsociados.xlsx@Datos@1
   |1   |1037655531   |1   |ospciclo4finde   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO|

  Esquema del escenario: Consulta de productos asociados al usuario desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces El deberia de ver los productos asoiados a su cuenta
    #Y Verifico el resultado de los siguientes archivos de iSeries
    #| Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaProductosAsociados.xlsx@Datos@2
   |2   |1037655531   |1   |userqa10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO|
