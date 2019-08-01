#language: es

Característica: Transferencia desde la app
  Como usuario de Bancolombia
  Quiero realizar una transferencia
  Desde mi app

  Esquema del escenario: Transferencia a cuentas no inscritas
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero TRANSFERIR_DINERO del usuario <usuario> con clave <clave>
    Y diligencios los datos de la transferencia con información
     |tipoTransferencia | productoOrigen   | tipoProductoOrigen   | monto   | productoDestino   | tipoProductoDestino   |
     |<tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |tipoTransferencia|productoOrigen|tipoProductoOrigen|monto|productoDestino|tipoProductoDestino
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@Datos@2|
