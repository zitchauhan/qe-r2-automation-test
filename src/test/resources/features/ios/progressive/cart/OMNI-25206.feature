Feature: Verify guest user sign in funcationalies on cart page

  @Sprint1 @ST-25206
  Scenario: verify guest user is able to log in from cart page
    Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    