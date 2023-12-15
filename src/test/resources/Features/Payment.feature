Feature: Proceeding with the payment for the product

  Scenario: Buying the product using payment option
    Given Launch URL to open SportsJam
    When user trying to search product
    And user clicks search button
    And user clicks item from product list
    And User trying to add product to cart
    And User clicks on Cart
    And The item is shown on the cart
    And user clicks proceed to pay
    And User enters email,password,holebutton and clicking continue
    And User entering Name,LastName,Address,Zipcode,Country,State,mobileNo,clicking continue
    And User verifying Order Details,contine
    Then user trying to click payNow
