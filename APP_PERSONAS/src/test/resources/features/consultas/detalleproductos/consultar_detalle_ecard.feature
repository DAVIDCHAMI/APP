#language: es

Característica: Consulta de detalle de tarjetas E card
Como usuario de Bancolombia
Quiero consultar el detalle de mi ecard
Para visualizar el detalle de mi ecard

Esquema del escenario: Consulta de detalle de tarjeta ecard
Dado que el Actor se autentica en la app
| ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
| <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
Cuando el actor quiere CONSULTAR_PRODUCTO
Y consulto el detalle de tarjeta ecard con <tipoTarjeta> y numero <numeroTarjeta>
Entonces deberia de ver el detalle de mi tarjeta de credito
Ejemplos:
| ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta                | numeroTarjeta |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductos.xlsx@Ecard@1
      |1|999999|1|usuarioecard54|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|e-Card Mastercard|*7371|
