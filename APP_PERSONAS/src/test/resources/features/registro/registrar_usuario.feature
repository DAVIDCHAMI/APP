#language: es

Característica: Registro en la APP personas bancolombia OSP
  Como usuario de Bancolombia
  Quiero realizar el registro de un usuario
  Para realizar la autenticacion en la app

  Esquema del escenario: Registrar usuario con documento de identidad desde mis Productos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiere realizar el registro con el usuario <nuevoUser> y con el correo <correoUsuario>
    Entonces el deberia de ver un mensaje de registro exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@1
   |2   |1128398861   |1   |1128398861   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa91   |jalzate@todo1.net|

  Esquema del escenario: Registrar usuario con documento de identidad desde otra opcion
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere EPREPAGO
    Y quiere realizar el registro con el usuario <nuevoUser> y con el correo <correoUsuario>
    Entonces el deberia de ver un mensaje de registro exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@2
   |2   |1128398861   |1   |1128398861   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa91   |jalzate@todo1.net|

  Esquema del escenario: Registrar un usuario con clave bloqueada
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Entonces el deberia de ver el mensaje de usuario bloqueado
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@3
   |1   |1010111   |1   |1010111   |2443   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net|

  Esquema del escenario: Registrar un usuario que ya este registrado
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Entonces el deberia de ver el mensaje usuario o clave invalida
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser | correoUsuario |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@1
   |3   |95400152   |1   |sandrita69   |1234   |4321   |Acierto   |001   |0370   |NO ERROR   |bolp   |ACTIVO   |   ||

  Esquema del escenario: Registrar un usuario y su nickname es el numero de identificacion
    Dado
    Cuando
    Entonces
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser | correoUsuario |
   ##@externaldata@./src/test/resources/datadriven/registro/RegistroUsuario.xlsx@Datos@3
      |3   |95400152   |1   |sandrita69   |1234   |4321   |Acierto   |001   |0370   |NO ERROR   |bolp   |ACTIVO   |   ||