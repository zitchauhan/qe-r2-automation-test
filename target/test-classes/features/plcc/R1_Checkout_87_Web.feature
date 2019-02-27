Feature: PLCC: Checkout - Payment Using PLCC 

Background: User Login and common steps for identifying card type entering BIN 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "password" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	#And user expect element ASO Home Page Title to be present
	When user enters "SKUIdOfProduct" in the search box plcc
	And user click on search icon 
	And user click on Add to Cart button 
	And user click on checkout from ATC pop up plcc
	And user clicks on checkout button and navigates to checkout page 
	#And user selects credit card radio button
	And user expect element credit card text field is present 

@C-PLCC @Regression @All @PLCC-87 @CR-VS 
Scenario: Verify the PLCC card image in footer when customer is on checkout page 
	Then user expect element plcc card image in footer to be present
	
	