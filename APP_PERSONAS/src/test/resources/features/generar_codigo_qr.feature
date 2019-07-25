#language: es

Característica: Generación de código QR

  Esquema del escenario: Generación de codigo QR sin valor
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiere ingresar desde RECIBIR_DINERO con el documento <usuario> con clave <clave>
    Y quiere generar un codigo QR sin valor con nombre <nombrePersonalizado>
      | tipoCuenta   | numeroCuenta   | descripcion   |
      | <tipoCuenta> | <numeroCuenta> | <descripcion> |
    Entonces el deberia de ver un mensaje de confirmación y el código QR
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | nombrePersonalizado | tipoCuenta       | numeroCuenta  | monto  | descripcion    |
   ##@externaldata@./src/test/resources/datadriven/GenerarCodigoQr.xlsx@Datos@1
   |1   |1010111   |1   |userqa10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Auto sin valor   |Cuenta de Ahorro   |406-740100-05   |   |la descripción|

  @manual
  Esquema del escenario: Generación de codigo QR con valor
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiere ingresar desde RECIBIR_DINERO con el documento <usuario> con clave <clave>
    Y quiere generar un codigo QR con valor con nombre <nombrePersonalizado>
      | tipoCuenta   | numeroCuenta   | monto   | descripcion   |

      | <tipoCuenta> | <numeroCuenta> | <monto> | <descripcion> |
    Entonces el deberia de ver un mensaje de confirmación y el código QR
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser | correoUsuario | nombrePersonalizado | tipoCuenta | numeroCuenta | monto | descripcion |
   ##@externaldata@./src/test/resources/datadriven/GenerarCodigoQr.xlsx@Datos@2
   |1   |1010111   |1   |userqa10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |Auto con valor   |Cuenta de Ahorro   |406-740100-05   |120000   |la descripción|
