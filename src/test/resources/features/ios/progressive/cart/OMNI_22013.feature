Feature: Verify Details of Cart with a product without variants

  @Sprint1 @TC-OMNI-24353 @ST-22013
  Scenario: User taps on View Cart Button to Navigate to Cart page
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees product title
    And User sees SKU label
    And User sees Price label
    And User sees Remove from cart button
    And User sees Add to wish list button