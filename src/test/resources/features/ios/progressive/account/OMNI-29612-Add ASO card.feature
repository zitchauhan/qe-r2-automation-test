
 Feature: User is able to add ASo card 
     
  @Sprint4 @ST-OMNI-29612 @TC-OMNI-3011611
	Scenario: User is able to add aso card 
		Given User launches the application
		And User continues as guest user
		And User is on Log In screen
		When User enters email address
		And User enters password
		And User taps on LogIn button
    And User taps on LogIn button
		Then User Logs into the application
		Then User taps on account in bottom nav
		#Then user taken to my account welcome screen 
		When user see myaccount welcomesection 
		Then user taps on payment button
		And user is on payment screen
		When user clicks onAdd new Academy card tile
		Then user is taken to add new Aso card page 
		Then i choose to enter Aso card "1234567890123456"
		Then i choose to enter first name "Prafull"
		Then i choose to enter Last name "Singh"
		Then i choose to enter Address "1047 rock vile pike "
		Then i choose to enter aprt name "2615"
		And i choose to enter zip code "20852"
		Then i choose to enter choose to enter city "abc"
		And i choose to enter mobile number "1234567890"
		Then i choose to click onsave card button 
		
		
		@Sprint4 @ST-OMNI-29612 @TC-OMNI-3011611
	Scenario: Validate that Alert modal comes when user clicks on back button and user can continue or go back 
		Given User launches the application
		And User continues as guest user
		And User is on Log In screen
		When User enters email address
		And User enters password
		And User taps on LogIn button
    And User taps on LogIn button
		Then User Logs into the application
		Then User taps on account in bottom nav
		#Then user taken to my account welcome screen 
		When user see myaccount welcomesection 
		Then user taps on payment button
		And user is on payment screen
		When user clicks onAdd new Academy card tile
		Then user is taken to add new Aso card page 
		Then i choose to enter Aso card "1234567890123456"
		Then i choose to enter first name "Prafull"
		Then i choose to enter Last name "Singh"
		Then i choose to enter Address "1047 rock vile pike "
		Then i choose to enter aprt name "2615"
		And i choose to enter zip code "20852"
		Then i choose to enter choose to enter city "abc"
		And i choose to enter mobile number "1234567890"
		Then i choose to click on back button 
		Then i verify that alert modal is disaplyed
		Then i click on Cancel button
		Then i choose to click onsave card button 
		