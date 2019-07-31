#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para autenticarme en la aplicación

  Esquema del escenario: Login exitoso a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero GESTIONAR_CLAVE_DINAMICA del usuario <usuario> con clave <clave>
    Y gestiona la inscripcion de clave dinámica
      | segundaClave   | nombrePersonalizado   | correo   | tipoCorreo   | numeroCelular   |
      | <segundaClave> | <nombrePersonalizado> | <correo> | <tipoCorreo> | <numeroCelular> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombrePersonalizado | correo                 | tipoCorreo | numeroCelular |
   ##@externaldata@./src/test/resources/datadriven/clavedinamica/InscribirClaveDinamica.xlsx@Datos@1
