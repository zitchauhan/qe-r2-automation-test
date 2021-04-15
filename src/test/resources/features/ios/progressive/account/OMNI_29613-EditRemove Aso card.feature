 Feature: User is able to remove existing aso card 
     
  @Sprint4 @ST-OMNI-29613 @TC-OMNI-3011611
	Scenario: User is able to remove existing aso card in my account 
    Given User launches the application
		And User continues as guest user
		And User is on "LogIn" screen
		When User enters "email which has aso card" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		#Then User Logs into the application
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page  
		Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		And user see "existing aso card" on my account payment page
		When user clicks on "existing aso card button" on my account payment page
		Then user is taken to "add new Aso card" on aso card page 
		