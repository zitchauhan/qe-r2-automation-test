Feature: Order Details - Show Payment Details

  @Sprint5 @ST-OMNI-33179 @TC-OMNI-35018
  Scenario: Validate User is navigated to payment details screen
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    Then User sees the account page
    Then User taps on the orders button
    Then User enter "730870007" in order field
    And User enters "77077" in zip code field
    Then User taps on Order Check button
    Then User taps on Order button in orders screen
    Then User is navigated to payment details screen
    
   @Sprint5 @ST-OMNI-33179 @TC-OMNI-35019
   Scenario: Validate User sees the necessary element of order summary in payment detail screen
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    Then User sees the account page
    Then User taps on the orders button
    Then User enter "730870007" in order field
    And User enters "77077" in zip code field
    Then User taps on Order Check button
    Then User is navigated to payment details screen
    Then User sees Order Summary label
    And User sees "Subtotal" field in Payment detail screen
    And User sees "Store Pick Up" field in Payment detail screen
    And User sees "e-Delivery" field in Payment detail screen
    And User sees "Taxes" field in Payment detail screen
    And User sees "Discount" field in Payment detail screen
    
   @Sprint5 @ST-OMNI-33179 @TC-OMNI-35020
   Scenario: Validate User is navigated to payment details screen
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    Then User sees the account page
    Then User taps on the orders button
    Then User enter "12345" in order field
    And User enters "12207" in zip code field
    Then User taps on Order Check button
    Then User is navigated to payment details screen
    Then User sees the payment method label
    And User sees "Card" field in Payment detail screen
    And User sees "Gift card" field in Payment detail screen
    And User sees "Gift card digits" field in Payment detail screen
    And User sees "Gift card amount" field in Payment detail screen
    