#language: es

  Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para autenticarme en la aplicación

  Esquema del escenario: Acceso exitoso a la aplicacion de Bancolombia

    Dado que subo los datos de la transaccion
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> |
    Cuando trato de autenticarme usando mis credenciales
      | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <primeraPregunta> | <validarClave> |
    Entonces verifico el resultado de la autenticacion

 Ejemplos:
  | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos
   |1   |1037655531   |1   |jacinto25   |1223   |3221   |bolp   |ACTIVO    |Acierto   |000   |0369   |NO ERROR|

