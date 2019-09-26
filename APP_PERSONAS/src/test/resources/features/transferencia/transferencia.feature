#language: es

Característica: Realizar una transferencia

  @manual
  Esquema del escenario: Transferencia a productos inscritos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere TRANSFERIR_DINERO
    Cuando el transfiere desde <opcionProductoOrigen> hacia el producto <opcionProductoDestino>
      | tipoTransferencia   | numeroCuenta     | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |
    Entonces deberia ver la confirmacion exitosa de la transferencia
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto | tipoTransferencia                         | productoDestino | tipoProductoDestino | opcionProductoOrigen | opcionProductoDestino |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@Datos@2
      | 2  | 1010111         | Cédula de ciudadanía | pruebauser01 | 6789  | 4321         | Alterno     | 000         | 0369              | NO ERROR          | bolp            | ACTIVO       | 406-182800-02  | Cuenta             | 60000 | Productos propios e inscritos Bancolombia | 406-182800-04   | Cuenta              | Mis productos        | Mis productos         |


  @manual
  Esquema del escenario: Transferencia desde un fondo de inversion a inscritas Bancolombia a cuenta depósto
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere TRANSFERIR_DINERO
    Cuando diligencios los datos de la transferencia desde <opcion> con informacion
      | tipoTransferencia   | numeroCuenta     | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |
   # Entonces deberia ver la confirmacion exitosa de la transferencia
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto  | tipoTransferencia                         | productoDestino | tipoProductoDestino | opcion      |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@Datos@6
   |6   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |7001000033569   |FIDURENTA   |100000   |Productos propios e inscritos Bancolombia   |406-139740-01   |Corriente   |Inversiones|

  @manual
  Esquema del escenario: Transferencia a cuentas no inscritas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere TRANSFERIR_DINERO
    Cuando diligencios los datos de la transferencia desde <opcion> con informacion
      | tipoTransferencia   | numeroCuenta     | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |
   # Entonces deberia ver la confirmacion exitosa de la transferencia
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto  | tipoTransferencia                  | productoDestino | tipoProductoDestino | opcion |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@Datos@1
   |1   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |406-139740-01   |Corriente   |100000   |Productos no inscritos Bancolombia   |40670694007   |Corriente   ||

  @Manual:Passed
  Esquema del escenario: Transferencia desde un fondo de inversion a inscritas de otros bancos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere TRANSFERIR_DINERO
    Cuando diligencios los datos de la transferencia desde <opcion> con informacion
      | tipoTransferencia   | numeroCuenta     | tipoCuenta           | monto   | productoDestino   | tipoProductoDestino   |
      | <tipoTransferencia> | <productoOrigen> | <tipoProductoOrigen> | <monto> | <productoDestino> | <tipoProductoDestino> |
    Entonces deberia ver la confirmacion exitosa de la transferencia
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | productoOrigen | tipoProductoOrigen | monto  | tipoTransferencia                   | productoDestino | tipoProductoDestino | opcion      |
   ##@externaldata@./src/test/resources/datadriven/transferencia/Transferencia.xlsx@Datos@5
   |5   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |001   |0369   |NO ERROR   |bolp   |ACTIVO   |0007000302095   |FIDUCUENTA   |100000   | Productos inscritos de otros bancos   |40670694007   |Corriente   |Inversiones|
