#language: es

Característica: Consulta de saldos tarjetas de credito app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis tarjetas de credito
  Para visualizar el saldo de estas

  @RutaCritica
  Esquema del escenario: Consulta de productos tarjetas de credito desde saldos y movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto el saldo de mis Tarjetas de crédito
      | <tipoCuenta> | <numeroCuenta> |
    Entonces Verifico el resultado de la consulta del saldo
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario         | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                                                     | numeroCuenta      | numeroProductos |
         ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@TarjetasCredito@3
      |3|928155899|1|recaudosnatik66|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|Empresarial American Express;Personal Visa;Personal Mastercard|*9870;*4547;*5434||

    @carrusel
  Esquema del escenario: Consulta de productos tarjetas de credito desde vista carrusel
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto el saldo de las Tarjetas de crédito desde la vista carrusel
    Entonces Verifico el resultado de la consulta del saldo desde vista carrusel <numeroProductos>
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta | numeroProductos |
         ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@TarjetasCredito@2
      |2|22468280|1|usuarioecard54|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|||1|

  Esquema del escenario: Consulta de productos E-card desde saldos y movimientos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Cuando consulto el saldo de mi Ecard desde Tarjetas de crédito
    Entonces Verifico el resultado de la consulta del saldo con los datos de la tarjeta
      | tipoTarjeta   | numeroTarjeta   | deudaPesos   | deudaDolares   |
      | <tipoTarjeta> | <numeroTarjeta> | <deudaPesos> | <deudaDolares> |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario        | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta       | numeroTarjeta | deudaPesos   | deudaDolares |
         ##@externaldata@./src/test/resources/datadriven/consultas/saldos/ConsultaSaldosConsolidados.xlsx@Ecard@1
      |1|22468280|1|usuarioecard54|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|e-card Mastercard|*7371|$ 459.409,00|USD 42,00|
