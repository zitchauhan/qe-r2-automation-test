
 Feature: User is able to add ASo card in account section 
     
  @Sprint4 @ST-OMNI-29612 @TC-OMNI-34183
	Scenario: User is able to add aso card in my account 
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
		When user clicks on "Add new Academy card tile" on my account payment page
		#When user clicks on "Add new credit card tile" on my account payment page
		Then user is taken to "add new Aso card" on aso card page 
		Then i choose to enter "AsoCard" on aso card page 
		Then i choose to enter "ccfirstname" on aso card page 
		Then i choose to enter "ccLastname" on aso card page 
		Then i choose to enter "ccAddress" on aso card page
		Then i choose to enter "ccaprtname" on aso card page
		And i choose to enter "cczipcode" on aso card page
		Then i choose to enter "entercccity" on aso card page
		And i choose to enter "ccmobilenumber" on aso card page
		When user clicks on "save card button" on aso card page
		And user see "payment header" on my account payment page
		And user see "existing aso card" on my account payment page
		
		
		
		@Sprint4 @ST-OMNI-29612 @TC-OMNI-34259
	Scenario: User Tries to cancell and save aso card 
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
		When user clicks on "Add new Academy card tile" on my account payment page
		#When user clicks on "Add new credit card tile" on my account payment page
		Then user is taken to "add new Aso card" on aso card page 
		Then i choose to enter "AsoCard" on aso card page 
		Then i choose to enter "ccfirstname" on aso card page 
		Then i choose to enter "ccLastname" on aso card page 
		Then i choose to enter "ccAddress" on aso card page
		Then i choose to enter "ccaprtname" on aso card page
		And i choose to enter "cczipcode" on aso card page
		Then i choose to enter "entercccity" on aso card page
		And i choose to enter "ccmobilenumber" on aso card page
		When user clicks on "backbutton" on aso card page
		Then user is taken to "alertmodal" on aso card page 
		When user clicks on "cancell" on aso card page
		#When user clicks on "continue" on aso card page
		Then user is taken to "add new Aso card" on aso card page 
		When user clicks on "save card button" on aso card page
		And user see "payment header" on my account payment page
		And user see "existing aso card" on my account payment page
		
		
		
		