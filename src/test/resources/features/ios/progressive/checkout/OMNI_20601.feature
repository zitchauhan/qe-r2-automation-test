Feature: User is able to navigate to checkout screen
  
  @ST-OMNI-20601 @TC-OMNI-33071
  Scenario: Title of your scenario
    Given User launches the application
    And User continues as guest user
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees the checkout button
    When User taps on checkout button
    Then User sees product thumbnail on checkout