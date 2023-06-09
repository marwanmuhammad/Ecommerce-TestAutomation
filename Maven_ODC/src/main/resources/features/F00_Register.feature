@smoke
Feature:Register_ user can register with new accounts
  Scenario: register with mandatory data

    Given navigate to url website
    And go to register page
    When enter the mandatory data
    And click on register button
    Then success message is displayed

