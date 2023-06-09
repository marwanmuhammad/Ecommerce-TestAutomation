@smoke
Feature: Hover_when the user hover on an item in the page sub items appear
  Scenario: move the cursor to an item in the home page and choose a sub item to verify that hover feature is working well

    Given navigate to url website
    When hover on computers item
    And click on desktops subitem
    Then verify that the page title contains "Desktops"