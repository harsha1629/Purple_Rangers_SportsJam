Feature: Connect With Us in SportsJam
 
Background:
Given user is in the home page of sportsjam page
  
  @facebook
Scenario: User clicking About us
 
    When User clicks Facebook image
    Then Connect with SportsJam.in on Facebook message is shown
    @twitter
    Scenario: User clicking Twiiter
    When User clicks Twiiter image
    Then Sign in to X message is shown
    @instagram
     Scenario: User clicking Instagram
      When User clicks Instagram Image
    Then Sportsjam.in  message is showns
  
  
  