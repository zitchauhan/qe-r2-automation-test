Feature: Personal Greetings

  @Sprint5 @ST-OMNI-20829 @TC-OMNI-36235
  Scenario: Validate logged in user sees the personal greeting message
   Given User launches the application 
	And User continues as guest user 
  And User is on Log In screen
	Then User sees email address field
  And User sees passwordd field
  Then User enters valid email "testuser_shr@yopmail.com"
  And User enters valid password "Qwerty@12345"
  And User taps on Login
  When User taps on account in bottom nav
  Then User sees the greeting message