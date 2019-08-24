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
    Y gestiono la inscripcion de clave dinámica
      | segundaClave   | nombrePersonalizado   | correo   | tipoCorreo   | numeroCelular   |
      | <segundaClave> | <nombrePersonalizado> | <correo> | <tipoCorreo> | <numeroCelular> |
    Entonces Yo debería ver mis datos registrados en clave dinámica
    Y cierra sesión en la app

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombrePersonalizado | correo                 | tipoCorreo | numeroCelular |
   ##@externaldata@./src/test/resources/datadriven/clavedinamica/InscribirClaveDinamica.xlsx@Datos@1