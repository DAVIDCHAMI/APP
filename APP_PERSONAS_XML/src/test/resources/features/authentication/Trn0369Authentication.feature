Feature: Bancolombia application
  A person must be able to access the Bancolombia application if they authenticate with username and password.

  @CasoExitoso
  Scenario Outline: Successful access to the Bancolombia application
    Given I Upload the Transaction Data
      | <ID> | <RutaEvidencia> | <RutaLogCanal> | <NombreEvidencia> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> |
    When  I try to authenticate myself using my credentials
      | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> |
    Then I verify the authentication result

    Examples:

      | ID | RutaEvidencia | RutaLogCanal | NombreEvidencia | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado |
   ##@externaldata@./src/test/resources/datadriven/authentication/Trn_0369Autenticacion.xlsx@Datos