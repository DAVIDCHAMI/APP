      #language: es

      Característica: Cargar tarjeta virtual ePrepago
        Yo como usuario de la app Personas Bancolombia
        Quiero cargar mi tarjeta virtual ePrepago
        Para tener saldo

        Esquema del escenario: Carga exitosa a tarjeta virtual ePrepago activa
          Dado que el Actor se autentica en la app
            | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
            | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
          Cuando el actor quiere RECARGAR_EPREPAGO
          Y realiza la carga por valor de <valorRecarga>
            | tipoCuenta   | numeroCuenta   |
            | <tipoCuenta> | <numeroCuenta> |
          Entonces el deberia de ver un mensaje de carga de tarjeta virtual ePrepago exitosa
          Ejemplos:
            | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
        ##@externaldata@./src/test/resources/datadriven/eprepago/recargar_tarjeta_virtual_eprepago.xlsx@Datos@1
      |1|93221450|1|pruebauser01|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|160000|Corriente|406-182800-02|

        Esquema del escenario: Carga a tarjeta virtual ePrepago inactiva
          Dado que el Actor se autentica en la app
            | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
            | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
          Cuando el actor quiere RECARGAR_EPREPAGO
          Y realiza la carga por valor de <valorRecarga>
            | tipoCuenta   | numeroCuenta   |
            | <tipoCuenta> | <numeroCuenta> |
          Entonces el deberia de ver un mensaje de carga de tarjeta virtual ePrepago exitosa
          Ejemplos:
            | ID | numeroDocumento | tipoDocumento | usuario           | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
          ##@externaldata@./src/test/resources/datadriven/eprepago/recargar_tarjeta_virtual_eprepago.xlsx@Datos@2
      |2|700101|1|pruebasregistro49|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|20000|Ahorros|406-701010-64|

        Esquema del escenario: Carga a tarjeta virtual ePrepago sobre el valor maximo permitido
          Dado que el Actor se autentica en la app
            | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
            | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
          Cuando el actor quiere RECARGAR_EPREPAGO
          Y realiza la carga sobre el valor maximo por valor de <valorRecarga>
            | tipoCuenta   | numeroCuenta   |
            | <tipoCuenta> | <numeroCuenta> |
          Entonces el deberia de ver un mensaje de carga de tarjeta virtual ePrepago exitosa
          Ejemplos:
            | ID | numeroDocumento | tipoDocumento | usuario           | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
          ##@externaldata@./src/test/resources/datadriven/eprepago/recargar_tarjeta_virtual_eprepago.xlsx@Datos@3
      |3|700100|1|pruebasregistro48|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|2000000|Ahorros|406-701000-71|

        Esquema del escenario: Carga a tarjeta virtual ePrepago sobre el valor minimo permitido
          Dado que el Actor se autentica en la app
            | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
            | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
          Cuando el actor quiere RECARGAR_EPREPAGO
          Y realiza la carga sobre el valor minimo por valor de <valorRecarga>
            | tipoCuenta   | numeroCuenta   |
            | <tipoCuenta> | <numeroCuenta> |
          Entonces el deberia de ver un mensaje de carga de tarjeta virtual ePrepago exitosa
          Ejemplos:
            | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
          ##@externaldata@./src/test/resources/datadriven/eprepago/recargar_tarjeta_virtual_eprepago.xlsx@Datos@4
      |4|93221453|1|autotest30|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|10000|Ahorros|406-733020-15|

        Esquema del escenario: Cargar tarjeta virtual ePrepago por el monto total de la cuenta
          Dado que el Actor se autentica en la app
            | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
            | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
          Cuando el actor quiere RECARGAR_EPREPAGO
          Y realiza la carga por valor de <valorRecarga>
            | tipoCuenta   | numeroCuenta   |
            | <tipoCuenta> | <numeroCuenta> |
          Entonces el deberia de ver un mensaje de carga de tarjeta virtual ePrepago exitosa
          Ejemplos:
            | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
          ##@externaldata@./src/test/resources/datadriven/eprepago/recargar_tarjeta_virtual_eprepago.xlsx@Datos@5
      |5|93221453|1|autotest30|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|100000|Ahorros|406-733020-20|

        Esquema del escenario: Cargar tarjeta virtual ePrepago con cuenta en ceros
          Dado que el Actor se autentica en la app
            | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
            | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
          Cuando el actor quiere RECARGAR_EPREPAGO
          Y realiza la carga por valor de <valorRecarga>
            | tipoCuenta   | numeroCuenta   |
            | <tipoCuenta> | <numeroCuenta> |
          Entonces deberia ver un mensaje de fondos insuficientes
          Ejemplos:
            | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
        ##@externaldata@./src/test/resources/datadriven/eprepago/recargar_tarjeta_virtual_eprepago.xlsx@Datos@6
      |6|93221453|1|autotest30|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|30000|Ahorros|406-733020-19|
