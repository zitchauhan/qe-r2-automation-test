Feature: Verify Subtotal and items label in cart

  @Sprint1 @TC_OMNI_24891
  Scenario: User is able to see subtotal and items value label in cart
    Given User launches the application
    And User Logs into the application
    When User taps on go to pdp button
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees items label
    And User sees subtotal header
    
   
   Scenario: Items label is udpated when more products are added to cart
    Given User launches the application
    And User Logs into the application
    When User taps on go to pdp button
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees items label
    And User sees subtotal header
    And User sees "2" items in item label