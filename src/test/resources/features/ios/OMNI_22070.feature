@TC-OMNI-22070
Feature: Verify presence of payment safety and available payment choices on View Cart screen

  Scenario: User can see payment safety message and payment choices
    Given User launches the application
    And User Logs into the application
    When User taps on go to pdp button
    And User sees Product title
    And User taps on add to cart button
    Then User is navigated To Cart Screen
    And User sees shop with confidence label
    And User sees security reassurance message
    And User sees we accept label
    # Next step doesn't do visual verification
    And User sees images of payment options