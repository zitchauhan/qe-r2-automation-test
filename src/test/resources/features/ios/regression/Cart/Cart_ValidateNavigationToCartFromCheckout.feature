Feature: Verify user is able to navigate to Checkout screen

  @Regression
  Scenario: Verify User is able to navigate to Checkout screen
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User sees the checkout button
    When User taps on the checkout button
    Then User sees the checkout screen
