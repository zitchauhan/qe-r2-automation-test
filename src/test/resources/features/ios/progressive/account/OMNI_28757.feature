Feature: Validate Adress book placeholder in Account screen

  @ST-OMNI-28757 @TC-OMNI-33070
  Scenario: Validate user can see the address book placeholder 
    Given User launches the application
    And User taps on Maybe later in Onboarding Screen
    And User continues as guest user
    And User taps on account in bottom nav
    Then User sees the address book place holder
    When User taps on the address book placeholder
    Then User is taken to add address screen