Feature: PLCC: Checkout_Payment Using PLCC : Identify Card Image in Footer

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_IdentifyCardType" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user click on My Account link
	And user click on Payments link
	Then delete all credit cards from My Account
	And user clears everything in cart
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	
@C-PLCC @Regression @All @PLCC-81 @CR-VS	
Scenario: Verify the display of PLCC credit card image when user enter three digit(778) BIN number for new credit card 
	And user handles adding new card "starting3digitsplccCard" if already card is saved
	#Then user expect selected credit card image on credit card text field  
	And user expect element plcc credit card image on credit card text field to present 