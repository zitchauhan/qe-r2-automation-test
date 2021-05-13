Feature: User I want to signup for email notifications for special offers, deals

  @Sprint6 @ST-OMNI-28638 @TC_OMNI-37337
  Scenario: User Sign in With valid Email and password and changing the password
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    And User is on Log In screen
    Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "zitchauhan@yahoo.in"
    And User enters valid password "Test@12345"
    And User taps on Login
    Then User Tap on Profile
    Then User tap on Password
    Then user see on Change Your Password screen
    Then User Enter Valid Current Password
    Then User Enter Valid new Password
    Then User tap on Upated
    Then User Redirect to Profile Screen
    And User is on Log In screen

  @TC_OMNI-37334
  Scenario: User Sign in With valid Email and password and  changing the password with invalid Password
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    And User is on Log In screen
    Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "zitchauhan@yahoo.in"
    And User enters valid password "Test@12345"
    And User taps on Login
    Then User tap on Password
    Then user is on Change Your Password screen
    Then User Enter Valid Current Password
    Then User Enter Valid new Password
    Then User tap on Upated
    Then User Redirect to Profile Screen
    And User is on Log In screen
    Then User tap on Password
    Then User Enter inValid Current Password
    Then User Enter Valid new Password
    Then User tap on Upated

  @TC-OMNI-37340
  Scenario: Password entered is same as entered email address
    Given User launches the application
    And User continues as guest user
    When User taps on account in bottom nav
    And User is on Log In screen
    Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "zitchauhan@yahoo.in"
    And User enters valid password "Test@12345"
    And User taps on Login
    Then User tap on Password
    Then user is on Change Your Password screen
    Then User Enter Valid Current Password
    Then User Enter  Valid Same new Password
    Then User tap on Upated
    Then User will get Error massge
