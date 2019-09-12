#language: es

Característica: Generación de código QR

  Esquema del escenario: Generación de codigo QR sin valor
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere GENERAR_CODIGO_QR
    Y quiere generar un codigo QR sin valor
      | tipoCuenta   | numeroCuenta   | descripcion   |
      | <tipoCuenta> | <numeroCuenta> | <descripcion> |
    Entonces el deberia de ver un mensaje de confirmacion y el codigo QR
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | nombrePersonalizado | tipoCuenta       | numeroCuenta  | monto | descripcion     |
   ##@externaldata@./src/test/resources/datadriven/codigoqr/GenerarCodigoQr.xlsx@Datos@1
   |1   |43024987   |1   |autotest10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |sinValor   |Corriente   |406-125170-00   |   |qr automatizado|

  Esquema del escenario: Generación de codigo QR sin inicio de sesión sin valor
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiere generar un codigo QR sin valor sin iniciar sesion con nombre <nombrePersonalizado>
      | tipoCuenta   | numeroCuenta   | descripcion   |
      | <tipoCuenta> | <numeroCuenta> | <descripcion> |
    Entonces el deberia de ver un mensaje de confirmacion y el codigo QR
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | nombrePersonalizado | tipoCuenta | numeroCuenta  | monto  | descripcion     |
   ##@externaldata@./src/test/resources/datadriven/codigoqr/GenerarCodigoQr.xlsx@Datos@4
   |4   |43024987   |1   |autotest10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |sinValor   |Ahorros   |406-725170-06   |   |qr automatizado|
