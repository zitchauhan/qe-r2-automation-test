
Feature: Verify Details of Empty cart for Guest user

  @Sprint1 @TC-OMNI-24518 @ST-OMNI-22071
  Scenario: Guest User is on cart without any products
  	Given User launches the application
  	When User taps on cart in bottom nav
    Then User is navigated To Cart Screen
    And User sees Cart icon
    And User sees Cart Empty label
    And User sees Sigin text
    And User sees Log in Button
    And User sees Create an Account Button