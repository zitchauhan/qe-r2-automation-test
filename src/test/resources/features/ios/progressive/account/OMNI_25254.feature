Feature: Create Account
  Password strength and rules validations

  Scenario: Verify password masking during password typing
    Given User launches the application
    And User taps on account in bottom nav
    When User taps create account on "My Account" screen
    Then User sees Create Account modal
    And User sees passwordd field
    When User enters password character "a"
    Then password field is masked
    When User taps Show button
    Then User sees the password
    And User sees Hide button
    When User taps Hide button
    Then password field is masked
    And User sees the Show button


  Scenario Outline: Verify field level features for Password strength meter
    Given User launches the application
    And User taps on account in bottom nav
    When User taps create account on "My Account" screen
    Then User sees Create Account modal
    And User sees passwordd field
    When User enters password "<password>"
    Then User sees password strength meter list
    And User sees Create Account button as "<create_account_button_state>"

    Examples:
    | password | create_account_button_state |
    | qwerty1234 | inactive                  |

  Scenario: User successfully logs into the application
    Given User launches the application
    And User continues as guest user
    And User is on Log In screen
    When User enters email address
    And User enters password
    And User taps on LogIn button
    Then User Logs into the application
