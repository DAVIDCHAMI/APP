#language: es

Característica: Consulta de productos asociados a un cliente en app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis productos
  Desde la opción saldos y movimientos
  El deberia de ver los movimientos del producto

  Esquema del escenario: Consultar un producto sin movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Y quiero revisar mis movimientos con tipo de cuenta <tipoCuenta> y número cuenta <numeroCuenta>
    Entonces El deberia de ver el mensaje No has realizado ningún movimiento con la tarjeta.

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/movimientos/ConsultaMovimientos.xlsx@Datos@
      | 1  | 1037655531      | 1             | userqa10 | 1234  | 4321         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |   Cuenta Corriente     | 406-140100-01          |