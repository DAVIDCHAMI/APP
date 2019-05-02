Feature: As a user of the SVP, I can open a virtual investment

  @manual
  Scenario Outline: I want to open a virtual investment
    Given that <user> is in the SVP
    When He select the virtual investment opening option
    Then He should be able to open a virtual investment with periodicity <periodicity> from an account <typeAccount> <characteristicAccount>

    Examples:
      | id | user     | periodicity       | typeAccount | characteristicAccount                |
      | 1  | Juan     | monthly           | savings     | with balance                         |
      | 2  | Rosa     | to the expiration | savings     | with balance                         |
      | 3  | Catalina | monthly           | current     | with balance                         |
      | 4  | Camilo   | to the expiration | current     | with balance                         |
      | 5  | Lina     | monthly           | savings     | no credit                            |
      | 6  | Carlos   | to the expiration | current     | no credit                            |
      | 7  | Andres   | to the expiration | savings     | in a state that does not allow debit |
      | 8  | Johan    | monthly           | current     | in a state that does not allow debit |

