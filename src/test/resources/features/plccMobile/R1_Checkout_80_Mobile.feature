Feature: PLCC: Checkout - Payment Using PLCC  : Identify Card Type

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	When user click on burger menu 
	And user click on My Account link of mobile
	And user enter Email address in sign-in page "Email_Generic" 
	And user enter password in sign-in page "passwordPlcc" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user enters "SKUIdOfProduct" in the search box plcc for mobile
    And user click on search icon for mobile
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page	
	
@C-PLCC @Regression @All @PLCC-80 @CR-VS @Mobile
Scenario: Verify the system behavior when user enter 778 as three digit BIN number 
	And user handles adding new card "starting3digitsplccCard" if already card is saved
	Then user expect selected credit card image on credit card text field  
	And user expect element plcc credit card image on credit card text field to present 
	
