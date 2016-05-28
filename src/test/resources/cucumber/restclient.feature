Feature: Rest Client test
  Scenario: My First test
    Given the host is up
    And send the request for basil
    Then respone should be success
    And respone contain basil
