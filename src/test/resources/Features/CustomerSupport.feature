Feature: Customer Support in SportsJam
  
  Given Launch URL to open SportsJam

  Scenario: User clicking customer support
    Given Launch URL to open SportsJam
    When User clicks Gift Voucher
    And user clicks Image
    Then user clicks add to cart
    When User clicks Reward Points
    Then REWARD POINTS message is shown
    When User clicks Buyers Guide
    Then Buyers Guide message is shown
    When User clicks Customized Services
    Then CUSTOMIZED SERVICES message is shown
    When User clicks Express Shipping
    Then DELIVERY INFORMATION message is shown
    When User clicks Secure Shopping
    Then PRIVACY AND SECURITY POLICY message is shown
    When User clicks 100% Authentic
    Then AUTHENTICITY @ SPORTSJAM.IN message is shown
