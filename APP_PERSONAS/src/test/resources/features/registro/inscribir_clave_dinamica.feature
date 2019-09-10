#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para autenticarme en la aplicación

  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere GESTIONAR_CLAVE_DINAMICA
    Y gestiono la inscripcion de clave dinamica
      | segundaClave   | nombrePersonalizado   | correo   | tipoCorreo   | numeroCelular   |
      | <segundaClave> | <nombrePersonalizado> | <correo> | <tipoCorreo> | <numeroCelular> |
    Entonces Yo deberia ver mis datos registrados en clave dinamica
    Y cierra sesion en la app

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombrePersonalizado | correo           | tipoCorreo | numeroCelular |
   ##@externaldata@./src/test/resources/datadriven/clavedinamica/InscribirClaveDinamica.xlsx@Datos@1
   |1   |67652517   |1   |AutoTest1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Test2   |scampo@todo1.net   |Laboral   |3145678956|
