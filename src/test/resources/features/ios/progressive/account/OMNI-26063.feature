Feature: Validate User is able to ADD and Save credit card
     
@Sprint5 @TC-OMNI-35879 @ST-26063
    Scenario:  Validate User is able to add Credit card in User account 
     Given User launches the application
   And User Clicks On MaY Be Later
   And User Goes to home page
   Then User taps on "account" button on login screen
        When User taps on LogIn button at Account Page
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		#Then User Logs into the application
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page  
		Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		#When user clicks on "Add new Academy card tile" on my account payment page
		When user clicks on "Add new credit card tile" on my account payment page
		Then user is navigate to credit card details page
		And User Add the Credit card cardholder Name ""
		Then User add the credit Card Number "" 
		Then User add the credit card Expiry Date ""
		Then User add the credit card cvv ""
		And user sees the Billing Address Section
		Then i choose to enter "ccfirstname" on credit card page 
		Then i choose to enter "ccLastname" on credit card page 
		Then i choose to enter "ccAddress" on credit card page
		Then i choose to enter "ccaprtname" on credit card page
		Then i choose to enter "cczipcode" on credit card page
		Then i choose to enter "entercccity" on credit card page
		Then i choose to enter "ccmobilenumber" on credit card page
		When user clicks on "save card button" on credit card page
		And user see "payment header" on my account payment page
		And User Sees the Listed Credit card
		
@Sprint5 @TC-OMNI-35883 @ST-26063		
Scenario: Validate the scenario when user press back button in between the process Add cedit card
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
		#When user clicks on "Add new Academy card tile" on my account payment page
		When user clicks on "Add new credit card tile" on my account payment page
		 Then user is navigate to credit card details page
		And User Add the Credit card cardholder Name ""
		Then User add the credit Card Number "" 
		Then User add the credit card Expiry Date ""
		Then User add the credit card cvv ""
		And user sees the Billing Address Section
		Then i choose to enter "ccfirstname" on credit card page 
		Then i choose to enter "ccLastname" on credit card page 
		Then i choose to enter "ccAddress" on credit card page
		Then i choose to enter "ccaprtname" on credit card page
		Then i choose to enter "cczipcode" on credit card page
		Then i choose to enter "entercccity" on credit card page
		Then i choose to enter "ccmobilenumber" on credit card page
		When user clicks on "backbutton" on credit card page
		Then user sees the Alert PopUp message 
		When user clicks on "cancell" on credit card page
		Then user is navigate to credit card details page
		When user clicks on "continue" on credit card page
		And user see "payment header" on my account payment page
		When user clicks on "save card button" on aso card page
		And user see "payment header" on my account payment page
		And User Sees the Listed Credit card
	@Sprint5 @TC-OMNI-35885 @ST-26063	
Scenario: Validate User sees the Default credit card on first position 
     Given User launches the application
   And User Clicks On MaY Be Later
   And User Goes to home page
   Then User taps on "account" button on login screen
        When User taps on LogIn button at Account Page
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		#Then User Logs into the application
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page  
		Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		#When user clicks on "Add new Academy card tile" on my account payment page
		When user clicks on "Add new credit card tile" on my account payment page
		Then user is navigate to credit card details page
		And User Add the Credit card cardholder Name ""
		Then User add the credit Card Number "" 
		Then User add the credit card Expiry Date ""
		Then User add the credit card cvv ""
		Then User set credit card as default 
		And user sees the Billing Address Section
		Then i choose to enter "ccfirstname" on credit card page 
		Then i choose to enter "ccLastname" on credit card page 
		Then i choose to enter "ccAddress" on credit card page
		Then i choose to enter "ccaprtname" on credit card page
		Then i choose to enter "cczipcode" on credit card page
		Then i choose to enter "entercccity" on credit card page
		Then i choose to enter "ccmobilenumber" on credit card page
		When user clicks on "save card button" on credit card page
		And user see "payment header" on my account payment page
		And User Sees the Default credit card on top
	
		