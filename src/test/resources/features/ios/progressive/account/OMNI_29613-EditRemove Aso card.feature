 Feature: User is able to edit/remove existing aso card 
     
  @Sprint4 @ST-OMNI-29613 @TC-OMNI-34260
	Scenario: User is able to remove existing aso card in my account 
    Given User launches the application
		And User continues as guest user
		And User is on "LogIn" screen
		When User enters "emailwhichhascreditcard" on login screen 
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
		When user clicks on "deletecardbutton" on aso card page
		Then user is taken to "alertmodal" on aso card page 
		#When user clicks on "cancell" on aso card page
		When user clicks on "continue" on aso card page
		And user see "payment header" on my account payment page
		When user clicks on "Add new Academy card tile" on my account payment page
		
		
		
		@Sprint4 @ST-OMNI-29613 @TC-OMNI-34260
	Scenario: User is able to edit existing aso card in my account 
    Given User launches the application
		And User continues as guest user
		And User is on "LogIn" screen
		When User enters "emailwhichhascreditcard" on login screen 
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
		Then i choose to enter "ccnewfirstname" on aso card page 
		When user clicks on "save card button" on aso card page
		And user see "payment header" on my account payment page
		And user see "existing aso card" on my account payment page
		#When user clicks on "deletecardbutton" on aso card page
		#Then user is taken to "alertmodal" on aso card page 
		#When user clicks on "cancell" on aso card page
		#When user clicks on "continue" on aso card page
		And user see "payment header" on my account payment page
		When user clicks on "Add new Academy card tile" on my account payment page
		