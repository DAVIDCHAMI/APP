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
      | tipoTransferencia   | numeroCuenta   | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto  | tipoTransferencia                         | productoDestino | tipoProductoDestino |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@Datos@2
   |1   |1010111   |Cédula de ciudadanía   |userrobot2   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |40613079003   |Corriente   |100000   |Productos propios e inscritos Bancolombia   |40673079005   |Cuenta de Ahorro|
