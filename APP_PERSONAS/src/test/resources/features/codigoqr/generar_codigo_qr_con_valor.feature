#language: es

Característica: Generación de código QR

  Esquema del escenario: Generación de codigo QR con valor
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere GENERAR_CODIGO_QR
    Y quiere generar un codigo QR con valor
      | tipoCuenta   | numeroCuenta   | monto   | descripcion   |
      | <tipoCuenta> | <numeroCuenta> | <monto> | <descripcion> |
    Entonces el deberia de ver un mensaje de confirmación y el código QR
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | nombrePersonalizado | tipoCuenta | numeroCuenta  | monto  | descripcion     |
   ##@externaldata@./src/test/resources/datadriven/codigoqr/GenerarCodigoQr.xlsx@Datos@2
   |2   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |conValor   |Ahorros   |406-732280-07   |150000   |qr automatizado|

  @Manual
  Esquema del escenario: Generación de codigo QR con única cuenta deposito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere GENERAR_CODIGO_QR
    Y quiere generar un codigo QR sin valor
      | tipoCuenta   | numeroCuenta   | descripcion   |
      | <tipoCuenta> | <numeroCuenta> | <descripcion> |
    Entonces el deberia de ver un mensaje de confirmación y el código QR
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | nombrePersonalizado | tipoCuenta       | numeroCuenta  | monto | descripcion     |
   ##@externaldata@./src/test/resources/datadriven/codigoqr/GenerarCodigoQr.xlsx@Datos@1
   |1   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |sinValor   |Ahorros   |406-732280-07   |   |qr automatizado|

  @Manual
  Esquema del escenario: Generación de codigo QR sin inicio de sesión con valor
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiere generar un codigo QR con valor sin iniciar sesión con nombre <nombrePersonalizado>
      | tipoCuenta   | numeroCuenta   | monto   | descripcion   |
      | <tipoCuenta> | <numeroCuenta> | <monto> | <descripcion> |
    Entonces el deberia de ver un mensaje de confirmación y el código QR
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | nombrePersonalizado | tipoCuenta | numeroCuenta  | monto  | descripcion     |
   ##@externaldata@./src/test/resources/datadriven/codigoqr/GenerarCodigoQr.xlsx@Datos@3
   |3   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |conValor   |Ahorros   |406-732280-07   |134000   |qr automatizado|
