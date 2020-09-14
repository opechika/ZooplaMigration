Feature: For Sale Properties
  As a customer
  I want the ability to search for any properties for sale
  So that I can review the property before I buy

@Smoke
Scenario Outline: Customer can search for any property
  Given I navigate to zoopla homepage
  When I enter "<Location>" into the search field
  And I select "<MinPrice>" from Min price dropdown
  And I select "<MaxPrice>" from Max price dropdown
  And I select "<Property>" from Property type dropdown
  And I select "<Bedroom>" from Bedrooms dropdown
  And I click on Search button
  Then search result page is displayed with relevant results

  Examples:
  |Location|MinPrice|MaxPrice|Property|Bedroom|
  |Manchester| £140,000|£250,000|Houses|3+    |
 # |OL9 8LD   | £120,000|£180,000|Flats |2+    |
 # |Victoria Station| £200,000|£400,000|Houses|4+|
  #|OL9    | £120,000|£180,000|Flats |2+    |


  @negativeTest
  Scenario: Customer cannot search for empty location
    Given I navigate to zoopla homepage
    When I enter "" into the search field
    And I click on Search button
    Then an error message is displayed on search field


    @negativeTest
  Scenario: Customer gets error page for invalid location
    Given I navigate to zoopla homepage
    When I enter "wwwwwwwwww" into the search field
    And I click on Search button
    Then an error page is displayed