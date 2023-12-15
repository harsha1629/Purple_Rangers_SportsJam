Feature: Creating Account in SportsJam
  
  
 Scenario: User trying to create Account
    Given Launch URL to open SportsJam
    When  User clicking create Account link
    When  User enters FirstName,MobileNo,Email,Password and ConfirmPassword
    And   User clicks the Submit button
    Then  User able to see logged in Page and logging out


 
