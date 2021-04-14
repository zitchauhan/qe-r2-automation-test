
  Feature: User is able to see add new cc tile on payment screen 
     
  @Sprint4 @ST-OMNI-30116 @TC-OMNI-3011611
	Scenario: User see Add new Credit cart tile
		Given User launches the application
		And User continues as guest user
		And User is on Log In screen
		When User enters email address
		And User enters password
		And User taps on LogIn button
		Then User Logs into the application
		Then User taps on account in bottom nav
		#Then user taken to my account welcome screen 
		When user see myaccount welcomesection 
		Then user taps on payment button
		And user is on payment screen
		When user clicks onAdd new credit card tile
		Then user is taken to add new credit card page 
		
		
		
		
		@Sprint4 @ST-OMNI-30116 @TC-OMNI-3011613
	Scenario: when user click on add ASO card 
		Given User launches the application
		And User continues as guest user
		And User is on Log In screen
		When User enters email address
		And User enters password
		And User taps on LogIn button
		Then User Logs into the application
		Then User taps on account in bottom nav
		#Then user taken to my account welcome screen 
		When user see myaccount welcomesection 
		Then user taps on payment button
		And user is on payment screen
		When user clicks onAdd new Academy card tile
		Then user is taken to add new Aso card page 
		
		
		
		@Sprint4 @ST-OMNI-30116 @TC-OMNI-301161333
	Scenario: Verify existing cards are displayed and top most card is default card 
		Given User launches the application
		And User continues as guest user
		And User is on Log In screen
		When User enters email address
		And User enters password
		And User taps on LogIn button
		Then User Logs into the application
		Then User taps on account in bottom nav
		#Then user taken to my account welcome screen 
		When user see myaccount welcomesection 
		Then user taps on payment button
		And user is on payment screen
		Then existing cards are shown to user 
		And top most card is default card 
		
		
		
		 
		 
		 
		
		
		