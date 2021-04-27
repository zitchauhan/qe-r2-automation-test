Feature:
@Sprint4 @ST-OMNI-29613 @TC-OMNI-34260
	Scenario: User is able to remove existing Credit card from Account
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
		And User Sees the Listed Credit card
		And User Click on the Listed Credit card no 1
		Then user is navigate to credit card details page
		When user clicks on "deletecardbutton" on credit card page
		Then user is taken to "alertmodal" on credit card page 
		When user clicks on "cancell" on credit card page
		Then user is navigate to credit card details page
		When user clicks on "deletecardbutton" on credit card page
		When user clicks on "continue" on credit card page
		And user see "payment header" on my account payment page
		

		
		
		