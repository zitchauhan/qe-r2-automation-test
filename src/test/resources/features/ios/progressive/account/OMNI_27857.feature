Feature: Edit or Remove Address

  @Sprint4 @ST-OMNI-27857 @TC-OMNI-
  Scenario: As an ASO Mobile App user,
  I must be able to edit/update address on My Account so that I can ship my products to my shipping address
    Given User launches the application
    And User Logs into the application
    And User taps on account in bottom nav
    When User taps on Address Book button
    Then User sees list of saved addresses
    # TODO: more validations required
    When User selects an address to edit
    Then User sees the edit address screen
    When User updates the address details on edit address screen
    Then User sees the AVS screen
    And User sees that the suggested address is selected by default
    When User selects "You Entered" tile on AVS
    And User taps on use selected address button
    Then User sees list of saved addresses
    When User selects an address to edit
    Then User sees the edit address screen
    And User sees updated phone number on edit address screen
    When User taps on back button
    Then User sees list of saved addresses
