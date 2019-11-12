#language: es

Característica: Consulta de detalle de E-prepago
  Como usuario de Bancolombia
  Quiero consultar el detalle de mi tarjeta E prepago
  Para visualizar el detalle de esta

  Esquema del escenario: Consulta de detalle de e-prepago
    Dado que el Actor esta listo en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   | tipoCuenta   | numeroCuenta   | nombrePersonalizado   | correo   | tipoCorreo   | numeroCelular   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> | <tipoCuenta> | <numeroCuenta> | <nombrePersonalizado> | <correo> | <tipoCorreo> | <numeroCelular> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto en e-Prepago el detalle de mi tarjeta <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi tarjeta eprepago
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta | nombrePersonalizado | correo | tipoCorreo | numeroCelular |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductos.xlsx@EprepagoPOC@1
      |1|22452521|1|invictus10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|MasterCard|*9344|invictusdiez|automatizaciontodo1@gmail.com|Laboral|3145678956|
