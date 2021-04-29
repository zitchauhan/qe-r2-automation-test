Feature: User is able to login into my account 
     
  @Sprint4 @ST-OMNI-29609012 @TC-OMNI-30090911611
	Scenario: User is able to add aso card 
		Given User launches the application
		And User continues as guest user
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 