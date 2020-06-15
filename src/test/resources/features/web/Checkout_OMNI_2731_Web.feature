Feature: Academy Credit Card should display as a separate option (from Credit Card) in My Account 

@OMNI-2731 @R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-2731 @ZYP_Checkout_2731 @CR-SK 
Scenario: Verify that authenticated user is able to navigate to "Payments" Page.
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then user click on My Account and navigate to payment
    And user deletes all existing credit card
	And user clicks on Add New Credit Card button
	And validate the radio button Academy Credit Card and Credit Card
	And user validates the "Academy Credit Card"
	And user validates the "Credit Card"
	
	
@Web @Regression @CR-SK 
Scenario: Verify that acc card can be added from My accounts
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then user click on My Account and navigate to payment
    And user deletes all existing credit card
	And user clicks on Add New Credit Card button
	#And validate the radio button Academy Credit Card and Credit Card
	#And user validates the "Academy Credit Card"
    And user adds the "Academy Credit Card"
    And  user enter Address "AVSAddress"
    And validate the acc card added