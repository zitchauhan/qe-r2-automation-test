Feature: Contact us 
     
  @Sprint6 @ST-OMNI-28652 @TC-OMNI-36950
	Scenario: Validate that guest user is able to contact us 
		Given User launches the application
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		And User continues as "guest user" on onboarding page
		
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page 
		Then User scrolls down to the bottom
		Then user taps on "contact us button" on my account page 
		When user see "Mobilenumber" on my account page 
		Then user taps on "Mobilenumber" on my account page 
		Then user taps on "cancel" on my account page 
		
		
		
		
		 @Sprint6 @ST-OMNI-28652 @TC-OMNI-36951
	Scenario: Validate that loggedin user is able to contact us 
		Given User launches the application
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		And User continues as "guest user" on onboarding page
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page 
		Then User scrolls down to the bottom
		Then user taps on "contact us button" on my account page 
		When user see "Mobilenumber" on my account page 
		Then user taps on "Mobilenumber" on my account page 
		Then user taps on "cancel" on my account page 
		
		
		