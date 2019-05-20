Feature: As a user of the SVP, I can check the balance of a virtual investment

  @manual
  Scenario Outline: I want to check the balance of a virtual investment
    Given that <user> is in the SVP
    When He query option balance of a virtual investment is selected.
    Then He should be able to check the balance of the virtual investment with periodicity <periodicity>

    Examples:
      | caseID | user | periodicity |
      | 1  | Juan     | monthly           |
      | 2  | Rosa     | to the expiration |