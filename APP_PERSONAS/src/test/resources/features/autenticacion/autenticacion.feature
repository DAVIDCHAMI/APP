#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para autenticarme en la aplicación

  Esquema del escenario:StepDefinitions Comunes
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   | opcionAutenticacion   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> | <opcionAutenticacion> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y cierra sesión en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@1
   |1   |43024987   |1   |automata87   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |CONSULTAR_PRODUCTO|

  @Manual
  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP desde diferentes opciones
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser exitosa
    Y cierra sesión en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@1
   |1   |43024987   |1   |automata87   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |CONSULTAR_PRODUCTO|

  @Manual
  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP desde diferentes opciones
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser exitosa
    Y cierra sesión en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@2
   |2   |1037655531   |1   |userrobot1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |TRANSFERIR_DINERO|

  @Manual
  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP desde diferentes opciones
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser exitosa
    Y cierra sesión en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@3
   |3   |1037655531   |1   |userrobot1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |CONSULTAR_PRODUCTO|

  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser exitosa
    Y cierra sesión en la app
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@4
   |4   |1037655531   |1   |userrobot1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |CONSULTAR_PRODUCTO|


  @Manual
  Esquema del escenario: Login fallido a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser fallida por clave invalida
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@5
   |5   |1037655531   |1   |userrobot1   |1111   |4321   |Alterno   |052   |0369   |CLAVE NO VALIDA   |bolp   |ACTIVO   |CONSULTAR_PRODUCTO|

  @Manual
  Esquema del escenario: Login con usuario bloqueado a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser fallida por usuario bloqueado
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@6
   |6   |95400152   |1   |sandrita69   |1234   |4321   |Alterno   |607   |0370   |Clave bloqueada   |bolp   |ACTIVO   |CONSULTAR_PRODUCTO|

