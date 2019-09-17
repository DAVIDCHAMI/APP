#language: es

Característica: Inscripcion de productos en la APP personas bancolombia OSP
  Como usuario de Bancolombia
  Quiero realizar la inscripcion de un producto bancolombia

  Esquema del escenario:  Inscripcion de productos bancolombia
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere INSCRIBIR_PRODUCTOS
    Y quiero realizar la inscripcion del producto con la informacion
      | <nombreBanco> | <tipo> | <numero> | <tipoDocumentoInscripcion> | <numeroDocumentoInscripcion> | <tipoFondo> |
   # Entonces el deberia de ver el detalle del producto registrado
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreBanco     | tipo               | numero            | tipoDocumentoInscripcion | numeroDocumentoInscripcion | tipoFondo  |
   ##@externaldata@./src/test/resources/datadriven/registro/InscripcionProductos.xlsx@Datos@3
   |3   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Bancolombia   |Fondo de Inversión   |12345678912345678   |Cédula de ciudadanía   |1044512658   |FIDUCUENTA|