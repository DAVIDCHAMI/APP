#language: es

Característica: Inscripcion de productos en la APP personas bancolombia OSP
  Como usuario de Bancolombia
  Quiero realizar la inscripcion de un producto bancolombia

  Esquema del escenario:  Inscripcion de productos bancolombia
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero INSCRIBIR_PRODUCTOS del usuario <usuario> con clave <clave>
    Y quiero realizar la inscripcion del producto con la información
      | <nombreBanco> | <tipo> | <numero> | <tipoDocumento> | <numeroDocumento> |
    Entonces el deberia de ver el detalle del producto registrado
    Y cierrar sesión en osp
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreBanco | tipo    | numero      |
   ##@externaldata@./src/test/resources/datadriven/registro/InscripcionProductos.xlsx@Datos@1
      | 1  | 1044512658      | Cédula de ciudadanía | userrobot2 | 1234  | 4321         | Alterno     | 000         | 0369              | NO ERROR          | bolp            | ACTIVO       | BANCOLOMBIA | Ahorros | 20580133845 |