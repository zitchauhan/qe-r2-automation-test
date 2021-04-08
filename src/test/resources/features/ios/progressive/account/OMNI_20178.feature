Feature: Verify User is able to see all the fields of the create and account screen

  @ST-OMNI-20178 @TC-OMNI-33069
  Scenario: User sees all necessary fields in create account page
  	Given User launches the application
  	And User taps on Maybe later in Onboarding Screen
    And User continues as guest user
    When User taps on account in bottom nav
    Then User sees the account page
    When User taps on Create An Account button
    Then User sees sign up screen
    And User sees "First Name" field
    And User sees "Last Name" field
    And User sees "Email" field
    And User sees "Password" field
    And User sees "Promotion" field
    And User sees "Create an Account" field
    And User sees "T&C" field