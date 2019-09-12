#language: es

Característica: Realizar una transferencia

  Esquema del escenario: Transferencia a cuentas no inscritas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere TRANSFERIR_DINERO
    Cuando diligencios los datos de la transferencia con informacion
      | tipoTransferencia   | numeroCuenta     | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |
   # Entonces deberia ver la confirmacion exitosa de la transferencia

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto  | tipoTransferencia                  | productoDestino | tipoProductoDestino |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@Datos@
   |1   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |406-139740-01   |Corriente   |100000   |Productos no inscritos Bancolombia   |40670694007   |Corriente|
   |2   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |406-739740-05   |Ahorros   |100000   |Productos propios e inscritos Bancolombia   |406-139740-01   |Corriente|
   |2   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |406-739740-05   |Ahorros   |100000   |Productos propios e inscritos Bancolombia   |406-739740-07   |Ahorros|
   |3   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |001   |0369   |NO ERROR   |bolp   |ACTIVO   |406-125170-03   |Corriente   |100000   | Productos inscritos de otros bancos   |40670694007   |Corriente|
   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   ||
