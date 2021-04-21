Feature: Create a wishlist

@Sprint5 @TC_OMNI_ @ST-OMNI-33102
 Scenario: Verify user successfully creates a wishlist
    Given User launches the application
    And User continues as guest user
    And User is on Log In screen
    When User enters email address
    And User enters password
    And User taps on LogIn button
    Then User Logs into the application
    Then User sees the homepage
    When User taps on account in bottom nav
    Then User sees the account page
