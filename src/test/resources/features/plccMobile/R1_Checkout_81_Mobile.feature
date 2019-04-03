Feature: PLCC: Checkout - Payment Using PLCC : Identify Card Image in Footer

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
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	And user clicks on checkout button and navigates to checkout page 

@C-PLCC @Regression @All @PLCC-81 @CR-VS @Mobile	
Scenario: Verify the display of PLCC credit card image when user enter three digit(778) BIN number for new credit card 
	And user handles adding new card "starting3digitsplccCard" if already card is saved 
	And user expect element plcc credit card image on credit card text field to present 