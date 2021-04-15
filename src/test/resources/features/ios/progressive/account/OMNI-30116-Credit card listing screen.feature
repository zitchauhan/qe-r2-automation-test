
  Feature: User is able to see Payment screen under my account section 
     
  @Sprint4 @ST-OMNI-30116 @TC-OMNI-3011611
	Scenario: User see Add new Credit cart tile
		Given User launches the application
		And User continues as guest user
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		#Then User Logs into the application
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page  
		Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		And user see "add credit card button" on my account payment page
		#And user see "Saved Cards" on my account payment page
		And user see "Aso card button" on my account payment page
		 # reviewd by jS
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		
		
		