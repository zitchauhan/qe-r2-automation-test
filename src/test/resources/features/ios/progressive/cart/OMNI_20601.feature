Feature: Verify user is able to navigate to Checkout screen

  @ST-OMNI-20601 @TC-OMNI-33071
  Scenario: Verify User is able to navigate to Checkout screen
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User sees the checkout button
    When User taps on the checkout button
    Then User sees the checkout screen