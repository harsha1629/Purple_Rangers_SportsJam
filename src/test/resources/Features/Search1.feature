Feature: Search the product in Sportsjam
  Background:
   Given User is on SportsJam HomePage
  
  @Firstproduct
  
 Scenario: User Search the product and verify it application
 
    When  User clicking the searchbar and user give the  keyword
    And  User click the Search option
    And  User getting the Number of product list displayed
    And   User clicks the product in the list
    Then  User successfully Search the product
    
    
    
    @SecondProduct
     Scenario: User Search the product and verify it application
  
    When  User clicking the searchbar and user give the  keywordtwo.
    And  User click the Search option
    And  User getting the Number of product2 list displayed
    And   User clicks the product in the listtwo
    Then  User successfully Search the product2
    