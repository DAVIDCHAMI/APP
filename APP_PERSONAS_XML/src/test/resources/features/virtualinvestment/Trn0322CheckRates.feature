@E2E_APP_PERSONAS
Feature: APP Personas Bancolombia
  A person must be able to access the transactional site APP persons Bancolombia and authenticate with user and
  password and be able to consult the check the rates of the virtual investment.

  @TestCase1
  Scenario Outline:  TRN0322 Successful check the rates of the virtual investment to the APP Personas Bancolombia

    Given I Upload the Transaction Data
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> |
    When I try to authenticate myself using my credentials
      | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> |
    And I verify the authentication
    And I consult the rates of the Virtual Investment Bancolombia
    Then I verify the rates virtual investment result
    And he can see the verification in the LogCanal-COMFFLGWWW_TRN0322
    #And I verify the opening virtual investment in finacle - PRUEBA DE CONEXION FINACLE

    Examples:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado |
    ##@externaldata@./src/test/resources/datadriven/virtualinvestment/Trn_0322ConsultarTasas.xlsx@Datos@1
   |1   |1035655536   |1   |banana01   |1223   |1234   |Acierto   |000   |0322   |TRANSACCION EXITOSA|
