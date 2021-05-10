Feature: User I want to signup for email notifications for special offers, deals

  @Sprint6  @ST-OMNI-28658 @TC-OMNI-37476
  Scenario: Validate Sign up for deals for Logged in User( Sign in With valid Email and zip code)
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    And User is on Log In screen
    Then User sees email address field
    And User sees password field
    Then User enters valid email "zitchauhan@yahoo.in"
    And User enters valid password "Test@12345"
    And User taps on Login
    Then User sees the account page
    And User tap on Sign-Up for Deals
    Then User see Sign Up for deals screen
    Then User enters valid email as  "Email"
    Then User enters valid zip code as  "59044"
    Then User tap on SIGN UP
    Then User See Message Confirmed! You are On the list
    When User Tap Back Navigation
    Then User sees the account page
@Sprint6  @ST-OMNI-28658 @TC-OMNI-37477
  Scenario: User Sign in With invalid Email and zip code
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    And User is on Log In screen
    Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "zitchauhan@yahoo.in"
    And User enters valid password "Test@12345"
    And User taps on Login
    Then User sees the account page
    And User tap on Sign-Up for Deals
    Then User see Sign Up for deals screen
    Then User enters invalid email  "*7a8fin@"
    Then User enters invalid valid zip code "12121"
    Then User tap on SIGN UP
    Then User get Message  Please enter valid email address
