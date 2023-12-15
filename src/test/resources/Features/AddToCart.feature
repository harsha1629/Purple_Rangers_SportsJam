Feature: user wants to Clicking the AddToCart and Delete from Cart in SportsJam

  Background: 
    Given Launch URL to open SportsJam

  @Adding
  Scenario: Adding items to Cart
    When user trying to search product
    And user clicks search button
    And user clicks item from product list
    And User trying to add product to cart and goes back to the previous window
    And user clicks the second product
    And user clicks add to cart for second product
    And User clicks on Cart
    And The item is shown on the cart
    And user clicks remove from cart
    Then the updated Cart is shown
