#language: es

Característica: Consulta de saldos de creditos app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis creditos
  Para visualizar el saldo de mis creditos

  Esquema del escenario: Consulta de productos credito desde saldos y movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto el saldo de mis Créditos
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
    Y cierra sesión en la app
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                | numeroCuenta            |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@Creditos@1
      | 1  | 1037655531      | 1             | usercdt66 | 1234  | 4321         | Acierto     | 000         | 0369              | NO ERROR          | bolp            | ACTIVO       | Prestamo Personal Ta;Prestamo Personal Ta | 29281005510;29281023970 |