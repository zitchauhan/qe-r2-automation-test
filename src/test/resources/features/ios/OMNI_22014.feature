Feature: Verify Order Summary in Cart

  @Sprint1 @TC-OMNI-24800
  Scenario: User sees the necessary Order Summary elements with label
    Given User launches the application
    And User Logs into the application
    When User taps on go to pdp button
    And User taps on add to cart button
    And User taps on View Cart button
    And User sees the order summary label
    And User sees taxes label
    And User sees the order total label
