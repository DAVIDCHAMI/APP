#language: es

Característica: Realizar una transferencia a productos no inscritas

  @RutaCritica
  Esquema del escenario: Transferencia a cuentas no inscritas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere TRANSFERIR_DINERO
    Cuando el transfiere desde <opcionProductoOrigen> hacia el producto <opcionProductoDestino>
      | tipoTransferencia   | numeroCuenta     | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |
    Entonces deberia ver la confirmacion exitosa de la transferencia
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto | tipoTransferencia                  | productoDestino | tipoProductoDestino | opcionProductoOrigen | opcionProductoDestino |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@NoInscritos@1
      |1|1010111|Cédula de ciudadanía|pruebauser01|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|406-782800-07|Ahorros|1000|Productos no inscritos Bancolombia|406-706940-07|Corriente|||

  Esquema del escenario: Transferencia a cuentas no inscritas desde una cuenta sin saldo
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere TRANSFERIR_DINERO
    Cuando el transfiere desde <opcionProductoOrigen> hacia el producto <opcionProductoDestino>
      | tipoTransferencia   | numeroCuenta     | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |
    Entonces deberia ver el mensaje de error: cuenta origen sin saldo
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto | tipoTransferencia                  | productoDestino | tipoProductoDestino | opcionProductoOrigen | opcionProductoDestino |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@NoInscritos@10
      |10|1010111|Cédula de ciudadanía|pruebauser01|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|406-182800-02|Corriente|1000|Productos no inscritos Bancolombia|40670694007|Corriente|||
