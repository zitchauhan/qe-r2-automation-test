
Feature: Verify Details of Empty cart for Guest user

  @Sprint1 @TC_OMNI_24518
  Scenario: Guest User is on cart without any products
  	Given Guest User is on empty cart page
    Then User sees Your Cart label
    And User sees Cart icon
    And User sees Cart Empty label
    And User sees Sigin text
    And User sees Log in Button
    And User sees Create and Account Button