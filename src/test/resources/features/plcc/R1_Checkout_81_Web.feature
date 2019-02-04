Feature: PLCC: Checkout - Payment Using PLCC 

Background: Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button
	And user expect element credit card text field is present 
	
@C-PLCC @Regression @All @PLCC-81 @CR-VS	
Scenario: Verify the display of PLCC credit card image when user enter three digit(778) BIN number for new credit card 
	When user enter plcc card "starting3digitsplccCard"
	Then user expect selected credit card image on credit card text field  
	And user expect element plcc credit card image on credit card text field to present 