Feature: Verify that user can change zip code from order summary screen

	@Sprint2  @TC-OMNI-30341 @ST-OMNI-26631
  Scenario: Verify that the user can see required fiels for changing the zip code
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    Then User sees Product title
    When User selects home delivery option
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User does not see item total 
    And User does not see order subtotal summary 
  