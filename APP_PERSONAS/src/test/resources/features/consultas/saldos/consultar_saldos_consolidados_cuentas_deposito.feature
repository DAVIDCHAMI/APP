#language: es

Característica: Consulta de saldos cuenta depositos app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis cuentas depositos
  Para visualizar el saldo de mis cuentas

  @RutaCritica
  Esquema del escenario: Consulta de productos cuentas deposito desde saldos y movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto el saldo de mis Cuentas
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado   | primeraPregunta | validarClave | tipoCuenta                                                             | numeroCuenta                                                                                                    | numeroProductos |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@Depositos@1
      | 1  | 22452521        | 1             | invictus10 | 1234  | 4321         | Acierto     | 000         | 1756              | TRANSACCION EXITOSA | bolp            | ACTIVO       | Corriente;Corriente;Adelanto;Corriente;Ahorros;Ahorros;Ahorros;Ahorros | 406-125210-00;406-125210-01;406-125210-02;406-169940-01;406-725210-11;406-725210-12;406-725210-13;406-725210-14 |                 |

  Esquema del escenario: Consulta de productos vista carrsusel de cuentas deposito desde saldos y movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto desde la vista carrusel el saldo de mis Cuentas deposito
    Entonces Verifico el resultado de la consulta del saldo desde vista carrusel <numeroProductos>
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado   | primeraPregunta | validarClave | tipoCuenta | numeroCuenta | numeroProductos |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@Depositos@2
      | 2  | 22452521        | 1             | invictus10 | 1234  | 4321         | Acierto     | 000         | 1756              | TRANSACCION EXITOSA | bolp            | ACTIVO       |            |              | 7               |
