Feature: Verify Order Summary in Cart

  @Sprint1 
  Scenario: User sees the necessary Order Summary elements with label
    Given User is on cart page with product added
    Then User sees order summary label
    And User sees subtotal label
    #And User sees change zip code button
    #Then User sees store pickup label
    #And User sees change store label
    And User sees taxes label
    #And User sees discount label
    #And User sees promo code label
    And User sees the order total label
