@smoke
Feature: Search_ user enter different keywords in the search bar
  Scenario Outline: user search with different elements and number of products changes by changing the search item
    Given navigate to url website
    When user search using different product names "<product>"
    Then verify that search url changed and number of "<product>" changed
    Examples:
    | product |
    | book       |
    | laptop     |
    | nike       |

Scenario: User can search using the serial number
  Given navigate to url website
  When user enter serial number in the search bar
  And open the product appeared after his search
  Then verify that the product contains the serial number