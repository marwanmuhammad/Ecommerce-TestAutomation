@smoke
Feature: Currencies_ user can change the currencies correctly
  Scenario: change the currencies of all products on the home page from (US Dollar) to (Euro)

    Given navigate to url website
    When Select Euro currency from the dropdown list on the top left of home page
    Then verify that Euro Symbol is shown on the 4 products displayed in Home page

