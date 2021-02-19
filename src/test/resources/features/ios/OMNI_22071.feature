
Feature: Verify Details of Empty cart for Guest user

  @Sprint1 @TC-OMNI-24518 @ST
  Scenario: Guest User is on cart without any products
  	Given User launches the application
  	When User taps on cart in bottom nav
    Then User sees Your Cart label
    And User sees Cart icon
    And User sees Cart Empty label
    And User sees Sigin text
    And User sees Log in Button
    And User sees Create an Account Button