#language: es

Característica: Inscripcion de productos en la APP personas bancolombia OSP
  Como usuario de Bancolombia
  Quiero realizar la inscripcion de un producto bancolombia


  Esquema del escenario:  Inscripcion de productos bancolombia fondo de inversion
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere INSCRIBIR_PRODUCTOS
    Y quiero realizar la inscripcion del producto con la informacion
      | <nombreBanco> | <tipo> | <numero> | <tipoDocumentoInscripcion> | <numeroDocumentoInscripcion> | <tipoFondo> |
    Entonces el deberia de ver el detalle del producto registrado
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreBanco | tipo               | numero        | tipoDocumentoInscripcion | numeroDocumentoInscripcion | tipoFondo  |
   ##@externaldata@./src/test/resources/datadriven/registro/InscripcionProductos.xlsx@Datos@3

    Esquema del escenario:  Inscripcion de productos de cuentas Bancolombia
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere INSCRIBIR_PRODUCTOS
    Y quiero realizar la inscripcion del producto con la informacion
      | <nombreBanco> | <tipo> | <numero> | <tipoDocumentoInscripcion> | <numeroDocumentoInscripcion> | <tipoFondo> |
    Entonces el deberia de ver el detalle del producto registrado
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreBanco | tipo    | numero      | tipoDocumentoInscripcion | numeroDocumentoInscripcion | tipoFondo |
   ##@externaldata@./src/test/resources/datadriven/registro/InscripcionProductos.xlsx@Datos@1

  Esquema del escenario:  Inscripcion de productos a otros bancos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere INSCRIBIR_PRODUCTOS
    Y quiero realizar la inscripcion del producto con la informacion
      | <nombreBanco> | <tipo> | <numero> | <tipoDocumentoInscripcion> | <numeroDocumentoInscripcion> | <tipoFondo> |
    Entonces el deberia de ver el detalle del producto registrado
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreBanco     | tipo    | numero      | tipoDocumentoInscripcion | numeroDocumentoInscripcion | tipoFondo |
   ##@externaldata@./src/test/resources/datadriven/registro/InscripcionProductos.xlsx@Datos@2

  Esquema del escenario:  Inscripcion de productos nequi
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere INSCRIBIR_PRODUCTOS
    Y quiero realizar la inscripcion del producto con la informacion
      | <nombreBanco> | <tipo> | <numero> | <tipoDocumentoInscripcion> | <numeroDocumentoInscripcion> | <tipoFondo> |
    Entonces el deberia de ver el detalle del producto registrado
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreBanco | tipo    | numero      | tipoDocumentoInscripcion | numeroDocumentoInscripcion | tipoFondo |
   ##@externaldata@./src/test/resources/datadriven/registro/InscripcionProductos.xlsx@Datos@4

  Esquema del escenario:  Inscripcion de producto caso alterno
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere INSCRIBIR_PRODUCTOS
    Y quiero realizar la inscripcion del producto con la informacion
      | <nombreBanco> | <tipo> | <numero> | <tipoDocumentoInscripcion> | <numeroDocumentoInscripcion> | <tipoFondo> |
    Entonces el deberia de mensaje LA CUENTA ESTA PENDIENTE DE CONFIRMAR INSCRIPCION
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreBanco | tipo    | numero      | tipoDocumentoInscripcion | numeroDocumentoInscripcion | tipoFondo |
   ##@externaldata@./src/test/resources/datadriven/registro/InscripcionProductos.xlsx@Datos@5