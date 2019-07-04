#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para autenticarme en la aplicación


  @LoginExitoso
  Esquema del escenario: Acceso exitoso a la aplicacion de Bancolombia OSP

    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces verifico el resultado de la autenticacion exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos
      | 1  | 1037655531      | 1             | userqa10 | 1234  | 3221         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |

  @LoginFallido
  Esquema del escenario: Logueo fallido a la aplicacion de Bancolombia OSP

    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces verifico el resultado del logueo fallido
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos
      | 2  | 1037655531      | 1             | userqa10 | 1111  | 3221         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |