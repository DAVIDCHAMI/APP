#language: es

Característica: Registro en la APP personas bancolombia OSP
  Como usuario de Bancolombia
  Quiero realizar el registro un usuario
  Para contar la autenticacion

  Esquema del escenario: Registrar usuario con documento de identidad
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiere ingresar desde CONSULTAR_PRODUCTO con el documento <numeroDocumento> con clave <clave>
    Y quiere realizar el registro con el usuario <nuevoUser> y con el correo <correoUsuario>
    Entonces el deberia de ver un mensaje de registro exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@2
   |2   |423698529   |1   |423698529   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa90   |jalzate@todo1.net|

  Esquema del escenario: Registrar un usuario que ya este registrado
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiere ingresar desde CONSULTAR_PRODUCTO con el documento <numeroDocumento> con clave <clave>
    Entonces verifico el mensaje del registro
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser | correoUsuario |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@3
   |3   |95400152   |1   |sandrita69   |1234   |4321   |Acierto   |001   |0370   |NO ERROR   |bolp   |ACTIVO   |   ||

  Esquema del escenario: Registrar un usuario con clave bloqueada
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiere ingresar desde CONSULTAR_PRODUCTO con el documento <numeroDocumento> con clave <clave>
    Entonces verifico el mensaje del registro
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser | correoUsuario |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@1
   |1   |1010111   |1   |1010111   |2443   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net|
