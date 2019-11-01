Feature: PLCC: Checkout_Payment Using PLCC : Hide Expire Date

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
#	When user click on My Account link 
#	And user expect element Email Address to be present 
#	And user enter Email address in sign-in page "Email_IdentifyCardType" 
#	And user enter password in sign-in page "passwordPlcc" 
#	And user click on Signin-button 
	
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Email_IdentifyCardType" 
	And user enter the valid password "passwordPlcc" 
	And user click on signin button
	
	Then user navigates to ASO-Home page 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	And user clears everything in cart
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page
	
@C-PLCC @Regression @All @PLCC-83 @CR-VS 
Scenario: Verify the functionality of Hiding expiry date section when system identifies BIN number for PLCC Credit card 
	When user handles adding new card "starting3digitsplccCard" if already card is saved
	Then user expect element expiry field to be not present 
	
@C-PLCC @Regression @All @PLCC-83 @CR-VS 
Scenario: Verify the system behavior of Hiding expiry date section when user enters different payment card other than PLCC credit card
	When user handles adding new card "starting2digitsvisaCard" if already card is saved
	Then user expect selected credit card image on credit card text field 
	And user expect element visa card image on credit card text field to present 
	And user expect element expiry date field to be present 