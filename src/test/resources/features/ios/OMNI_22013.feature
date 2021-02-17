Feature: Verify Details of Cart with a product without variants

  @Sprint1 @TC_OMNI_24353
  Scenario: User taps on View Cart Button to Navigate to Cart page
    Given User has launched the app and is on PDP
    And User has tapped on add product to cart
    When User taps on view cart button
    Then User navigates to cart detail page
    And User sees "Your Cart" label
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
    
