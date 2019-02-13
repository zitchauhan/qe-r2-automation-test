Feature: Checkout
	
Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "plccSavedCard" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	#And user click on Add to Cart Button 
	And user click on Add to Cart button  
	And user click on checkout from ATC pop up 
	And user clicks on checkout button and navigates to checkout page 
	And user expect element credit card text field is present 

@C-PLCC @Regression @All @PLCC-80 @CR-VS	
Scenario: Verify the display of saved card on payment section of checkout page
When user check element payment section to be present
Then user expect element saved card on payment section of checkout page to be present
