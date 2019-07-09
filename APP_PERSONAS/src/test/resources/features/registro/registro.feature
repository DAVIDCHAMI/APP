#language: es

  Característica: Registro en la APP personas bancolombia OSP
    Como usuario de Bancolombia
    Quiero realizar el registro

    @Registro
    Esquema del escenario: Verificar el registro ingresando con documento
      Dado que el Actor carga los datos para la prueba
        | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
      Y quiero ingresar desde CONSULTAR_PRODUCTO con el documento <numeroDocumento> con clave <clave>
      Entonces verifico el resultado del registro
      Ejemplos:
        | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos
        | 2  | 1037655531      | 1             | userqa10 | 1111  | 3221         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |




