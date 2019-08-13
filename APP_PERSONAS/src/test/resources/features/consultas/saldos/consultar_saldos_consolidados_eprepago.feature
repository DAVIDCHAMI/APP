#language: es

Característica: Consulta de saldos de e prepago app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mi tarjeta e prepago
  Para visualizar el saldo de esta

  Esquema del escenario: Consulta de productos e-Prepago desde saldos y movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto el saldo de mis eprepago
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
    Y cierra sesión en la app
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta     |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@Eprepago@1
   |1   |1037655531   |1   |userrobot3   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |MasterCard   |5306950634968354|
