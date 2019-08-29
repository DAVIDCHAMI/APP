#language: es

Característica: Consulta de detalle credito de consumo
  Como usuario de Bancolombia
  Quiero consultar el detalle de mi credito de consumo
  Para visualizar el detalle de mi credito

  Esquema del escenario: Consulta de detalle de credito de consumo
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y consulto en Créditos el detalle de mi credito de consumo con <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi credito de consumo
    Y cierra sesion en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle-SCIFFSALDO_DETALLE |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductosDepositos.xlsx@Depositos@1
      | 1  | 22452521        | 1             | invictus10 | 1234  | 4321         | Acierto     | 000         | 0360              | NO ERROR          | bolp            | ACTIVO       | Corriente  | 406-125210-01 |

