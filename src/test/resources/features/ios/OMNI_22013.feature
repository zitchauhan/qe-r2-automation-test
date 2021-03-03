Feature: Verify Details of Cart with a product without variants

  @Sprint1 @TC-OMNI-24353 @ST-22013
  Scenario: User taps on View Cart Button to Navigate to Cart page
    Given User launches the application
    When User taps on go to pdp button
    And User sees Product title
    And User taps on add to cart button
    Then User is navigated To Cart Screen
    And User sees items label
    And User sees subtotal header
    And User sees product title
    And User sees SKU label
    And User sees Price label
    And User sees Quantity Selector
    And User sees Remove from cart button
    And User sees Add to wish list button
    When User taps on increment button
    Then Quantity is increased by one
    When User taps on decrement button
    Then Quantity is decreased by one