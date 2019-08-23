#language: es

Característica: Consulta de productos Cuentas Deposito de un cliente en app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis productos
  Desde la opción saldos y movimientos
  El deberia de ver los movimientos de su cuenta deposito


  Esquema del escenario: Consultar Cuenta corriente sin movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiero revisar mis movimientos con tipo de cuenta <tipoCuenta> y número cuenta <numeroCuenta>
    Entonces El deberia de ver el mensaje No has realizado ningún movimiento con la tarjeta.
    Y cierra sesion en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle-SCIFFSALDO_DETALLE |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado                                 | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/movimientos/ConsultaMovimientos.xlsx@Depositos@1
      | 1  | 22452521        | 1             | invictus10 | 1234  | 4321         | Alterno     | 072         | 0369              | No has realizado ningún movimiento con la tarjeta | bolp            | ACTIVO       | Ahorros    | 406-725210-11 |

  @PruebaBack
  Esquema del escenario: Consultar cuenta Corriente con movimientos en la app con cuentas depósito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiero revisar mis movimientos en la app con tipo de cuenta <tipoCuenta> y número cuenta <numeroCuenta>
    Entonces El deberia de ver los movimientos asociados a su cuenta
    Y cierra sesion en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle-SCIFFSALDO_DETALLE |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado   | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/movimientos/ConsultaMovimientos.xlsx@Depositos@2
      | 2  | 22452521        | 1             | invictus10 | 1234  | 4321         | Acierto     | 000         | 0369              | TRANSACCION EXITOSA | bolp            | ACTIVO       | Corriente  | 406-125210-00 |

