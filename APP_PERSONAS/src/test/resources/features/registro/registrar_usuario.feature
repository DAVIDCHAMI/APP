#language: es

Característica: Registro en la APP personas bancolombia OSP
  Como usuario de Bancolombia
  Quiero realizar el registro de un usuario
  Para realizar la autenticacion en la app


  Esquema del escenario: Registrar usuario con documento de identidad
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Y quiere realizar el registro con el usuario <nuevoUser> y con el correo <correoUsuario>
    Entonces el deberia de ver un mensaje de registro exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@2
   |2   |10757880   |1   |10757880   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa93   |jalzate@todo1.net   |CONSULTAR_PRODUCTO|

  @Manual
  Esquema del escenario: Registrar un usuario que ya este registrado
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere ingresar por la <opcionAutenticacion>
    Entonces el deberia de ver el mensaje usuario o clave invalida
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser | correoUsuario | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@3
   |3   |95400152   |1   |sandrita69   |1234   |4321   |Acierto   |001   |0370   |NO ERROR   |bolp   |ACTIVO   |   |   |CONSULTAR_PRODUCTO|

  @Manual
  Esquema del escenario: Registrar un usuario con clave bloqueada
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere ingresar por la <opcionAutenticacion>
    Entonces el deberia de ver el mensaje de usuario bloqueado
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@1
   |1   |1010111   |1   |1010111   |2443   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |EPREPAGO|
