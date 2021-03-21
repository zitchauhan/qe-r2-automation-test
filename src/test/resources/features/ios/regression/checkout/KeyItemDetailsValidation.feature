Feature: Checkout

  @Regression
  Scenario: Verify that the user can see key item details on Checkout screen
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User sees the checkout button
    When User taps on checkout button
    Then User sees product thumbnail on checkout
    And User sees product name on checkout
    And User sees sku on the cart page
    And User sees the quantity on the cart page
    And User sees the product price on the cart page