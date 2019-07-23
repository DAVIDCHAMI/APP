#language: es

Característica: Registro en billetera App
  Como usuario de Bancolombia
  Quiero realizar el registro en Billetera
  Para realizar transacciones

  Esquema del escenario: Registro exitoso en billetera App
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero OPCION_BILLETERA del usuario <usuario> con clave <clave>
    Y realiza la activacion de la billetera
    Entonces El deberia de ver que la activación de su billetera fue exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/billetera/RegistroBilletera.xlsx@Datos@1
   |1   |1037655531   |1   |userqa10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO|
