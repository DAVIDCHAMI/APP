#language: es

Característica: Consulta de saldos cuenta depositos app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis cuentas depositos
  Para visualizar el saldo de mis cuentas

  Esquema del escenario: Consulta de productos cuentas deposito desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>|
    Cuando consulto el saldo de mis Cuentas
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                         | numeroCuenta                              |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/Trn_1756ConsultaSaldosConsolidados.xlsx@Datos@1

    @Manual
  Esquema del escenario: Consulta de productos credito desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>|
    Cuando consulto el saldo de mis Créditos
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                | numeroCuenta            |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/Trn_1756ConsultaSaldosConsolidados.xlsx@Datos
      | 1  | 1037655531      | 1             | usercdt66 | 1234  | 4321         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     | Prestamo Personal Ta;Prestamo Personal Ta | 29281005510;29281023970 |

  @Manual
  Esquema del escenario: Consulta de productos tarjetas de credito desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>|
    Cuando consulto el saldo de mis Tarjetas de crédito
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                         | numeroCuenta                              |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/Trn_1756ConsultaSaldosConsolidados.xlsx@Datos
      | 1  | 1037655531      | 1             | userqa10 | 1234  | 4321         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     | Cuenta Corriente;Cuenta de Ahorro;Cuenta de Ahorro | 406-140100-01;406-740100-05;406-740100-06 |

  @Manual
  Esquema del escenario: Consulta de productos e-Prepago desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>|
    Cuando consulto el saldo de mis e-Prepago
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                         | numeroCuenta                              |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/Trn_1756ConsultaSaldosConsolidados.xlsx@Datos
      | 1  | 1037655531      | 1             | userqa10 | 1234  | 4321         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     | Cuenta Corriente;Cuenta de Ahorro;Cuenta de Ahorro | 406-140100-01;406-740100-05;406-740100-06 |

  @Manual
  Esquema del escenario: Consulta de productos crediagil desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>|
    Cuando consulto el saldo de mis Crediágil
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                         | numeroCuenta                              |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/Trn_1756ConsultaSaldosConsolidados.xlsx@Datos
      | 1  | 1037655531      | 1             | userqa10 | 1234  | 4321         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     | Cuenta Corriente;Cuenta de Ahorro;Cuenta de Ahorro | 406-140100-01;406-740100-05;406-740100-06 |

  @Manual
  Esquema del escenario: Consulta de productos inversiones desde saldos y movimientos
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>|
    Cuando consulto el saldo de mis Inversiones
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
#    Y Verifico el resultado de los siguientes archivos de iSeries
#    | Logcanal- COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                         | numeroCuenta                              |
   ##@externaldata@./src/test/resources/datadriven/consultas/saldos/Trn_1756ConsultaSaldosConsolidados.xlsx@Datos
      | 1  | 1037655531      | 1             | userqa10 | 1234  | 4321         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     | Cuenta Corriente;Cuenta de Ahorro;Cuenta de Ahorro | 406-140100-01;406-740100-05;406-740100-06 |
