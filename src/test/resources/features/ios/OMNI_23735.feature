Feature: Verify Subtotal and items label in cart

  @Sprint1 @TC_OMNI_24891
  Scenario: User is able to see subtotal and items value label in cart
    Given User has navigated to cart
    Then Subtotal label should be displayed
    And Item count should be displayed