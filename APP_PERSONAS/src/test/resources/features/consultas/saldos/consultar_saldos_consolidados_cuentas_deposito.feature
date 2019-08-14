#language: es

Característica: Consulta de saldos cuenta depositos app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis cuentas depositos
  Para visualizar el saldo de mis cuentas

  Esquema del escenario: Consulta de productos cuentas deposito desde saldos y movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto el saldo de mis Cuentas
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
    Y cierra sesión en la app
    Y Verifico los resultados en los archivos de iseries
    | Logcanal-COMFFLGWWW |Consolidados Depositos-SCIFFSALDO_CONSOLIDADO|
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                         | numeroCuenta                              |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@Depositos@1
   |1   |1037655531   |1   |userrobot3   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Corriente;Adelanto;Ahorros;Ahorros   |406-101390-08;406101390-09;406-701390-12;406-701390-13|

