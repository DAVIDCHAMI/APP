#language: es

Característica: Autenticacion app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contrasena
  Para autenticarme en la aplicacion

  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP desde diferentes opciones
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@1
      |1|43024987|1|pruebauser01|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|INSCRIBIR_PRODUCTOS|

  @RutaCritica
  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@4
      |4|43024987|1|autotest30|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|CONSULTAR_PRODUCTO|

  Esquema del escenario: Login fallido a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser fallida por clave invalida
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@5
      |5|45612862|1|pruebauser01|1267|4321|Alterno|052|0369|clave inválida|bolp|ACTIVO|CONSULTAR_PRODUCTO|

  Esquema del escenario: Login con usuario bloqueado a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser fallida por usuario bloqueado
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@6
      |6|22493944|1|bloqueotarjetas01|1234|4321|Alterno|607|0370|La clave que usas en el cajero está bloqueada|bolp|ACTIVO|CONSULTAR_PRODUCTO|

  Esquema del escenario: Bloqueo de clave despues de 3 intentos
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando ingreso por <opcionAutenticacion> con el usuario <usuario> con clave errada <clave>
    Entonces la autenticacion deberia de ser fallida por usuario bloqueado
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario         | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@7
      |7|22493944|1|recaudosnatik66|2222|4321|Alterno|607|0369|NO ERROR|bolp|ACTIVO|CONSULTAR_PRODUCTO|

  Esquema del escenario: Verificar frase de seguridad del usuario
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando ingreso por <opcionAutenticacion> con el usuario <usuario> con la clave <clave>
    Entonces Se debe presentar la frase de seguridad asociada al usuario
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario          | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@8
      |8|22493944|1|pruebasusuario11|1234|4321|Alterno|607|0369|NO ERROR|bolp|ACTIVO|CONSULTAR_PRODUCTO|

  Esquema del escenario: Verificar frase de seguridad de un usuario inexistente
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando ingreso por <opcionAutenticacion> con el usuario <usuario> con la clave <clave>
    Entonces Se debe presentar una frase de seguridad asociada al usuario inexistente
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario           | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@9
      |9|22493944|1|userinexistente12|1234|4321|Alterno|607|0369|NO ERROR|bolp|ACTIVO|CONSULTAR_PRODUCTO|

  Esquema del escenario: Verificar que no se muestre frase de seguridad  con usuario que ingrese con el documento de identidad y tenga activada la opcion
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando ingreso por <opcionAutenticacion> con el usuario <usuario> con la clave <clave>
    Entonces La frase de seguridad no se debe visualizar
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario           | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@10
      |10|36625233|1|36625233|1234|4321|Alterno|607|0369|NO ERROR|bolp|ACTIVO|CONSULTAR_PRODUCTO|

  Esquema del escenario: Verificar opcion "¿No eres cliente?"
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando ingreso por <opcionAutenticacion> con usuario <usuario>
    Entonces Se deben de ver las opciones para un cliente nuevo
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario           | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@1
      |1|43024987|1|pruebauser01|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|INSCRIBIR_PRODUCTOS|
