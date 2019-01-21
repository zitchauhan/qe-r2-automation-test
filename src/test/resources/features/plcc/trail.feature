Feature: PLCC: Checkout - Payment Using PLCC 

Background: User Login and common steps for identifying card type entering BIN 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	And user click on Add to cart button 
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 

	
#@C-PLCC @Regression @All @PLCC-84 @CR-VS 
#Scenario: Verify user is able to navigate to confirm order page by clicking on review order button by using existing PLCC card-1st Time
#	When user enter plcc card "ValidPLCCCard" 
#	And user click on REVIEW ORDER button
#	And user click on PLACE ORDER button
#	Then user navigates to order confirmation page
#	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
#	And user expect element Order Number to be present
#	And user expect element a confirmation email is on its way to be present
#	And user expect element print link to be present
#	And user expect element my account link to be present
	
	
Scenario: Verify user is able to navigate to confirm order page by clicking on review order button by using existing PLCC card
	When user enter plcc card "ValidPLCCCard" 
	And user click on REVIEW ORDER button
	And user click on PLACE ORDER button
	Then user navigates to order confirmation page
	And user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present
	And user expect element Order Number to be present
	And user expect element a confirmation email is on its way to be present
	And user expect element print link to be present
	And user expect element my account link to be present
	And user place fifty orders and see the response with "SKUIdOfProduct1"
	
	
