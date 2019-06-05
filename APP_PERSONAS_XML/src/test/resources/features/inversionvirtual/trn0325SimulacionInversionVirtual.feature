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
    And Previous consultations opening the virtual investment
     | <CuentaOrigen> | <TipoCuentaOrigen> |
    And I simulation the Virtual Investment Bancolombia
      |<Monto>|<Periodicidad>|<Tiempo>|<TasaEfectiva>|
    And Subsequent consultations opening the virtual investment
    Then I verify simulation the virtual investment result
    And I verify that the balance in the SCIFFSALDO is not debited


    Examples:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | CuentaOrigen |  TipoCuentaOrigen | Monto |Periodicidad|Tiempo|TasaEfectiva|
    ##@externaldata@./src/test/resources/datadriven/virtualinvestment/Trn_0325SimulacionIV.xlsx@Datos@1
   |1   |1035655536   |1   |banana01   |1223   |1234   |Acierto   |000   |0325   |TRANSACCION EXITOSA   |40675536005   |Ahorros   |500000   |ATEXPIRATION   |90   |2.89|
