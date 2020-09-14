Feature: Customer can interact with tabs

  Scenario: Customer can click on for sale tab link
    Given I navigate to zoopla homepage
    When I hover over the For Sale link
    And I click on UK commercial properties for sale
    Then For Sale page is displayed