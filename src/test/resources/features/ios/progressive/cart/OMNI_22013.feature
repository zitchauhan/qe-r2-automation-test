Feature: Verify Details of Cart with a product without variants

  @Sprint1 @TC-OMNI-24353 @ST-22013
  Scenario: User taps on View Cart Button to Navigate to Cart page
    Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees product title
    And User sees SKU label
    And User sees Price label
    And User sees quantity stepper
    And User sees Remove from cart button
    And User sees Add to wish list button
   
   @Sprint1 @TC-OMNI-24353 @ST-22013
   Scenario: User should be allowed to increment and decrement the quantity of product in cart
   	Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees product image
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    When User taps on increment quantity stepper
		Then Quantity is changed to "3"
		When User taps on decrement quantity stepper
		Then Quantity is changed to "2"