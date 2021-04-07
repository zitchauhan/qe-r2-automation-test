Feature: Verify presence of payment safety and available payment choices on View Cart screen

  @Sprint2 @TC-OMNI-22070 @TC-OMNI-33073
  Scenario: User can see payment safety message and payment choices
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User sees shop with confidence label
    And User sees security reassurance message
    And User sees we accept label
    # Next step doesn't do visual verification
    And User sees images of payment options