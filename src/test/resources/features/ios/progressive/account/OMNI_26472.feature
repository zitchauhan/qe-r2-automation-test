Feature: Address Suggestion & Verification

  @Sprint2 @ST-OMNI-26472 @TC-OMNI-
  Scenario: Verify that User can add an address
    Given User launches the application
    When User adds a new address
    Then User sees address verification screen
    And User sees suggested address checked by default
    When User taps on use selected address button
    Then User sees the list of already added addresses
    And User sees relevant warning message "AddressWarning"
    When User taps an existing addresses
    Then User sees address verification screen
    When User taps on edit link of existing address
    Then User sees the edit address screen
