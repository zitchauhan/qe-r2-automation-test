Feature: Verify Order Summary in Cart

  @Sprint1 @TC-OMNI-24800 @ST-OMNI-22014
  Scenario: User sees the necessary Order Summary elements with label
    Given User launches the application
    And User continues as guest user
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User verifies delivery options in PDP
    And User taps on add to cart button
    And User taps on View Cart button
    And User sees the order summary label
    And User sees taxes label
    And User sees the order total label