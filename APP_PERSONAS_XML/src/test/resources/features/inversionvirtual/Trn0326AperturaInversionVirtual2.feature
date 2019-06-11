@E2E_APP_PERSONAS
Feature: APP Personas Bancolombia
  A person must be able to access the transactional site APP persons Bancolombia and authenticate with user and
  password and be able to consult the check the rates of the virtual investment.

  @TestCase1
  Scenario Outline:  TRN0322 Successful check the opening the virtual investment to the APP Personas Bancolombia

    Given I Upload the Transaction Data
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> |
    When I try to authenticate myself using my credentials
      | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> |
    And I verify the authentication
    And Previous consultations opening the virtual investment
      | <CuentaOrigen> | <TipoCuentaOrigen> |
    And I know the range and the annual effective rate virtual investment
      | <Monto> | <Periodicidad> | <Plazo> | <TasaEfectiva>|
    And I accept terms and conditions virtual investment
      | <VersionTYC> |
    And I opening the Virtual Investment Bancolombia
    And Subsequent consultations opening the virtual investment
    Then I verify opening the virtual investment result
    And I verify the debit of the balance in the SCIFFSALDO

    #And he can see the verification in the LogCanal-COMFFLGWWW_TRN0326
    And I verify the results in the files of back iseries
     | LOG CANAL-COMFFLGWWW | SALDOS DEPOSITOS-SCIFFSALDO |


    Examples:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | CuentaOrigen |  TipoCuentaOrigen | Monto | Periodicidad | Plazo |TasaEfectiva | VersionTYC |
    ##@externaldata@./src/test/resources/datadriven/virtualinvestment/Trn_0326Apertura.xlsx@Datos@1
   |1   |35806340   |1   |nose   |2443   |4321   |Acierto   |000   |0326   |TRANSACCION EXITOSA   |40676340007   |Ahorros   |5150000   |ATEXPIRATION   |90   |2.89   |1.8|
